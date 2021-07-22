public class Heroe extends Personaje{

    @Override
    public void Nombre() {
        System.out.println("Heroe");
    }

    @Override
    public void Vida() {
        System.out.println("150ps");
    }
    
    @Override
    public void Mod_Vida() {
        System.out.println("Vida Modificable");
        System.out.println("");
    }
}
