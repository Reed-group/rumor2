package net.reed.rumor.core;

import io.netty.channel.ChannelInitializer;
import io.netty.channel.socket.SocketChannel;

public abstract class Init extends ChannelInitializer<SocketChannel> {
     public abstract void initChannel(SocketChannel socketChannel) throws Exception;
}
