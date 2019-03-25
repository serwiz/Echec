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
    			this.terrain[i][j]= new Case(i, j);
    		}
    	}
    }
   
    public int deplacement(Case c_initial, Case c_final)
    {
    	return 0;
    }
    
}
