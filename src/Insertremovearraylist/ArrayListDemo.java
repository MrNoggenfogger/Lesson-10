/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Insertremovearraylist;

import java.util.*;

/**
 *
 * @author chri8160
 */
public class ArrayListDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList <String> x = new ArrayList();
        ArrayList <Person> y = new ArrayList();
        
        x.add("Apple");
        x.add("Pear");
        x.add("Banana");
        
        y.add(new Person("Smith. Joe", 45));
        y.add(new Person("Andrews, Amy", 22));
        y.add(new Person("Simpson, Homer", 48));
        
        for (int i = 0; i < x.size(); i++) {
            System.out.println(x.get(i));
            
        }
        
        for(Person p:y){
            System.out.println(p.getName());    
        }
        
        System.out.println("Remove Pear from x");
        
        x.remove(1);
        
        System.out.println("Insert new Person between 1 and 2");
        y.add(2,new Person("Gumball, Barney",32));
        
        for (int i = 0; i < x.size(); i++) {
            System.out.println(x.get(i));
        }
        for(Person p:y){
            System.out.println(p.getName());
        }
        System.out.println("Edit Amy Andrews Age");
        
        Person temp = y.get(1);
        temp.setAge(67);
        y.set(1,temp);
        
        for(Person p:y){
            
        }
    }
    
}
