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
public class KeyViolationException extends Exception {

    public KeyViolationException() {
        super("Chave primária duplicada");
    }

}
