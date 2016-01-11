package com.gmailraidenbits.scrapy.architecture.model.impl1;

import java.lang.reflect.InvocationTargetException;

import com.gmailraidenbits.scrapy.architecture.model.Controller;
import com.gmailraidenbits.scrapy.architecture.model.Model;
import com.gmailraidenbits.scrapy.architecture.model.View;

/**
 * This deals just with business objects: spiders (ie the scraping task) and
 * the means to run them (HTTP requests/responses, proxies, etc).
 */
public class WebCrawler implements Model.Model2UpperLayer, Model.Controllable {

    @Override
    public void setSpider() {
    }

    @Override
    public void doX() {
    }

    @Override
    public void doY() {
    }

    @Override
    public <T extends Controller> T connectC(Class<T> controller)
            throws InstantiationException, IllegalAccessException, IllegalArgumentException,
            InvocationTargetException, NoSuchMethodException, SecurityException {
        T theAddedController = controller.getConstructor().newInstance();
        fController = theAddedController.connectTo(this);
        return theAddedController;
    }

    @Override
    public WebCrawler connectV(Class<? extends View> view)
            throws InstantiationException, IllegalAccessException, IllegalArgumentException,
            InvocationTargetException, NoSuchMethodException, SecurityException {
        fView = view.getConstructor().newInstance();
        return this;
    }

    private Controller fController;
    private View       fView;
}
