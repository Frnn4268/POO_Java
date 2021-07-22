public class Personajes {
  
    public static void main(String[] args){
        
        Aldeano Aldeano1 = new Aldeano();
        Aldeano1.Nombre();
        Aldeano1.Vida();
        Aldeano1.Mod_Vida();
        
        Heroe Heroe1 = new Heroe();
        Heroe1.Nombre();
        Heroe1.Vida();
        Heroe1.Mod_Vida();
        
        Elfo Elfo1 = new Elfo();
        Elfo1.Nombre();
        Elfo1.Vida();
        Elfo1.Mod_Vida();
        
        Guerrero Guerrero1 = new Guerrero_Nórdico();
        Guerrero1.Nombre();
        Guerrero1.Vida();
        Guerrero1.Atacar();
        
        Guerrero Guerrero2 = new Guerrero_Jaguar();
        Guerrero2.Nombre();
        Guerrero2.Vida();
        Guerrero2.Atacar();
    }
}
