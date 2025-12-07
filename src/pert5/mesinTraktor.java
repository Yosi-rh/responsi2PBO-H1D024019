class mesinTraktor extends defaultMesin {
    private double kapasitasTarik;

    mesinTraktor(String nama, int hp, double tarik) {
        super(nama, hp);
        this.kapasitasTarik = tarik;
    }

    @Override
    void tampilInfo() {
        System.out.print("Mesin Traktor " + getNamaMesin() + " | Tarik: " + kapasitasTarik +
                " ton | Tenaga: " + getTenagaHP() + " HP");
    }

    @Override
    double nilaiPerforma() {
        return (getTenagaHP() * 0.9) + (kapasitasTarik * 10);
    }

    @Override
    String kategoriMesin() {
        return "Mesin Traktor";
    }

    void suaraMesin() {
        System.out.println("GGGRRRR! Hidup mesinnn!");
    }

    double getKapasitasTarik() {
        return kapasitasTarik;
    }
}