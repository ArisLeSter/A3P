
/**
 * Write a description of class Vtc here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Vtc
{
    // instance variables - replace the example below with your own
    private int aRoues;
    private boolean aRemplissage;
    private static int aNombre;
    private static final int MIN_ROUES = 2; 
    
    static {aNombre = 0;}

    /**
     * Constructor for objects of class Vtc
     */
    public Vtc(final int pRoues)
    {
        aNombre++;
        this.aRoues = pRoues;
        this.aRemplissage = false;
    }

    
    public void roule()
    {
        System.out.print("("+this.aRemplissage+")");
        System.out.println(" "+"Les "+this.aRoues+" roues tournent.");
    }
    
    public void freine()
    {
        System.out.println("J'appuie sur le frein.");
    }
    
    public boolean estComplet()
    {
        return this.aRemplissage;
    }
    
    public void invComplet()
    {
        this.aRemplissage = !this.aRemplissage;
    }
    
    public static void getaNombre()
    {
        System.out.println("Il y a "+aNombre+" véhicules de transport en commun.");
    }
}
