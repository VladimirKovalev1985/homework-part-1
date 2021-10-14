package ru.netology.sqr;

public class selection {
    public int calculate(int first, int second) {
int counter = 0;

        for (int i = 10; i <= 99; i++) {


            if ((first <= (i * i) && (i * i) <= second)) {

                counter = counter + 1;

                System.out.println(counter);

            }
        }

       return 0;
    }

}
