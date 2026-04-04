class Dosen {
    String kode;
    String nama;
    String jenisKelamin;
    int usia;

    Dosen(String kd, String nm, String jk, int age) {
        kode = kd;
        nama = nm;
        jenisKelamin = jk;
        usia = age;
    }

    void tampil() {
        String jk;

        if (jenisKelamin.equalsIgnoreCase("L")) {
            jk = "Laki-laki";
        } else {
            jk = "Perempuan";
        }

        System.out.println("Kode : " + kode);
        System.out.println("Nama : " + nama);
        System.out.println("JK   : " + jk);
        System.out.println("Usia : " + usia);
        System.out.println("----------------------");
    }
}