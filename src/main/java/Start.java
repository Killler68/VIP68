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
        * например titanicFilm так же и с переменной income1 -> titanicIncome
        * и если значение изменяться не будет, сделай ее final
        * https://vertex-academy.com/tutorials/ru/modifikator-final/
        * так же и с остальными переменными
        */
        String titanicFilm = "Титаник";
       final int titanicIncome = 2194;
int a;
        String AvatarFilm = "Аватар";
       final int AvatarIncome = 2810;

        String DarkKnightFilm = "Тёмный рыцарь";
       final int DarkKnightIncome = 1084;

        // Напишите реализацию нового метода ниже
        if (titanicIncome >AvatarIncome) {
            if (AvatarIncome > DarkKnightIncome) {
                return titanicFilm;
            } else {
                return AvatarFilm;
            }
        } else {
            if (AvatarIncome > DarkKnightIncome) {
                return AvatarFilm;
            } else {
                return DarkKnightFilm;
            }
        }
    }
}
