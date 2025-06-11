// Example showing the concept of POJO Class 

class Demo1{
    private int rno;
    protected double per;
    public String name;
    String address;

    Demo1(){} 
    Demo1(int rno,double per, String name,String address){
        this.rno=rno;
        this.per=per;
        this.name=name;
        this.address=address;
    }
    // setter methods
    public void setRno(int rno){
        this.rno=rno;
    }
    private void setPer(double per){
        this.per=per;
    }
    protected void setName(String name){
        this.name=name;
    }
    void setAddress(String address){
        this.address=address;
    }

    // getter methods
    int getRno(){
        return rno;
    }
    private double getPer(){
        return per;
    }
    protected String getName(){
        return name;
    }
    public String getAddress(){
        return address;
    }

    public static void main(String args[]){
        Demo1 obj = new Demo1(101,67.78,"Andrew Anderson","Indore");
        System.out.println("Roll Number  : "+obj.getRno());
        System.out.println("Percentage  : "+obj.getPer());
        System.out.println("Name  : "+obj.getName());
        System.out.println("Address  : "+obj.getAddress());

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