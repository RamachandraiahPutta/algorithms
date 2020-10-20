package com.algorithms.greedy;

import java.util.ArrayList;
import java.util.List;

import com.algorithms.bitwise.RightMostSetBit;

/*
 * You are given n activities with their start and finish times. 
 * Select the maximum number of activities that can be performed by a single person, 
 * assuming that a person can only work on a single activity at a time.
 * 
 * */
public class ActivitySelection {

	List<Integer> selectActivities(int[] s, int[] f, int n) {

		List<Integer> selectedActivities = new ArrayList<Integer>();

		// The first activity always gets selected
		int lastSelectedActivity = 0;
		selectedActivities.add(lastSelectedActivity);

		for (int i = 1; i < n; i++) {
			if (s[i] >= f[lastSelectedActivity]) {
				selectedActivities.add(i);
				lastSelectedActivity = i;
			}
		}

		return selectedActivities;
	}

	public static void main(String args[]) {
		ActivitySelection ob = new ActivitySelection();

		int s[] = { 1, 3, 0, 5, 8, 5 };
		int f[] = { 2, 4, 6, 7, 9, 9 };
		int n = s.length;

		List<Integer> selectActivities = ob.selectActivities(s, f, n);

		System.out.println("Maximum Possible Activities: " + selectActivities);
	}
}
