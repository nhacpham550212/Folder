/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package composite59cntt3;

/**
 *
 * @author Admin
 */
public class ComPoSite59CNTT3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         AbstractFile data = new Folder("Data");
        AbstractFile toanFolder = new  Folder("Toan");
         AbstractFile daiSo = new File("DaiSo12.doc");
          AbstractFile tichPhan = new File("TichPhan12.doc");
        AbstractFile lyFolder = new Folder("Ly");
        AbstractFile DaiCuong = new  Folder("Ly Dai Cuong");
         AbstractFile HoaFolder = new  Folder("Hoa");
        AbstractFile Hoa = new File("Hoa12.pdf" );
       
       
        data.add(toanFolder);
        toanFolder.add(daiSo);
        toanFolder.add(tichPhan);
        
        data.add(lyFolder);
        lyFolder.add(DaiCuong);
        
        data.add(HoaFolder);
        HoaFolder.add(Hoa);
        System.out.println(data.getTreeFolder());
        System.out.println(daiSo.getPath());
        toanFolder.remove(tichPhan);
        System.out.println("\n");
        System.out.println(data.getTreeFolder());
        
       
    }
    
}
