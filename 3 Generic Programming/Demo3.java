// example showing the concept of generic class 

class MyClass{}
@SuppressWarnings("unchecked")
class Demo3<DT>{ // generic class
    <DT>void swap(DT a,DT b){ // generic method
        DT temp = a;
        a = b;
        b = temp;
        System.out.println("After Swapping : \na : "+a+"\nb : "+b);
    }
    public static void main(String args[]){
        Demo3<MyClass> obj = new Demo3();
        obj.swap(5,6);
        obj.swap(6.6,2.3);
        obj.swap('a','b');
    }
}