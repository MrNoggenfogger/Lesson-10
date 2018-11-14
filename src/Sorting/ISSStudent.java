/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sorting;

/**
 *
 * @author chri8160
 */
public class ISSStudent implements Comparable <ISSStudent>{
    private String name;
    private String address;
    private int id;
    
    ISSStudent(String n, String a, int i){
        name = n;
        address = a;
        id = i;
    }
    
    public String toString(){
        return "Name:\t\t" + name + "\nAddress:\t" + address + "\nID:\t\t" + id;
    }
    public int getID(){
        return id;
    }
    public String getName(){
        return name;
                }
    @Override
    public int compareTo(ISSStudent o) {
        //this version uses names
        return name.compareTo(o.name);
    }
    
}
