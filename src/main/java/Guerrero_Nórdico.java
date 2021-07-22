public class Guerrero_Nórdico implements Guerrero{

    @Override
    public void Nombre() {
        System.out.println("Guerrero Nórdico");
    }

    @Override
    public void Vida() {
        System.out.println("200ps");
    }

    @Override
    public void Atacar() {
        System.out.println("+20");
        System.out.println("");
    }
}
