package com.huobi.client.model;

import com.huobi.client.model.enums.EtfSwapType;

import java.math.BigDecimal;
import java.util.List;

/**
 * The past creation and redemption.
 */
public class EtfSwapHistory {

    private long createdTimestamp;
    private String currency;
    private BigDecimal amount;
    private EtfSwapType type;
    private int status;
    private BigDecimal rate;
    private BigDecimal fee;
    private BigDecimal pointCardAmount;
    private List<UnitPrice> usedCurrencyList;
    private List<UnitPrice> obtainCurrencyList;

    /**
     * Get the UNIX formatted timestamp in UTC of the operation.
     *
     * @return The timestamp.
     */
    public long getCreatedTimestamp() {
        return createdTimestamp;
    }

    public void setCreatedTimestamp(long createdTimestamp) {
        this.createdTimestamp = createdTimestamp;
    }

    /**
     * Get the ETF name.
     *
     * @return ETF name.
     */
    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    /**
     * Get creation or redemption amount.
     *
     * @return The amount.
     */
    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    /**
     * Get the swap type. Creation or redemption.
     *
     * @return The swap type.
     */
    public EtfSwapType getType() {
        return type;
    }

    public void setType(EtfSwapType type) {
        this.type = type;
    }

    /**
     * Get the operation result
     *
     * @return The status.
     */
    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    /**
     * Get the fee rate.
     *
     * @return The rate.
     */
    public BigDecimal getRate() {
        return rate;
    }

    public void setRate(BigDecimal rate) {
        this.rate = rate;
    }

    /**
     * Get the actual fee amount
     *
     * @return The amount.
     */
    public BigDecimal getFee() {
        return fee;
    }

    public void setFee(BigDecimal fee) {
        this.fee = fee;
    }

    /**
     * Get discount from point card.
     *
     * @return The amount.
     */
    public BigDecimal getPointCardAmount() {
        return pointCardAmount;
    }

    public void setPointCardAmount(BigDecimal pointCardAmount) {
        this.pointCardAmount = pointCardAmount;
    }

    /**
     * For creation this is the list and amount of underlying assets used for ETF creation. For
     * redemption this is the amount of ETF used for redemption.
     *
     * @return The list.
     */
    public List<UnitPrice> getUsedCurrencyList() {
        return usedCurrencyList;
    }

    public void setUsedCurrencyList(List<UnitPrice> usedCurrencyList) {
        this.usedCurrencyList = usedCurrencyList;
    }

    /**
     * For creation this is the amount for ETF created. For redemption this is the list and amount of
     * underlying assets obtained.
     *
     * @return The list.
     */
    public List<UnitPrice> getObtainCurrencyList() {
        return obtainCurrencyList;
    }

    public void setObtainCurrencyList(List<UnitPrice> obtainCurrencyList) {
        this.obtainCurrencyList = obtainCurrencyList;
    }
}
