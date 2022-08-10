package com.Revature.IBank.Menus;

import com.Revature.IBank.Exceptions.MenuRouter;
import com.Revature.IBank.models.BankMember;
import com.Revature.IBank.Util.customLogger;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import static com.Revature.IBank.Util.Appstate.shutdown;

public class WelcomeMenu {
    public WelcomeMenu(BufferedReader terminalReader, MenuRouter menuRouter) throws IOException {


        String[] welcomeMessages = {"Welcome to IBank", "1) Login", "2) Register", "3) Exit application"};

        System.out.println(welcomeMessages[1]);
        System.out.println(welcomeMessages[2]);
        System.out.println(welcomeMessages[3]);

        try {
            String firstInput = terminalReader.readLine();

            switch (firstInput) {

                case "1":
                    System.out.println("User has selected Login");
                    MenuRouter.transfer("/LoginMenu");
                    break;
                case "2":
                    System.out.println("User has selected Register");
                    MenuRouter.transfer("/RegisterMenu");
                    break;
                case "3":
                    System.out.println("User has selected to exit application");
                    shutdown();
                    break;
                default:
                    System.out.println("User has not selected a valid input");

                    }
        }           catch(IOException e){
                        e.printStackTrace();
        }
    }
}

