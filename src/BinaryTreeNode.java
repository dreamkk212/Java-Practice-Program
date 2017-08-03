/* PROSPER_LEGAL_LEGEND */

/**
 * CLASS / TYPE DESCRIPTION GOES HERE.
 *
 * @author kjain
 */
public class BinaryTreeNode {

    private int value;
    private BinaryTreeNode left;
    private BinaryTreeNode right;


    public BinaryTreeNode(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public BinaryTreeNode insertLeft(int value) {
        this.left = new BinaryTreeNode(value);
        return left;
    }

    public BinaryTreeNode insertRight(int value) {
        this.right = new BinaryTreeNode(value);
        return right;
    }

    
    public BinaryTreeNode getLeft() {
        return left;
    }

    
    public BinaryTreeNode getRight() {
        return right;
    }
}
