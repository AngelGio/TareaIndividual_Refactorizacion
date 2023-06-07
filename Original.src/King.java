import javax.swing.ImageIcon;
import java.util.ArrayList;

public class King extends ChessGamePiece {
    public King(ChessGameBoard board, int row, int col, int color) {
        super(board, row, col, color, false);
    }

    @Override
    protected ArrayList<String> calculatePossibleMoves(ChessGameBoard board) {
        ArrayList<String> allMoves = new ArrayList<String>();
        allMoves.addAll(calculateKingMoves(board, 1));
        return allMoves;
    }

    public boolean isChecked(ChessGameBoard board) {
        return getCurrentAttackers(board).size() > 0;
    }

    @Override
    public ImageIcon createImageByPieceType() {
        if (getColorOfPiece() == ChessGamePiece.WHITE) {
            return new ImageIcon(getClass().getResource("chessImages/WhiteKing.gif"));
        } else if (getColorOfPiece() == ChessGamePiece.BLACK) {
            return new ImageIcon(getClass().getResource("chessImages/BlackKing.gif"));
        } else {
            return new ImageIcon(getClass().getResource("chessImages/default-Unassigned.gif"));
        }
    }

    private ArrayList<String> calculateKingMoves(ChessGameBoard board, int distance) {
        ArrayList<String> allMoves = new ArrayList<String>();
        int row = getRow();
        int col = getCol();
        
        allMoves.addAll(calculateMovesInDirection(board, row - 1, col + 1, distance)); // North East
        allMoves.addAll(calculateMovesInDirection(board, row - 1, col - 1, distance)); // North West
        allMoves.addAll(calculateMovesInDirection(board, row + 1, col + 1, distance)); // South East
        allMoves.addAll(calculateMovesInDirection(board, row + 1, col - 1, distance)); // South West
        allMoves.addAll(calculateMovesInDirection(board, row - 1, col, distance)); // North
        allMoves.addAll(calculateMovesInDirection(board, row + 1, col, distance)); // South
        allMoves.addAll(calculateMovesInDirection(board, row, col - 1, distance)); // West
        allMoves.addAll(calculateMovesInDirection(board, row, col + 1, distance)); // East
        
        return allMoves;
    }

    private ArrayList<String> calculateMovesInDirection(ChessGameBoard board, int row, int col, int distance) {
        ArrayList<String> moves = new ArrayList<String>();
        // Lógica para calcular los movimientos en la dirección especificada con la distancia dada
        // Agrega los movimientos válidos a la lista de movimientos
        return moves;
    }
}
