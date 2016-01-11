package com.gmailraidenbits.scrapy.architecture.control;

import com.gmailraidenbits.scrapy.architecture.control.Control;
import com.gmailraidenbits.scrapy.architecture.control.abstraction.Abstraction;
import com.gmailraidenbits.scrapy.architecture.control.presentation.Presentation;

/**
 * Receives/returns requests from upper layer with the help of its 2 components:
 * abstraction and presentation.
 */
public class WebCrawlerControl implements Control {

    @Override
    public Control connectA(Class<? extends Abstraction> abstraction) throws Exception {
        fAbstraction= abstraction.getConstructor().newInstance();
        return this;
    }

    @Override
    public Control connectP(Class<? extends Presentation> presentation) throws Exception {
        fPresentation= presentation.getConstructor().newInstance();
        return this;
    }

    @Override
    public Control onStart(String[] clArgs) {

        // defaultModelOptions= extractOptionsFrom(clArgs, cfgFiles[]);

        // fAbstraction.setDefaultOptions(defaultModelOptions).processSpider(<? extends abstraction.ASpider>)

        return this;
    }

    private Abstraction fAbstraction;
    private Presentation fPresentation;
}
