/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.alma.hadlm1cs.components;

import fr.alma.hadl.annotations.*;
import fr.univnantes.alma.hadlm2.composant.SimpleComposant;

/**
 *
 * @author indy
 */
@Component("Client")
public class Client extends SimpleComposant {

    @ProvidedInterface("query")
    public String query;

    @RequiredInterface("setQuery")
    public void setQuery(String query) {
        this.set("query", query);
    }

    @RequiredInterface("receive")
    public void receive(String result) {
        System.out.println(result);
    }
}
