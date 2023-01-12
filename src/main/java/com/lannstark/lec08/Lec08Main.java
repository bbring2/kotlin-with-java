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

}
