package org.psjava.algo.sequence.sort;

import org.junit.Test;
import org.psjava.algo.sequence.sort.MergeSort;

public class MergeSortTest {
	@Test
	public void test() {
		SortTestUtil.testSimpleSort(new MergeSort());
	}
}