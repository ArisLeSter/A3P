
/**
 * Write a description of class Utilisation here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Utilisation
{
    public void essai()
    {
        Vtc.getaNombre();
        
        Vtc vVtc1 = new Vtc(6);
        Vtc.getaNombre();
        vVtc1.roule();
        vVtc1.freine();
        
        Avion vAirbus = new Avion(4,2);
        Vtc.getaNombre();
        vAirbus.invComplet();
        vAirbus.roule();
        vAirbus.vole();
        vAirbus.freine();
        
        Vtc vVtc2 = new Avion(8,4);
        Vtc.getaNombre();
        vVtc2.roule();
        
        Avion vA =  (Avion)vVtc2;
        vA.vole();
        vA.freine();     
              
    }
}
