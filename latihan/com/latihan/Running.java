package com.latihan;

import java.util.Scanner;

public class Running {
    String pilih(){
        Scanner kibor = new Scanner(System.in);
        return kibor.next();
    }

    void heroSelect() {
        switch (pilih()) {
            case "1" -> Hero.Superman();
            case "2" -> Hero.Batman();
            case "3" -> Hero.Flash();
            case "4" -> Hero.GreenLanterns();
        }
    }
    void enemySelect() {
        switch (pilih()) {
            case "1" -> Evil.Doomsday();
            case "2" -> Evil.Joker();
            case "3" -> Evil.Gordon();
            case "4" -> Evil.YellowLanters();
        }
    }
    void start(){
        System.out.format("======GAME SUPER HERO======%n%n");
        System.out.println("Pilih Hero yang ingin kamu gunakan : ");
        System.out.printf("[1] Superman%n[2] Batman%n[3] Flash%n[4] Green Lanters%nHero : ");
    }
    void enemy(){
        System.out.printf("Hero pilihanmu adalah : "+Character.namaSelf+"%n%n");
        System.out.println("Pilih Musuh yang ingin kamu lawan : ");
        System.out.printf("[1] Doomsday%n[2] Joker%n[3] Gordon%n[4] Yellow Lantern%nMusuh : ");
    }
    void infoChar() {
        System.out.printf("Musuh pilihanmu adalah : "+Character.namaEnemy+"%n%n");
        System.out.println("Heromu adalah : "+Character.namaSelf);
        System.out.println("Lawanmu adalah : "+Character.namaEnemy);
        System.out.printf("=============Hero=============%nNyawa : %s\t\tSerangan : %s%n",Character.HPself,Character.damageSelf);
        System.out.printf("Energi : %s\t\tRegen : %s%n",Character.energySelf,Character.regen);
        System.out.printf("=============Evil=============%nNyawa : %s\t\tSerangan : %s%n%n",Character.HPenemy,Character.damageEnemy);
        System.out.printf("%n====PERMAINAN DIMULAI====%n");
    }
    void Win(){
        if(Character.HPenemy<=0){
            System.out.println("Kamu menang!");
            Character.gameover = true;
        }
    }
    void Lose(){
        if(Character.HPself<=0){
            System.out.printf("%nKamu Kalah!, Nyawamu Habis");
            Character.gameover = true;
        }
    }
    void TryAgain(){
        boolean ulang = false;
        do {if(Character.gameover){
            System.out.printf("%nApakah kamu ingin main lagi?%n[Ya/Tidak]%n");
            Scanner kibor = new Scanner(System.in);
            String jawab = kibor.next();
            if ((jawab).equals("Ya")||(jawab).equals("ya")) {
                Character.tryagain = true;
                Character.gameover = false;
                ulang = false;
            } else if ((jawab).equals("Tidak")||(jawab).equals("tidak")) {
                Character.tryagain = false;
                ulang = false;
            } else {
                System.out.println("Tolong jawab sesuai pilihan");
                ulang = true;
            }
        }} while (ulang);
    }
    void Tindakan(){
        Character aksi = new Character(){};
        boolean ulang;
        do {
            System.out.printf("Giliranmu :%n[1] Serang%n[2] Pulihkan%n[3] Energizing%nTindakan : ");
            switch (pilih()){
                case "1" -> {
                    aksi.Attack();
                    ulang = false;
                }
                case "2" -> {
                    aksi.regenrating();
                    ulang = false;
                }
                case "3" -> {
                    aksi.Energizing();
                    ulang = false;
                }
                default -> {
                    System.out.printf("%nPilih tindakan dengan angka%n");
                    ulang = true;
                }
            }
        } while (ulang);
    }
}