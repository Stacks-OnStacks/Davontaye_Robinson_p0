package com.Revature.IBank.Menus;

import com.Revature.IBank.Exceptions.MenuRouter;

import java.io.BufferedReader;
import java.io.IOException;

public abstract class Menu {
    protected String name;
    protected String route;
    protected BufferedReader terminalReader;
    protected MenuRouter menuRouter;
    public Menu(String register, BufferedReader terminalReader, MenuRouter menuRouter, Object o) {
        this.name = name;
        this.route = route;
        this.terminalReader = terminalReader;
        this.menuRouter = menuRouter;
    }

    public String getName() {
        return name;
    }

    public String getRoute() {
        return route;
    }

    public abstract void render() throws IOException;
}
