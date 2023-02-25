package _02_boolean._6_wheres_waldo;

import java.io.File;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

import processing.core.PApplet;
import processing.core.PImage;


/*  Goal: Create a Where's Waldo game!
  
  1. Find a Where's Waldo image and copy it into the /images folder at the
     top level of this module OR use the provided waldo.jpg image.
  
  2. Declare a variable for the image:
     PImage waldo;
  		Int waldo;
  		
  In the setup() method:
    3. Load your image using the following code:
       waldo = loadImage("waldo.jpg");
  		
    4. Resize your image to the size of the window using the resize() method.
 // WIDTH = 600;
 // HEIGHT = 400;
    	face.resize(WIDTH, HEIGHT);
    	  	
    5. Set your Waldo image as the window's background.
  
  In the draw() method:
    6. Find the range of X and Y coordinates of Waldo in the image. You can
       use the following code to help you:
       println("X: " + mouseX + " Y: " + mouseY);
  
    7. Use an if statement to check if the user clicked the mouse
  
    8. If the user clicked the mouse, use another if statement to check the
       X and Y coordinates. If the coordinates are on Waldo call the
       playWhoohoo() method, otherwise call the playDoh() method.
 */


public class WheresWaldo extends PApplet {
    static final int WIDTH = 600;
    static final int HEIGHT = 400;

    PImage waldo;
    
    @Override
    public void settings() {
        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup() {
    	waldo = loadImage("waldo.jpg"); 
    	waldo.resize(WIDTH, HEIGHT);
    	draw();  
    }

    @Override
    public void draw() {
    	background(waldo);
    	println("X: " + mouseX + " Y: " + mouseY);
//    	if () {//i need help in line 66 please 
//    	playWhoohoo();
//    	}
//    	else { 
//    		playDoh();
//    	}
    }

    static public void main(String[] args) {
        PApplet.main(WheresWaldo.class.getName());
    }

    /*********************** DO NOT MODIFY THE CODE BELOW ********************/

    Clip clip = null;

    public void playDoh() {
        if (clip == null || !clip.isActive()) {
            clip = playSound("homer-doh.wav");
        }
    }

    public void playWhoohoo() {
        if (clip == null || !clip.isActive()) {
            clip = playSound("homer-woohoo.wav");
        }
    }

    public Clip getSong(String fileName) {
        String path = "src/";
        Clip clip = null;

        // Note: use .wav files
        try {
            clip = AudioSystem.getClip();
            AudioInputStream inputStream = AudioSystem.getAudioInputStream(new File(path + fileName));
            clip.open(inputStream);
        } catch (Exception e) {
            System.out.println("ERROR: " + e.getMessage() + " for " + path + fileName);
        }

        return clip;
    }

    public Clip playSound(String fileName) {
        final Clip clip = getSong(fileName);

        new Thread(new Runnable() {
            @Override
            public void run() {
                clip.start();
            }
        }).start();

        return clip;
    }
}
