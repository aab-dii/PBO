package Character;

public abstract class character {
    protected int tinggi, berat, umur;
    protected String nama ;

    // Constructor
    public character(int tinggi, int berat, String nama, int umur) {
        this.tinggi = tinggi;
        this.berat = berat;
        this.nama = nama;
        this.umur = umur;
    }

    // getter
    public int getUmur() {
        return umur;
    }

    public int getTinggi() {
        return tinggi;
    }

    public int getBerat() {
        return berat;
    }

    public String getNama() {
        return nama;
    }
    
    public void setUmur(int umur) {
        this.umur = umur;
    }

    public void setTinggi(int tinggi) {
        this.tinggi = tinggi;
    }
    
    public void setBerat(int berat) {
        this.berat = berat;
    }

    //abstract method
    public abstract void setNama(String nama);
}

