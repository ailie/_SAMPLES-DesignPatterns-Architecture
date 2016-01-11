package com.gmailraidenbits.scrapy.architecture.control.abstraction;

/**
 * This deals just with business objects: spiders (ie the scraping task) and
 * the means to run them (HTTP requests/responses, proxies, etc).
 */
public class WebCrawler implements Abstraction {

    @Override
    public void setSpider() {
    }

    @Override
    public void doX() {
    }

    @Override
    public void doY() {
    }

    // Scheduler
    public WebCrawler scheduleRequest() {
        return null;
    }

    public void crawl(Req req) {

    }

    public void crawm(Rsp rsp) {
    }

    String                    fHeaderField_UserAgent;
}
