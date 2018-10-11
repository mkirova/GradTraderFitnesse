package com.scottlogic.gradtrader.price.source;

import com.scottlogic.gradtrader.price.Price;
import com.scottlogic.gradtrader.price.PriceException;
import com.scottlogic.gradtrader.price.history.PriceHistory;

import java.util.Collection;

/**
 * Interim test double until we can determine if we can use either existing FakePriceSource
 * or a true mock.
 */
public class StubPriceSource implements PriceSource {

    private Price price;

    public void setPrice(Price price) {
        this.price = price;
    }
    @Override
    public Price getPrice() {
        return this.price;
    }

    @Override
    public Price getPrice(long l) {
        throw new IllegalStateException("Not implemented.");
    }

    @Override
    public PriceHistory getPriceHistory(long l, long l1) throws PriceException {
        throw new IllegalStateException("Not implemented.");
    }

    @Override
    public Collection<PriceHistory> getPriceHistory(long l, long l1, long l2) throws PriceException {
        throw new IllegalStateException("Not implemented.");
    }

    @Override
    public int getFrequencyMillis() {
        throw new IllegalStateException("Not implemented.");
    }
}
