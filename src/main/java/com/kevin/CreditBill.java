package com.kevin;

import java.io.Serializable;

/**
 * @author kevin
 * @ClassName
 * @Date 2019/12/721:05
 */
public class CreditBill implements Serializable {

    private String accountId;
    private String name;
    private double amount;
    private String date;
    private String address;

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public CreditBill() {
        super();
    }

    @Override
    public String toString() {
        return "CreditBill{" +
                "accountId='" + accountId + '\'' +
                ", name='" + name + '\'' +
                ", amount=" + amount +
                ", date='" + date + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
