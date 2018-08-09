PImage catPic;
int acceleration = 5;

void setup() {
  size (800,450);
   catPic = loadImage("cat.jpg");
                catPic.resize(width, height);
background(catPic);
noStroke();
}
int x = 341;
int y = 211;
void draw(){
  
   if(mousePressed){
println("Mouse’s x-position: " + mouseX + "\n" + "Mouse’s y-position: " + mouseY + "\n");}
 ellipse(x, y, 55, 60);
 ellipse(x+130, y+35, 55, 40);
        fill( 240, 5, 5);

        
        
 }
 void keyPressed() {
                 x+=2*acceleration;
y+=2*acceleration;
}