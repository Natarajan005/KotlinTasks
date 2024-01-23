package com.example.kotlintasks

data class Node(
    val id: Int,
    val name: String,
    val parent: Int?,
    var children : MutableList<Node> = mutableListOf()
)

fun main() {
    val inputList = listOf(
        Node(id= 1, name= "Node A", parent= null),
        Node(id= 2, name= "Node B", parent= 1),
        Node(id= 3, name= "Node C", parent= 1),
        Node(id= 4, name= "Node D", parent= 2),
        Node(id= 5, name= "Node E", parent= 2),
        Node(id= 6, name= "Node F", parent= null),
        Node(id= 7, name= "Node G", parent= 6),
        Node(id= 8, name= "Node H", parent= 1),
        Node(id= 9, name= "Node I", parent= null),
        Node(id= 10, name= "Node J", parent= null),
    )
    val ansList = mutableListOf<Node>()
    inputList.forEach {
        node ->
        if(node.parent == null){
            ansList.add(node)
            formTree(inputList,node)
        }
    }
    println("[")
    ansList.forEach {
        node ->
        println("id = ${node.id}")
        println("name = ${node.name}")
        println("parent = ${node.parent}")
        println("children = ${node.children}")
        println(",")
    }
    println("]")
}

fun formTree(inputList: List<Node>, node: Node){
    inputList.forEach {
        inputNode ->
        if(inputNode.parent == node.id) {
            node.children.add(inputNode)
            formTree(inputList,inputNode)
        }
    }
}