package com.gmailraidenbits.scrapy.architecture.control.abstraction;

/** Abstraction's control-facing API. */
public interface Abstraction {

    public interface Observer {
        void onXDone();
        void onYDone();
    }

    enum Command {
        START, STOP, PAUSE
    }

    void setSpider();
    void doX();
    void doY();
}
