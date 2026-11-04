
class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode curr=head;
        int length=0;
        while(curr!=null){
            curr=curr.next;
            length++;
        }
        curr=head;
        for(int i=1;i<=length/2;i++){
            curr=curr.next;

        }
        return curr;
        
    }
}