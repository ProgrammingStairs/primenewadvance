// example without generic class 

class Demo1{
    void swap(int a,int b){
        int temp = a;
        a = b;
        b = temp;
        System.out.println("After Swapping : \na : "+a+"\nb : "+b);
    }
    void swap(double a,double b){
        double temp = a;
        a = b;
        b = temp;
        System.out.println("After Swapping : \na : "+a+"\nb : "+b);
    }
    void swap(char a,char b){
        char temp = a;
        a = b;
        b = temp;
        System.out.println("After Swapping : \na : "+a+"\nb : "+b);
    }
    public static void main(String args[]){
        Demo1 obj = new Demo1();
        obj.swap(5,6);
        obj.swap(6.6,2.3);
        obj.swap('a','b');
    }
}