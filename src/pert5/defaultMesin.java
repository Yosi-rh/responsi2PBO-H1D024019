class defaultMesin {
    private String namaMesin;
    private int tenagaHP;

    defaultMesin(String nama, int hp) {
        this.namaMesin = nama;
        this.tenagaHP = hp;
    }

    void tampilInfo() {
        System.out.print("Mesin " + namaMesin + " | Tenaga: " + tenagaHP + " HP");
    }

    double nilaiPerforma() {
        return tenagaHP * 1.0;
    }

    String kategoriMesin() {
        return "Mesin Umum";
    }

    // Getter methods
    String getNamaMesin() {
        return namaMesin;
    }

    int getTenagaHP() {
        return tenagaHP;
    }
}