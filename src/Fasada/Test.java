/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fasada;

/**
 *
 * @author KrzysieK
 */
public class Test {
    public static void main(String[] args){
        Fasada restauracja = new Fasada();
        restauracja.zamow(Zamowienie.PIZZA, "Gdańsk");
        System.out.println("---");
        restauracja.zamow(Zamowienie.OBIAD, "Sopot");
    }
}
