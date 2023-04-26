package Figures;

import java.util.ArrayList;
import java.util.Arrays;

public class Bishop extends Figure {

    public Bishop(boolean isblack, int position) {
        this.value = 30;
        this.isBlack = isblack;
        this.position = position;
        this.possibleMoves =new ArrayList<>(Arrays.asList(9,-9,7,-7)); // später in Methode * n multiplizieren mit n = [1,7]
    }
}
