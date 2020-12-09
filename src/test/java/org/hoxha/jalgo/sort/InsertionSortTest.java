package org.hoxha.jalgo.sort;

class InsertionSortTest extends AbstractSortTest {

    @Override
    public Sort getInstance() {
        return SortFactory.insertionSort();
    }
}
