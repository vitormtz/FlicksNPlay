/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Support;

import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 *
 * @author vitor
 */
public class ValidacaoDataNascimento {

    public static boolean validarDataNascimento(String dataNascimento) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        sdf.setLenient(false); // Desativa a tolerância a datas inválidas

        try {
            sdf.parse(dataNascimento); // Tenta fazer o parse da data
            return true; // Se o parse for bem-sucedido, a data é válida
        } catch (ParseException e) {
            return false; // Se ocorrer uma exceção, a data é inválida
        }
    }
}
