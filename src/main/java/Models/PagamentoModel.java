/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

/**
 *
 * @author vitor
 */
public class PagamentoModel {

    private int id;
    private int id_tipo_pagamento;
    private String dt_pagamento;

    public PagamentoModel(int id, int id_tipo_pagamento, String dt_pagamento) {
        this.id = id;
        this.id_tipo_pagamento = id_tipo_pagamento;
        this.dt_pagamento = dt_pagamento;
    }

    public PagamentoModel(int id_tipo_pagamento, String dt_pagamento) {
        this.id_tipo_pagamento = id_tipo_pagamento;
        this.dt_pagamento = dt_pagamento;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId_tipo_pagamento() {
        return id_tipo_pagamento;
    }

    public void setId_tipo_pagamento(int id_tipo_pagamento) {
        this.id_tipo_pagamento = id_tipo_pagamento;
    }

    public String getDt_pagamento() {
        return dt_pagamento;
    }

    public void setDt_pagamento(String dt_pagamento) {
        this.dt_pagamento = dt_pagamento;
    }

}
