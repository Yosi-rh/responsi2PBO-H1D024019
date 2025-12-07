class mesinMotor extends defaultMesin {
    private String tipeMotor;

    mesinMotor(String nama, int hp, String tipe) {
        super(nama, hp);
        this.tipeMotor = tipe;
    }

    @Override
    void tampilInfo() {
        System.out.print("Mesin Motor " + getNamaMesin() + " | Tipe: " + tipeMotor +
                " | Tenaga: " + getTenagaHP() + " HP");
    }

    @Override
    double nilaiPerforma() {
        return getTenagaHP() * 1.2;
    }

    @Override
    String kategoriMesin() {
        return "Mesin Motor";
    }

    void suaraMesin() {
        System.out.println("Brummm! Mesin motor menyala!");
    }
}