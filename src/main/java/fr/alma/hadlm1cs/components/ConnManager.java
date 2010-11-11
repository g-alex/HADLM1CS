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
@Component("ConnManager")
public class ConnManager extends SimpleComposant {

    @ProvidedInterface("result")
    public String result;
    @ProvidedInterface("query")
    public String query;

    @RequiredInterface("parseQuery")
    public void parseQuery(String query) {
        this.query = query;
    }

    @RequiredInterface("receiveResult")
    public void receiveResult(String result) {
        this.result = result;
    }
}
