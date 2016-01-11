package com.gmailraidenbits.scrapy.architecture.control;

import com.gmailraidenbits.scrapy.architecture.control.abstraction.Abstraction;
import com.gmailraidenbits.scrapy.architecture.control.presentation.Presentation;

/** The Control's API facing the upper layer (ie service, or the app's main entry point). */
public interface Control {

        Control connectA(Class<? extends Abstraction> abstraction) throws Exception;

        Control connectP(Class<? extends Presentation> presentation) throws Exception;

        Control onStart(String[] clArgs);
}
