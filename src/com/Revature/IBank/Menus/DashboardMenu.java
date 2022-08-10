package com.Revature.IBank.Menus;

import com.Revature.IBank.Exceptions.MenuRouter;

import java.io.BufferedReader;
import java.io.IOException;

public class DashboardMenu extends Menu {

    public DashboardMenu(String register, BufferedReader terminalReader, MenuRouter menuRouter, Object o) {
        super(register, terminalReader, menuRouter, o);

    }

    @Override
    public void render() throws IOException {


    }
}
