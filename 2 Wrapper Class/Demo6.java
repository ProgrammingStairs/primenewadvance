// example showing the concept of wrapper class

class Demo6{
    public static void main(String args[]){
       Integer x = new Integer(123);
       Integer y = new Integer(789);
       System.out.println("sum : "+(x+y));

       String s1 = Integer.toString(123);
       String s2 = Integer.toString(789);
       System.out.println("sum : "+(s1+s2));

       String s3 = x.toString();
       String s4 = y.toString();
       System.out.println("sum : "+(s3+s4));

       String s5 = Character.toString('a');
       System.out.println("string : "+s5);
       System.out.println("string : "+s5.toUpperCase());

    }
}
