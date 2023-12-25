package com.myapp;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpServer;

public class Main {
    public static void main(String[] args) throws IOException {
        // Load the image
        BufferedImage image = ImageIO.read(new File("src/main/resources/aws.jpg"));

        // Start a simple HTTP server
        HttpServer server = HttpServer.create(new InetSocketAddress(8080), 0);
        server.createContext("/", new ImageHandler(image));
        server.setExecutor(null); // Use default executor
        server.start();
        System.out.println("Server started on port 8080");
    }

    static class ImageHandler implements HttpHandler {
        private final BufferedImage image;

        public ImageHandler(BufferedImage image) {
            this.image = image;
        }

        @Override
        public void handle(HttpExchange exchange) throws IOException {
            exchange.sendResponseHeaders(200, 0);
            OutputStream os = exchange.getResponseBody();
            ImageIO.write(image, "jpg", os);
            os.close();
        }
    }
}
