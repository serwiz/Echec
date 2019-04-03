package lib.src.pieces;
import lib.src.echec.Case;
import lib.src.echec.Piece;
import java.awt.Color;

public class Cavalier extends Piece {

	public Cavalier(Color couleur) {
		super(couleur, "cavalier");
	}

	@Override
	public boolean estValide(Case c_initial, Case c_final) {
		return false;
	}

	
}
