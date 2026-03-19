package net.reed.rumor.core.WebSocket;

import io.netty.channel.ChannelPipeline;
import io.netty.handler.codec.http.HttpServerCodec;
import net.reed.rumor.core.Init;

import io.netty.channel.socket.SocketChannel;

public class InitWSSDefault extends Init {
    @Override
    public void initChannel(SocketChannel socketChannel) throws Exception {
        ChannelPipeline pipeline = socketChannel.pipeline();
        pipeline.addLast("httpServerCodec", new HttpServerCodec());
        pipeline.addLast("httpHandler", new Server());
    }
}
