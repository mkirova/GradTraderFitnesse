package com.scottlogic.gradtrader.slim.trademanager;

import com.scottlogic.gradtrader.price.PriceException;
import com.scottlogic.gradtrader.trade.Quote;
import com.scottlogic.gradtrader.trade.Rfq;
import com.scottlogic.gradtrader.trade.TradeManager;
import com.scottlogic.gradtrader.trade.TradeManagerProvider;

import java.time.Instant;
import java.util.function.Supplier;

/**
 * Decision Table for testing the request quote functionality.
 */
public class RequestQuote {

    private String userId;
    private String portfolioId;

    private String pairId;
    private String quantity;
    private String direction;

    //TODO stored as long, but displayed as decimal
    private String indicativePrice;

    private final Supplier<TradeManager> tradeManager;

    private Quote quote;
    private Exception exception;

    public RequestQuote() {
        this.tradeManager = new TradeManagerProvider();
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public void setPortfolioId(String portfolioId) {
        this.portfolioId = portfolioId;
    }

    public void setPairId(String pairId) {
        this.pairId = pairId;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public void setIndicativePrice(String indicativePrice) {
        this.indicativePrice = indicativePrice;
    }

    // Sigh, must be upper case, can't be getSuccess
    public String Error() {
        return (this.exception != null) ? this.exception.getMessage() : "";
    }

    public boolean Success() {
        return (quote != null);
    }

    public String Time() {
        return quote != null ? asNowIsh(quote.getTime()) : "";
    }

    private String asTime(long time) {
        String formatted = Instant.ofEpochMilli(time).toString();
        // TODO remove
        System.out.println(String.format("<< %d millis => %s", time, formatted));
        return formatted;
    }

    private String asDecimal(long number) {
        // TODO String.format
        return Long.valueOf(number).toString();
    }

    public String Expires() {
<<<<<<< HEAD
        return (quote != null) ? asNowIsh(quote.getExpires()) : "";
=======
        return (quote != null) ?  asNowIsh(quote.getExpires()) :"";
>>>>>>> bc84211ef1e975c2a32e1499d329f38d96596af9
    }

    private String asNowIsh(long then) {
        long now = Instant.now().toEpochMilli();
        long delta = then - now;
        float secondsAsDecimal = delta / 1000f;
        int seconds = Math.round(secondsAsDecimal);

        if (seconds > 0) {
            return String.format("NOW+%dS", seconds);
        }
        else if (seconds < 0) {
            return String.format("NOW-%dS", seconds);
        }
        else {
            return "NOW";
        }
    }

    public String Price() {
        return quote != null ? asDecimal(quote.getPrice()) : "";
    }

    private Rfq create() {
        long quantityValue = Long.valueOf(this.quantity);
        long indicativePriceValue = Long.valueOf(this.indicativePrice);

        return new Rfq(
                this.userId, this.portfolioId,
                this.pairId, quantityValue,
                this.direction, indicativePriceValue);
    }

    public void execute() {
        this.quote = null;
        this.exception = null;
        try {
            this.quote = this.tradeManager.get().requestQuote(create());
    }
        catch (PriceException pe) {
            // helpful for business rules
            this.exception = pe;
        }
        catch (Exception e) {
<<<<<<< HEAD
            // an unexpected thing has happened
=======
>>>>>>> bc84211ef1e975c2a32e1499d329f38d96596af9
            this.exception = e;
        }
    }
}
