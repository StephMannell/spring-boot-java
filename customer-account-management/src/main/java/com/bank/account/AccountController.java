package com.bank.account;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountController {
    @GetMapping("/accounts")
    public String getAccounts() {
        return "List of customer accounts.";
    }
}