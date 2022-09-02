🧠Approach 1 : Using preorder recursion

Idea:
The idea is to visit each node of the input binary tree using preorder andcheck their existence in both the trees. If current nodes in both trees are not null then we add their values and update node value in root1 and return it at the last. 


Algorithm:

In preorder fashion traverse both the binary trees, i.e, tree1 and tree2.

If both the current treenodes are NULL, return NULL.

If one of them isn’t NULL, return the other treenode.

If both are not NULL, update the first tree, i.e, tree1, with the summation of values of both the treenodes.

Make the recursive call for left subtree and right subtree.

At last, return the treenode of tree1, as it contains the merged version of both trees.


class Solution {
    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) 
    {
        //if any one root is nul,return the other root
        if(root1 == null)
            return root2;
        else if(root2 == null)
            return root1;
        
        //else add both the roots of trees
        root1.val += root2.val;
        
        //call recursively for left and right subtrees
        root1.left = mergeTrees(root1.left,root2.left);
        root1.right = mergeTrees(root1.right,root2.right);
        
        //we are updating value in root1 so return it.
        return root1;
    }
}

⏳Analysis:
Time complexity: O(n)
Space complexity: O(n)







🧠Approach 2: Iterative postorder traversal using stack

Idea:
Here also we'll traverse both the trees but instead using recursion we'll use stack to solve it iteratively.

Algorithm:

Create a stack.
While stack is not empty, 
Insert the root nodes of both trees.
We remove a nodepair from stack and update the corresponding node with the sum of values in the first trees.
If both nodes are null, we continue popping the next pair from stack.
If the left chid of root1 is not null, we insert the left child of both trees onto stack.
If left child of root1 is null, we append the left child of root2 to the current node
We continue the process for the right child as well.
At the end, we return the merged root, i.e, root1.









public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        if(root1==null && root2==null){
            return null;
        }
        if(root1==null){
            return root2;
        }
        if(root2==null){
            return root1;
        }
        Stack<TreeNode[]>st=new Stack<>();
        st.push(new TreeNode[]{root1,root2});
        while(!st.isEmpty()){
            TreeNode[] curr=st.pop();
            curr[0].val+=curr[1].val;
            if(curr[0].left==null)
                curr[0].left=curr[1].left;
            else if(curr[1].left!=null) 
                st.push(new TreeNode[]{curr[0].left,curr[1].left});
            if(curr[0].right==null)
                curr[0].right=curr[1].right;
            else if(curr[1].right!=null) 
                st.push(new TreeNode[]{curr[0].right,curr[1].right});
            
        }
        return root1;
    }



⏳Analysis:
Time complexity: O(n)
Space complexity: O(n)









🧠Other approaches:

We can use BFS(level order traversal)/DFS. The idea will remain same as above except that we're using queue data structure to track the order of nodes and merge their values. Time and space complexity will remain same as previous.


Using BFS traversal:





class Solution {
    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        if(root1==null)
            return root2;
        if(root2==null)
            return root1;
        Queue<TreeNode [] > q = new LinkedList<>();
        q.add(new TreeNode[]{root1,root2});
            while(!q.isEmpty()){
      TreeNode curr[] = q.remove();
                curr[0].val = curr[0].val + curr[1].val;
                if(curr[0].left==null)
                  curr[0].left = curr[1].left;
               else if(curr[1].left !=null)
                    q.add(new TreeNode[]{curr[0].left,curr[1].left});
                if(curr[0].right==null)
                    curr[0].right=curr[1].right;
               else if(curr[1].right!=null)
                    q.add(new TreeNode[]{curr[0].right,curr[1].right});
            }
        return root1;  
  }
}

