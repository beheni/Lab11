package org.example.proxy;

import lombok.Setter;

@Setter
public class ProxyImage implements MyImage{
    private String filename;
    private RealImage realImage;
    @Override
    public void display() {
        if (realImage == null) {
            this.realImage = new RealImage(filename);
        }
        realImage.display();
    }
}

