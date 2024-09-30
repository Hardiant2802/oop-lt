public class QLNS {
    GiangVien gv;
    SinhVien sv;
    Person p;

    public QLNS(GiangVien gv, SinhVien sv, Person p) {
        this.gv = gv;
        this.sv = sv;
        this.p = p;
    }

    public GiangVien getGv() {
        return gv;
    }

    public void setGv(GiangVien gv) {
        this.gv = gv;
    }

    public SinhVien getSv() {
        return sv;
    }

    public void setSv(SinhVien sv) {
        this.sv = sv;
    }

    public Person getP() {
        return p;
    }

    public void setP(Person p) {
        this.p = p;
    }

    public static void main(String[] args) {
        QLNS qlns = new QLNS();
        qlns.setGv(new GiangVien("Nguyen Van A", "1990"));
        qlns.setSv(new SinhVien("Nguyen Van B", "23020531", "2005"));
        qlns.setP(new Person("Nguyen Van C", "1998"));
        System.out.println(qlns.getGv().getHoTen() + " " + qlns.getGv().getNamSinh());
        System.out.println(qlns.getSv().getHoTen() + " " + qlns.getSv().getMaSinhVien() + " " + QLNS.getSv().getNamSinh());
        System.out.println(qlns.getP().getHoTen() + " " + qlns.getP().getNamSinh());
    }
}
