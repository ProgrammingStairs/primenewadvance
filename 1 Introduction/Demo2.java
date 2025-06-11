// Example showing the concept of Bean Class 

import java.io.Serializable;
class Demo2 implements Serializable{
    private int rno;
    private double per;
    private String name;
    private String address;

    Demo2(){} 

    // setter methods
    public void setRno(int rno){
        this.rno=rno;
    }
    public void setPer(double per){
        this.per=per;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setAddress(String address){
        this.address=address;
    }

    // getter methods
    public int getRno(){
        return rno;
    }
    public double getPer(){
        return per;
    }
    public String getName(){
        return name;
    }
    public String getAddress(){
        return address;
    }

    public static void main(String args[]){
        Demo2 obj = new Demo2();
        obj.setRno(456);
        obj.setPer(45.56);
        obj.setName("Peter Parker");
        obj.setAddress("Jabalpur");
        System.out.println("\nRoll Number  : "+obj.getRno());
        System.out.println("Percentage  : "+obj.getPer());
        System.out.println("Name  : "+obj.getName());
        System.out.println("Address  : "+obj.getAddress());
    }
}