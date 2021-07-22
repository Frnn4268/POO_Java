public class Quest {

    private static final int NOT_PICKED = 0;
    private static final int PICKED = 1;
    private static final int COMPLETED = 2;

    //Status
    private String Nombre;
    private int Vida;
    private int Status;

    //Get and set
    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getVida() {
        return Vida;
    }

    public void setVida(int reward) {
        this.Vida = Vida;
    }  
    
    public void changeToPicked(){
        this.Status = PICKED;
    }
    
    public void changeToNotPicked(){
        this.Status = NOT_PICKED;
    }
    
    public void changeToCompleted(){
        this.Status = COMPLETED;
    }
}
