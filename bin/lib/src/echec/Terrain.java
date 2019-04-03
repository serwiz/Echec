package lib.src.echec;
/**
 * Cette classe représente le terrain (et ses méthodes), qui est unique et contient un tableau de type Case, 
 * c'est par lui que tout se fera.
 *
 * @author Serhan Wissam 
 * @version 18/03/2019
 */
public class Terrain
{
    private final int nb_case = 8;
    private Case terrain[][];    

    /**
     * Constructeur d'objets de classe Terrain
     * Créé le terrain de jeu
     */
    public Terrain()
    {
        // initialisation des variables d'instance
    	this.terrain = new Case[nb_case][nb_case];
    	for(int i=0; i<nb_case; i++)
    	{
    		for(int j=0; j<nb_case; j++)
    		{
    			this.terrain [i] [j] = new Case (i, j);
    		}
    	}
    }
    /**
     * Fonction permettant de tester l'existence d'un obstacle sur le déplacement d'une pièce
     * @param		c_initial	case de départ de la pièce
     * @param		c_final		case d'arrivée de la pièce
     * @return 		Vrai si il y a un obstacle sur le déplacement de la pièce Faux sinon
     */
   public boolean existeObstacle (Case c_initial, Case c_final)
    {
	    int i;
    	switch (c_initial.retourneContenu().getName())
    	{
    		case "pion":
    			if ((c_initial.getX()+1 == c_final.getX() || c_final.getX() == c_initial.getX()-1) && c_final.getY() == c_initial.getY()+1)
    				return false;
    			
    			for (i=c_initial.getY()+1; i<c_final.getY()+1; ++i)
    			{
    				if(this.terrain[c_initial.getX()] [i].retourneContenu() != null)
    					return true;
    			}
    			return false;
    			
    		case "tour":
    			// Déplacement vertiacle case finale au-dessus de la case initiale
       			if(c_initial.getX() == c_final.getX() && c_final.getY() > c_initial.getY())
    			{
    				for(i=c_initial.getY()+1; i<c_final.getY(); ++i)
        			{
        				if(this.terrain [c_final.getX()] [i].retourneContenu() != null)
        				{
        					return true;
        				}
        			}	
    			}
       			// Déplacement verticale case finale en-dessous de la case initiale
       			else if(c_initial.getX() == c_final.getX() && c_final.getY() < c_initial.getY())
    			{
    				for(i=c_initial.getY()-1; i>c_final.getY(); --i)
        			{
        				if(this.terrain [c_final.getX()] [i].retourneContenu() != null)
        				{
        					return true;
        				}
        			}
    			}
       			// Déplacement horizontale case finale à droite de la case initiale
    			else if(c_initial.getY() == c_final.getY() && c_final.getX() > c_initial.getX())
    			{
    				for(i=c_initial.getX()+1; i<c_final.getX(); ++i)
        			{
        				if(this.terrain [i] [c_initial.getY()].retourneContenu() != null)
        				{
        					return true;
        				}
        			}	
    			}
       			// Déplacement horizontale case finale à gauche de la case initiale
    			else if(c_initial.getY() == c_final.getY() && c_final.getX() < c_initial.getX())
    			{
    				for(i=c_initial.getX()-1; i>c_final.getX(); --i)
        			{
        				if(this.terrain [i] [c_initial.getY()].retourneContenu() != null)
        				{
        					return true;
        				}
        			}	
    			} 			
    			return false;
    		case "roi":
    			return (c_final.retourneContenu() != null && c_final.retourneContenu().getColor() == c_initial.retourneContenu().getColor());
    		case "reine":
    			
    			break;
    		case "fou":
    			
    			break;
    		case "cavalier":
    			return false;
    			
    		default:
    			return false;
    	}
    	return false;
    }
   
    public boolean deplacement (Case c_initial, Case c_final)
    {
    	if(!(c_initial.estVide()) && this.terrain [c_initial.getX()] [c_initial.getY()].retourneContenu().estValide(c_initial, c_final) )
    	{
    		c_final.changeContenu (c_initial.retourneContenu());
    		c_initial.changeContenu (null);
    		return true;
    	}
    	else
    	{
    		return false;
    	}
    }
    
}
