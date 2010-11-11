/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.alma.hadlm1cs.connectors;

import fr.alma.hadl.annotations.Connector;
import fr.univnantes.alma.hadlm2.connecteur.ConnecteurSS;
import fr.univnantes.alma.hadlm2.exceptions.WrongTypeException;

/**
 *
 * @author indy
 */
@Connector("CSResponse")
public class CSResponse extends ConnecteurSS {

    public CSResponse() throws WrongTypeException {
        super(null, null, null, null);
    }

    @Override
    public <S, E> S before(E arg) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
