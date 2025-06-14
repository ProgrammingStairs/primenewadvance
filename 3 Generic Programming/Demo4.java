// example showing the concept of generic class 

@SuppressWarnings("unchecked")
class Demo4<DT1,DT2>{ // generic class
    DT1 temp1;
    DT2 temp2;
    Demo4(DT1 temp1,DT2 temp2){
        this.temp1=temp1;
        this.temp2=temp2;
    }
    void display(){
        System.out.println("Hello "+temp2+", your Id is "+temp1);
    }
    public static void main(String args[]){
        Demo4<Integer,String> obj = new Demo4(10001,"Andrew Anderson");
        obj.display();
    }
}