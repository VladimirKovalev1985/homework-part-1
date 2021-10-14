package ru.netology.sqr;

public class SQRService {
    public static void main(String[] args) {


        selection service = new selection();
        int first = 100;
        int second = 150;

        int result = service.calculate(first, second);

        System.out.println(result);


    }
}

