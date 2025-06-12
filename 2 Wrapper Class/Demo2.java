// example showing the concept of wrapper class

class Demo2{
    public static void main(String args[]){
        int num = 100;
        System.out.println("primitive value : "+num);
        // conversion of primitive datatype into object
        // autoboxing
        Integer obj = num;
        System.out.println("object : "+obj);

        Double obj1 = 56.56;
        System.out.println("object : "+obj1);

        // conversion of object into its corresponding primitive type
        // unboxing
        int n = obj;
        System.out.println("primitive value : "+n);
    }
}

/*
    "100",3 

    1 x 3 ^ 2 + 0 x 3 ^ 1 + 0 x 3 ^ 0
    1 x 9 + 0 x 3 + 0 x 1
    9 + 0 + 0
    9
*/