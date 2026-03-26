package com.app;

import java.util.Scanner;

public class MainApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ContactDAO dao = new ContactDAO();

        while (true) {
            System.out.println("\n1. Add Contact");
            System.out.println("2. View Contacts");
            System.out.println("3. Update Contact");
            System.out.println("4. Delete Contact");
            System.out.println("5. Exit");
            System.out.print("Choose: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Name: ");
                    String name = sc.nextLine();

                    System.out.print("Phone: ");
                    String phone = sc.nextLine();

                    System.out.print("Email: ");
                    String email = sc.nextLine();

                    dao.addContact(new Contact(name, phone, email));
                    break;

                case 2:
                    dao.viewContacts();
                    break;

                case 3:
                    System.out.print("Enter ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("New Phone: ");
                    String newPhone = sc.nextLine();

                    dao.updateContact(id, newPhone);
                    break;

                case 4:
                    System.out.print("Enter ID: ");
                    int delId = sc.nextInt();

                    dao.deleteContact(delId);
                    break;

                case 5:
                    System.exit(0);
            }
        }
    }
}