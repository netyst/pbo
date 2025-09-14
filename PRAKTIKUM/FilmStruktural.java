public class FilmStruktural {
    public static void main(String[] args) {

        String[] judulFilm = new String[10];
        int[] durasiMenit= new int[10];
        int[] tahunRilis = new int[10];

        judulFilm[0] = "Laskar Pelangi";
        durasiMenit[0] = 124;
        tahunRilis[0] = 2008;

        judulFilm[1] = "Dilan 1990";
        durasiMenit[1] = 110;
        tahunRilis[1] = 2018;

        judulFilm[2] = "Dua Garis Biru";
        durasiMenit[2] = 110;
        tahunRilis[2] = 2018;

        judulFilm[3] = "Pengabdi Setan";
        durasiMenit[3] = 107;
        tahunRilis[3] = 2017;

        judulFilm[4] = "KKN Desa Penari";
        durasiMenit[4] = 130;
        tahunRilis[4] = 2022;

        judulFilm[5] = "Ayat-ayat Cinta";
        durasiMenit[5] = 120;
        tahunRilis[5] = 2008;

        judulFilm[6] = "Habibie dan Ainun";
        durasiMenit[6] = 133;
        tahunRilis[6] = 2012;

        judulFilm[7] = "Gita Cinta dari SMA";
        durasiMenit[7] = 108;
        tahunRilis[7] = 2023;

        judulFilm[8] = "Magic Hour";
        durasiMenit[8] = 114;
        tahunRilis[8] = 2015;

        judulFilm[9] = "Twivortiare";
        durasiMenit[9] = 110;
        tahunRilis[9] = 2019;

        System.out.println("----- 10 DATA FILM INDONESIA -----");

        for (int i = 0; i < judulFilm.length; i++) {
            System.out.println();
            durasiHitungJam(judulFilm[i], durasiMenit[i]);
            filmBaruCek(judulFilm[i],tahunRilis [i]);
            System.out.println("...........................................");
        }
    }

    public static void durasiHitungJam (String namaFilm, int lamaFilm){
        int jam = lamaFilm / 60;
        int menit = lamaFilm % 60;
        System.out.println(namaFilm + " adalah film dengan durasi " + jam + " jam " + menit + " menit");
    }

    public static void filmBaruCek (String namaFilm, int tahun) {
        if (tahun >= 2020) {
            System.out.println( namaFilm + " merupakan film kategori baru (" + tahun + ")");
        } else {
            System.out.println(namaFilm + " merupakan film kategori lama (" + tahun + ")");
        }
    }
}
        
        