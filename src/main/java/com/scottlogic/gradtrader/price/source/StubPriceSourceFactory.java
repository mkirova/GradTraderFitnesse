package com.scottlogic.gradtrader.price.source;

import com.scottlogic.gradtrader.price.Price;
import com.scottlogic.gradtrader.price.PriceException;

import java.time.Instant;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Interim test double until we can determine if we can use either existing FakePriceSourceFactory
 * or a true mock.
 * TODO: inject a TimeSupplier
 */
public class StubPriceSourceFactory implements PriceSourceFactory {
    private final Map<String, PriceSource> priceSources = new LinkedHashMap<>();

    public StubPriceSourceFactory() {
        super();

        String key = "EURGBP";

        // TODO: time description taken from test framework
        String timeDesc = "2018-09-23T12:30:05.000Z";
        Instant i = Instant.parse(timeDesc);
        long time = i.toEpochMilli();

        // TODO: remove println
        Price eurGbpPrice = new Price(key, time, 400,500);

        StubPriceSource eurGbpPriceSource = new StubPriceSource();
        eurGbpPriceSource.setPrice(eurGbpPrice);

        this.priceSources.put(key, eurGbpPriceSource);
    }

    @Override
    public PriceSource getPriceSource(String key) throws PriceException {
        if (!priceSources.containsKey(key))
            throw new PriceException(String.format("Invalid instrument pair '%s'.", key));

        return priceSources.get(key);
    }

    public void putPriceSource(String key, PriceSource value) {
        priceSources.put(key, value);
    }
}
