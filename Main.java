public class Main {
    public static void main(String[] args) {
        NguoilaoDong ql = new NguoilaoDong("Nguyen Van A", "QL01", 10000000);
        NguoilaoDong nv = new NhanVien("Tran Thi B", "NV01", 8000000, 24);
        NguoilaoDong gv = new GiangVien("Le Van C", "GV01", 9000000, 40, 150000);

        System.out.println("--- THONG TIN NGOI LAO DONG ---");
        ql.hienThiThongTin();
        nv.hienThiThongTin();
        gv.hienThiThongTin();
    }
}
