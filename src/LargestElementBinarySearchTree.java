/* PROSPER_LEGAL_LEGEND */

/**
 * CLASS / TYPE DESCRIPTION GOES HERE.
 *
 * @author kjain
 */
public class LargestElementBinarySearchTree {

    public Integer findLargestNumberGivenBinarySearchTreeRecursion(BinaryTreeNode root) {
        if (root == null) {
            return null;
        }

        if (root.getRight() != null) {
            return findLargestNumberGivenBinarySearchTree(root.getRight());
        }

        return root.getValue();
    }

    public Integer findLargestNumberGivenBinarySearchTree(BinaryTreeNode root) {
        if (root == null) {
            return null;
        }
        BinaryTreeNode currentNode = root;
        while (currentNode != null) {
            if ((currentNode.getRight() == null)) {
                return currentNode.getValue();
            }
            currentNode = currentNode.getRight();
        }
        return currentNode.getValue();
    }

    public Integer findSecondLargestNumberGivenBinarySearchTree(BinaryTreeNode root) throws Exception {
        if (root == null || (root.getLeft() == null && root.getRight() == null)) {
            throw new Exception("minimum two nodes required to calculate the second largest.");
        }

        BinaryTreeNode currentNode = root;

        while (true) {

            if (currentNode.getRight() == null && currentNode.getLeft() != null) {
                return findLargestNumberGivenBinarySearchTree(currentNode.getLeft());
            }

            if (currentNode.getRight() != null && currentNode.getRight().getRight() == null
                    && currentNode.getRight().getLeft() == null) {
                return currentNode.getValue();
            }
            currentNode = currentNode.getRight();

        } // return findSecondLargestNumberGivenBinarySearchTree(root.getRight());
    }

    public static void main(String[] args) throws Exception {
        BinaryTreeNode root = new BinaryTreeNode(5);
        BinaryTreeNode level1LeftNode = root.insertLeft(3);
        level1LeftNode.insertLeft(1);
        level1LeftNode.insertRight(4);
        BinaryTreeNode level1RightNode = root.insertRight(8);
        BinaryTreeNode level2RightLeftNode = level1RightNode.insertLeft(7);
        BinaryTreeNode level2RightRightNode = level1RightNode.insertRight(12);
        BinaryTreeNode level3RightleftNode = level2RightRightNode.insertLeft(10);
        level3RightleftNode.insertLeft(9);
        level3RightleftNode.insertRight(11);
        LargestElementBinarySearchTree largestElementBinarySearchTree = new LargestElementBinarySearchTree();
        System.out.println("findLargest" + largestElementBinarySearchTree.findLargestNumberGivenBinarySearchTree(root));
        System.out.println("findSecondLargest"
                + largestElementBinarySearchTree.findSecondLargestNumberGivenBinarySearchTree(root));
    }

}
