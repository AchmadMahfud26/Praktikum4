public class Lingkaran {
    private int r;

    public void setR(int r) {
        this.r = r;
    }
    public int getR() {
        return r;
    }
    
    public float luas;
    public float keliling;

    public void luas(){
        System.out.println("Luas Lingkaran     = 3,14 * r * r");
    }
    public void keliling(){
        System.out.println("Keliling Lingkaran = 2 * 3,14 * r");
    }
}
