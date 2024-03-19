public class Ultraman {
    //inisialisasi variabel
    private int umur, tinggi, berat, kecepatan;
    private String nama, human_host, kousen, era;

    //konstruktor
    public Ultraman(int umur, int tinggi, int berat, int kecepatan,String nama, String human_host, String kousen, String era) {
        this.setUmur(umur);
        this.setTinggi(tinggi);
        this.setBerat(berat);
        this.setNama(nama);
        this.setKecepatan(kecepatan);
        this.setHuman_host(human_host);
        this.setKousen(kousen);
        this.setEra(era);
    }

    //getter
    public int getUmur() {
        return umur;
    }

    public int getTinggi() {
        return tinggi;
    }

    public int getBerat() {
        return berat;
    }

    public int getKecepatan() {
        return kecepatan;
    }

    public String getNama() {
        return nama;
    }

    public String getHuman_host() {
        return human_host;
    }

    public String getKousen() {
        return kousen;
    }

    public String getEra() {
        return era;
    }

    //setter
    public void setUmur(int umur) {
        this.umur = umur;
    }

    public void setTinggi(int tinggi) {
        this.tinggi = tinggi;
    }

    public void setBerat(int berat) {
        this.berat = berat;
    }

    public void setKecepatan(int kecepatan) {
        this.kecepatan = kecepatan;
    }

    public void setHuman_host(String human_host) {
        this.human_host = human_host;
    }

    public void setKousen(String kousen) {
        this.kousen = kousen;
    }

    public void setEra(String era) {
        this.era = era;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
        
}
