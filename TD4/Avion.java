
/**
 * Write a description of class Avion here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Avion extends Vtc
{
    // instance variables - replace the example below with your own
    private int aRéacteurs;

    /**
     * Constructor for objects of class Avion
     */
    public Avion(final int pRoues, final int pRéacteurs)
    {
        super(pRoues);
        this.aRéacteurs = pRéacteurs;
    }

    public void vole()
    {
        System.out.println("Je vole.");
    }
    
    @Override public void roule()
    {
        if(this.estComplet())
        {
            System.out.println("Je pousse les réacteurs.");
            super.roule();
        }
    }
    
    @Override
    public void freine()
    {
        System.out.println("J'inverse les "+this.aRéacteurs+" réacteurs.");
        super.freine();
    }
}
