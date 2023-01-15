package Controller;
import Entity.KaryawanEntity;
import javax.swing.table.DefaultTableModel;

public class KaryawanController {
    public void tambahkaryawan(String Nama, String Umur, String Alamat) {
        Allobject.karyawanModel.insertkaryawan(new KaryawanEntity(Nama,Umur,Alamat));
    }

    public void tampilkan(){
        Allobject.karyawanModel.tampildaftar();
    }

    public void editkaryawan(int index, int pilih ,String data){
        Allobject.karyawanModel.update(index-1,pilih,data);
    }

    public void hapusKaryawan(int index){
        Allobject.karyawanModel.delete(index-1);
    }

    public DefaultTableModel daftarkaryawa(){
        DefaultTableModel dtmdaftarkaryawan = new DefaultTableModel();
        Object[] kolom ={" No "," Nama "," Umur ","Alamat"};
        dtmdaftarkaryawan.setColumnIdentifiers(kolom);
        int size = Allobject.karyawanModel.alldatakaryawan().size();
        for (int i=0;i<size;i++){

            Object [] data = new Object[4];
            data[0] = i+1;
            data[1] = Allobject.karyawanModel.alldatakaryawan().get(i).getNama();
            data[2] = Allobject.karyawanModel.alldatakaryawan().get(i).getUmur();
            data[3] = Allobject.karyawanModel.alldatakaryawan().get(i).getAlamat();

            dtmdaftarkaryawan.addRow(data);
        }
        return dtmdaftarkaryawan;
    }
}

