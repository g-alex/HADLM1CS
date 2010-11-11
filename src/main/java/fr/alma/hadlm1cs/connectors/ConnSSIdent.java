/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.alma.hadlm1cs.connectors;

import fr.alma.hadl.annotations.Connector;
import fr.univnantes.alma.hadlm2.composant.Composant;
import fr.univnantes.alma.hadlm2.connecteur.ConnecteurSS;
import fr.univnantes.alma.hadlm2.exceptions.WrongTypeException;
import java.lang.reflect.Method;

/**
 *
 * @author indy
 */
@Connector("ConnSSIdent")
public class ConnSSIdent extends ConnecteurSS {

    public ConnSSIdent(Composant source, Method from, Composant target, Method to) throws WrongTypeException {
        super(source, from, target, to);
    }

    @Override
    public <S, E> S before(E arg) {
        return (S) arg;
    }
}
