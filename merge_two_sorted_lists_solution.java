class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        
        if(list1 == null && list2 == null) return null;
        else if(list1 == null) return list2;
        else if (list2 == null) return list1;
        
        ListNode mergedList = new ListNode();
        ListNode pointer = mergedList;

        if(list1.val <= list2.val) {
            mergedList.val = list1.val;
            list1 = list1.next;
        }else {
            mergedList.val = list2.val;
            list2 = list2.next;
        }
        
        while(list1 != null || list2 != null){
            if(list1 == null){
                pointer.next = new ListNode(list2.val);
                list2 = list2.next;     
            }else if(list2 == null){
                pointer.next = new ListNode(list1.val);
                list1 = list1.next;   
            }else if(list1.val <= list2.val){
                pointer.next = new ListNode(list1.val);
                list1 = list1.next;  
            }else{
                pointer.next = new ListNode(list2.val);
                list2 = list2.next;    
            }
            pointer = pointer.next;
        }
        return mergedList;
    }
}