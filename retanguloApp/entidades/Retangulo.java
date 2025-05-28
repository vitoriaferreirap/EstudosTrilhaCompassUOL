package retanguloApp.entidades;

public class Retangulo {
  public double width;
  public double height;

  //contrutor
  public Retangulo(double width, double height) {
    this.width = width;
    this.height = height;
  }


  public  double Area() {
    double area = width * height;
    return area;

  }

  public  double Perimetro() {
    //formula para perimetro
    double perimetro = 2 * (width + height);
    return perimetro;

  }

  public  double Diagonal() {
    //formula para diagonal
    double diagonal = Math.sqrt((width * width) + (height * height)); //Matheight.sqrt() calcula a raiz quadrada
    return diagonal;
  }
  @Override //Garante que está sobrescrevendo corretamente um método da superclasse 
  public  String toString() { //não deve receber paramentro.
    return String.format(
        "Area: %.2f\nPerímetro: %.2f\nDiagonal: %.2f ",
        Area(), Perimetro(), Diagonal()  
    );

   
  }
  
}
