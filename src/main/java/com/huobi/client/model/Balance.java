package com.huobi.client.model;

import com.huobi.client.model.enums.BalanceType;

import java.math.BigDecimal;

/**
 * The balance of specified account.
 */
public class Balance {

    private String currency;
    private BalanceType type;
    private BigDecimal balance;

    /**
     * Get the currency of this balance.
     *
     * @return The currency.
     */
    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    /**
     * Get the balance type, trade or frozen.
     *
     * @return The balance type, see {@link BalanceType}
     */
    public BalanceType getType() {
        return type;
    }

    public void setType(BalanceType type) {
        this.type = type;
    }

    /**
     * Get the balance in the main currency unit.
     *
     * @return The balance.
     */
    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }
}
