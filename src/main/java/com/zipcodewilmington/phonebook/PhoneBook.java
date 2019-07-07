package com.zipcodewilmington.phonebook;

import java.util.*;

/**
 * Created by leon on 1/23/18.
 */
public class PhoneBook {

    Map<String, List<String>> myBook;

    public PhoneBook(Map<String, List<String>> map) {

        this.myBook = map;
    }

    public PhoneBook() {

        
    }





    public void add(String name, String phoneNumber) {

            List<String> list = new ArrayList<>();
            list.add(phoneNumber);
            this.myBook.put(name, list);
    }


    public void addAll(String name, String... phoneNumbers) {

       this.myBook.put(name, Arrays.asList(phoneNumbers));


    }

    public void remove(String name, String phoneNumber) {

        this.myBook.remove(name);



    }

    public Boolean hasEntry(String name) {

        return this.myBook.containsKey(findPhoneBookEntry(name));
    }

    public List<String> lookup(String name) {

        return this.myBook.get(name);
    }

    public String reverseLookup(String phoneNumber)  {

        return findPhoneBookEntry(phoneNumber);
    }

    public List<String> getAllContactNames() {


        return new ArrayList(this.myBook.keySet());
    }

    public Map<String, List<String>> getMap() {

        return this.myBook;
    }

    public String findPhoneBookEntry(String str) {
        for(Map.Entry<String, List<String>> entry:myBook.entrySet()) {
            for(String pb: entry.getValue()) {
                if(str.equals(pb)) {
                    return entry.getKey();
                }
            }
        }
        return str;
    }
}
