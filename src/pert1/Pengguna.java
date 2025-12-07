package pert1;

class Pengguna {
    int umur;
    double berat;
    double tinggi;

    final double faktorAktivitas = 1.2;

    double hitungBMI() {
        double tinggiMeter = tinggi / 100;
        double bmi = berat / (tinggiMeter * tinggiMeter);

        return bmi;
    }

    void tampilKategori() {
        double bmi = hitungBMI();
        if (bmi < 18.5) {
            System.out.println("Kurus");
        } else if (bmi < 25) {
            System.out.println("Normal");
        } else {
            System.out.println("Obesitas");
        }
    }

    double hitungKalori() {
        double kalori = berat * faktorAktivitas * 10;
        return kalori;
    }

    void tampilInfo() {
        System.out.println("=== Informasi Kesehatan Pengguna ===");
        System.out.println("Umur: " + umur + " tahun");
        System.out.println("Berat: " + berat + " kg");
        System.out.println("Tinggi: " + tinggi + " cm");

        double bmi = hitungBMI();
        System.out.printf("BMI: %.2f%n", bmi);

        System.out.print("Kategori: ");
        tampilKategori();

        double kalori = hitungKalori();
        System.out.println("Kebutuhan Kalori: " + (int)kalori + " kal/hari");
        System.out.println("====================================");
    }
}
