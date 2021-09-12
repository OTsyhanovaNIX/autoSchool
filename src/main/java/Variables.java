import java.util.Scanner;

public class Variables {
    public static void main(String[] args){
        System.out.println("Задание 1");
        int q = 21, w = 8;
        int x = q/w;
        int y = q%w;
        System.out.println("Результат деления "+x+",отстаток "+y);

        System.out.println("Задание 2");
        //Scanner value = new Scanner(System.in);
        //System.out.println("Введи двухзначное число");
        //int n = value.nextInt();
        int n = 23;
        int n1 = n;
        int sum = 0;
        if (n < 0) n = -n;
        while (n>0){
            sum = sum + n % 10;
            n = n /10;
        }
        System.out.println("Сумма цифр числа "+n1+" равна "+sum);

        System.out.println("Задание 3");
        float p = 8.56f;
        float p1 = Math.round(p);
        System.out.println("Результат округления до ближайшего целого " +p1);

        System.out.println("Задание 4");
        int a=2, b=3, c=7;
        int a1=a, b1=b, c1=c;
        a1 = a+b;
        b1 = c-a;
        c1 = a+b+c;
        a=a1;
        b=b1;
        c=c1;
        System.out.println(a+" "+b+" "+c);
    }
}
