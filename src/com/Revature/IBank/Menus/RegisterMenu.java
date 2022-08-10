package com.Revature.IBank.Menus;

import com.Revature.IBank.Exceptions.MenuRouter;
import com.Revature.IBank.models.BankMember;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;

public class RegisterMenu extends Menu {

    public RegisterMenu(BufferedReader terminalReader, MenuRouter menuRouter) throws IOException {
        super("Register", terminalReader, menuRouter,);

        public void render() throw IOException{
            System.out.print("Please enter your first name: \n>");
            String firstname = terminalReader.readLine();
            System.out.print("Please enter your last name: \n>");
            String lastname = terminalReader.readLine();
            System.out.println("Please enter your email: \n>");
            String email = terminalReader.readLine();
            System.out.println("Please enter your password");
            String password = terminalReader.readLine();
            BankMember Bankmember = new BankMember(email, password);

        try (FileWriter fileWriter = new FileWriter(memoryFile, true);) {

            BankMember member = new BankMember(email, firstname, lastname, password);

            System.out.println(member.getPassword());

        } catch (IOException e){
            e.printStackTrace();
        }


    }



    }
}
