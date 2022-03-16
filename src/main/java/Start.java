package main.java;

public class Start {
    public static void main(String[] args) {
        // Ниже вызовите новый метод
        String highestGrossingFilm = findHighestGrossingFilm();
        System.out.println("Самый кассовый фильм: " + highestGrossingFilm);
    }
    public static String findHighestGrossingFilm() {
        /** 
        * если заранее известно что будет лежать в переменной, дай ей осмысленное название
        * например titanicFiml так же и с переменной income1 -> titcanicInocome
        * и если значение изменяться не будет, сделай ее final
        * https://vertex-academy.com/tutorials/ru/modifikator-final/
        * так же и с остальными переменными
        */
        String film1 = "Титаник";
        int income1 = 2194;

        String film2 = "Аватар";
        int income2 = 2810;

        String film3 = "Тёмный рыцарь";
        int income3 = 1084;

        // Напишите реализацию нового метода ниже
        if (income1 > income2) {
            if (income1 > income3) {
                return film1;
            } else {
                return film2;
            }
        } else {
            if (income2 > income3) {
                return film2;
            } else {
                return film3;
            }
        }
    }
}
