package jawabansoalno2;

import javax.swing.*;

/**
 *
 * @author ridho
 */
public class JawabanSoalNo2 {

    public static void main(String[] args) {
       
        String  customer = "", tgl = "", kdBrg = "", nmBrg = "";
        double harga = 0.0;
        int jml = 0;
        
        double subTotal = 0.0, total = 0.0, jmlBayar = 0.0, jmlKembali = 0.0;
        String dataKeluar = "";
        int no = 0, ulang = 0, cetak = 0;
        
        tgl = JOptionPane.showInputDialog("Inputkan Tanggal Transaksi : ");
        customer = JOptionPane.showInputDialog("Inputkan Nama Customer : ");
        
        do{
            JOptionPane.showMessageDialog(null,"_____Kode Barang____\n"
                    + "KD1    = Asus\n"
                    + "KD2    = Acer\n"
                    + "KD3    = Mac Book Air\n"
                    + "KD4    = Thosiba\n"
                    + "KD5    = Samsung");
            
            kdBrg = JOptionPane.showInputDialog("Masukkan Kode Barang : ");
            if(kdBrg.equals("KD1")){
                nmBrg = "Asus";
                harga = 150000.0;
            }else if(kdBrg.equals("KD2")){
                nmBrg = "Acer";
                harga = 200000.0;
            }else if(kdBrg.equals("KD3")){
                nmBrg = "Mac Book Air";
                harga = 100000.0;
            }else if(kdBrg.equals("KD4")){
                nmBrg = "Thosiba";
                harga = 300000.0;
            }else if(kdBrg.equals("KD5")){
                nmBrg = "Samsung";
                harga = 400000.0;
            }
            
            no++;
            jml = Integer.parseInt(JOptionPane.showInputDialog("Item = "+ no +
                    "\nKode Barang : " + kdBrg+
                    "|Nama Barang : " + nmBrg+
                    "\nHarga : " + harga +
                    "\n\n"
                    + "---------------------------Masukkan Jumlah : "));
            
            subTotal = jml * harga;
            total = total + subTotal;
            
            dataKeluar = dataKeluar+ "No : "+no+
                    "\nKode Barang : " + kdBrg+
                    "\nNama Barang : " + nmBrg+
                    "\nHarga : " + harga +
                    "\nJumlah : " + jml+
                    "\nSubTotal : " + subTotal + "\n\n";
            
            ulang = Integer.parseInt(JOptionPane.showInputDialog("Apakah Anda Akan Input Data Lagi ?" +
                                                "\n1.Ya" + "\n2.Tidak \n Jawab"));
                    
            
        }while(ulang==1);
        
        jmlBayar = Double.parseDouble(JOptionPane.showInputDialog("Total Transaksi : Rp. "+ total
                +"\n\nMasukkan Jumlah Bayar : "));
                jmlKembali = jmlBayar - total;
                
                cetak = Integer.parseInt(JOptionPane.showInputDialog("Apakah anda akan "
                        + "mencetak data barang keluar ? "+
                        "\n1. Ya \n 2. Tidak \n Jawab"));
        
        
        if(cetak==1){
        JOptionPane.showMessageDialog(null, 
                "\nTgl Transaksi : "+tgl+
                "\nCustomer : "+customer+ "\n==========================================\n"+ dataKeluar+
                "\nTotal Transaksi : Rp. "+total+
                "\n======================================================================\n"+
                "\nJumlah Bayar : Rp. "+jmlBayar+
                "\nJumlah Kembali : Rp. "+jmlKembali);
        }else {
            JOptionPane.showMessageDialog(null, "End");
        }
        
    }
    
}
