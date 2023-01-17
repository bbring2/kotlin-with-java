package com.lannstark.lec07;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class JavaFilePrinter {

  public void readFile(String path) throws IOException {
    try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
      System.out.println(reader.readLine());
    }
  }

  public void readFile() throws IOException {
    File currentFile = new File(".");
    File file = new File(currentFile.getAbsolutePath() + "/a.txt");
    BufferedReader br = new BufferedReader(new FileReader(file));
    System.out.println(br.readLine());
    br.close();
  }

  public static void main(String[] args) throws IOException {
    JavaFilePrinter printer = new JavaFilePrinter();
    printer.readFile();
  }

}
