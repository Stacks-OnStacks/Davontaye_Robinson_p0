package com.Revature.IBank.Util;

import com.Revature.IBank.Exceptions.MenuRouter;
import com.Revature.IBank.Menus.DashboardMenu;
import com.Revature.IBank.Menus.LoginMenu;
import com.Revature.IBank.Menus.RegisterMenu;
import com.Revature.IBank.Menus.WelcomeMenu;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Appstate {

    private static boolean isRunning;
    private final LoginMenu LoginMenu;
    private MenuRouter menuRouter;


    public Appstate(com.Revature.IBank.Menus.LoginMenu loginMenu) throws IOException {
        LoginMenu = loginMenu;
        isRunning = true;
        menuRouter = new MenuRouter();

        BufferedReader terminalReader = new BufferedReader(new InputStreamReader(System.in));

        WelcomeMenu welcomeMenu = new WelcomeMenu(terminalReader, menuRouter);
        RegisterMenu registerMenu = new RegisterMenu(terminalReader, menuRouter);
        DashboardMenu dashboardMenu = new DashboardMenu(terminalReader, menuRouter);
        LoginMenu LoginMenu = new LoginMenu(terminalReader, menuRouter);

        menuRouter.addMenu(welcomeMenu);
        menuRouter.addMenu(registerMenu);
        menuRouter.addMenu(dashboardMenu);
        menuRouter.addMenu(LoginMenu);

        {
        }
        while (isRunning) {
            menuRouter.transfer("/welcome");
        }
    }

    public static void shutdown() {
        isRunning = false;


    }

}

