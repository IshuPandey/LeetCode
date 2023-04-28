// You are given the heads of two sorted linked lists list1 and list2.

// Merge the two lists in a one sorted list. The list should be made by splicing together the nodes of the first two lists.

// Return the head of the merged linked list.


public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
    ListNode list = new ListNode(0);
    ListNode handler = list;
    while(list1 != null && list2 != null) {
        if (list1.val <= list2.val) {
            handler.next = list1;
            list1 = list1.next;
        } else {
            handler.next = list2;
            list2 = list2.next;
        }
        handler = handler.next;
    }
    
    if (list1 != null) {
        handler.next = list1;
    } else if (list2 != null) {
        handler.next = list2;
    }
    
    return list.next;
}