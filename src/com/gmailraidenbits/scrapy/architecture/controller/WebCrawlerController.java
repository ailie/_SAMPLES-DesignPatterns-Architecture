package com.gmailraidenbits.scrapy.architecture.controller;

import com.gmailraidenbits.scrapy.architecture.model.Controller;
import com.gmailraidenbits.scrapy.architecture.model.Model;

/**
 * Processes and forwards any input/commands to the scraper model. Receives from the
 * scraper model the available set of commands.
 */
public class WebCrawlerController implements Controller {

    public Controller onStart(String[] clArgs) {

        // defaultModelOptions= extractOptionsFrom(clArgs, cfgFiles[]);

        // fModel.setDefaultOptions(defaultModelOptions).processSpider(<? extends model.ASpider>)

        return this;
    }

    @Override
    public Controller connectTo(Model.Controllable model) {
        fModel = model;
        return this;
    }

    private Model.Controllable fModel;
}
