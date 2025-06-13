// example showing the concept of wrapper class

import java.util.Scanner;
class Demo7{
    static void validateNumber(String num){
        boolean status = true; 
        if(num.length()!=10){
            status = false;
        }else{
            for(int i=0;i<num.length();i++){
                char ch = num.charAt(i);
                if(!Character.isDigit(ch)){
                    status = false;
                    break;
                }
            }
        }
        String str = status ? "Valid Mobile Number" : "Invalid Mobile Number";
        System.out.println(str);
    }
    public static void main(String args[]){
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter 10 digit mobile number : ");
       String num = sc.next();
       validateNumber(num); 
    }
}
