package org.example;
import org.example.enums.Plan;

public class Healthplan {

    private int id;
    private String name;
    private Plan plan;

    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public Plan getPlan() {
        return this.plan;
    }

    public Healthplan(int id, String name, Plan plan) {
        this.id = id;
        this.name = name;
        this.plan = plan;
    }

}
