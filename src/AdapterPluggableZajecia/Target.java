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
public class Target {
    public String Estimate(int i) {
            return "Estimate is " + (int)Math.round(i / 3.0);
        }
}
