PImage mustache;
  PImage friend;

void setup() {size(600,500);
friend = loadImage("logan.jpeg");

friend.resize(width,height);

}
void draw () {
background(friend);  
  image(mustache, 400, 300);
  
  
}