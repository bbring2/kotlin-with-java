package com.lannstark.lec07

import java.io.BufferedReader
import java.io.File
import java.io.FileReader

class FilePrinter {

    fun readFile() { //코틀린에선 ioexception이 나더라도 빨간줄이 나오지 않음!
        val currentFile = File(".")
        val file = File(currentFile.absolutePath+"/a.txt")
        val reader = BufferedReader(FileReader(file))
        println(reader.readLine())
        reader.close()
    }

    //try - read resource가 없음 코틀린에는
    fun readFile(path: String) {
        BufferedReader(FileReader(path)).use { 
            bufferedReader -> println(bufferedReader.readLine())
        }
    }
}