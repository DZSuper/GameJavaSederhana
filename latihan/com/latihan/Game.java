package com.latihan;

public
class Game {
public static void main(String[] args){
    Character kar = new Character(){};
    Running run = new Running();
    do {
    run.start();
    run.heroSelect();
    run.enemy();
    run.enemySelect();
    run.infoChar();
    do {
        run.Tindakan();
        kar.Damaging();
        run.Win();
        run.Lose();
    } while (!Character.gameover);
        run.TryAgain();
} while (Character.tryagain);
}
}