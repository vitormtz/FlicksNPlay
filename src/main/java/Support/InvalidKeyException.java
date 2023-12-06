/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Support;

/**
 *
 * @author mouriac
 */
public class InvalidKeyException extends Exception {

    public InvalidKeyException() {
        super("Valor incorreto para chave primária");
    }

}
