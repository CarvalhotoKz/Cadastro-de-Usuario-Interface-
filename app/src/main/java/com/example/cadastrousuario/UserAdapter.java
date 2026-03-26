package com.example.cadastrousuario;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import org.jetbrains.annotations.NotNull;
import java.util.List;

//Classe Adapter: Gerencia a criação e o preenchimento dos itens na RecycleView
public class UserAdapter extends RecyclerView.Adapter<UserAdapter.ViewHolder> {
    //Atributo Privado que armazena a referencia dos dados que serão exibidos
    private List<String> listaUsuarios;

    //Construtor que permite que a MainActivity "entregue" a lista de dados para este Adpter
    public UserAdapter(List<String> lista){
        this.listaUsuarios = lista;
    }

    // Método 1: Cria "do zero" o visual de uma linha da lista (+ViewHolder)
    @NotNull
    @Override
    public ViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int ViewType){
        //Layout transforma o arquivo XML em um objeto View Java
        //Aqui usamos um layout padrão do Android (simple_list_item_1) para facilitar
        View view = LayoutInflater.from(parent.getContext()).inflate(android.R.layout.simple_list_item_1,parent,false);
    }
}
