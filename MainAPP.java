public class MainAPP {
    public static void main(String[] args){
        karyawan karyawan =new karyawan("anisa sholeha","montong bulok","087765893104");
        penggajian penggajian=new penggajian("Rp.2.000.000.000","Rp.1.500.000","Rp.4.000.000");
        status_pendidikan status_pendidikan=new status_pendidikan("aktif");
        jabatan jabatan= new jabatan("admin");

        karyawan.cetakkaryawan(karyawan.no_hp);
        penggajian.cetakpenggajian(penggajian.gajiPokok);
        jabatan.cetakjabatan(jabatan.jabatan);
        status_pendidikan.cetakstatus_pendidikan(status_pendidikan.status);

    }
}

