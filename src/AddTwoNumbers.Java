public class Solution {
//    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
//      ListNode dummy = new ListNode(0);
//      ListNode p1=l1;
//      ListNode p2=l2;
//      ListNode curr = dummy;
//      int carry=0;
//      while(p1 !=null || p2 !=null){
//          int x= (p1 !=null) ? p1.val : 0;
//          int y= (p2 !=null) ? p2.val : 0;
//          int sum=x+y+carry;
//          carry = sum/10;
//          curr.next = new ListNode(sum % 10);
//          curr = curr.next;
//          if(p1 !=null) { p1=p1.next;}
//          if(p2 !=null) { p2=p2.next;}
//      }
//          if (carry > 0) 
//        curr.next = new ListNode(carry);
//    return dummy.next;
//    
//    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    int carry=0;
    ListNode newNode = new ListNode(0);
    ListNode p1=l1, p2=l2, p3=newNode;
    while(p1 != null || p2 != null) {
        if(p1 != null) {
            carry +=p1.val;
            p1=p1.next;
        }
        if(p2 != null) {
            carry +=p2.val;
            p2 = p2.next;
        }
        p3 = new ListNode(carry%10);
        p3=p3.next;
        carry/=10;
        if(carry ==1) {
            p3 = new ListNode(carry);
        }
        }   
        return newNode.next;
    }
    
}