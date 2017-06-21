
class DemoCoche {

    public static void main(String[] args) {

        Coche.imprimirAgencia();

        Coche coche = new Coche("Mazda 3", "plata");
        coche.setMatricula(1234);
        coche.imprimirCoche();
        System.out.println("Matricula: " + coche.getMatricula());

        Coche coche2 = new Coche("Fiesta", "rojo", 55445);
        coche2.imprimirCoche();
        System.out.println("Matricula: " + coche2.getMatricula());
        
        CocheCarrera cocheCarrera1= new CocheCarrera(200,5,"BMW", "NEON",666);
        System.out.println("Datos del coche de carreras: "+cocheCarrera1.premiacion());
    }
}
