package com.huobi.client.model;

import java.math.BigDecimal;


/**
 * The Huobi supported symbols.
 */
public class Symbol {

    private String baseCurrency;
    private String quoteCurrency;
    private int pricePrecision;
    private int amountPrecision;
    private String symbolPartition;
    private String symbol;

    private Integer valuePrecision;
    private BigDecimal minOrderAmt;
    private BigDecimal maxOrderAmt;
    private BigDecimal minOrderValue;
    private Integer leverageRatio;


    /**
     * Get the base currency in a trading symbol.
     *
     * @return The currency.
     */
    public String getBaseCurrency() {
        return baseCurrency;
    }

    public void setBaseCurrency(String baseCurrency) {
        this.baseCurrency = baseCurrency;
    }

    /**
     * Get the quote currency in a trading symbol.
     *
     * @return The currency.
     */
    public String getQuoteCurrency() {
        return quoteCurrency;
    }

    public void setQuoteCurrency(String quoteCurrency) {
        this.quoteCurrency = quoteCurrency;
    }

    /**
     * Get the quote currency precision when quote price (decimal places).
     *
     * @return The precision.
     */
    public int getPricePrecision() {
        return pricePrecision;
    }

    public void setPricePrecision(int pricePrecision) {
        this.pricePrecision = pricePrecision;
    }

    /**
     * Get the base currency precision when quote amount (decimal places).
     *
     * @return The precision.
     */
    public int getAmountPrecision() {
        return amountPrecision;
    }

    public void setAmountPrecision(int amountPrecision) {
        this.amountPrecision = amountPrecision;
    }

    /**
     * Get the trading section, possible values: [main，innovation，bifurcation].
     *
     * @return The partition.
     */
    public String getSymbolPartition() {
        return symbolPartition;
    }

    public void setSymbolPartition(String symbolPartition) {
        this.symbolPartition = symbolPartition;
    }

    /**
     * Get the symbol, like "btcusdt".
     *
     * @return The symbol.
     */
    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    /**
     * Get the trading amount precision .
     *
     * @return
     */
    public Integer getValuePrecision() {
        return valuePrecision;
    }

    public void setValuePrecision(Integer valuePrecision) {
        this.valuePrecision = valuePrecision;
    }

    /**
     * Get the min order size .
     *
     * @return
     */
    public BigDecimal getMinOrderAmt() {
        return minOrderAmt;
    }

    public void setMinOrderAmt(BigDecimal minOrderAmt) {
        this.minOrderAmt = minOrderAmt;
    }

    /**
     * Get the max order size .
     *
     * @return
     */
    public BigDecimal getMaxOrderAmt() {
        return maxOrderAmt;
    }

    public void setMaxOrderAmt(BigDecimal maxOrderAmt) {
        this.maxOrderAmt = maxOrderAmt;
    }

    /**
     * Get the min order amount .
     *
     * @return
     */
    public BigDecimal getMinOrderValue() {
        return minOrderValue;
    }

    public void setMinOrderValue(BigDecimal minOrderValue) {
        this.minOrderValue = minOrderValue;
    }

    /**
     * Get the maximum leverage
     *
     * @return
     */
    public Integer getLeverageRatio() {
        return leverageRatio;
    }

    public void setLeverageRatio(Integer leverageRatio) {
        this.leverageRatio = leverageRatio;
    }
}
