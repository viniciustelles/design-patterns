package br.com.design.patterns.adapter;

import br.com.design.patterns.adapter.model.XML;

public class MainApp {

    public static void main(String[] args) {
        // Message service default
        SystemMessageService systemMessageService = new SystemMessageService();
        systemMessageService.send(new XML("Data as xml"));

        // Adapter to send message as json
        MessageServiceAdapter messageServiceAdapter = new MessageServiceAdapter();
        messageServiceAdapter.send(new XML("Data as xml"));
    }
}
