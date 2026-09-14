/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.displaygraphics;
import java.awt.*;
import javax.swing.*;
public class DisplayGraphics extends JPanel{
//this is a constructor method.
public DisplayGraphics(){
super();
}
/* Create a paintComponent() method to override the one in
JPanel.This is where the drawing happens. We don't have
to call it in our program, it gets called automatically
whenever the panel needs to be redrawn, like when it is
made visible or moved or whatever.
*/
public void paintComponent(Graphics g){
final int MID = 150;
final int TOP = 50;
g.setColor(Color.blue); 
g.fillRect(0, 0, 400, 300); //background
g.setColor(Color.GREEN); //set the graphics object's paint color
//for next action
g.fillRect(0, 175, 300, 50); // ground
g.setColor(Color.white); //restting paint color
g.fillOval(-40, -40, 80, 80); // moon
g.setColor(Color.red); //resetting paint color
g.fillOval(MID-20, TOP, 40, 40);// head
g.fillOval(MID-35, TOP+35, 70, 50); // upper torso
g.fillOval(MID-50, TOP+80, 100, 60); // lower torso
g.setColor(Color.black);
g.fillOval(MID-10, TOP+10, 5, 5); // left eye
g.fillOval(MID+5, TOP+10, 5, 5);// right eye
g.drawArc(MID-10, TOP+20, 20, 10, 190, 160); // smile
g.drawLine(MID-25, TOP+60, MID-50, TOP+40); // left arm
g.drawLine(MID+25, TOP+60, MID+55, TOP+60); // right arm
g.setColor(Color.orange);
g.drawLine(MID-20, TOP+5, MID+20, TOP+5); // brim of hat
g.fillRect(MID-15, TOP-20, 30, 25);// top of hat
g.setColor(Color.GREEN);
g.fillPolygon(new int[] {175, 220, 275}, new int[] {200, 20, 200}, 3);
g.fillRect(60, 70, 40, 40);//present shape for the snowman to hold
g.setColor(Color.red);
g.fillRect(75, 70, 10, 40);//wrapping paper stripe 1
g.fillRect(60, 85, 40, 10);//wrapping paper stripe 2
g.fillOval(210, 60, 15, 15);//tree ornament 1
g.fillOval(220, 90, 15, 15);//tree ornament 2
g.fillOval(215, 130, 15, 15);//tree ornament 3
g.setColor(Color.yellow);
g.fillOval(65, 50, 20, 20);//bow piece 1
g.fillOval(75, 50, 20, 20);//bow piece 2
}
/**
* @param args the command line arguments
*/
public static void main(String arg[]){
//create a new JFrame object, initialize
JFrame frame = new JFrame("Display Graphics");
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.setSize(400,300);
/* Create a new identifier for a Basic JPanel (DisplayGraphics) called
"panel",*/
// then create a new BasicJPanel object for it to refer to.
DisplayGraphics panel = new DisplayGraphics();
// Make the panel object the content pane of the JFrame.
// This puts it into the drawable area of frame, and now
// we do all our drawing to panel, using paintComponent(), above.
frame.setContentPane(panel);
frame.setVisible(true);
}
}