package Character;

public class Kaiju extends character{
    public Kaiju(int tinggi, int berat, String nama, int umur){
        super(tinggi, berat, nama, umur);
    }
    @Override
    public void setNama(String nama){
        this.nama = nama;
    }
}
