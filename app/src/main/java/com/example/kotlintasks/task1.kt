package com.example.kotlintasks

fun main() {
    val list = listOf(
        "programming", "java", "kotlin", "algorithm", "array", "programming"
    )
    val ans = checkWord(list,"ra")
}

fun checkWord(inputList: List<String>, substring: String) : List<String>{
    val newList = mutableListOf<String>()
    for( word in inputList ){
        if( !newList.contains(word) ){
            if( substring in word ){
                newList.add(word)
            }
        }
    }
    return newList
}