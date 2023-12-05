/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Support;

import java.text.ParseException;
import javax.swing.JFormattedTextField;
import javax.swing.text.DefaultFormatterFactory;
import javax.swing.text.MaskFormatter;

/**
 *
 * @author vitor
 */
public class CEPFormattedTextField extends JFormattedTextField {

    public CEPFormattedTextField() {
        super(createCEPFormat());
    }

    private static DefaultFormatterFactory createCEPFormat() {
        MaskFormatter maskFormatter = null;
        try {
            maskFormatter = new MaskFormatter("#####-###");
            maskFormatter.setPlaceholderCharacter('_'); // Opcional: substitui os espaços vazios por outro caractere
            maskFormatter.setValueContainsLiteralCharacters(false); // Opcional: permite que o caractere de espaço seja substituído
        } catch (ParseException e) {
            e.printStackTrace();
        }

        return new DefaultFormatterFactory(maskFormatter);
    }
}
