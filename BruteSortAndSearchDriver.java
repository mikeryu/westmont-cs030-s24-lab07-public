/**
 * Westmont College Spring 2024
 * CS 030 Lab 07
 *
 * @author Assistant Professor Mike Ryu mryu@westmont.edu
 */

import java.util.NoSuchElementException;

/* ***************************************
 *   DO NOT MODIFY ANYTHING IN THIS FILE
 * **************************************/

public class BruteSortAndSearchDriver {

  public static void main(String[] args) {
    runFindThird();
    runCapitalize();
    runSelectionSortDesc();
    runInsertionSortDesc();
    runInsertionSortRec();
  }

  private static void runFindThird() {
    double[] nums1 = {1.0, 2.0, 3.0, -1.0, -2.0, -3.0};
    double[] nums2 = {2.0, -3.0, 4.0, -2.0, 6.0, -1.0};
    double[] nums3 = {2.0, -3.0, 4.0, -2.0};

    BruteSortAndSearch.findThird(nums1, true);
    System.out.println();

    BruteSortAndSearch.findThird(nums1, false);
    System.out.println();

    BruteSortAndSearch.findThird(nums2, true);
    System.out.println();

    BruteSortAndSearch.findThird(nums2, false);
    System.out.println();

    try {
      BruteSortAndSearch.findThird(nums3, true);
    } catch (NoSuchElementException e) {
      System.out.println("NoSuchElementException caught.");
    }

    try {
      BruteSortAndSearch.findThird(nums3, false);
    } catch (NoSuchElementException e) {
      System.out.println("NoSuchElementException caught.");
    }

  }

  private static void runCapitalize() {
    char[] str1 = "abcdefg".toCharArray();
    char[] str2 = "I love Java.".toCharArray();

    BruteSortAndSearch.capitalize(str1);
    System.out.println();

    BruteSortAndSearch.capitalize(str2);
    System.out.println();
  }

  private static void runSelectionSortDesc() {
    int[] nums = {1, 3, 2, 4, 5, 6, 8, 7, 10, 9};

    BruteSortAndSearch.selectionSortDesc(nums);
    System.out.println();
  }


  private static void runInsertionSortDesc() {
    String[] texts = {"B", "A", "C", "D", "G", "H", "F", "I", "E"};

    BruteSortAndSearch.insertionSortDesc(texts);
    System.out.println();
  }

  private static void runInsertionSortRec() {
    String text = "IHGDEFCBA";
    String sentence = "HelloMyNameIsMikeRyuItsNiceToMeetYou";

    System.out.printf("Recursive insertion sort with '%s'\n", text);
    System.out.printf("Final result is: %s\n\n", BruteSortAndSearch.insertionSortRec(text));

    System.out.printf("Recursive insertion sort with '%s'\n", sentence);
    System.out.printf("Final result is: %s\n\n", BruteSortAndSearch.insertionSortRec(sentence));
  }
}
