package fr.src.echec;
import java.awt.Color;
/**
 * Cette classe concerne les pieces du jeu d'échec et leurs méthodes.
 *
 * @author Serhan Wissam
 * @version 18/03/2019
 */
public abstract class Piece
{
    // Couleur des pièces (noire ou blanche)
    private Color couleur;
    
    /**
     * Constructeur d'objets de classe Pieces
     * Attribue une couleur (noir/blanc) à la pièce
     */
    public Piece(Color couleur)
    {
        // initialisation des variables d'instance
        this.couleur = couleur;
    }
    
    public Color getColor() 
    {
    	return this.couleur;
    }
    /**
     * méthode abstraite pour les déplacements
     *
     * @return     void
     */
    public abstract void deplacement();
}
