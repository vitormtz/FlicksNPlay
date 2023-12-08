/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Support;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import javax.swing.JFormattedTextField;
import javax.swing.text.DefaultFormatterFactory;
import javax.swing.text.MaskFormatter;

/**
 *
 * @author vitor
 */
public class DataNascimentoFormattedTextField extends JFormattedTextField {

    public DataNascimentoFormattedTextField() {
        super(createDataNascimentoFormat());
    }

    private static DefaultFormatterFactory createDataNascimentoFormat() {
        MaskFormatter maskFormatter = null;
        try {
            maskFormatter = new MaskFormatter("##/##/####");
            maskFormatter.setPlaceholderCharacter('_'); // Opcional: substitui os espaços vazios por outro caractere
            maskFormatter.setValueContainsLiteralCharacters(false); // Opcional: permite que o caractere de espaço seja substituído
        } catch (ParseException e) {
            e.printStackTrace();
        }

        return new DefaultFormatterFactory(maskFormatter);
    }

    public static String DateFormatExample(String dataString) {
        // Formato para a data de entrada
        DateTimeFormatter formatoEntrada = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        // Converte a String para um objeto LocalDate
        LocalDate data = LocalDate.parse(dataString, formatoEntrada);

        // Formato para a data de saída
        DateTimeFormatter formatoSaida = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        // Converte a data para uma String no formato desejado
        return data.format(formatoSaida);
    }
}
