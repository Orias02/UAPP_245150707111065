
package uap.bases;


public abstract class BaseCetakan {
    protected double volume;
    protected double luasPermukaan;
    protected double massa;

    public abstract void hitungVolume();
    public abstract void hitungLuasPermukaan();
    public abstract void hitungMassa();

    public void printInfo() {
        System.out.printf("Volume          : %.2f\n", volume);
        System.out.printf("Luas permukaan  : %.2f\n", luasPermukaan);
        System.out.printf("Massa           : %.2f\n", massa);
    }

    public double getMassa() {
        return massa;
    }
}
