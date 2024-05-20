package com.credit.client.entrypoint;

import com.credit.client.entrypoint.adapters.MessageToDTOAdapter;
import com.credit.client.entrypoint.request.ClientMessage;
import com.credit.client.usecase.ClientUseCase;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RabbitMQQueueListener {
    @Autowired
    private ClientUseCase useCase;

    @RabbitListener(queues = "debit-receive")
    public void receiveMessage(String strMessage) {
        ClientMessage message = ClientMessage.parseMessage(strMessage);
        useCase.updateClient(MessageToDTOAdapter.adapt(message));
    }
}
