package br.com.design.patterns.composite;


import java.util.ArrayList;
import java.util.List;

public class MainApp {

    public static void main(String[] args) {

        Menu home = new Menu("Home");
        Menu languages = new Menu("Languages", getLanguageSubItems());
        home.show("");
        languages.show("");
    }

    private static List<MenuItem> getLanguageSubItems() {
        List<MenuItem> languages = new ArrayList<>();
        languages.add(new Menu("English", getLevels()));
        languages.add(new Menu("Spanish", getLevels()));
        return  languages;
    }

    private static List<MenuItem> getLevels() {
        List<MenuItem> levels = new ArrayList<>();
        levels.add(new Menu("beginner"));
        levels.add(new Menu("intermediary"));
        levels.add(new Menu("advanced"));
        return levels;
    }
}


