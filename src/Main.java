public class Main {
    public static void main(String[] args) {
//        Person
        Person orang = new Person("Jacob","Bandung Lautan Api");
        String getname = orang.getName();
        String getadress = orang.getAdress();;
        System.out.println("Nama : " + getname);
        System.out.println("Alamat : " + getadress);
        System.out.println(orang);
        System.out.println("");

//        Sudent
        Student murid = new Student("Asep Buntal","Kota KLitih","S2",2023,1200);
        String setprogram = murid.getProgram();
        int setyear = murid.getYear();
        double setfee = murid.getFee();
        System.out.println("Program : " + setprogram);
        System.out.println("Tahun : " + setyear);
        System.out.println("UKT : " + setfee);
        System.out.println(murid);
        System.out.println("");

//        Staff
        Staff staff = new Staff("Aceng Sarip","Gotham City","Suzuran",154500);
        String setschool = staff.getSchool();
        double setpay = staff.getPay();
        System.out.println("Sekolah : " + setschool);
        System.out.println("Biaya : " + setpay);
        System.out.println(staff);
    }
}