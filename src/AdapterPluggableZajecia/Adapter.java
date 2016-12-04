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
public class Adapter extends Adaptee{
    private interface Funkcja{
        String Request(int wartosc);
    }
    private Funkcja funkcja;
    
    Adapter(Target target){
        funkcja = (int i) -> target.Estimate(i);
    }
    
    Adapter(Adaptee adaptee){
        funkcja = new Funkcja(){
            @Override
            public String Request(int i){
                int wartosc = (int)Math.round(adaptee.Precise(i, 3));
                return "Estimate based on precision is " + wartosc;
            }
        };
    }

    
    public String Request(int i) {
        return funkcja.Request(i);
    }
}
