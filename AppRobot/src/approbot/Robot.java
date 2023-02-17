
package approbot;

/*CLASE DE ROBOT CON SUS CARACTERÍSTICAS
 */
public class Robot {
    private int manos;//el cliente nos dira si el robot tiene una mano o dcs
    private String partedeabajo;//el cliente nos dira si el robot tiene ruedas o piernas

    public Robot() {
    }
    
    public Robot(int manos, String partedeabajo) {//hay que indicarle si el robot tiene 1 o 2 manos y si tiene
        // ruedas o piernas
        this.manos = manos;
        this.partedeabajo = partedeabajo;
    }
    
    public int getPinzas() {
        return manos;
    }

    public String getPartedeabajo() {
        return partedeabajo;
    }

    public void setPinzas(int manos) {
        this.manos = manos;
    }

    public void setPartedeabajo(String partedeabajo) {
        this.partedeabajo = partedeabajo;
    }
}
