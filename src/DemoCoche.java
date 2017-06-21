
class DemoCoche {

    public static void main(String[] args) {

        Coche coche = new Coche();

        coche.setMatricula(1234);
        coche.setModelo("mazda 3");
        coche.setColor("plata");
        coche.imprimirCoche();
        System.out.println("Matricula: " + coche.getMatricula());
    }
}
