package com.gmailraidenbits.scrapy;

import com.gmailraidenbits.scrapy.architecture.controller.WebCrawlerController;
import com.gmailraidenbits.scrapy.architecture.model.impl1.WebCrawler;
import com.gmailraidenbits.scrapy.architecture.view.WebCrawlerView;

public class Env {

    public static void main(String[] clArgs) throws Exception {

        new WebCrawler()
                .connectV(WebCrawlerView.class)
                .connectC(WebCrawlerController.class)
                .onStart(clArgs);
    }
}


