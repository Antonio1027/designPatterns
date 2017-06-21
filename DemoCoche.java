class DemoCoche
{
	public static void main(String[] args){
		Coche coche = new Coche("Mazda 3", "Vino");
		coche.setMatricula(1234);
		coche.imprimirCoche();
		System.out.println("Matricula: " + coche.getMatricula());
	}
}