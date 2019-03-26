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
		this.name = "Pion";
	}
	
	public boolean getStatus()
	{
		return this.initial;
	}
	
	@Override
	public boolean estValide(Case c_initial, Case c_final)
	{
		// deplacement normal
		if( (c_final().getX() == c_initial.getX && ( c_final().getY() == c_initial.getY()+1 
				|| (c_final().getY() == c_initial.getY()+2 && this.initial) ) )
		{
			return true;
		} // mange un pion
		else if( (c_final.getX() == c_initial.getX()+1 || c_final.getX() == c_initial.getX()-1) 
				&& c_final.getY() == c_initial.getY()+1 && (c_final.contenu.getColor() != this.couleur && c_final.!estVide()) )
		{
			return true;
		}
		else return false;
	}
}
