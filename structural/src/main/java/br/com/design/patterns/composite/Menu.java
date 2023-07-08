package br.com.design.patterns.composite;

import java.util.ArrayList;
import java.util.List;

public class Menu implements MenuItem {

    private String name;
    private List<MenuItem> subItems = new ArrayList<>();

    public Menu(String name) {
        this.name = name;
    }

    public Menu(String name, List<MenuItem> subItems) {
        this.name = name;
        this.subItems.addAll(subItems);
    }

    @Override
    public void show(String structure) {
        System.out.println(structure + name);
        subItems.forEach(item -> {
            item.show(" > " + structure);
        });
    }
}
