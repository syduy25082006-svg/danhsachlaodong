public class QuanLy extends NguoilaoDong {
    private double heSoTrachNhiem;

    public QuanLy(String hoTen, String maSo, double luongCoBan, double heSoTrachNhiem) {
        super(hoTen, maSo, luongCoBan);
        this.heSoTrachNhiem = heSoTrachNhiem;
    }

    @Override
    public double tinhLuong() {
        return luongCoBan * heSoTrachNhiem;
    }

    @Override
    public void hienThiThongTin() {
        super.hienThiThongTin();
        System.out.println("Chuc vu: Quan ly | He so trach nhiem: " + heSoTrachNhiem + " | Tong luong: " + tinhLuong());
    }
}
