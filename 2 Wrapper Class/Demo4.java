// example showing the concept of wrapper class

class Demo4{
    public static void main(String args[]){
        Integer obj = new Integer(130);
        System.out.println("result : "+obj.intValue());
        System.out.println("result : "+obj.floatValue());
        System.out.println("result : "+obj.longValue());
        System.out.println("result : "+obj.doubleValue());
        System.out.println("result : "+obj.shortValue());
        System.out.println("result : "+obj.byteValue());
    }
}
