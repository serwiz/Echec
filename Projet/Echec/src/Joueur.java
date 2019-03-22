import java.util.ArrayList;
import java.awt.color.*;
/**
 * Cette classe concerne les joueurs et leurs méthodes
 *
 * @author Serhan Wissam
 * @version Mars 2019
 */
public class Joueur
{
    // mode == 0 ? : IA || mode == 1 ? : Player
    private int mode;
    // couleur du joueur
    private Color couleur;
    // Liste des pièces restantes au joueur
    private ArrayList<Piece> p_Liste;
    /**
     * Constructeur d'objets de classe Joueur
     */
    public Joueur(int mode)
    {
        // Joueur ou IA ?
        this.mode = mode;
        // Liste des pièces du joueur pleine au départ
        for(int i=0; i<nb_pieces; i++)
        {
            
        }
    }

    /**
     * Un exemple de méthode - remplacez ce commentaire par le vôtre
     *
     * @param  y   le paramètre de la méthode
     * @return     la somme de x et de y
     */
    
}
