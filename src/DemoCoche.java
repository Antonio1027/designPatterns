
class DemoCoche {

    public static void main(String[] args) {

        Coche coche = new Coche("mazda 3","plata");

        coche.setMatricula(1234);
        coche.imprimirCoche();
        System.out.println("Matricula: " + coche.getMatricula());
    }
}
