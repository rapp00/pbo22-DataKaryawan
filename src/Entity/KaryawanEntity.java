package Entity;

public class KaryawanEntity {
    private String Nama;
    private String Umur;
    private String Alamat;

    public KaryawanEntity(String nama, String umur, String alamat) {
        this.Nama = nama;
        this.Umur = umur;
        this.Alamat = alamat;
    }

    public String getNama() {
        return Nama;
    }

    public void setNama(String nama) {
        Nama = nama;
    }

    public String getUmur() {
        return Umur;
    }

    public void setUmur(String umur) {
        Umur = umur;
    }

    public String getAlamat() {
        return Alamat;
    }

    public void setAlamat(String alamat) {
        Alamat = alamat;
    }
}
