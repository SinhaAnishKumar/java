int count = 0;
int result = Integer.Min_VALUE;
public int KthSmallest(TreeNode root, int k){
  traverse(root, k);
  return result;
}
public void traverse(TreeNode root, int k){
  if(root == null) return;
  traverse(root.left, k);
  count++;
  if(count == k) result = root.val;
  traverse(root.right, k);
} 
