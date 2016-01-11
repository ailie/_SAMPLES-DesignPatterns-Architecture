package com.gmailraidenbits.scrapy.architecture.model;

public interface Model {

    /** The Model's API facing the upper layer (ie service, or the app's main entry point). */
    interface Model2UpperLayer {

        <T extends Controller> T connectC(Class<T> controller) throws Exception;

        Model2UpperLayer connectV(Class<? extends View> view) throws Exception;
    }

    /** Model's controller-facing API. */
    public interface Controllable {

        enum Command {
            START, STOP, PAUSE
        }

        void setSpider();
        void doX();
        void doY();
    }

}
