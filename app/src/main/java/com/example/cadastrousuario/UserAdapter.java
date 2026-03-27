package com.example.cadastrousuario;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

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

        //Retorna uma nova instância da nossa classe interna ViewHolder com a View Criada
        return new ViewHolder(view);
    }

    //Método 2: Vincula os dados de um objeto de lista a uma linha especifica da tela
    @Override
    public void onBindViewHolder(@NotNull ViewHolder holder, int position){
        //Recupera os dados da lista de acordo com a posição do Android está desenhando agora
        String nome = listaUsuarios.get(position);

        //Define o texto no componente visual que está guardando dentro de 'holder'
        holder.tvNome.setText(nome);
    }

    //Método 3: Informa ao Android quantos itens a lista pussui ao todo
    @Override
    public int getItemCount(){
        //Se a lista existir, retorna o tamanho. Se não, retorna zero
        return listaUsuarios != null ? listaUsuarios.size() : 0;
    }

    //Classe interna ViewHolder: Serve para "segurar" as referências dos componentes de cada linha
    //Evita chamadas respectivas ao findViewById, melhorando a performace do RecycleView
    public class ViewHolder extends RecyclerView.ViewHolder{
        //Referência para o TextView da linha
        TextView tvNome;

        public ViewHolder(@NotNull View itemView){
            super(itemView);
            //Faz o mapeamento do ID do layout para o objeto java]
            //android.R.id.text1 é o ID padrão do layout 'simple_list_item_1'
            tvNome = itemView.findViewById(android.R.id.text1);
        }
    }
}
