
/**
 * Klasse Fakultaet
 * beinhaltet zwei weitere Arten die Fakultaet zu berechnen
 * 
 * @author Samantha Maass & Hussein Abbas
 * @version 12.05.2019
 */
public class Fakultaet
{
     /**
     * Leerer Konstruktor
     */    
    public Fakultaet ()
    {
    }
    
    /**
     * Berechnet f(x) = x! 
     * als Top Level Klasse implementiert
     */
    public static int fakultaetTopLevelStatic (int x)
    {
        if(x == 0){
            return 1;
        }
        else{
            return x * fakultaetTopLevelStatic(x-1);
        }
    }

    public static void fakultaetTopLevel(int untereGrenze, int obereGrenze) {
        int zahl = 0;
        int wert = 0;

        for (int j = untereGrenze; j <= obereGrenze; j++)
        {
            wert = j;
            for (int i = 1 ; i <= j; i++)
                wert = wert * i;
            System.out.println (wert);
        }
    }

    public int fakultaetTopLevel (int x)
    {
        if(x == 0){
            return 1;
        }
        else{
            return x * fakultaetTopLevel(x-1);
        }
    }
    
    /**
     * Berechnet f(x) = x! 
     * als Static Nested Klasse implementiert
     */    
    public static class NestedClass
    {
        public static void fakultaetNestedClass(int untereGrenze, int obereGrenze) {
            int zahl = 0;
            int wert = 0;

            for (int j = untereGrenze; j <= obereGrenze; j++)
            {
                wert = j;
                for (int i = 1 ; i <= j; i++)
                    wert = wert * i;
                System.out.println (wert);
            }
        }

        public  int fakultaetNestedClass (int x)
        {
            if(x == 0){
                return 1;
            }
            else{
                return x * fakultaetNestedClass(x-1);
            }
        }

        public static int fakultaetNestedClassStatic (int x)
        {
            if(x == 0){
                return 1;
            }
            else{
                return x * fakultaetNestedClassStatic(x-1);
            }
        }
    }
}
 