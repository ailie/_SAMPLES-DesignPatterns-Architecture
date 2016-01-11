package com.gmailraidenbits.scrapy;

import com.gmailraidenbits.scrapy.architecture.control.WebCrawlerControl;
import com.gmailraidenbits.scrapy.architecture.control.abstraction.WebCrawler;
import com.gmailraidenbits.scrapy.architecture.control.presentation.WebCrawlerPresentation;

public class Env {

    public static void main(String[] clArgs) throws Exception {

        new WebCrawlerControl()
                .connectP(WebCrawlerPresentation.class)
                .connectA(WebCrawler.class)
                .onStart(clArgs);
    }
}


