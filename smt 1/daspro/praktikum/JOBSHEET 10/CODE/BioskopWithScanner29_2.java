import java.util.Scanner;

public class BioskopWithScanner29_2 {
    public static void main(String[] args) {
        Scanner input29 = new Scanner (System.in);
        String [][] penonton = new String[4][2];

        // no 2. membuat pilihan menu
        while (true) {
            System.out.println("Pilihan Menu : ");
            System.out.println("1. Input data penonton");
            System.out.println("2. Tampilan daftar penonton");
            System.out.println("3. Exit");
            System.out.print("Masukkan pilihan anda : ");
            int inputMenu = input29.nextInt();
            input29.nextLine();

            switch (inputMenu) {
                case 1: 
                    System.out.println("1. Input data penonton"); //jika user memilih 1, maka yang ditampilkan adalah input data penonton
                    int baris, kolom;
                    String nama, next;

                        System.out.print("Masukkan nama : ");
                        nama = input29.nextLine();
                        System.out.print("Masukkan baris : ");
                        baris = input29.nextInt();
                        System.out.print("Masukkan kolom : ");
                        kolom = input29.nextInt();
                        input29.nextLine();


                        if (baris >= 1 && baris <=4 && kolom >= 1 && kolom <= 2) {
                            if (penonton[baris-1][kolom-1] == null) {
                                penonton[baris-1][kolom-1] = nama;
                                System.out.println("Data penonton telah terinput");
                            } else {
                                System.out.println("Mohon maaf, kursi telah terisi"); //no 4. warning kursi telah terisi
                                System.out.println("Silahkan kembali ke pilihan menu");
                            }  
                        } else {
                            System.out.println("Baris dan kolom kursi tidak tersedia"); //no. 3 meghandle kursi
                        }
                        break;

                        
                case 2:
                System.out.println("2. Tampilan daftar penonton "); //jika user memilih 2, maka yang ditampilkan adalah daftar penonton
                for (int i = 0; i < 4; i++) {
                    for (int j = 0; j < 2; j++) {
                        if (penonton[i][j] != null) {
                            System.out.println("Baris " + ( i + 1)+ " Kolom " + (j + 1) + " : "+ penonton [i][j]);
                        } else {
                            System.out.println("Baris " + ( i + 1)+ " Kolom " + (j + 1) + " : *** ");
                        }
                    }
                }     
                break;

                case 3:
                System.out.println("Terimakasih telah berkunjung!");  //jika user memilih 3, maka yang ditampilkan adalah menu exit/keluar
                input29.close();
                System.exit(0);
                break;

                default:
                System.out.println("Pilihan menu invalid, silahkan coba lagi");
                break;
                        
                }
                } 
            }
            }
            
    
