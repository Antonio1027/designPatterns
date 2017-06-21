
class DemoCoche {

    public static void main(String[] args) {

        Coche coche = new Coche("mazda 3", "plata");

        coche.setMatricula(1234);
        coche.imprimirCoche();
        System.out.println("Matricula: " + coche.getMatricula());

        Coche coche2 = new Coche("Fiesta", "rojo", 55445);
        coche2.imprimirCoche();
        System.out.println("Matricula: " + coche2.getMatricula());
    }
}
