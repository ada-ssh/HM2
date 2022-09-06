import java.util.Random;
import java.util.Scanner;

import static java.lang.Math.round;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World");


        Scanner scanner = new Scanner(System.in);
        String Line = scanner.nextLine();
        System.out.println(" Hello " + Line);


        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число:");
        double xx = sc.nextInt();
        Random random = new Random();
        int yy = random.nextInt(91) + 10;
        System.out.println(yy);


        double x1 = xx * 0.85d;
        double i1 = 10 * x1 + 2 * yy;
        System.out.println(i1);


        double x2 = xx * 0.5d;
        double i2 = 7 * x2 + yy;
        System.out.println(i2);


        double x3 = xx * 0.9d;
        double i3 = 2 * x3 + 3 * yy;
        System.out.println(i3);


        double i4 = (xx + yy) * 0.9d;
        System.out.println("Цена со скидкой : " + i4);
        double sk = (xx + yy) * 0.1d;
        System.out.println("Скидка составляет : " + sk);


        int x = 5;
        int y = 10;
        System.out.println(Math.sqrt(x * x + y * y));


        Scanner scan = new Scanner(System.in);
        System.out.println("Введите первое число:");
        double b = scan.nextInt();
        Scanner scann = new Scanner(System.in);
        System.out.println("Введите второе число:");
        double c = scann.nextInt();
        System.out.println(Math.sqrt(b * b + c * c));


        Random rand = new Random();
        int q = random.nextInt(91) + 10;
        System.out.println(q);
        Random ran = new Random();
        int w = random.nextInt(91) + 10;
        System.out.println(w);
        double rez = q % w;
        int rez1 = q / w;
        System.out.println("Результат деления : " + rez1);
        System.out.println("Остаток : " + rez);


        Scanner scanne = new Scanner(System.in);
        System.out.println("Введите трёхзначное натуральное число:");
        int n = scanne.nextInt();
        int rezult = (int) (n % 10 + (n / 10) % 10 + (n / 100) % 10);
        System.out.println("Результат : " + rezult);

        //Scanner sca = new Scanner(System.in);
        //System.out.println("Введите дробное число:");
        //float n1 = sca.nextFloat();
        //float y1 = n1 - (int) n1;
        double n1 = 22.6d;
        double y1 = n1 - (int)n1;
        System.out.print (n1 + " округляем и получаться - " );
        if (y1 >= 0.5) {

            n1 += 1;

        } else n1 = (int) n1;
        System.out.print ( (int)n1 );


        int z = 2147483647+1;
        System.out.println(z);


        int x4 = 5, y4 = 7, z4 = 0, k4 = 9;

        z4 = x4 * x4 + y4 * y4;
        z4 = x4 * x4 * x4;
        k4 = x4 / z4;
        System.out.println(z4);
        System.out.println(k4);
    }
}
