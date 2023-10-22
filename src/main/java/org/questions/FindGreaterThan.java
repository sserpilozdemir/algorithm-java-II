package org.questions;

public class FindGreaterThan {

    int[] data;


    FindGreaterThan next;

    public FindGreaterThan(int[] data) {
        this.data = data;
        this.next = null;
    }


    public FindGreaterThan deleteGreaterThan(FindGreaterThan head, int x){
        FindGreaterThan filteredHead = null;
        FindGreaterThan filteredTail = null;
        FindGreaterThan current = head;

        while(current != null){
            if(current.data[0] < x){
                if(filteredHead == null){
                    filteredHead = new FindGreaterThan(current.data);
                    filteredTail = filteredHead;
                }else {
                    filteredHead.next = new FindGreaterThan(current.data);
                    filteredTail = filteredTail.next;
                }
            }
            current = current.next;

        }
        return filteredHead;

    }
}
