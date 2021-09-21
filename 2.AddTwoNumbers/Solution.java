import java.util.*;

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if (l1 == null) {
            return l2;
        }
        else if (l2 == null) {
            return l1;
        }
        int pre = 0, p = 0;
        ListNode l1_pre = null, l1_head = l1;
        while(l1 != null && l2 != null) {
            pre = p;
            p = (l1.val + l2.val + pre) / 10;
            l1.val = (l1.val + l2.val + pre) % 10;
            l1_pre = l1;
            l1 = l1.next;
            l2 = l2.next;
        }
        if (l1 == null && l2 != null) {
            l1_pre.next = l2;
            l1 = l2;
        }
        while(p != 0) {
            if (l1 != null) {
                pre = p;
                p = (pre + l1.val) / 10;
                l1.val = (pre + l1.val) % 10;       
                l1_pre = l1;
                l1 = l1.next;
            }
            else {
                l1_pre.next = new ListNode(p);
                p = 0;
            }         
        }
        return l1_head;
    }

    public Solution () {
        /*
        本题的目标是，把用链表存储的大数字相加。
        本题需要考虑严密边界条件。
        */
    }

    public static void main(String[] args) {
        // System.out.println("Hello Solution!");
        Solution mySolution = new Solution();
        ListNode a = new ListNode(2), b = new ListNode(5);
        a.next = new ListNode(4);
        a.next.next = new ListNode(5);
        b.next = new ListNode(6);
        b.next.next = new ListNode(4);
        a.next.next.next = new ListNode(3);
        b.next.next.next = new ListNode(7);
        a.printList();
        b.printList();
        mySolution.addTwoNumbers(a, b).printList();
        // System.out.println(Arrays.toString(mySolution.twoSumOther(nums, target)));
    }
}