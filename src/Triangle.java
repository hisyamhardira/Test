import java.awt.Color;
public class Triangle {
	
	public static void main(String[] args) {
		
		MWorld myWorld = new MWorld ("Triangle",800,600);
		MTurtle turtle = new MTurtle (myWorld);
		turtle.setColor(Color.cyan);
		turtle.setPenColor(Color.BLUE);
		
		turtle.forward(220);
		turtle.turnRight(135);
		turtle.forward(160);
		turtle.turnRight(90);
		turtle.forward(160);
		
	
}
	
}
