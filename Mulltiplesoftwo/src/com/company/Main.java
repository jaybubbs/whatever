package com.company;

public class Main {

    public static void main(String[] args) {
    numbercompl();
    }

    public static void  loop() {
        int x;
        x = 1;

        while (x < 10) {
            System.out.println("2x" + x + "=" + (x * 2));

            x++;
        }
    }

    public  static void multiples()
    {
        int x;
        x = 1;

        while (x <= 100)
        {
            if (x % 2 == 0)
            {
                System.out.println(x);
            }
                x = x + 1;
            }

    }

    public static void numbercompl() {
        int x = 1;
        int y = 1;


        while (x <= 10) {
            y = 1;
            while (y <= x) {

                System.out.println(y + " , ");
                y = y + 1;
            }
            System.out.println(x + ",");
            x++;
        }
    }
}

