public class Mobil extends Kendaraan{
    public Mobil(int kapasitasTanki, String bahanBakar) {
        setKapasitasTanki(kapasitasTanki);
        setBahanBakar(bahanBakar);
    }

    @Override
    public void isiBensin(String tipe, String jumlah) {
        if (isiTanki == getKapasitasTanki()){
            System.out.println("tanki sudah penuh, tidak perlu diisi lagi");
            return;
        }
        super.isiBensin(tipe, jumlah);
    }

    @Override
    public void isiBensin(String tipe, int jumlah) {
        if (isiTanki == getKapasitasTanki()){
            System.out.println("tanki sudah penuh, tidak perlu diisi lagi");
            return;
        }
        super.isiBensin(tipe, jumlah);
    }
}
