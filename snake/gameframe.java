package snake;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.Random;


public class gameframe extends JFrame {
gameframe(){
	gamepanel panel = new gamepanel();
  this.add(panel);
  this.setTitle("snake");
  this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  this.setResizable(false);
  this.pack();
  this.setVisible(true);
  this.setLocationRelativeTo(null);
}
}
