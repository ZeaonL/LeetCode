public class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    public void printList() {
        if (this.next == null) {
            System.out.println(this.val + " -> null");
        }
        else {
            System.out.print(this.val + " -> ");
            this.next.printList();
        }
    }

    public static void main(String[] args) {
        System.out.println("this is ListNode!");
    }
}
