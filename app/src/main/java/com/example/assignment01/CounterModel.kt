package com.example.assignment01

class CounterModel {

    private var count1: Int = 0
    private var count2: Int = 0

    //method to increase count
    fun increament1(){
        count1++
    }
    fun increament2(){
        count1 += 2
    }fun increament3(){
        count1 +=3
    }
    fun increament4(){
        count2++
    }
    fun increament5(){
        count2 += 2
    }fun increament6(){
        count2 +=3
    }
//    fun decreament(){
//        if(count > 0){
//            count = count - 1
//
//        }
//    }
    fun reset(){
    count1 = 0
    count2 = 0
    }
    //method to get the current count value

    fun getCount1():Int{
        return count1
    }
    fun getCount2():Int{
        return count2
    }
}