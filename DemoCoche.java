class DemoCoche
{
	public static void main(String[] args){
		Coche coche = new Coche();
		coche.modelo = "Mazda 3";
		coche.color = "Vino";

		System.out.println("Modelo:" + coche.modelo + " Color: " + coche.color);
	}
}