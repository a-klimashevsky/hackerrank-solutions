package toptal.i;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Solution {
    private class Contact {
        Contact(String a, String b) {
            this.name = a;
            this.number = b;
        }

        String name;
        String number;
    }

    public String solution(String[] A, String[] B, String P) {
        List<Contact> contacts = new ArrayList<>();
        for (int i = 0; i < A.length; i++) {
            contacts.add(new Contact(A[i], B[i]));
        }
        Collections.sort(contacts, new Comparator<Contact>() {
            @Override
            public int compare(Contact o1, Contact o2) {
                return o1.name.compareTo(o2.name);
            }
        });

        for (Contact contact : contacts) {
            if (contact.number.contains(P)) {
                return contact.name;
            }
        }

        return "NO CONTACT";
    }
}
