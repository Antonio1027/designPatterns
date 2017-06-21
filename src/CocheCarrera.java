/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rm
 */
public class CocheCarrera extends Coche{

    private int numVictorias;
    private int rpm;
    
    public CocheCarrera(int rpm,int numVictorias,String modelo, String color,int matricula) {
        super(modelo, color);
        this.numVictorias= numVictorias;
        this.rpm=rpm;
    }

    public String premiacion(){
        return "numero victorias: "+this.numVictorias + " rpm: "+ this.rpm+" agencia: "+Coche.AGENCIA;
    }
    public int getNumVictorias() {
        return numVictorias;
    }

    public void setNumVictorias(int numVictorias) {
        this.numVictorias = numVictorias;
    }

    public int getRpm() {
        return rpm;
    }

    public void setRpm(int rpm) {
        this.rpm = rpm;
    }
    
    
}
