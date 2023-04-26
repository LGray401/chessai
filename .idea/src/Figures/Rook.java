package Figures;

import java.util.ArrayList;
import java.util.Arrays;

public class Rook extends Figure {

    public Rook (boolean isblack, int position) {
        this.value = 50;
        this.isBlack = isblack;
        this.position = position;
        this.possibleMoves = new ArrayList<>(Arrays.asList(1,-1,8,-8)); // später in Methode * n multiplizieren mit n = [1,7]
    }
}
