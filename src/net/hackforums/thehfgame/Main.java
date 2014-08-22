package net.hackforums.thehfgame;

public class Main implements Runnable{
    
    boolean isRunning = false;
    private Thread thread;
    
    public void start() {
        isRunning = false;
        thread = new Thread(this, "Display");
        thread.start();
    }
    
    @Override
    public void run() {
        
        init();
        
        while(isRunning) {
            
        }
        
    }

    public static void main(String[] args) {
        
        new Main().start();

    }
}
