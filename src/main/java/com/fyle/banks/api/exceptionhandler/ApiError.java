package com.fyle.banks.api.exceptionhandler;


import javax.validation.ConstraintViolation;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.databind.annotation.JsonTypeIdResolver;
import com.fasterxml.jackson.databind.jsontype.impl.TypeIdResolverBase;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.apache.commons.lang3.StringUtils;
import org.hibernate.validator.internal.engine.path.PathImpl;
import org.springframework.http.HttpStatus;
import org.springframework.validation.FieldError;
import org.springframework.validation.ObjectError;


@Data
@JsonTypeInfo(include = JsonTypeInfo.As.WRAPPER_OBJECT, use = JsonTypeInfo.Id.CUSTOM,
              property = "error", visible = true)
@JsonTypeIdResolver(LowerCaseClassNameResolver.class)
class ApiError
{

  private HttpStatus status;
  private ZonedDateTime timestamp;
  private String message;
  private String debugMessage;
  private Set<ApiSubError> subErrors;


  ApiError(final HttpStatus status)
  {
    this();
    this.status = status;
  }

  private ApiError()
  {
    timestamp = ZonedDateTime.now(ZoneId.of("UTC"));
  }

  ApiError(final HttpStatus status, final Throwable ex)
  {
    this();
    this.status = status;
    this.message = "Unexpected error";
    this.debugMessage = ex.getLocalizedMessage();
  }

  ApiError(final HttpStatus status, final String message, final Throwable ex)
  {
    this();
    this.status = status;
    this.message = message;
    this.debugMessage = ex.getLocalizedMessage();
  }

  void addValidationErrors(final List<FieldError> fieldErrors)
  {
    fieldErrors.forEach(this::addValidationError);
  }

  private void addValidationError(final FieldError fieldError)
  {
    this.addValidationError(
      StringUtils.substringBefore(fieldError.getObjectName(), "DTO"),
      fieldError.getField(),
      fieldError.getRejectedValue(),
      fieldError.getDefaultMessage());
  }

  private void addValidationError(final String object, final String field, final Object rejectedValue, final String message)
  {
    addSubError(new ApiValidationError(object, field, rejectedValue, message));
  }

  private void addSubError(final ApiSubError subError)
  {
    if (subErrors == null)
    {
      subErrors = new HashSet<>();
    }
    subErrors.add(subError);
  }

  void addValidationError(final List<ObjectError> globalErrors)
  {
    globalErrors.forEach(this::addValidationError);
  }

  private void addValidationError(final ObjectError objectError)
  {
    this.addValidationError(
      objectError.getObjectName(),
      objectError.getDefaultMessage());
  }

  private void addValidationError(final String object, final String message)
  {
    addSubError(new ApiValidationError(object, message));
  }

  void addValidationErrors(final Set<ConstraintViolation<?>> constraintViolations)
  {
    constraintViolations.forEach(this::addValidationError);
  }

  /**
   * Utility method for adding error of ConstraintViolation. Usually when a @Validated validation fails.
   *
   * @param cv the ConstraintViolation
   */
  private void addValidationError(final ConstraintViolation<?> cv)
  {
    this.addValidationError(
      cv.getRootBeanClass().getSimpleName(),
      ((PathImpl) cv.getPropertyPath()).getLeafNode().asString(),
      cv.getInvalidValue(),
      cv.getMessage());
  }


  interface ApiSubError
  {

  }

  @Data
  @EqualsAndHashCode(callSuper = false)
  @AllArgsConstructor()
  class ApiValidationError implements ApiSubError
  {

    private String object;
    private String field;
    private Object rejectedValue;
    private String message;

    ApiValidationError(final String object, final String message)
    {
      this.object = object;
      this.message = message;
    }
  }
}

class LowerCaseClassNameResolver extends TypeIdResolverBase
{

  @Override
  public String idFromValue(final Object value)
  {
    return value.getClass().getSimpleName().toLowerCase();
  }

  @Override
  public String idFromValueAndType(final Object value, final Class<?> suggestedType)
  {
    return idFromValue(value);
  }

  @Override
  public JsonTypeInfo.Id getMechanism()
  {
    return JsonTypeInfo.Id.CUSTOM;
  }
}
