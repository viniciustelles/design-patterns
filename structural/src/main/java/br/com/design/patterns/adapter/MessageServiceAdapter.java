package br.com.design.patterns.adapter;

import br.com.design.patterns.adapter.model.JSON;
import br.com.design.patterns.adapter.model.XML;

public class MessageServiceAdapter extends SystemMessageService {

    private MessageService messageService;

    public MessageServiceAdapter() {
        this.messageService = new MessageService();
    }

    @Override
    public void send(XML xml) {
        // convert xml to json
        JSON message = new JSON(xml.getData());
        messageService.send(message);
    }
}
