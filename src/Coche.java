
class Coche {

    protected final static String AGENCIA = "Ford";

    private String modelo;
    private String color;
    private boolean pinturaMetalizada;
    private int matricula;
    private int anioFabricacion;

    public Coche(String modelo, String color) {
        this.modelo = modelo;
        this.color = color;
    }

    public Coche(String modelo, String color, int matricula) {
        this.modelo = modelo;
        this.color = color;
        this.matricula = matricula;
    }

    public String getModelo() {
        return this.modelo;
    }

    public String getColor() {
        return this.color;
    }

    public int getMatricula() {
        return this.matricula;
    }

    public int getAnioFabricacion() {
        return this.anioFabricacion;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public void imprimirCoche() {
        System.out.println("Modelo: " + this.modelo + " Color: " + this.color);
    }

    public static void imprimirAgencia() {
        System.out.println("Agencia: " + Coche.AGENCIA);
    }

}
