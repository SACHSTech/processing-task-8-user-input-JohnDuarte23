import processing.core.PApplet;

public class Sketch extends PApplet {
	
	
  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
	// put your size call here
    size(400, 400);
  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {
    background(0, 0, 0);
  }

  float ellipseX = 200;
  float ellipseY = 200;

  boolean upPressed = false;
  boolean downPressed = false;
  boolean leftPressed = false;
  boolean rightPressed = false;  
  boolean shiftPressed = false;

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {

    background(0, 0, 0);
    
    if(mousePressed){
      fill(255, 255, 51);
      ellipse(mouseX, mouseY, 50, 50);
    }

    ellipse(ellipseX, ellipseY, 50, 50);
    
      if (upPressed){
        ellipseY -= 1;
      }
      if (rightPressed){
        ellipseX += 1;
      }
      if (downPressed){
        ellipseY += 1;
      }
      if (leftPressed){
        ellipseX -= 1;
      }
      if (upPressed && shiftPressed) {
        ellipseY -= 5;
      }
      if (rightPressed && shiftPressed) {
        ellipseX += 5;
      }
      if (downPressed && shiftPressed) {
        ellipseY += 5;
      }
      if (leftPressed && shiftPressed) {
        ellipseX -= 5;
      }


  }
  public void keyPressed() {
    if (key == 'w') {
      upPressed = true;
    }
    else if (key == 's') {
      downPressed = true;
    }
    else if (key == 'a') {
      leftPressed = true;
    }
    else if (key == 'd') {
      rightPressed = true;
    }
    else if(keyCode == SHIFT) {
      shiftPressed = true;
    }
  }
  
  public void keyReleased() {
    if (key == 'w') {
      upPressed = false;
    }
    else if (key == 's') {
      downPressed = false;
    }
    else if (key == 'a') {
      leftPressed = false;
    }
    else if (key == 'd') {
      rightPressed = false;
    }
    else if(keyCode == SHIFT) {
      shiftPressed = false;
    }
  }

  public void mouseReleased() {
    fill(255, 255, 255);
  }
}