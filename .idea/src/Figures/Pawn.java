package Figures;

import java.util.ArrayList;
import java.util.Arrays;

public class Pawn extends Figure {

    public Pawn(boolean isblack, int position) {
        this.value = 10;
        this.isBlack = isblack;
        this.position = position;
        this.possibleMoves = new ArrayList<>(Arrays.asList(8)); // am Anfang 16?
    }
}
