package org.questions;

public class Main {
    public static void main(String[] args) {
        FindGreaterThan head = new FindGreaterThan(new int[]{10});
        head.next = new FindGreaterThan(new int[]{15});
        head.next.next = new FindGreaterThan(new int[]{7});
        head.next.next.next = new FindGreaterThan(new int[]{5});

        FindGreaterThan filteredList = head.deleteGreaterThan(head, 8);

        FindGreaterThan current = filteredList;
        while (current != null) {
            System.out.println(current.data[0]);
            current = current.next;
        }
    }
}
