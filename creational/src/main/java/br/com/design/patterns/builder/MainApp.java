package br.com.design.patterns.builder;

public class MainApp {

    public static void main(String[] args) {
        User user = User.builder()
                .fullName("Jhon")
                .userName("jhon@mail.com")
                .password("123")
                .build();
        
        System.out.println(user);
    }
}
