package net.hackforums.morningstretches;

public class Launcher {

    public static void main(String[] args)
    {
       Thread myThread = new TemperatureConverter().run();

    }
}
