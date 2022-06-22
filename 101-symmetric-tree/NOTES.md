If the root of the tree is null, then it's symmetric,
Otherwise we'll check for right and left root of the tree
isSymmetric(root.left, root.right);
if only left or only right root is null, then return false, otherwise if both are null, return true
​
if left val is not same as right val, return true
​
check for left of left with right of right and right of left with left of right