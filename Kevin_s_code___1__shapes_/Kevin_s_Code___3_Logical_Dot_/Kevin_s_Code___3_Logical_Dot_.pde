void setup(){
  size(800,800);
  
}
void draw(){
  background(211,177,222);
  if(mousePressed){
    fill(random(200),random(200),random(200));
  }else{
  fill(252,74,95);
  }
  ellipse(400,400,125,125);
  
}