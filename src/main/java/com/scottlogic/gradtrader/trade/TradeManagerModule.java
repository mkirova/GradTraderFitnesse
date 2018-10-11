package com.scottlogic.gradtrader.trade;

import com.google.inject.AbstractModule;
import com.scottlogic.gradtrader.price.source.PriceSourceFactory;
import com.scottlogic.gradtrader.price.source.StubPriceSourceFactory;

public class TradeManagerModule extends AbstractModule {
    @Override
    protected void configure() {

        bind(QuoteEngine.class).to(QuoteEngineImpl.class);
        bind(PriceSourceFactory.class).to(StubPriceSourceFactory.class);
    }
}