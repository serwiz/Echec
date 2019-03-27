package fr.src.echec;
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
    
   public boolean existeObstacle (Case c_initial, Case c_final)
    {
	   int i;
    	switch (c_initial.retourneContenu().getName())
    	{
    		case "Pion":
    			if ((c_initial.getX()+1 == c_final.getX() || c_final.getX() == c_initial.getX()-1) && c_final.getY() == c_initial.getY()+1)
    				return false;
    			
    			for (i=c_initial.getY()+1; i<c_final.getY()+1; ++i)
    			{
    				if(this.terrain[c_initial.getX()] [i].retourneContenu() != null)
    					return true;
    			}
    			return false;
    			
    		case "Tour":
    			int x = 0;
    			if(c_initial.getX() == c_final.getX() && c_final.getY() > c_initial.getY())
    			{
    				x = 1;
    			}
    			else if(c_initial.getX() == c_final.getX() && c_final.getY() < c_initial.getY())
    			{
    				x = -1;
    			}
    			
    			for(i=c_initial.getY()+1; i<c_final.getY()+1; i = i+x)
    			{
    				if(this.terrain [c_final.getX()] [i].retourneContenu() != null)
    				{
    					
    				}
    			}	
 
    			break;
    		case "Roi":
    			
    			break;
    		case "Reine":
    			
    			break;
    		case "Fou":
    			
    			break;
    		case "Cavalier":
    			return false;
    			break;
    		default:
    			return false;
    			break;
    			
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
