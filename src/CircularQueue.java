/* PROSPER_LEGAL_LEGEND */

/**
 * CLASS / TYPE DESCRIPTION GOES HERE.
 *
 * @author kjain
 */
public class CircularQueue {

    private int numRows;
    private String[] values;


    public CircularQueue(int rows) {
        numRows =rows;
        values = new String[rows*(rows-1)/2];
    }

    public void setValue(String value, int row, int column) {
        values[mapRowColumn(row, column)] = value;
    }

    public String getValue(int row, int column) {
        return values[mapRowColumn(row, column)];
    }

    private int mapRowColumn(int row, int column) {
        if (row > numRows ) {
            throw new ArrayIndexOutOfBoundsException();
        }
        if (row < column) {
            return (row * (row - 1) / 2) + column;
        } else {
            return row-1;
        }
    }
    
    public static void main(String[] args) {
        CircularQueue triangularArray = new CircularQueue(10);
        triangularArray.setValue("kAmi", 10, 10);
        System.out.println(triangularArray.getValue(10,10));
        triangularArray.setValue("kAmi1", 8, 10);
        System.out.println(triangularArray.getValue(8,10));
    }
}
