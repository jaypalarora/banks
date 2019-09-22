package com.fyle.banks.exception;


public class ApiException extends RuntimeException
{
  public ApiException(final String message)
  {
    super(message);
  }
}
