package ru.tehkode.chatmanager;

import org.bukkit.entity.Player;
import ru.tehkode.chatmanager.channels.Channel;
import ru.tehkode.chatmanager.format.MessageFormat;

public interface Message {
    String getMessage();

    Player getSender();

    Channel getChannel();

    void setChannel(Channel channel);

    MessageFormat getFormat();

    void setFormat(MessageFormat format);
}
