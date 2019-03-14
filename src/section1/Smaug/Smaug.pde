PImage beard;
  PImage Smaug;
void setup(){
  Smaug = loadImage("Smaug.jpg");
    size (752,1012);
    Smaug.resize(width,height);
    beard = loadImage("W.png");
}
void draw(){
  background(Smaug);
  
}