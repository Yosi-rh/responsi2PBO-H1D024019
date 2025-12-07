package pert1;

class UjiPengguna {
    public static void main(String[] args) {
        Pengguna p = new Pengguna();
        p.umur = 25;
        p.berat = 60.0;
        p.tinggi = 170.0;

        p.tampilInfo();

        // Tampilkan demonstrasi tentang konstanta final
//        p.faktorAktivitas = 1.5;
//
//        System.out.println("Nilai faktor aktivitas baru: " + p.faktorAktivitas);
    }
}
