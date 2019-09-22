package com.fyle.banks.api;


import com.fyle.banks.dto.BankDTO;
import com.fyle.banks.service.BankService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/banks/v1/")
public class BankController
{

  @Autowired
  private BankService bankService;

  @GetMapping("search")
  public ResponseEntity<BankDTO> search(@RequestParam(value = "ifsc", required = false) String ifsc,
                                        @RequestParam(value = "bankName", required = false) String bankName,
                                        @RequestParam(value = "city", required = false) String city) {
    return ResponseEntity.ok(bankService.search(ifsc, bankName, city));
  }

}
