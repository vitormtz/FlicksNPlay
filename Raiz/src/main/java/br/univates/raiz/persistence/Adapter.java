package br.univates.raiz.persistence;

import java.util.ArrayList;

public abstract class Adapter<T,E> implements IAdapter<T,E> {
    @Override
    public ArrayList<T> readAll(Filter<T> filtro)
    {
        ArrayList<T> selecionados = new ArrayList();
        ArrayList<T> todos = readAll();
        for (T obj: todos)
        {
            if (filtro.isAccept(obj))
            {
                selecionados.add(obj);
            }
        }
        return selecionados;
    }
}
