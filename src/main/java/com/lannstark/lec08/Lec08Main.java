package com.lannstark.lec08;

public class Lec08Main {

  public static void main(String[] args) {

  }

  public static void printAll(String... strings) {
    for (String str : strings) {
      System.out.println(str);
    }

    for(int i=1; i<=3; i++) {
      System.out.println(i);
    }

    for(int i=3; i>=1; i--) {
      System.out.println(i);
    }

    for(int i=1; i<=5; i+=2) {
      System.out.println(i);
    }
  }

  public int max(int a, int b) {
    if(a>b) {
      return a;
    } else
      return b;
  }

  public void repeat(String str, int num, boolean useNewLine) {
    for(int i=1; i<=num; i++) {
      if(useNewLine) {
        System.out.println(str);
      } else {
        System.out.print(str);
      }
    }
  }

  public void repeat(String str, int num) {
    repeat(str, num, true);
  }

  public void repeat(String str) {
    repeat(str, 3);
  }

}
