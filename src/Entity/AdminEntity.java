package Entity;

public class AdminEntity extends BiodataAbstractEntity{
    public AdminEntity(String kode, String password, String nama) {
        super(kode, password, nama);
    }

    @Override
    public String getKode() {
        return kode;
    }
}
