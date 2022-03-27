package practices;

import classes.models.unitmodels.Socket;

public class start {
    public static void main(String[] args) {
        int c = 9;

        String [ ][ ] chessBoard = new String[8][8];
        for (int i = 0; i < chessBoard.length; i++) {
            for (int j = 0; j < chessBoard[0].length; j++) {
                if((i + j) % 2 == 0) chessBoard[i][j] = "W";
                else chessBoard[i][j] = "B";
            }
        }

        for (int i = 0; i < chessBoard.length; i++) {
            c--;
            for (int j = 0; j < chessBoard[i].length; j++) {
                if(j == 0) System.out.print(c + "   ");
                System.out.print(" " + chessBoard[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.print("    ");
        char ch1 = '`';
        for (int i = 0; i < chessBoard.length; i++) {
            ch1++;
            System.out.print(" " + ch1 + " ");
        }
    }
}



