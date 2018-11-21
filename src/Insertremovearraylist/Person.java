
package Insertremovearraylist;
public class Person implements Comparable{
    private String name;
    private int age;
    private String gender;
    
    public Person(String nm,String genderr, int ag){
        name = nm;
        age = ag;
        gender = genderr;
}
 public String getName(){
     return name;
 }   

    @Override
    public int compareTo(Object o) {
         String other = ((Person)o).getName();
         return name.compareTo(other);
         
    }
    
    public void setAge(int a){
        age = a;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return name;
    }
    public String getGender(){
        return gender;
    }
    
    
}
