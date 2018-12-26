PImage mustache;
  PImage DrugMan;
void setup(){
  DrugMan = loadImage("DrugMan.jpg");
  size(700,680);
  DrugMan.resize(700,680);
  mustache = loadImage("FaceHair.png");
  mustache.resize(250,80);
  
}
void draw(){
  background(DrugMan);
  if (mousePressed){
    background(DrugMan);
  image(mustache,230,383);
  }else{
    image(mustache,mouseX,mouseY);
  }
}