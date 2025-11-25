public class Shapes {
    public static void main(String[] args) {
      
        // Task 1: Draw a regular shape
         Turtle turtle = new Turtle(250,250);
         turtle.setCanvasSize(1000,1000);
         for(int i=1;i<=3;i++){
            turtle.forward(50.0);
            turtle.left(120);
         }

        // Task 2: Draw a regular shape many times
        turtle.up();
        turtle.setPosition(-250,-250);
        turtle.down();
        for(int i=1;i<=10;i++){
           for(int j=1;j<=2;j++){
               turtle.forward(50.0);
               turtle.left(120);
               }
               turtle.forward(50.0);
               turtle.left(120);
               turtle.forward(50.0);
               turtle.left(120);
               turtle.forward(50.0);
               turtle.left(120);
               turtle.forward(100);
               turtle.left(36);
}


        // Task 3: How many times does Turtle turn!
        turtle.up();
        turtle.setPosition(250,-250);
        turtle.down();
         for(int i=1;i<=10;i++){
           for(int j=1;j<=2;j++){
               turtle.forward(50.0);
               turtle.left(120);
               }
               turtle.forward(50.0);
               turtle.left(120);
               turtle.forward(50.0);
               turtle.left(120);
               turtle.forward(50.0);
               turtle.left(120);
               turtle.forward(100);
               turtle.left(36);
}

        // Extension 1:


        // Extension 2:

    }
}
