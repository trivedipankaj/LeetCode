public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode temp1=l1,temp2=l2,newhead=null,res=null;
        int first=0,second=0;
        int carry=0;
        while(temp1!=null || temp2!=null){
             first = temp1!=null?temp1.val:0;
             second = temp2!=null?temp2.val:0;
             
             int result = carry+first+second;
             carry=0;
             if(result>=10){
                 carry=result/10;
                 result = result%10;
             }
             ListNode p = new ListNode(result);
             if(newhead!=null){
                 newhead.next =p;
                 newhead = newhead.next;
             }else{
                 newhead =p;
                 res =newhead;
             }
             if(temp1!=null) temp1 =temp1.next;
             if(temp2!=null) temp2=temp2.next;
        }
        if(carry>0){
            ListNode p = new ListNode(carry);
            newhead.next =p;
        }
        return res;
    }
}
