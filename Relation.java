import java.util.Scanner;
class Relation {
    public static void main(String[] args){
        int a,b;
        System.out.print("Enter two number");
        Scanner obj = new Scanner(System.in);
        a=obj.nextInt();
        b=obj.nextInt();
        System.out.println("true/false: "+(a<b));
        System.out.println("true/false: "+(a>b));
        System.out.println("true/false: "+(a<=b));
        System.out.println("true/false: "+(a!=b));
        System.out.println("true/false: "+(a>=b));
        System.out.println("true/false: "+(a==b));


    }
    
}
