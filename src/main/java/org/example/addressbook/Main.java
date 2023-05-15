package org.example.addressbook;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        AddressBook addressBook = new AddressBook();
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("1. Add Contact");
            System.out.println("2. Delete Contact");
            System.out.println("3. Search Contact");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter name: ");
                    String name = scanner.next();
                    System.out.print("Enter phone number: ");
                    String phoneNumber = scanner.next();
                    System.out.print("Enter email: ");
                    String email = scanner.next();
                    Contact contact = new Contact(name, phoneNumber, email);
                    addressBook.addContact(contact);
                    System.out.println("Contact added successfully.");
                    break;
                case 2:
                    System.out.print("Enter name: ");
                    String nameToDelete = scanner.next();
                    ArrayList<Contact> matchingContacts = addressBook.searchByName(nameToDelete);
                    if (matchingContacts.size() == 0) {
                        System.out.println("Contact not found.");
                    } else if (matchingContacts.size() == 1) {
                        Contact contactToDelete = matchingContacts.get(0);
                        addressBook.deleteContact(contactToDelete);
                        System.out.println("Contact deleted successfully.");
                    } else {
                        System.out.println("Multiple contacts found:");
                        for (Contact matchingContact : matchingContacts) {
                            System.out.println(matchingContact.getName() + " " + matchingContact.getPhoneNumber() + " " + matchingContact.getEmail());
                        }
                        System.out.print("Enter phone number of contact to delete: ");
                        String phoneNumberToDelete = scanner.next();
                        boolean contactDeleted = false;
                        for (Contact matchingContact : matchingContacts) {
                            if (matchingContact.getPhoneNumber().equals(phoneNumberToDelete)) {
                                addressBook.deleteContact(matchingContact);
                                System.out.println("Contact deleted successfully.");
                                contactDeleted = true;
                                break;
                            }
                        }
                        if (!contactDeleted) {
                            System.out.println("Contact not found.");
                        }
                    }
                    break;
                case 3:
                    System.out.print("Enter name: ");
                    String nameToSearch = scanner.next();
                    ArrayList<Contact> matchingContacts2 = addressBook.searchByName(nameToSearch);
                    if (matchingContacts2.size() == 0) {
                        System.out.println("Contact not found.");
                    } else {
                        System.out.println("Matching contacts:");
                        for (Contact matchingContact : matchingContacts2) {
                            System.out.println(matchingContact.getName() + " " + matchingContact.getPhoneNumber() + " " + matchingContact.getEmail());
                        }
                    }
                    break;
                case 4:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        } while (choice != 4);
    }
}

