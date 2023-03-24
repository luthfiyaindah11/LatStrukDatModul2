/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author USER
 */

import java.util.ArrayList;
public class LatMod2 {
     public static void main(String[] args){
     ArrayList<String>ObjekHewan = new ArrayList<>();
     ArrayList<String>DeleteHewan = new ArrayList<>();
     
     ObjekHewan.add("Sapi");
     ObjekHewan.add("Kelinci");
     ObjekHewan.add("Kambing");
     ObjekHewan.add("Unta");
     ObjekHewan.add("Domba");
     
         System.out.println("Sebelum dihapus"+ObjekHewan);
         
         DeleteHewan.add("Kelinci");
         DeleteHewan.add("Kambing");
         DeleteHewan.add("Unta");
         
         System.out.println("Hewan yang dihapus"+DeleteHewan);
         ObjekHewan.removeAll(DeleteHewan);
         System.out.println("Output : "+ObjekHewan);
     }
}
