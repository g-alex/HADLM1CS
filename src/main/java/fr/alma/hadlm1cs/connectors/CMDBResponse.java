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
@Connector("CMDBResponse")
public class CMDBResponse extends ConnecteurSS {

    public CMDBResponse() throws WrongTypeException {
        super(null, null, null, null);
    }

    @Override
    public <S, E> S before(E arg) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
