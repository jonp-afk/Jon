/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.stringname;

/**
 *
 * @author jprice2027
 */
public class StringName {

    public static void main(String[] args) {
         String name = new String("Jon Price");
         System.out.println("\'My name is \"" + name + "\"\'");
         int length = name.length();
         System.out.println("My name length is " + length);
         String uppername = name.toUpperCase();
         System.out.println("My name in upper case is " + uppername);
         String lowername = name.toLowerCase();
         System.out.println("My name in lower case is " + lowername);
         System.out.println("The first letter of my name is " + name.charAt(0));
         System.out.println("The last letter of my name is " + name.charAt(8));
         System.out.println("The index of the space between the names is " + name.indexOf(" "));
    }
}
