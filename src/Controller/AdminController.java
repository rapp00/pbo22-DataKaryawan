package Controller;
import Entity.AdminEntity;
public class AdminController implements Incontroller{
    int indexLogin = 0;
    public AdminController() {
    }
    @Override
    public void dataAdmin() {
        String kodeAdmin[] = {"01"};
        String passwordAdmin[] = {"01"};
        String namaAdmin[] = {"Budi"};
        for(int i = 0; i < kodeAdmin.length; i++) {
            Allobject.adminModel.insertAdmin(new AdminEntity(kodeAdmin[i], passwordAdmin[i], namaAdmin[i]));
        }
    }

    public void login(String kodeAdmin, String passwordAdmin) {
        indexLogin = Allobject.adminModel.cekData(kodeAdmin, passwordAdmin);
    }

    public AdminEntity adminEntity() {
        return Allobject.adminModel.showDataAdmin(indexLogin);
    }

}

