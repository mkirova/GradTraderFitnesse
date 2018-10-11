package com.scottlogic.gradtrader.trade;

import com.google.inject.Guice;
import com.google.inject.Injector;

import java.util.function.Supplier;

public class TradeManagerProvider implements Supplier<TradeManager> {
    private TradeManager tradeManager;

    // TODO: Injection
    public TradeManagerProvider() {
        Injector injector = Guice.createInjector(new TradeManagerModule());
        TradeManager tradeManager = injector.getInstance(TradeManagerImpl.class);
        this.tradeManager = tradeManager;
    }

    public TradeManager get() {
        return this.tradeManager;
    }
}
