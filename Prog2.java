public class Prog2 {
    String nama, alamat, notlp, email, js, jt, w;
    Integer ttl, penyedia, alat, bahan, trans;

    public program2(String ww, String nama, String alamat, String notlp,
            String email, String ttl, String penyedia,
            String alat, String bahan, String trans, String js, String jt) {
        this.nama = nama;
        this.alamat = alamat;
        this.notlp = notlp;
        this.email = email;
        this.ttl = ttl;
        this.alat = alat;
        this.bahan = bahan;
        this.trans = trans;
        this.js = js;
        this.jt = jt;
        this.w = ww;
    }

    public String getnama() {
        return nama;
    }

    public String getalamat() {
        return alamat;
    }

    public String getnotlp() {
        return notlp;
    }

    public String getemail() {
        return email;
    }

    public String getttl() {
        return ttl;
    }

    public String getalat() {
        return alat;
    }

    public String getbahan() {
        return bahan;
    }

    public String gettrans() {
        return trans;
    }

    public String getjs() {
        return js;
    }

    public String getww() {
        return ww;
    }

}