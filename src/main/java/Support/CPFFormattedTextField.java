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
public class CPFFormattedTextField extends JFormattedTextField {

    public CPFFormattedTextField() {
        super(createCPFFormat());
    }

    private static DefaultFormatterFactory createCPFFormat() {
        MaskFormatter maskFormatter = null;
        try {
            maskFormatter = new MaskFormatter("###.###.###-##");
        } catch (ParseException e) {
            e.printStackTrace();
        }

        return new DefaultFormatterFactory(maskFormatter);
    }
}
