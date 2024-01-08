package com.latihan;

public abstract class Character {

    static String namaSelf, namaEnemy;
    static int HPself, damageSelf, HPenemy, damageEnemy;
    static int regen, energySelf;
    static boolean gameover = false, tryagain;

    protected void Attack() {
        if (energySelf>=8){
            HPenemy -= damageSelf;

            energySelf -= 8;
            System.out.println("Kamu menyerang, Sisa Energi : "+ energySelf);
            if(HPenemy>=0){
                System.out.println("Sisa HP musuh : "+HPenemy+"HP");
            }} else {System.out.println("Energimu tidak cukup untuk melakukan serangan, " +
                "isi energimu kembali untuk melakukan tindakan");
        }}
    protected void Damaging() {
        HPself -= damageEnemy;
        if (HPenemy>0){
            System.out.printf("%nGiliran Musuhmu :%n");
            System.out.print("Kamu diserang"); if(HPself>=0) System.out.printf(", Sisa Nyawa : "+HPself+"HP%n%n");
        }}
    protected void regenrating() {
        if (energySelf>=10) {
            HPself += regen;
            energySelf -= 10;
            System.out.println("Kamu rehat, Nyawamu pulih menjadi : "+HPself+"HP");
            System.out.println("Energimu tersisa : "+ energySelf);
        } else { System.out.println("Energimu tidak cukup untuk melakukan pemulihan, " +
                "isi energimu kembali untuk melakukan tindakan");
        }}
    protected void Energizing() {
        energySelf += 50;
        System.out.println("energimu bertambah sebanyak 50, sekarang energimu menjadi "+ energySelf);
    }
}