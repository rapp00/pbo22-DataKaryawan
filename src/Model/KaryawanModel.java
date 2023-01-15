package Model;
import Entity.KaryawanEntity;
import java.util.ArrayList;
import java.util.Scanner;

public class KaryawanModel implements in {
    Scanner input = new Scanner(System.in);
    public ArrayList<KaryawanEntity> karyawanEntityArrayList;

    public KaryawanModel() {
        karyawanEntityArrayList = new ArrayList<KaryawanEntity>();
    }

    public void insertkaryawan(KaryawanEntity karyawan) {
        karyawanEntityArrayList.add(karyawan);
    }

    public ArrayList<KaryawanEntity> getdaftarkaryawanarraylist() {
        return karyawanEntityArrayList;
    }

    public ArrayList<KaryawanEntity> alldatakaryawan() {
        return karyawanEntityArrayList;
    }

    public int size() {
        return karyawanEntityArrayList.size();
    }

    @Override
    public void tampildaftar() {
        int nomor;
        for (KaryawanEntity karyawanEntity : karyawanEntityArrayList) {
            nomor = 1 + karyawanEntityArrayList.indexOf(karyawanEntity);
            System.out.println("========================================");
            System.out.println(nomor);
            System.out.println("Nama   : " + karyawanEntity.getNama());
            System.out.println("Umur   : " + karyawanEntity.getUmur());
            System.out.println("Alamat : " + karyawanEntity.getAlamat());
            System.out.println("========================================");
        }
    }

    public int search (int index)
    {
        if (index < this.karyawanEntityArrayList.size())
            return index;
        else
            return -1;
    }

    public void update(int index, int pilih,String data)
    {

        if (search(index)==-1)
        {

            System.out.println("data tidak ditemukan");
        }
        else
        {

            switch (pilih) {
                case 1:

                    karyawanEntityArrayList.get(index).setNama(data);
                    break;
                case 2:

                    karyawanEntityArrayList.get(index).setUmur(data);
                    break;
                case 3:

                    karyawanEntityArrayList.get(index).setAlamat(data);
                    break;
                default:
            }
        }
    }

    public void delete(int index)
    {
        if (search(index)==-1)
        {

        }
        if (index == -1)
        {
        }
        else
        {
            karyawanEntityArrayList.remove(index);
            System.out.println("berhasil dihapus");
        }
    }
}

