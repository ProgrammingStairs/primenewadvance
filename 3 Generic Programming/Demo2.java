// example showing the concept of generic class 
@SuppressWarnings("unchecked")
class Demo2<DT>{
    void swap(DT a,DT b){
        DT temp = a;
        a = b;
        b = temp;
        System.out.println("After Swapping : \na : "+a+"\nb : "+b);
    }
    public static void main(String args[]){
        Demo2<Integer> obj = new Demo2();
        obj.swap(5,6);
        Demo2<Double> obj1 = new Demo2();  
        obj1.swap(6.6,2.3);
        Demo2<Character> obj2 = new Demo2();  
        obj2.swap('a','b');
    }
}