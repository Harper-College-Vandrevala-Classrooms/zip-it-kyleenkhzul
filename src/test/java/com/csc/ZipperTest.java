package com.csc;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ZipperTest {

  Zipper zipper;

  @BeforeEach
  void setUp() {
    zipper = new Zipper();
  }

   @Test
    void testZipEqualLengthLists() {
        List<Integer> list1 = Arrays.asList(1, 3, 5);
        List<Integer> list2 = Arrays.asList(2, 4, 6);
        List<Integer> expected = Arrays.asList(1, 2, 3, 4, 5, 6);

        assertEquals(expected, zipper.zip(list1, list2));
    }

    @Test
    void testZipFirstListLonger() {
        List<String> list1 = Arrays.asList("a", "b", "c", "d");
        List<String> list2 = Arrays.asList("1", "2");
        List<String> expected = Arrays.asList("a", "1", "b", "2", "c", "d");

        assertEquals(expected, zipper.zip(list1, list2));
    }

    @Test
    void testZipSecondListLonger() {
        List<Character> list1 = Arrays.asList('x', 'y');
        List<Character> list2 = Arrays.asList('1', '2', '3', '4');
        List<Character> expected = Arrays.asList('x', '1', 'y', '2', '3', '4');

        assertEquals(expected, zipper.zip(list1, list2));
    }

    @Test
    void testZipWithEmptyFirstList() {
        List<Double> list1 = Collections.emptyList();
        List<Double> list2 = Arrays.asList(1.1, 2.2, 3.3);
        List<Double> expected = Arrays.asList(1.1, 2.2, 3.3);

        assertEquals(expected, zipper.zip(list1, list2));
    }

    @Test
    void testZipWithEmptySecondList() {
        List<Double> list1 = Arrays.asList(1.1, 2.2, 3.3);
        List<Double> list2 = Collections.emptyList();
        List<Double> expected = Arrays.asList(1.1, 2.2, 3.3);

        assertEquals(expected, zipper.zip(list1, list2));
    }

    @Test
    void testZipBothListsEmpty() {
        List<Integer> list1 = Collections.emptyList();
        List<Integer> list2 = Collections.emptyList();
        List<Integer> expected = Collections.emptyList();

        assertEquals(expected, zipper.zip(list1, list2));
    }
}
