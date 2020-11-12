public abstract class Piece {

  private int row, col;

  public Piece(int row, int col) {
    this.row = row;
    this.col = col;
  }

  public void draw() {
    System.out.print(" " + getClass().getName() + " ");
  }

}
