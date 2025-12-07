class mesinTraktorListrik extends mesinTraktor {
    private double kapasitasBaterai;

    mesinTraktorListrik(String nama, int hp, double tarik, double baterai) {
        super(nama, hp, tarik);
        this.kapasitasBaterai = baterai;
    }

    @Override
    void tampilInfo() {
        // Pakai getter untuk kapasitasTarik
        System.out.print("Mesin Traktor Listrik " + getNamaMesin() + " | Tarik: " +
                getKapasitasTarik() + " ton | Baterai: " + kapasitasBaterai +
                " kWh | Tenaga: " + getTenagaHP() + " HP");
    }

    @Override
    double nilaiPerforma() {
        return (getTenagaHP() * 1.1) + (kapasitasBaterai * 5);
    }

    @Override
    String kategoriMesin() {
        return "Mesin Traktor Listrik";
    }

    @Override
    void suaraMesin() {
        System.out.println("Bzzzzz! Mesin traktor listrik aktif!");
    }
}