/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Support;

import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.Document;
import javax.swing.text.DocumentFilter;

/**
 *
 * @author vitor
 */
public class PriceDocumentFilter extends DocumentFilter {

    @Override
    public void insertString(FilterBypass fb, int offset, String string, AttributeSet attr)
            throws BadLocationException {
        Document doc = fb.getDocument();
        StringBuilder sb = new StringBuilder(doc.getText(0, doc.getLength()));
        sb.insert(offset, string);

        if (isValidPrice(sb.toString())) {
            super.insertString(fb, offset, string, attr);
        } else {
            // Indica que a inserção foi rejeitada
        }
    }

    @Override
    public void replace(FilterBypass fb, int offset, int length, String text, AttributeSet attrs)
            throws BadLocationException {
        Document doc = fb.getDocument();
        StringBuilder sb = new StringBuilder(doc.getText(0, doc.getLength()));
        sb.replace(offset, offset + length, text);

        if (isValidPrice(sb.toString())) {
            super.replace(fb, offset, length, text, attrs);
        } else {
            // Indica que a substituição foi rejeitada
        }
    }

    private boolean isValidPrice(String text) {
        // Adapte a lógica conforme necessário para validar o formato do preço
        return text.isEmpty() || text.matches("^\\d+(\\.\\d{0,2})?$");
    }
}
