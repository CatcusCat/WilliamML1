int xPos = 200;
int yPos = 375;
Car c = new Car();
Car b = new Car();
Car a = new Car();


void setup() {
  size(400, 400);
}
void draw() {
  background(255, 255, 255);
  fill(0, 255, 0);
  ellipse(xPos, yPos, 10, 10);
  noStroke();
  display(c);
}

void keyPressed() {
  if (key == CODED) {
    if (keyCode == UP)
    {
      yPos -= 10;
    } else if (keyCode == DOWN) {
      yPos += 10;
    } else if (keyCode == RIGHT) {
      xPos += 10;
    } else if (keyCode == LEFT) {
      xPos -= 10;
    }
  }
}

void stayIn() {
  if (xPos >= 400) {
    xPos = 395;
  }  
  if (xPos >= 400) {
    xPos = 395;
  } else if (xPos <= 0) {
    xPos = 5;
  } else if (yPos >= 400) {
    yPos = 395;
  } else if (yPos <= 0) {
    yPos = 5;
  }
}
class Car {
  public car(int x, int y, int size) {
    

 

 }
}
}

 void display() {{
  
    fill(0, 255, 0);
    rect(x, y, size, 50);
  
 }

 void moveL() {
  x -= 10; 
  
  if (x == 0) {
   x == 400;
    
  }