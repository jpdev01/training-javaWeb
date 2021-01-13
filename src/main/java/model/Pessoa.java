package model;

public class Pessoa {
    public int id;
    public String name;
    public String password;

    public Pessoa(int id, String name, String password)
    {
        this.setId(id);
        this.setName(name);
        this.setPassword(password);
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
