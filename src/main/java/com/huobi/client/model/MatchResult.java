package com.huobi.client.model;

import com.huobi.client.model.enums.DealRole;
import com.huobi.client.model.enums.OrderSource;
import com.huobi.client.model.enums.OrderType;

import java.math.BigDecimal;


/**
 * The match result information.
 */
public class MatchResult {

    private long createdTimestamp;
    private BigDecimal filledAmount;
    private BigDecimal filledFees;
    private long id;
    private long matchId;
    private long orderId;
    private BigDecimal price;
    private OrderSource source;
    private String symbol;
    private OrderType type;
    private BigDecimal filledPoints;
    private String feeDeductCurrency;
    private DealRole role;

    /**
     * Get the UNIX formatted timestamp in UTC when the match and fill is done.
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
     * Get the amount which has been filled.
     *
     * @return The amount.
     */
    public BigDecimal getFilledAmount() {
        return filledAmount;
    }

    public void setFilledAmount(BigDecimal filledAmount) {
        this.filledAmount = filledAmount;
    }

    /**
     * Get the transaction fee paid so far.
     *
     * @return The fee.
     */
    public BigDecimal getFilledFees() {
        return filledFees;
    }

    public void setFilledFees(BigDecimal filledFees) {
        this.filledFees = filledFees;
    }

    /**
     * Get the internal id.
     *
     * @return The id.
     */
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    /**
     * Get the match id of this match.
     *
     * @return The id.
     */
    public long getMatchId() {
        return matchId;
    }

    public void setMatchId(long matchId) {
        this.matchId = matchId;
    }

    /**
     * Get the order id of this order.
     *
     * @return The id.
     */
    public long getOrderId() {
        return orderId;
    }

    public void setOrderId(long orderId) {
        this.orderId = orderId;
    }

    /**
     * Get the limit price of limit order.
     *
     * @return The limit price.
     */
    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    /**
     * Get the source where the order was triggered, possible values: sys, web, api, app.
     *
     * @return The source, see {@link OrderSource}
     */
    public OrderSource getSource() {
        return source;
    }

    public void setSource(OrderSource source) {
        this.source = source;
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
     * Get the order type, possible values are: buy-market, sell-market, buy-limit, sell-limit,
     * buy-ioc, sell-ioc, buy-limit-maker, sell-limit-maker.
     *
     * @return The order type, see {@link OrderType}
     */
    public OrderType getType() {
        return type;
    }

    public void setType(OrderType type) {
        this.type = type;
    }

    /**
     * Get the order fee use currency, if user open the switch of 'Use HT deduction' or 'Use Point Card to deduct' ,this filed may like 'ht or htpoints'
     *
     * @return
     */
    public String getFeeDeductCurrency() {
        return feeDeductCurrency;
    }

    public void setFeeDeductCurrency(String feeDeductCurrency) {
        this.feeDeductCurrency = feeDeductCurrency;
    }

    /**
     * Get the order fee quantity.
     *
     * @return
     */
    public BigDecimal getFilledPoints() {
        return filledPoints;
    }

    public void setFilledPoints(BigDecimal filledPoints) {
        this.filledPoints = filledPoints;
    }

    /**
     * Get the roles in the deal
     *
     * @return
     */
    public DealRole getRole() {
        return role;
    }

    public void setRole(DealRole role) {
        this.role = role;
    }
}
