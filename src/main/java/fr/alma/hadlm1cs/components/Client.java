/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.alma.hadlm1cs.components;

import fr.alma.hadl.annotations.*;
import fr.univnantes.alma.hadlm2.composant.SimpleComposant;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author indy
 */
@Component("Client")
public class Client extends SimpleComposant {

    @ProvidedInterface("query")
    public String query;

    @RequiredInterface("receive")
    public void receive(String result) {
        System.out.println(result);
    }

    @RunInterface("setQuery")
    public void setQuery() throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        String myQuery = br.readLine();
        this.set("query", myQuery);
    }
}
