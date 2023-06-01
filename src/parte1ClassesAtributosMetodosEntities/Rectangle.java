package parte1ClassesAtributosMetodosEntities;

public class Rectangle {
	
	public double width,height; //largura,altura
	
	public Rectangle() {
		
	}
	
	public double area() {
	
		return width * height;
	}
	public double perimeter() {//perímetro
		
		return 2 * (width + height);
	}
	public double diagonal() {
		return Math.sqrt(width * width + height * height); 
	}

	@Override
	public String toString() {
		return "A área do retângulo informado está definida em:\n\n"
  +String.format("        Altura de %.2f%n"
						+ "        Largura de %.2f%n"
						+ "        Area: %.2f%n"
						+ "        Perimetro %.2f%n"
						+ "        Diagonal %.2f ",height,width,area(),perimeter(),diagonal());
		
	}
	

}
