package com.example.demo.server;

import com.example.demo.shared.MessageService;
import com.google.gwt.user.server.rpc.RemoteServiceServlet;
import org.springframework.beans.factory.annotation.Autowired;

import javax.servlet.annotation.WebServlet;
import java.time.LocalDateTime;

/**
 * The server-side implementation of the RPC service.
 */

@WebServlet(urlPatterns = "/google_web_toolkit/greet", loadOnStartup = 1)
public class MessageServiceImpl extends RemoteServiceServlet implements MessageService {

    @Autowired
    private ExampleBean exampleBean;

    public String sendMessage(String message) throws IllegalArgumentException {
        if (message == null) {
            throw new IllegalArgumentException("message is null");
        }



        return "Hello, " + message + "!<br><br> Time received: " + LocalDateTime.now() + exampleBean.method();
    }

}
