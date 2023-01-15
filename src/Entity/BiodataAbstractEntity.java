package Entity;

public abstract class BiodataAbstractEntity {

        protected String kode, password, nama;

        public BiodataAbstractEntity(String kode, String password, String nama) {
            this.kode = kode;
            this.password = password;
            this.nama = nama;
        }
        public abstract String getKode();
        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }

        public String getNama() {
            return nama;
        }

        public void setNama(String nama) {
            this.nama = nama;
        }

        public void setKode(String kode) {
            this.kode = kode;
        }


    }


