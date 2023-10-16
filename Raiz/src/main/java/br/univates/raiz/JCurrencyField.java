package br.univates.raiz;

import javax.swing.text.NumberFormatter;

/**
 *
 * @author mouriac
 */
public class JCurrencyField extends JTextFieldCustomized
{

    public JCurrencyField()
    {
        setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("###,##0.00"))));
        setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        NumberFormatter nf = (NumberFormatter)this.getFormatter();
        nf.setAllowsInvalid(false);
    }
    
    /**
     * Retorna o valor digitado pelo usuário no campo.
     * @return o valor double digitado
     */
    public double getDouble()
    {
        double r = 0;
        if (this.getValue() instanceof Double)
        {
            r = (Double)this.getValue();
        }
        else if (this.getValue() instanceof Long)
        {
            Long aux = (Long)this.getValue();
            r = aux.doubleValue();
        }
        return r;
    }
    
    /**
     * Define um valor inicial para o campo.
     * @param value valor double a ser atribuido ao campo
     */
    public void setDouble( double value )
    {
        this.setValue(value);
    }
}
