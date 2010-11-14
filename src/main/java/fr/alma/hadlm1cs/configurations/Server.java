/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.alma.hadlm1cs.configurations;

import fr.alma.hadl.annotations.*;
import fr.univnantes.alma.hadlm2.composant.Configuration;

/**
 *
 * @author indy
 */
@Component("Server")
public class Server extends Configuration {

    @RequiredInterface("parseQuery")
    public void parseQuery(String query) {
    }

    @ProvidedInterface("result")
    public String result;
}
