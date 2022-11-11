package addition;

import java.util.Scanner;

public class maini{
    public static void main(String[] args){
        add addobj = new add();
        addobj.addi();
        sub subobj = new sub();
        subobj.subb();
    }
}
class add{
    int a;
    int b;
   public void addi(){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter 1st");
         a = sc.nextInt();
         this.a=a;
        System.out.print("enter 2nd");
         b = sc.nextInt();
         this.b=b;
        int c = a+b;
        System.out.println(c);
    }
}
class sub extends add{
   public void subb(){
       int s =a-b ;
       System.out.print(s);
    }
}
