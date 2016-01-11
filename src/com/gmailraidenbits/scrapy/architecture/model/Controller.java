package com.gmailraidenbits.scrapy.architecture.model;

import java.util.EnumSet;

import com.gmailraidenbits.scrapy.architecture.model.Model.Controllable;
import com.gmailraidenbits.scrapy.architecture.model.Model.Controllable.Command;

/** Controller's model-facing API. */
public interface Controller {

    /** This set of available commands is common for all the objects controlling this Model. */
    EnumSet<Controllable.Command> AVAILABLE_COMMANDS = EnumSet.allOf(Controllable.Command.class);

    Controller connectTo(Controllable model);
}