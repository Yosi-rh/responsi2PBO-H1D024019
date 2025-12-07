package pert7;

public class EWalletPayment implements PaymentMethod {
    private String namaLayanan;
    private double nominalPembayaran;
    private double saldo;

    public EWalletPayment(String namaLayanan, double nominalPembayaran, double saldo) {
        this.namaLayanan = namaLayanan;
        this.nominalPembayaran = nominalPembayaran;
        this.saldo = saldo;
    }

    public void processPayment() {
        double total = nominalPembayaran + getTransactionFee();
        if (saldo >= total) {
            saldo = saldo - total;
            System.out.println("Pembayaran berhasil!");
        } else {
            System.out.println("Pembayaran gagal! Saldo tidak cukup.");
        }
    }

    public String getPaymentDetails() {
        return "Pembayaran dilakukan melalui " + namaLayanan;
    }

    public double getTransactionFee() {
        return 2000.0;
    }

    public double getBalance() {
        return saldo;
    }

    public double getTotalBayar() {
        return nominalPembayaran + getTransactionFee();
    }
}
