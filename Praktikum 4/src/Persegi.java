public class Persegi extends BangunDatar {
    private int sisi;
    public void setSisi(int sisi) {
        this.sisi = sisi;
    }
    public int getSisi() {
        return sisi;
    }

    public void luas(){
        System.out.println("Luas Persegi       = sisi * sisi");
    }
    public void keliling(){
        System.out.println("Keliling Persegi   = 4 * sisi");
    }
}
