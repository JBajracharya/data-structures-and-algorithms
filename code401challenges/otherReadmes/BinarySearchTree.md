# Trees
<!-- Short summary or background information -->
Creating Binary Search tree and different methods to traverse through the tree.

## Challenge
<!-- Description of the challenge -->
Binary search tree that adds smaller value node to the left of the tree and adds bigger value
to the right of the tree. Methods created are preOrder, inorder, postOrder, add, and contains

## Approach & Efficiency
<!-- What approach did you take? Why? What is the Big O space/time for this approach? -->
For all the methods recursive path is used to move through the nodes. Each node has value pointer
to the left node and the pointer to the right node. Root node is replaced with new left or right
node and traversed through same way.

## API
<!-- Description of each method publicly available in each of your trees -->
Insert method: takes value for parameter and adds the node to the left if the value is smaller and to the right if the value is 
bigger.
contains method: takes value for parameter and checks if the tree contains the given value
preOrder method: takes root node for parameter and return Array list of value in the order(root, left, right)
inOrder method: takes root node for parameter and return Array list of value in the order(left, root, right)
postOrder method: takes root node for parameter and return Array list of value in the order(left, right, root)
