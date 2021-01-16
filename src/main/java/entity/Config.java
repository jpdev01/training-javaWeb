package entity;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Config implements Serializable{
    private String patternApp = "http://localhost:8081/training_servlet_oficial_war_exploded/";

    public String getPatternApp()
    {
        return this.patternApp;
    }
}
