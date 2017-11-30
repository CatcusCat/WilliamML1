  double gravity = 4;
  double velocity = 0;
  float dotY = -100;
  float pipeX = 600;
  int score = 0;

void setup() {
  size(800, 600);
}

void draw() {
  background(0, 0, 0);
  
  if (pipeX == 100  && dotY <= 200 || dotY >= 400) {
     System.out.println("You lose");
     System.out.println(score);
     System.exit(0);
  }
  
  else if (pipeX == 100  && dotY > 200 && dotY < 400) {
   score += 1; 
  }
  
  if (dotY == 700){
    dotY = -100;
  }
  
  if (pipeX == -50) {
     pipeX = 850;
    
  }
  
  rect(pipeX, -100, 50, 300);
  rect(pipeX, 400, 50, 300);
  ellipse(100, dotY, 50, 50);
  velocity += gravity;
  dotY += gravity;
  pipeX -= 5;
  
  
   if (mousePressed == true) {
     delay(20);
    dotY += -20;
    
  }
  
}