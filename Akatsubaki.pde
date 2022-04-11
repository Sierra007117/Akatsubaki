import java.lang.management.ManagementFactory;
import com.sun.management.OperatingSystemMXBean;
OperatingSystemMXBean osBean;
float[] values;
int i = 0;
int j = 0;

boolean isDone = false;

void setup() {
  fullScreen(P2D);
  //size(400, 200);
  osBean = ManagementFactory.getPlatformMXBean(OperatingSystemMXBean.class);  
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
  if (isDone){
     return;
  }
  background(000, 000, 000);
  textSize(20);
  text("Bubble Sort - Dynamic Simulation", 00, 20);
  text("System RTC - " + hour() + ":" + minute() + ":" + second()+ ":" + millis(), 00, 40);
  text("Payload - " + values, 00, 60);
  text("Sample - " + values[i], 00, 80);
  text("CPU Load - " + ((float)osBean.getSystemCpuLoad()), 00, 100);
  text("VRAM - " + ((long)osBean.getCommittedVirtualMemorySize()), 00, 120);

  if (i < values.length) {
    for (int j = 0; j < values.length-i-1; j++) {
      float a = values[j];
      float b = values[j+1];
      if (a > b) {
        swap(values, j, j+1);
      }
    }
  } else {
    println("Simulation Completed");
    isDone = true;
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
