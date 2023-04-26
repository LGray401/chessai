import Figures.*;

import java.util.ArrayList;

class Main{

    public static void main(String[] args) {

        Queen testQueen = new Queen(true, 20);
        ArrayList<Integer> testMoves = testQueen.listMoves();
        System.out.println(testMoves.size());

        for(int i = 0; i < testMoves.size(); i++) {
                System.out.println(testMoves.get(i));
        }
    }

}