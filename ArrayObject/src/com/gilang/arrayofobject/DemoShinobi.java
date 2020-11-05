package com.gilang.arrayofobject;

public class DemoShinobi {
    public static void main(String[] args) {
        shinobi[] n = new shinobi[3];

        //membentuk objek 1
        n[0] = new shinobi();
        n[0].setNoRegistrasi("012606");
        n[0].setNama("Uchiha Sasuke");
        n[0].setPeringkatNinja("Genin");

        //membentuk objek 2
        n[1] = new shinobi();
        n[1].setNoRegistrasi("012607");
        n[1].setNama("Uzumaki Naruto");
        n[1].setPeringkatNinja("Genin");

        //membentuk objek 3
        n[2] = new shinobi();
        n[2].setNoRegistrasi("012601");
        n[2].setNama("Haruno Sakura");
        n[2].setPeringkatNinja("chunin");


        //menampilkan 3 objek dari array
        System.out.println("Data Shinobi \n");
        for (shinobi i:n){
            System.out.println("No.Registrasi : " + i.getNoRegistrasi());
            System.out.println("Nama          : " + i.getNama());
            System.out.println("Peringkat     : " + i.getPeringkatNinja());
            System.out.println();
        }
    }
}
