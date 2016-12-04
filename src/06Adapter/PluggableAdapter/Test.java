/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AdapterPluggableZajecia;

/**
 *
 * @author KrzysieK
 */
public class Test {
    public static void main(String[] args){
        Adapter staraFunkcja = new Adapter(new Adaptee());
        System.out.println(staraFunkcja.Request(5));
        
        Adapter nowaFunkcja = new Adapter(new Target());
        System.out.println(nowaFunkcja.Request(5));
    }
}
