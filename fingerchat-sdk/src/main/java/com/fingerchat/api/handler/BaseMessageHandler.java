package com.fingerchat.api.handler;

import com.fingerchat.api.IMessage;
import com.fingerchat.api.MessageHandler;
import com.fingerchat.api.connection.Connection;
import com.fingerchat.api.protocol.Packet;

/**
 * Created by LY309313 on 2017/9/23.
 */

public abstract class BaseMessageHandler <T extends IMessage> implements MessageHandler {

    public abstract T decode(Packet packet, Connection connection);

    public abstract void handle(T message);

    public void handle(Packet packet, Connection connection) {
        T t = decode(packet, connection);
        if (t != null) {
            t.decodeBody();
            handle(t);
        }
    }

}
