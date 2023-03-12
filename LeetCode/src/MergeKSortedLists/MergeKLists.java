/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class MergeKLists {
    public ListNode mergeKLists(ListNode[] lists) {
    if(lists.length == 0) return null;
    List<Integer> l1 = new ArrayList<>();
      for(ListNode arr : lists){
          while(arr != null){
              l1.add(arr.val);
              arr = arr.next;
          }
      }
      Collections.sort(l1); 
      
      ListNode ans = null;
      ListNode temp = null;
      for (Integer i : l1){
          if(temp == null){
              temp = new ListNode(i);
              ans = temp;
          }
          else{
              temp.next = new ListNode(i);
              temp = temp.next;
          }
      }
      return ans;
    }
}