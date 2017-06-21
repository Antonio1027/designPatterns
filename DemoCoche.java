class DemoCoche
{
	public static void main(String[] args){
		Coche coche = new Coche();
		coche.setModelo("Mazda 3");
		coche.setColor("Vino");
		coche.setMatricula(1234);

		coche.imprimirCoche();
		System.out.println("Matricula: " + coche.getMatricula());
	}
}