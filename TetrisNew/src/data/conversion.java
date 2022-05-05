package data;

public class conversion {
	public static int cellToCoord(int cell) {
		return cell * 32;
		
	}
	public static int coordToCell(int coord) {
		return coord / 32;
	}
}
