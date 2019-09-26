/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10118005.latihan4.kambing;

/**
 *
 * @author USER
 * NAMA   : Rycho Rantung
 * KELAS  : IF-1
 * NIM    : 10118005
 * Deskripsi Program : Program ini berisi program untuk menambah kambing
 */
public class Kambing {
 
    public void tambahKambing() {
        int jumlahKambing = 0;
        
        jumlahKambing = jumlahKambing + 5;
        System.out.println("Jumlah kambing setelah ditambah: "+
                jumlahKambing);
    }

    public static void main(String[] args) {
        // TODO code application logic here
        Kambing kambingJantan = new Kambing();
        kambingJantan.tambahKambing();
    }
    
}
