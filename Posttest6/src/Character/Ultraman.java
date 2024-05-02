package Character;

public class Ultraman extends character {
    //inisialisasi variabel
    private int kecepatan;
    private String human_host, kousen, era;

    //konstruktor
    public Ultraman(int umur, int tinggi, int berat, int kecepatan,String nama, String human_host, String kousen, String era) {
        super(tinggi, berat, nama, umur);
        this.setKecepatan(kecepatan);
        this.setHuman_host(human_host);
        this.setKousen(kousen);
        this.setEra(era);
    }

    //getter
    public int getKecepatan() {
        return kecepatan;
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
    
    @Override
    public void setNama(String nama){
        this.nama = nama;
    }
}
