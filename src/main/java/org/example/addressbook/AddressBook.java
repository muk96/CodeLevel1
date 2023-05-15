package org.example.addressbook;

import java.util.ArrayList;

public class AddressBook {
    ArrayList<Contact> contacts;

    public AddressBook(){
        contacts = new ArrayList<>();
    }

    public void addContact(Contact contact){
        contacts.add(contact);
    }

    public void deleteContact(Contact contact){
        contacts.remove(contact);
    }

    //Method to search for a contact by name
    public ArrayList<Contact> searchByName(String name){
        ArrayList<Contact> matchingNames = new ArrayList<>();
        for(Contact contact : contacts){
            if(name.equals(contact.getName())){
                matchingNames.add(contact);
            }
        }

        return matchingNames;
    }
}
