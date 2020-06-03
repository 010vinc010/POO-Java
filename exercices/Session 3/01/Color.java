public class Color {

  int red, green, blue;

  public Color(int R, int G, int B) {
    this.red = R;
    this.green = G;
    this.blue = B;
  }

  public String toString() {
    return "rgb("+red+","+green+","+blue+")";
  }
}