// example showing the concept of wrapper class

class Demo5{
    public static void main(String args[]){
        String s1="123", s2="34.43", s3="true";
        int res1 = Integer.parseInt(s1);
        System.out.println("res1 : "+res1);

        double res2 = Double.parseDouble(s2);
        System.out.println("res2 : "+res2);

        boolean res3 = Boolean.parseBoolean(s3);
        System.out.println("res3 : "+res3);
    }
}
