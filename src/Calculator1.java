public class Calculator1 extends Calculator {
    public void setJudul(){
        System.out.println("Ini adalah operasi perhitungan penjumlahan dengan abstract class");
    }
    public static void main(String[] args) {
        Calculator1 newObj = new Calculator1();
        newObj.setJudul();
        newObj.setJumlah(5,8);
    }
}
