/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Searching;

/**
 *
 * @author chri8160
 */
public class ISSStudent implements Comparable{
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
    
    @Override
    public int compareTo(Object o) {
        if(this.id > ((ISSStudent)o).getID()) return 1;
        else if (this.id < ((ISSStudent)o).getID()) return -1;
        else return 0;
    }
    
}
