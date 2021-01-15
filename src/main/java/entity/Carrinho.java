package entity;

import java.util.ArrayList;
import java.util.List;

public class Carrinho {

    private List<Produto> produtos = new ArrayList<Produto>();

    public void add(Produto p){
        produtos.add(p);
    }

    public List<Produto> getProdutos(){
        return produtos;
    }

    public void deleteProduto(int id)
    {
        Produto p = Produto.getProdutoById(id);
        produtos.remove(p);
    }

    public Produto getProdutoById(int id)
    {
        for (Produto p : produtos)
        {
            if (p.getId() == id)
            {
                return p;
            }
        }
        return null;
    }
}
