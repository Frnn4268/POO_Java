public class Aldeano extends Personaje{

    @Override
    public void Nombre() {
        System.out.println("Aldeano");
    }

    @Override
    public void Vida() {
        System.out.println("50ps");
    }
    
    @Override
    public void Mod_Vida() {
        System.out.println("Vida no Modificable");
        System.out.println("");
    }
}
