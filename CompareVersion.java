/***
Compare two version numbers version1 and version2.
If version1 > version2 return 1, if version1 < version2 return -1, otherwise return 0.

You may assume that the version strings are non-empty and contain only digits and the . character.
The . character does not represent a decimal point and is used to separate number sequences.
For instance, 2.5 is not "two and a half" or "half way to version three", it is the fifth second-level revision of the second first-level revision.

Here is an example of version numbers ordering:

0.1 < 1.1 < 1.2 < 13.37


**/


public class Solution {
    public int compareVersion(String version1, String version2) {
        String[] s1 = version1.split("\\.");
        String[] s2 = version2.split("\\.");
        int i = 0, j = 0;
        int m = s1.length;
        int n = s2.length;
        while (i < m && j < n) {
            int d1 = Integer.parseInt(s1[i]), d2 = Integer.parseInt(s2[j]);
            if (d1 > d2) return 1;
            if (d1 < d2) return -1;
            i++;
            j++;
        }
        while(i<m){
            if (Integer.parseInt(s1[i]) > 0) return 1;
            i++;
        }
        while(j<n){
            if (Integer.parseInt(s2[j]) > 0) return -1;
            j++;
        }
        return 0;
        
    }
}
