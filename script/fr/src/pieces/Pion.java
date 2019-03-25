package fr.src.pieces;
import fr.src.echec.Case;
import fr.src.echec.Piece;
import java.awt.Color;

public class Pion extends Piece {
	boolean initial;
	/**
	 * Constructeur de la classe Pion
	 */
	public Pion (Color couleur)
	{
		super(couleur);
		this.initial = true;
	}
	
	@Override
	public boolean estValide(Case c_initial, Case c_final)
	{
		
		return false;
	}

}
