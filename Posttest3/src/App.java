import java.util.Scanner;

import Character.Ultraman;
import Character.Kaiju;

import java.util.ArrayList;

public class App {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);// inisialisasi input
        ArrayList<Ultraman> dataultramans = new ArrayList<>();// inisialisasi array Ultraman
        ArrayList<Kaiju> datakaiju = new ArrayList<>();// inisialisasi array Kaiju
        Display ultramanDisplay = new Display(dataultramans);// inisialisasi display Ultraman
        Display kaijuDisplay = new Display(datakaiju, true);// inisialisasi display Kaiju
        int pilih = 0;// deklarasi variabel pilih
        while (pilih != 5) {// perulangan utama
            System.out.println("============================================");
            System.out.println("| Program Pendataan Ultraman di Nebula M78 |");
            System.out.println("============================================");
            System.out.println("| [1]. Create Data                         |");
            System.out.println("| [2]. Read Data                           |");
            System.out.println("| [3]. Update Data                         |");
            System.out.println("| [4]. Delete Data                         |");
            System.out.println("| [5]. Exit                                |");
            System.out.println("============================================");
            System.out.print("Masukkan Pilihan >> ");
            pilih = sc.nextInt();// input pilihan
            switch (pilih) {// statement switch berdasarkan variabel pilih
                case 1:
                    System.out.println("============================================");
                    System.out.println("|               Create Data                |");
                    System.out.println("============================================");
                    System.out.println("| 1. Ultraman                              |");
                    System.out.println("| 2. Kaiju                                 |");
                    System.out.println("============================================");
                    pilih = sc.nextInt();// input pilihan
                    switch (pilih) {
                        case 1:
                            System.out.println("============================================");
                            System.out.println("|           Create Data Ultraman           |");
                            System.out.println("============================================");
                            sc.nextLine();// membersihkan buffer input setelah input integer
                            System.out.print("Masukkan Nama :");
                            String nama = sc.nextLine();// input nama

                            System.out.print("Masukkan Umur :");
                            int umur = sc.nextInt();// input umur

                            System.out.print("Masukkan Tinggi :");
                            int tinggi = sc.nextInt();// input tinggi

                            System.out.print("Masukkan Berat :");
                            int berat = sc.nextInt();// input berat

                            System.out.print("Masukkan Kecepatan :");
                            int kecepatan = sc.nextInt();// input kecepatan

                            sc.nextLine();// membersihkan buffer input setelah input integer
                            System.out.print("Masukkan Human Host :");
                            String human_host = sc.nextLine();// input human host

                            System.out.print("Masukkan Kousen :");
                            String kousen = sc.nextLine();// input kousen

                            System.out.print("Masukkan Era :");
                            String era;
                            int erap;

                            do {
                                System.out.println("1. Showa");
                                System.out.println("2. Heisei");
                                System.out.println("3. New Generation");
                                System.out.println("4. Reiwa");
                                erap = sc.nextInt();// input era

                                switch (erap) {
                                    case 1:
                                        era = "Showa";
                                        break;
                                    case 2:
                                        era = "Heisei";
                                        break;
                                    case 3:
                                        era = "New Generation";
                                        break;
                                    case 4:
                                        era = "Reiwa";
                                        break;
                                    default:
                                        era = "Unknown";
                                        break;
                                }

                                if (erap < 1 || erap > 4) {
                                    System.out.println("Input tidak valid. Masukkan nomor era yang sesuai.");
                                }
                            } while (erap < 1 || erap > 4);

                            Ultraman ultbr = new Ultraman(umur, tinggi, berat, kecepatan, nama, human_host, kousen,
                                    era);
                            dataultramans.add(ultbr);// menambahkan data kedalam array
                            System.out.println("Data Berhasil ditambahkan");
                            break;

                        case 2:
                            System.out.println("============================================");
                            System.out.println("|           Create Data Ultraman           |");
                            System.out.println("============================================");
                            sc.nextLine();

                            System.out.print("Masukkan Nama Kaiju :");
                            nama = sc.nextLine();// input nama

                            System.out.print("Masukkan Umur Kaiju :");
                            umur = sc.nextInt();// input umur

                            System.out.print("Masukkan Tinggi Kaiju :");
                            tinggi = sc.nextInt();// input tinggi

                            System.out.print("Masukkan Berat Kaiju:");
                            berat = sc.nextInt();// input berat

                            Kaiju kaiju = new Kaiju(tinggi, berat, nama, umur);
                            datakaiju.add(kaiju);
                            break;
                        default:
                            System.out.println("Invalid Input");
                            break;

                    }
                case 2:
                    System.out.println("============================================");
                    System.out.println("|                Read Data                 |");
                    System.out.println("============================================");
                    System.out.println("| [1]. Ultraman                            |");
                    System.out.println("| [2]. Kaiju                               |");
                    System.out.println("============================================");
                    pilih = sc.nextInt();
                    switch (pilih) {
                        case 1:
                            ultramanDisplay.displayAllUltraman();// menampilkan isi arraylist ultraman
                            break;
                        case 2:
                            kaijuDisplay.displayAllKaiju();// menampilkan isi arraylist kaiju
                            break;
                        default:
                            break;
                    }
                    break;

                case 3:
                    System.out.println("============================================");
                    System.out.println("|                Read Data                 |");
                    System.out.println("============================================");
                    System.out.println("| [1]. Ultraman                            |");
                    System.out.println("| [2]. Kaiju                               |");
                    System.out.println("============================================");
                    pilih = sc.nextInt();
                    switch (pilih) {
                        case 1:
                            ultramanDisplay.displayAllUltraman();// menampilkan isi arraylist

                            if (dataultramans.isEmpty()) {// check data di arraylist
                                break;
                            }

                            System.out.print("Masukkan Nomor Yang Ingin Diubah : ");
                            int ubah = sc.nextInt();// input index

                            if (!isValidIndex(ubah, dataultramans)) {// check jika index valid
                                System.out.println("Nomor tidak valid.");
                                break;
                            }

                            sc.nextLine();// membersihkan buffer input setelah input integer
                            System.out.print("Masukkan Nama :");
                            String namabr = sc.nextLine();// input nama baru

                            System.out.print("Masukkan Umur :");
                            int umurbr = sc.nextInt();// input umur baru

                            System.out.print("Masukkan Tinggi :");
                            int tinggibr = sc.nextInt();// input tinggi baru

                            System.out.print("Masukkan Berat :");
                            int beratbr = sc.nextInt();// input berat baru

                            System.out.print("Masukkan Kecepatan :");
                            int kecepatanbr = sc.nextInt();// input kecepatan baru

                            sc.nextLine();// membersihkan buffer input setelah input integer
                            System.out.print("Masukkan Human Host :");
                            String humanbr = sc.nextLine();// input human host baru

                            System.out.print("Masukkan Kousen :");
                            String kousenbr = sc.nextLine();// input kousen baru

                            System.out.print("Masukkan Era :");
                            String erabr;
                            int erap;
                            do {
                                System.out.println("1. Showa");
                                System.out.println("2. Heisei");
                                System.out.println("3. New Generation");
                                System.out.println("4. Reiwa");
                                erap = sc.nextInt();// input era baru

                                switch (erap) {
                                    case 1:
                                        erabr = "Showa";
                                        break;
                                    case 2:
                                        erabr = "Heisei";
                                        break;
                                    case 3:
                                        erabr = "New Generation";
                                        break;
                                    case 4:
                                        erabr = "Reiwa";
                                        break;
                                    default:
                                        erabr = "Unknown";
                                        break;
                                }

                                if (erap < 1 || erap > 4) {
                                    System.out.println("Input tidak valid. Masukkan nomor era yang sesuai.");
                                }
                            } while (erap < 1 || erap > 4);

                            while (pilih != 1 && pilih != 2) {// perulangan konfirmasi pengubahan data
                                System.out.println("Anda Yakin Ingin Mengubah Nomor " + ubah + " ?");
                                System.out.println("==========================");
                                System.out.println("| [1]. Ya     [2]. Tidak |");
                                System.out.println("==========================");
                                System.out.print("Masukkan Pilihan : ");
                                pilih = sc.nextInt();// input pilihan
                                switch (pilih) {// statement switch berdasarkan variabel pilih
                                    case 1:// pilihan ya
                                           // mengubah data di arraylist sesuai index berdasarkan inputan baru
                                        dataultramans.get(ubah - 1).setNama(namabr);
                                        dataultramans.get(ubah - 1).setUmur(umurbr);
                                        dataultramans.get(ubah - 1).setTinggi(tinggibr);
                                        dataultramans.get(ubah - 1).setBerat(beratbr);
                                        dataultramans.get(ubah - 1).setKecepatan(kecepatanbr);
                                        dataultramans.get(ubah - 1).setHuman_host(humanbr);
                                        dataultramans.get(ubah - 1).setKousen(kousenbr);
                                        dataultramans.get(ubah - 1).setEra(erabr);
                                        System.out.println("Data Berhasil Diubah");
                                        break;
                                    case 2:// pilihan tidak
                                        System.out.println("Data Batal Diubah");
                                        break;
                                    default:// pilihan tidak valid
                                        System.out.println("Invalid Input");
                                        break;

                                }
                            }
                            break;
                        case 2:
                            kaijuDisplay.displayAllKaiju();// menampilkan isi arraylist

                            if (datakaiju.isEmpty()) {// check data di arraylist
                                break;
                            }

                            System.out.print("Masukkan Nomor Yang Ingin Diubah : ");
                            ubah = sc.nextInt();// input index

                            if (!isValidIndex(ubah, datakaiju)) {// check jika index valid
                                System.out.println("Nomor tidak valid.");
                                break;
                            }

                            sc.nextLine();// membersihkan buffer input setelah input integer
                            System.out.print("Masukkan Nama :");
                            namabr = sc.nextLine();// input nama baru

                            System.out.print("Masukkan Umur :");
                            umurbr = sc.nextInt();// input umur baru

                            System.out.print("Masukkan Tinggi :");
                            tinggibr = sc.nextInt();// input tinggi baru

                            System.out.print("Masukkan Berat :");
                            beratbr = sc.nextInt();// input berat baru

                            while (pilih != 1 && pilih != 2) {// perulangan konfirmasi pengubahan data
                                System.out.println("Anda Yakin Ingin Mengubah Nomor " + ubah + " ?");
                                System.out.println("==========================");
                                System.out.println("| [1]. Ya     [2]. Tidak |");
                                System.out.println("==========================");
                                System.out.print("Masukkan Pilihan : ");
                                pilih = sc.nextInt();// input pilihan
                                switch (pilih) {// statement switch berdasarkan variabel pilih
                                    case 1:// pilihan ya
                                           // mengubah data di arraylist sesuai index berdasarkan inputan baru
                                        datakaiju.get(ubah - 1).setNama(namabr);
                                        datakaiju.get(ubah - 1).setUmur(umurbr);
                                        datakaiju.get(ubah - 1).setTinggi(tinggibr);
                                        datakaiju.get(ubah - 1).setBerat(beratbr);
                                        System.out.println("Data Berhasil Diubah");
                                        break;
                                    case 2:// pilihan tidak
                                        System.out.println("Data Batal Diubah");
                                        break;
                                    default:// pilihan tidak valid
                                        System.out.println("Invalid Input");
                                        break;
                                }
                            }
                            break;
                        default:
                            System.out.println("Invalid Input");
                            break;
                    }
                    break;
                case 4:
                    System.out.println("============================================");
                    System.out.println("|                Read Data                 |");
                    System.out.println("============================================");
                    System.out.println("| [1]. Ultraman                            |");
                    System.out.println("| [2]. Kaiju                               |");
                    System.out.println("============================================");
                    pilih = sc.nextInt();
                    switch (pilih) {
                        case 1:
                            ultramanDisplay.displayAllUltraman();// menampilkan isi arraylist

                            if (dataultramans.isEmpty()) {// check data di arraylist
                                break;
                            }

                            System.out.print("Masukkan Nomor yang Ingin Dihapus : ");
                            int hapus = sc.nextInt();// input index hapus

                            if (!isValidIndex(hapus, dataultramans)) {// check index valid
                                System.out.println("Nomor tidak valid.");
                                break;
                            }

                            while (pilih != 1 && pilih != 2) {// perulangan konfirmasi hapus
                                System.out.println("Anda Yakin Ingin Menghapus Nomor " + hapus + " ?");
                                System.out.println("==========================");
                                System.out.println("| [1]. Ya     [2]. Tidak |");
                                System.out.println("==========================");
                                System.out.print("Masukkan Pilihan : ");
                                pilih = sc.nextInt();// input pilihan
                                switch (pilih) {
                                    case 1:// pilihan ya
                                        dataultramans.remove(hapus - 1);// menghapus data berdasarkan index hapus
                                        System.out.println("Data Berhasil Dihapus");
                                        break;
                                    case 2:// pilihan tidak
                                        System.out.println("Data Batal DIhapus");
                                        break;
                                    default:
                                        System.out.println("Invalid Input");
                                        break;
                                }
                            }
                            break;
                        case 2:
                            kaijuDisplay.displayAllKaiju();// menampilkan isi arraylist

                            if (datakaiju.isEmpty()) {// check data di arraylist
                                break;
                            }

                            System.out.print("Masukkan Nomor yang Ingin Dihapus : ");
                            hapus = sc.nextInt();// input index hapus

                            if (!isValidIndex(hapus, datakaiju)) {// check index valid
                                System.out.println("Nomor tidak valid.");
                                break;
                            }

                            while (pilih != 1 && pilih != 2) {// perulangan konfirmasi hapus
                                System.out.println("Anda Yakin Ingin Menghapus Nomor " + hapus + " ?");
                                System.out.println("==========================");
                                System.out.println("| [1]. Ya     [2]. Tidak |");
                                System.out.println("==========================");
                                System.out.print("Masukkan Pilihan : ");
                                pilih = sc.nextInt();// input pilihan
                                switch (pilih) {
                                    case 1:// pilihan ya
                                        datakaiju.remove(hapus - 1);// menghapus data berdasarkan index hapus
                                        System.out.println("Data Berhasil Dihapus");
                                        break;
                                    case 2:// pilihan tidak
                                        System.out.println("Data Batal DIhapus");
                                        break;
                                    default:
                                        System.out.println("Invalid Input");
                                        break;
                                }
                            }
                            break;
                        default:
                            break;
                    }
                    break;
                case 5:// keluar program
                    System.out.println("Terimakasih Telah Menggunakan Program Ini :)");
                    break;
                default:
                    break;
            }
        }
        sc.close();
    }

    private static <T> boolean isValidIndex(int index, ArrayList<T> dataList) {
        return index >= 1 && index <= dataList.size();
    }

}
