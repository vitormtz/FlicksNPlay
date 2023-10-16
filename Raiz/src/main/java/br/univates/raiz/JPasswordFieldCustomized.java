package br.univates.raiz;

import java.awt.Color;
import javax.swing.JPasswordField;

public class JPasswordFieldCustomized extends JPasswordField{
    
    private boolean required;
    
    public JPasswordFieldCustomized() {
        this.required = false;
        
        this.addFocusListener(new java.awt.event.FocusAdapter()
        {
            public void focusLost(java.awt.event.FocusEvent evt)
            {
                if (isRequired())
                {
                    if (getPassword().length == 0)
                    {
                        setBackground(Color.YELLOW);
                    } 
                    else
                    {
                        setBackground(Color.WHITE);
                    }
                }
            }
        });
    }

    public boolean isRequired()
    {
        return required;
    }

    public void setRequired(boolean required)
    {
        this.required = required;
    }
}
