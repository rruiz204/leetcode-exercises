package MergeTwoSortedList;

public class Solution {
  public static void main(String[] args) {
    Node l1  = new Node(1);
    l1.next = new Node(2);
    l1.next.next = new Node(4);

    Node l2 = new Node(1);
    l2.next = new Node(3);
    l2.next.next = new Node(4);

    Node ordered = solve(l1, l2);
    while (ordered != null) {
      System.out.println(ordered.value);
      ordered = ordered.next;
    }
  }

  public static Node solve(Node l1, Node l2) {
    Node dummy = new Node(0);
    Node current = dummy;

    while (l1 != null && l2 != null) {
      if (l1.value <= l2.value) {
        current.next = l1;
        l1 = l1.next;
      } else {
        current.next = l2;
        l2 = l2.next;
      }

      current = current.next;
    }

    if (l1 != null) {
      current.next = l1;
    }

    if (l2 != null) {
      current.next = l2;
    }

    return dummy.next;
  }
}
