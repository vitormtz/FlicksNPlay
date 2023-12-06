/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Support;

/**
 *
 * @author vitor
 */
public class ValidacaoCPF {

    public static boolean validarCPF(String cpf) {
        cpf = cpf.replaceAll("[^0-9]", ""); // Remove caracteres não numéricos

        if (cpf.length() != 11) {
            return false; // CPF deve ter 11 dígitos
        }

        // Calcula o primeiro dígito verificador
        int soma = 0;
        for (int i = 0; i < 9; i++) {
            soma += Character.getNumericValue(cpf.charAt(i)) * (10 - i);
        }
        int primeiroDigito = (soma % 11 < 2) ? 0 : 11 - (soma % 11);

        // Calcula o segundo dígito verificador
        soma = 0;
        for (int i = 0; i < 10; i++) {
            soma += Character.getNumericValue(cpf.charAt(i)) * (11 - i);
        }
        int segundoDigito = (soma % 11 < 2) ? 0 : 11 - (soma % 11);

        // Verifica se os dígitos verificadores calculados coincidem com os fornecidos no CPF
        return Character.getNumericValue(cpf.charAt(9)) == primeiroDigito
                && Character.getNumericValue(cpf.charAt(10)) == segundoDigito;
    }
}
