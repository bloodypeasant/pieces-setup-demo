public class Chess {

  private String[][] boardSetup = {
      { "Black Rook", "Black Knight", "Black Bishop", "Black Queen", "Black King", "Black Bishop", "Black Knight",
          "Black Rook" },
      { "Black Pawn", "Black Pawn", "Black Pawn", "Black Pawn", "Black Pawn", "Black Pawn", "Black Pawn",
          "Black Pawn" },
      { "", "", "", "", "", "", "", "" }, { "", "", "", "", "", "", "", "" }, { "", "", "", "", "", "", "", "" },
      { "", "", "", "", "", "", "", "" },
      { "White Pawn", "White Pawn", "White Pawn", "White Pawn", "White Pawn", "White Pawn", "White Pawn",
          "White Pawn" },
      { "White Rook", "White Knight", "White Bishop", "White Queen", "White King", "White Bishop", "White Knight",
          "White Rook" }, };

  private Piece[][] pieces = new Piece[8][8];

  public Chess() {
    System.out.println("Constructing Chess");
    makePieces();
    draw();
  }

  private void makePieces() {
    for (int row = 0; row < 8; row++) {
      for (int col = 0; col < 8; col++) {
        switch (boardSetup[row][col]) {
          // black pieces
          case "Black Rook":
            pieces[row][col] = new BlackRook(row, col);
            break;
          case "Black Knight":
            pieces[row][col] = new BlackKnight(row, col);
            break;
          case "Black Bishop":
            pieces[row][col] = new BlackBishop(row, col);
            break;
          case "Black Queen":
            pieces[row][col] = new BlackQueen(row, col);
            break;
          case "Black King":
            pieces[row][col] = new BlackKing(row, col);
            break;
          case "Black Pawn":
            pieces[row][col] = new BlackPawn(row, col);
            break;
          // white pieces
          case "White Rook":
            pieces[row][col] = new WhiteRook(row, col);
            break;
          case "White Knight":
            pieces[row][col] = new WhiteKnight(row, col);
            break;
          case "White Bishop":
            pieces[row][col] = new WhiteBishop(row, col);
            break;
          case "White Queen":
            pieces[row][col] = new WhiteQueen(row, col);
            break;
          case "White King":
            pieces[row][col] = new WhiteKing(row, col);
            break;
          case "White Pawn":
            pieces[row][col] = new WhitePawn(row, col);
            break;
          default:
            pieces[row][col] = null;
        }
      }
    }
  }

  private void draw() {
    for (int row = 0; row < 8; row++) {
      for (int col = 0; col < 8; col++) {
        Piece piece = pieces[row][col];
        if (piece == null) {
          System.out.print("   ");
          continue;
        }
        piece.draw();
      }
      System.out.println();
    }
  }

  public static void main(String[] args) {
    new Chess();
  }
}