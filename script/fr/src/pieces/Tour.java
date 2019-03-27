package fr.src.pieces;
import fr.src.echec.Case;

public class Tour extends Piece {
	
	public Tour(Color couleur) 
	{
		super(couleur, "Tour");
	}
	
	@Override
	public boolean estValide (Case c_initial, Case c_final) 
	{
		//boolean valide;
	
		if(c_initial.getX() == c_final.getX() || c_initial.getY() == c_final.getY())
		{
			return true;
		}
			
		return false;	
	}

}
