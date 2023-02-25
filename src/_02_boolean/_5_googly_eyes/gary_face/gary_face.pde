PImage gary;
int width = 800;
int height = 600;

void setup() {
  size(800, 600);
  gary = loadImage("cat.jpg");
  gary.resize(800, 600);
  image(gary,0,0);
  
}

void draw() {
  background(gary);
  fill(#FFFFFF);
  ellipse(210,290,230,230);
  fill(#FFFFFF);
  ellipse(550,290,230,230);
  fill(#000000);
  
  if(mouseX>110 && mouseX<310 && mouseY>200 && mouseY<380){
    ellipse(mouseX,mouseY,150,150);
    ellipse(mouseX+550-210,mouseY,150,150);
  }else{
    ellipse(210,290,150,150);
    ellipse(210+550-210,290,150,150);
  }
  
}
