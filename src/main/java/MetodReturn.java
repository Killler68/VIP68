package main.java;

public class MetodReturn {
    public static void main(String[] args) {

        final String highestGrossingFilm = findHighestGrossingFilm();
        System.out.println("Самый кассовый фильм: " + highestGrossingFilm);
    }

    public static String findHighestGrossingFilm() {
        final String titanicFilm = "Титаник";
        final int titanicIncome = 2194;
        final String AvatarFilm = "Аватар";
        final int AvatarIncome = 2810;
        final String DarkKnightFilm = "Тёмный рыцарь";
        final int DarkKnightIncome = 1084;

        if (titanicIncome > AvatarIncome) {
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
