package entity;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;

public class Produto {
    private static Map<Integer, Produto> produtos;

    static {
        produtos = new LinkedHashMap<Integer, Produto>();
        produtos.put(1, new Produto(1, "p1", 100));
    }

    private int id;
    private String name;
    private double value;

    private Produto(int id, String name, double value){
        this.id = id;
        this.name = name;
        this.value = value;
    }

    public static Map<Integer, Produto> getListProdutos() {
        return produtos;
    }

    public static Collection<Produto> getProdutos(){
        return produtos.values();
    }

    public static void setProdutos(Map<Integer, Produto> produtos) {
        Produto.produtos = produtos;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public static Produto getProdutoById(int id){
        return produtos.get(id);
    }
}
