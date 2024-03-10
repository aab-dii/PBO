import java.util.ArrayList;

public class Display {

    private ArrayList<Ultraman> ultramanList;

    public Display(ArrayList<Ultraman> ultramanList) {
        this.ultramanList = ultramanList;
    }

    public void displayAllUltraman() {
        int namaWidth = 20; // Panjang minimum untuk judul Nama
        int umurWidth = 6; // Panjang minimum untuk judul Umur
        int tinggiWidth = 6; // Panjang minimum untuk judul Tinggi
        int beratWidth = 6; // Panjang minimum untuk judul Berat
        int hostWidth = 20; // Panjang minimum untuk judul Human Host
        int kousenWidth = 10; // Panjang minimum untuk judul Kousen
        int eraWidth = 10; // Panjang minimum untuk judul Era
        for (Ultraman ultraman : ultramanList) {
            namaWidth = Math.max(namaWidth, ultraman.getNama().length());
            umurWidth = Math.max(umurWidth, String.valueOf(ultraman.getUmur()).length());
            tinggiWidth = Math.max(tinggiWidth, String.valueOf(ultraman.getTinggi()).length());
            beratWidth = Math.max(beratWidth, String.valueOf(ultraman.getBerat()).length());
            hostWidth = Math.max(hostWidth, ultraman.getHuman_host().length());
            kousenWidth = Math.max(kousenWidth, ultraman.getKousen().length());
            eraWidth = Math.max(eraWidth, ultraman.getEra().length());
        }
        int total = namaWidth + umurWidth + tinggiWidth + hostWidth + beratWidth + kousenWidth +eraWidth;
        String horizontalLine = "";
        String horizontalLine2 = "";
        for (int i = 0; i < total; i++) {
            horizontalLine += "=";
            horizontalLine2 += "-";
        }
        if (ultramanList.isEmpty()) {
            System.out.println("Data Kosong, Mohon Mengisi data terlebih dahulu");
        } else {
            System.out.println(horizontalLine);
            System.out.println("|                                       Ultraman List                                              |");
            System.out.println(horizontalLine);
            System.out.printf(
                    "| %-4s | %-" + (namaWidth + 1) + "s | %-" + (umurWidth + 1) + "s | %-" + (tinggiWidth + 1)
                            + "s | %-" + (beratWidth + 1)
                            + "s | %-" + (hostWidth + 1) + "s | %-" + (kousenWidth + 1) + "s | %-" + (eraWidth + 1)
                            + "s |\n",
                    "No.", "Nama", "Umur", "Tinggi", "Berat", "Human Host", "Kousen", "Era");

            int i = 0;
            for (Ultraman ultraman : ultramanList) {
                i++;
                System.out.println(horizontalLine2);
                System.out.printf(
                        "| %-4d | %-" + (namaWidth + 1) + "s | %-" + (umurWidth + 1) + "d | %-" + (tinggiWidth + 1)
                                + "d | %-" + (beratWidth + 1)
                                + "d | %-" + (hostWidth + 1) + "s | %-" + (kousenWidth + 1) + "s | %-" + (eraWidth + 1)
                                + "s |\n",
                        i, ultraman.getNama(), ultraman.getUmur(), ultraman.getTinggi(), ultraman.getBerat(),
                        ultraman.getHuman_host(), ultraman.getKousen(), ultraman.getEra());
            }

            System.out.println(horizontalLine);
        }
    }

}