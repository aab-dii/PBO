package Character;

public class character {
    private int tinggi, berat, umur;
    private String nama ;

    public character(int tinggi, int berat, String nama, int umur) {
        this.tinggi = tinggi;
        this.berat = berat;
        this.nama = nama;
        this.umur = umur;
    }

    public int getUmur() {
        return umur;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }

    public int getTinggi() {
        return tinggi;
    }
    public void setTinggi(int tinggi) {
        this.tinggi = tinggi;
    }
    public int getBerat() {
        return berat;
    }
    public void setBerat(int berat) {
        this.berat = berat;
    }
    public String getNama() {
        return nama;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
}

