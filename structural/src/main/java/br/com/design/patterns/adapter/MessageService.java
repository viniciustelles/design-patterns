package br.com.design.patterns.adapter;

import br.com.design.patterns.adapter.model.JSON;
import br.com.design.patterns.adapter.model.XML;

public class MessageService {

    public void send(JSON data) {
        System.out.println("Sending data as JSON...");
    }
}
