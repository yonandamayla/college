import java.util.Scanner;
public class PenggolonganUkt {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);    
        int penghasilan;

        System.out.print("Masukkan penghasilan : ");
        penghasilan = sc.nextInt();

        if (penghasilan >= 100000 && penghasilan <= 10000000){
            if (penghasilan >= 100000 && penghasilan <= 500000){
            System.out.println("Anda termasuk golongan 1");
            System.out.println("Maka anda harus membayar 500.000");
            } else if(penghasilan >= 600000 && penghasilan <= 1000000){
            System.out.println("Anda termasuk golongan 2");
            System.out.println("Maka anda harus membayar 1.000.000");
            }else if (penghasilan >= 1500000 && penghasilan <= 2000000){
            System.out.println("Anda termasuk golongan 3");
            System.out.println("Maka anda harus membayar 1.500.000");
            }else if (penghasilan >= 2500000 && penghasilan <= 3500000){
            System.out.println("Anda termasuk golongan 4");
            System.out.println("Maka anda harus membayar 2.000.000");
            }else if(penghasilan >= 4000000 && penghasilan <= 5000000){
            System.out.println("Anda termasuk golongan 5");
            System.out.println("Maka anda harus membayar 3.000.000");
            }
        } else {
            System.out.println("Anda tidak termasuk golongan apapun");
        }
        
}
}
