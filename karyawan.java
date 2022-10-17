
public class karyawan {
    String nama;
    String alamat;
    String no_hp;
    karyawan(String parannama,String paranalamat,String paranno_hp){
        this.nama = parannama;
        this.alamat = paranalamat;
        this.no_hp = paranno_hp;

    }

    void cetakkaryawan(String no_hp){
        System.out.println("nama karyawan ="+ nama + "alamat="+ alamat + "no_hp ="+ no_hp);
    }
}
