// example showing the concept of wrapper class

@Deprecated
class Demo3{
    public static void main(String args[]){
        char ch = 'a';
        System.out.println("result : "+Character.isLowerCase(ch));
        System.out.println("result : "+Character.isUpperCase(ch));
        System.out.println("result : "+Character.isAlphabetic(ch));
        System.out.println("result : "+Character.isDigit(ch));
        System.out.println("result : "+Character.isSpace(ch));
        System.out.println("result : "+Character.isWhitespace(ch));
    }
}
