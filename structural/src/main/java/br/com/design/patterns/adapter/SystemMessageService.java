package br.com.design.patterns.adapter;

import br.com.design.patterns.adapter.model.XML;

public class SystemMessageService {

    void send(XML data) {
        System.out.println("Sending data as XML...");
    }
}
