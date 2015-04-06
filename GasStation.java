/***
There are N gas stations along a circular route, where the amount of gas at station i is gas[i].

You have a car with an unlimited gas tank and it costs cost[i] of gas to travel from station i to its next station (i+1). You begin the journey with an empty tank at one of the gas stations.

Return the starting gas station's index if you can travel around the circuit once, otherwise return -1.

Note:
The solution is guaranteed to be unique.
*/


public class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        if(gas.length==0 || cost.length ==0){
            return -1;
        }
        int fuel=0;
        int current=0;
        for(int i=0; i<=gas.length*2;i++){
            fuel += gas[i%gas.length];
            fuel -= cost[i%cost.length];
            if(fuel <0){
                fuel=0;
                current =-1;
            }
            if(current == gas.length){
                return i-current;
            }
            current++;
        }
    
        return -1;
    }
}
