public class LatihanOperatorRelasi {
    public static void main(String[] args) {
        int x,y,z ;
        x = 100;
        y = 99;
        z = 99;
        System.out.println("Nilai x = " +x);
        System.out.println("Nilai y = " +y);
        System.out.println("Nilai z = " +z);
        // Operator sama dengan
        if (y == z) {
            System.out.println("y sama dengan z");
        }else {
            System.out.println("y tidak sama dengan z");
        }
        // Operator tidak sama dengan
        if (x != y){
            System.out.println("x tidak sama dengan y");
        }else {
            System.out.println("x sama dengan y");
        }
        // Operator lebih besar dari
        if (x > y) {
            System.out.println("x lebih besar dari y");
        }
        if (y < x) {
            System.out.println("y lebih kecil dari x");
        }
        // Operator lebih besar dari atau sama dengan
        if (x >= y) {
            System.out.println("x lebih besar dari atau sama dengan y");
        }
        if (y <= x) {
            System.out.println("y lebih kecil dari atau sama dengan x");
        }
    }
}