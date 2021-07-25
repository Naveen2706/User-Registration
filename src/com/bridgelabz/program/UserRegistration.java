package com.bridgelabz.program;

import java.util.Scanner;
import java.util.regex.Pattern;

interface FirstNameInterface {
    boolean firstNameValidation();
}

interface LastNameInterface {
    boolean lastNameValidation();
}

interface EmailValidationInterface {
    boolean emailValidation();
}

interface MobileValidationInterface {
    boolean phoneValidation();
}

interface PasswordValInterface {
    boolean passwordValidation();
}

public class UserRegistration {
    public static void main(String[] args) {

        System.out.println("Enter First Name :");
        FirstNameInterface personL = (() -> {
            Scanner scanner = new Scanner(System.in);
            String nameF = scanner.next();
            return Pattern.matches("^[A-Z]{1}+[a-z]{3,}$", nameF);
        });
        System.out.println(personL.firstNameValidation());

        System.out.println("Enter Last name :");
        LastNameInterface person2 = (() -> {
            Scanner scanner = new Scanner(System.in);
            String nameL = scanner.next();
            return Pattern.matches("^[A-Z]{1}+[a-z]{3,}$", nameL);
        });
        System.out.println(person2.lastNameValidation());

        System.out.println("Enter Email Address :");
        EmailValidationInterface person3 = (() -> {
            Scanner scanner = new Scanner(System.in);
            String email = scanner.next();
            return Pattern.matches("^[a-zA-Z0-9-.+]+@[a-zA-Z0-9.]+$", email);
        });
        System.out.println(person3.emailValidation());

        System.out.println("Enter Phone Number :");
        MobileValidationInterface person4 = (() -> {
            Scanner scanner = new Scanner(System.in);
            String phoneNumber = scanner.next();
            return Pattern.matches("^[0-9]{3} [0-9]{10}$", phoneNumber);
        });
        System.out.println(person4.phoneValidation());

        System.out.println("Enter Password :");
        PasswordValInterface person5 = (() -> {
            Scanner scanner = new Scanner(System.in);
            String password = scanner.next();
            return Pattern.matches("(?=.*?[A-Z])(?=.*?[0-9])(?=.*?[#?!@$%^&*-]).{8,}$", password);
        });
        System.out.println(person5.passwordValidation());
    }
}
