package ad;

import java.util.Scanner;

public class in {
    public static void main(String[] args){
        stu obj1 =new stu();
        obj1.det();
        mark obj2 = new mark();
        obj2.getMark();
        dis obj3 = new dis();
        obj3.disp();
    }
}
class stu{
    int roll;
    String name;
    void det(){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the roll:");
        roll = sc.nextInt();
        System.out.print("enter the name:");
        name = sc.next();
    }
}
class mark extends stu {
    int m1;
    int m2;
    int m3;
    int tot;
    void getMark(){
        Scanner scan=new Scanner(System.in);
        System.out.print("enter m1:");
        int m1= scan.nextInt();
        this.m1=m1;
        System.out.print("enter m2:");
        int m2= scan.nextInt();
        this.m2=m2;
        System.out.print("enter m3:");
        int m3= scan.nextInt();
        this.m3=m3;
        int tot = m1 + m2 + m3;
        this.tot=tot;

    }
}
class dis extends mark {
    void disp(){
        System.out.println("your m1 is:"+m1);
        System.out.println("your m2 is:"+m2);
        System.out.println("your m3 is:"+m3);
        System.out.println("your tot is:"+tot);
    }
}