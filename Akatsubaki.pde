float x;
float y;
float shade;

void setup() {
  size(200, 100);
  
  //start in middle of screen
  x = width/2;
  y = height/2;
  shade = 128;
}

void draw() {
    
  //randomly move the point
  x = x + random(-1, 1);
  y = y + random(-1, 1);
  
  //wrap left and right
  if(x < 0){
    x = width;
  }
  if(x > width){
    x = 0;
  }

  //wrap top and bottom
  if(y < 0){
    y = height;
  }
  if(y > height){
    y = 0;
  }
  
  //randomly change the color
  shade = shade + random(-1, 1);
  
  //don't let the color go outside the bounds
  if(shade < 0){
    shade = 0;
  }
  if(shade > 255){
    shade = 255;
  }
  
  //set the color
  stroke(shade);
  
  //draw the point
  point(x, y);
}
