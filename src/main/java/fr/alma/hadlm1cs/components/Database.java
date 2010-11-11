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
@Component("Database")
public class Database extends SimpleComposant {

    private String response;

    @RequiredInterface("receiveQuery")
    public void receiveQuery(String query) {
        response = "Hello " + query;
        this.call("sendResponse");
    }

    @ProvidedInterface("sendResponse")
    public String sendResponse() {
        return response;
    }
}
