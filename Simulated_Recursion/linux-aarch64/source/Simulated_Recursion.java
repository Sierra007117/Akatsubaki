/* autogenerated by Processing revision 1282 on 2022-04-15 */
import processing.core.*;
import processing.data.*;
import processing.event.*;
import processing.opengl.*;

import java.util.HashMap;
import java.util.ArrayList;
import java.io.File;
import java.io.BufferedReader;
import java.io.PrintWriter;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.IOException;

public class Simulated_Recursion extends PApplet {

int level = 10;
int radius= 300;

 public void setup() {
  /* size commented out by preprocessor */;
  noStroke();
  noLoop();
}

 public void draw() {
  drawCircle(width/2, radius, level);
}

 public void drawCircle(int x, int radius, int level) {                    
  float tt = 126 * level/4.0f;
  fill(tt);
  ellipse(x, height/2, radius*2, radius*2);      
  if(level > 1) {
    level = level - 1;
    drawCircle(x - radius/2, radius/2, level);
    drawCircle(x + radius/2, radius/2, level);
  }
}


  public void settings() { size(700, 700); }

  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "Simulated_Recursion" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
