class analisisMesin {
    public static void main(String[] args) {
        defaultMesin[] semuaMesin = new defaultMesin[5];

        semuaMesin[0] = new mesinMotor("Honda Supra X", 125, "Bebek");
        semuaMesin[1] = new mesinTraktor("Kubota MX5200", 520, 5.0);
        semuaMesin[2] = new mesinTraktorListrik("EcoTrac Z900", 300, 4.2, 70);
        semuaMesin[3] = new mesinMotor("Yamaha R25", 250, "Sport");
        semuaMesin[4] = new mesinTraktorListrik("Volta FarmX", 200, 3.5, 80);

        System.out.println("=== DATA MESIN MEGATECH ===");

        for (int i = 0; i < semuaMesin.length; i++) {
            semuaMesin[i].tampilInfo();
            System.out.println();
            System.out.println("Kategori: " + semuaMesin[i].kategoriMesin());
            System.out.println("Performa: " + semuaMesin[i].nilaiPerforma());
            System.out.println();
        }

        System.out.println("=== SUARA MESIN ===");

        for (int i = 0; i < semuaMesin.length; i++) {
            if (semuaMesin[i] instanceof mesinMotor) {
                mesinMotor motor = (mesinMotor) semuaMesin[i];
                motor.suaraMesin();
            } else if (semuaMesin[i] instanceof mesinTraktor) {
                if (semuaMesin[i] instanceof mesinTraktorListrik) {
                    mesinTraktorListrik traktorListrik = (mesinTraktorListrik) semuaMesin[i];
                    traktorListrik.suaraMesin();
                } else {
                    mesinTraktor traktor = (mesinTraktor) semuaMesin[i];
                    traktor.suaraMesin();
                }
            }
        }

        System.out.println("\n=== MESIN PERFORMA TERTINGGI ===");

        defaultMesin mesinTerbaik = semuaMesin[0];
        double performaTertinggi = semuaMesin[0].nilaiPerforma();

        for (int i = 1; i < semuaMesin.length; i++) {
            double performaSekarang = semuaMesin[i].nilaiPerforma();
            if (performaSekarang > performaTertinggi) {
                performaTertinggi = performaSekarang;
                mesinTerbaik = semuaMesin[i];
            }
        }

        System.out.println(mesinTerbaik.getNamaMesin() + " → " + performaTertinggi);

        System.out.println("\n=== TOP 3 MESIN TERBAIK ===");

        for (int i = 0; i < semuaMesin.length - 1; i++) {
            for (int j = 0; j < semuaMesin.length - 1 - i; j++) {
                if (semuaMesin[j].nilaiPerforma() < semuaMesin[j + 1].nilaiPerforma()) {
                    defaultMesin temp = semuaMesin[j];
                    semuaMesin[j] = semuaMesin[j + 1];
                    semuaMesin[j + 1] = temp;
                }
            }
        }

        for (int i = 0; i < 3 && i < semuaMesin.length; i++) {
            System.out.println((i + 1) + ". " + semuaMesin[i].getNamaMesin() +
                    " → " + semuaMesin[i].nilaiPerforma());
        }
    }
}