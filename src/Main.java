import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int a,b,c,sum,avg;
        a=in.nextInt();
        b=in.nextInt();
        c=in.nextInt();
        sum=a+b+c;
        avg=(a+b+c)/3;
        System.out.printf("%d\n",sum);
        System.out.printf("%d",avg);

    }
}
