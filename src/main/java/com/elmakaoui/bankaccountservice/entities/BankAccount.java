package com.elmakaoui.bankaccountservice.entities;

import com.elmakaoui.bankaccountservice.enums.AccountType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
@Entity
@Data @NoArgsConstructor @AllArgsConstructor @Builder
public class BankAccount {
    @Id
    private String id;
    private Date createAt;
    private double balance;
    private String currency;
    private AccountType type;
}
