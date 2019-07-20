package com.mutlucelep.leetcode.a965uniqueemailaddresses;

import java.util.HashMap;

/**
 * URL:
 * =====
 * https://leetcode.com/problems/unique-email-addresses/
 * <p>
 * Desc:
 * =====
 * Every email consists of a local name and a domain name, separated by the @ sign.
 * <p>
 * <p>
 * <p>
 * For example, in alice@leetcode.com, alice is the local name, and leetcode.com is the domain name.
 * <p>
 * <p>
 * <p>
 * Besides lowercase letters, these emails may contain '.'s or '+'s.
 * <p>
 * <p>
 * <p>
 * If you add periods ('.') between some characters in the local name part of an email address, mail sent there will be forwarded to the same address without dots in the local name. For example, "alice.z@leetcode.com" and "alicez@leetcode.com" forward to the same email address. (Note that this rule does not apply for domain names.)
 * <p>
 * <p>
 * <p>
 * If you add a plus ('+') in the local name, everything after the first plus sign will be ignored. This allows certain emails to be filtered, for example m.y+name@email.com will be forwarded to my@email.com. (Again, this rule does not apply for domain names.)
 * <p>
 * <p>
 * <p>
 * It is possible to use both of these rules at the same time.
 * <p>
 * Given a list of emails, we send one email to each address in the list. How many different addresses actually receive mails?
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * <p>
 * Input: ["test.email+alex@leetcode.com","test.e.mail+bob.cathy@leetcode.com","testemail+david@lee.tcode.com"]
 * Output: 2
 * Explanation: "testemail@leetcode.com" and "testemail@lee.tcode.com" actually receive mails
 * <p>
 * <p>
 * Note:
 * <p>
 * <p>
 * 1 <= emails[i].length <= 100
 * 1 <= emails.length <= 100
 * Each emails[i] contains exactly one '@' character.
 * All local and domain names are non-empty.
 * Local names do not start with a '+' character.
 */

class Solution {
    public int numUniqueEmails(String[] emails) {
        if (emails == null || emails.length <= 0) {
            return 0;
        }

        HashMap<String, String> map = new HashMap<>();
        int diff = 0;
        for (int i = 0; i < emails.length; i++) {
            String s = emails[i];
            int indexOfPlus = s.indexOf('+');
            int indexOfAt = s.indexOf('@');
            String local;
            if (indexOfPlus >= 0) {
                local = s.substring(0, indexOfPlus);
            } else {
                local = s.substring(0, indexOfAt);
            }

            String domain = s.substring(indexOfAt + 1, s.length());

            String removedDotLocal = local.replace(".", "");
            if (map.containsKey(domain) && map.containsValue(removedDotLocal)) {
                continue;
            }
            diff++;
            map.put(domain, removedDotLocal);
        }

        return diff;
    }
}
