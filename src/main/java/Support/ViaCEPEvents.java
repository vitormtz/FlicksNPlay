/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Support;

/**
 *
 * @author vitor
 */
public interface ViaCEPEvents {

    /**
     * Quando o CEP for encontrado com sucesso
     *
     * @param cep retorna o objeto ViaCEP
     */
    public void onCEPSuccess(ViaCEP cep);

    /**
     * Quando ocorrer qualquer erro ao encontrar o CEP
     *
     * @param cep retorna o CEP que foi requisitado
     */
    public void onCEPError(String cep);
}
