
/**
 * Cette classe représente les cases (abscisse, ordonnés, contenu) et leurs méthodes.
 *
 * @author Serhan Wissam
 * @version 18/03/2019
 */
public class Case
{
    // contenu de la case
    private Piece contenu;
   
    /**
     * Constructeur d'objets de classe Case
     * Attribue les coordonnées de la case et son contenu
     */
    public Case()
    {
        this.contenu = null;
    }
    
    public Case(Piece contenu)
    {
        // initialisation des variables d'instance
        this.contenu = contenu;
    }
    
    /**
     * Change le contenu d'une case
     * 
     * @param 		contenu de type Piece
     */
    public void changeContenu(Piece contenu)
    {
    	this.contenu = contenu;
    }
    
    /**
     * Retourne le contenu de la case de type piece ou null
     * 
     * @return 		contenu de la case
     */
    public Piece retourneContenu()
    {
    	return this.contenu;
    }
    /**
     * Test si la case est vide
     * 
     * @return     true si la case est vide faux sinon
     */
    public boolean estVide()
    {
        return (this.contenu == null);
    }
}
