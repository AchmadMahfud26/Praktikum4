public class Segitiga extends BangunDatar {
    private int alas;
    private int tinggi;

    public void setAlas(int alas) {
        this.alas = alas;
    }
    public int getAlas() {
        return alas;
    }
    public void setTinggi(int tinggi) {
        this.tinggi = tinggi;
    }
    public int getTinggi() {
        return tinggi;
    }
    public void luas(){
        System.out.println("Luas Segitiga      = 1/2 * alas * tinggi");
    }
    public void keliling(){
        System.out.println("Keliling Segitiga  = sisi A + sisi B + sisi C");
    }
}
