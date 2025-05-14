public class Kendaraan {
    private String bahanBakar; // diesel atau bensin
    private int kapasitasTanki;
    public int isiTanki = 0;

    public String getBahanBakar() {
        return bahanBakar;
    }

    public void setBahanBakar(String bahanBakar) {
        this.bahanBakar = bahanBakar;
    }

    public int getKapasitasTanki() {
        return kapasitasTanki;
    }

    public void setKapasitasTanki(int kapasitasTanki) {
        this.kapasitasTanki = kapasitasTanki;
    }

    public void isiBensin(String tipe, String jumlah) {
        if (!tipe.equals(bahanBakar)) {
            System.out.println("bahan bakar tidak sesuai");
            return;
        }
        if (!jumlah.equals("full")) {
            System.out.println("terjadi kesalahan dalam pengisian bensin.");
            return;
        }
        System.out.println("pengisian bensin berhasil dengan " + tipe + " sebanyak " + (kapasitasTanki - isiTanki) + " liter.");
        isiTanki = kapasitasTanki;
    }

    public void isiBensin(String tipe, int jumlah) {
        if (!tipe.equals(bahanBakar)) {
            System.out.println("bahan bakar tidak sesuai");
            return;
        }
        if ((jumlah + isiTanki) > kapasitasTanki) {
            System.out.println("tanki tidak dapat menerima semua bahan bakar");
            System.out.println("jumlah yang dipakai             = " + (kapasitasTanki - isiTanki) + " liter");
            System.out.println("jumlah yang tidak dapat dipakai = " + (jumlah + isiTanki - kapasitasTanki) + " liter");
            isiTanki = kapasitasTanki;
            System.out.println("pengisisan bensin berhasil.");
        } else {
            System.out.println("pengisian bensin berhasil dengan " + tipe + " sebanyak " + jumlah + " liter.");
            isiTanki += jumlah;
        }
    }
}