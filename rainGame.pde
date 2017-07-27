int yPos;
int randomNumber = (int) random(width);
int score = 0;
void setup() {
  yPos = -5;
  size(500, 500);
}

void draw() {
   if(score == 5) {
    text("YOU WIN", 250, 250); 
    stop();
   }
   
   else {
  background(255, 255, 255);
  fill(0, 0, 255);
  ellipse(randomNumber, yPos, 10, 10);
  noStroke();
  fill(1, 1, 1);
  rect(mouseX, 450, 100, 100);
  yPos += 5;
  
  if (yPos == 510) {
   yPos = -5; 
   checkCatch();
   randomNumber = (int) random(width);
   
  
  }
 }
}

void checkCatch(){
if (randomNumber > mouseX && randomNumber < mouseX+100)
      score++;
   else if (score > 0) {
     score--;
   }
println("Your score is now: " + score);
fill(0, 0, 0);
textSize(16);
text("Score: " + score, 20, 20);

}