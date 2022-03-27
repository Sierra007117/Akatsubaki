float[] values;

int i = 0;
int j = 0;

void setup() {
  //fullScreen(P2D);
  size(1366, 768);
  values = new float[width];
  for (int i = 0; i < values.length; i++) {
    values[i] = random(height);
    //values[i] = noise(i/100.0)*height;
  }
  //for (int i = 0; i < values.length; i++) {
  //  }
  //}
}

void draw() {
  background(000,000,000);
  textSize(20);
  text("Bubble Sort - Dynamic Simulation", 00, 20);  
  text("System RTC - "+ hour() + ":" +minute()+ ":"+second()+ ":"+millis(), 00, 40);
  text("Payload - " + values, 00, 60);
  text("Sample - " + values[i], 00, 80);  
  if (i < values.length) {
    for (int j = 0; j < values.length-i-1; j++) {
      float a = values[j];
      float b = values[j+1];
      if (a > b) {
        swap(values, j, j+1);
      }
    }
  } 
  else {
    println("Simulation Completed");
    exit(); 
  }
  i++;

  for (int i = 0; i < values.length; i++) {
    stroke(255);
    line(i, height, i, height - values[i]);
  }
}

void swap(float[] arr, int a, int b) {
  float temp = arr[a];
  arr[a] = arr[b];
  arr[b] = temp;
}
