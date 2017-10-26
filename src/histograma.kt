

import java.io.File
import java.io.InputStream
fun main(args: Array<String>) {
    val inputStream: InputStream = File("src\\kot.txt").inputStream()

    val inputString = inputStream.bufferedReader().use {
        it.readText()
    }
    //println(inputString)

    var split = inputString.split(" ")


    //print(split[1].length)
    var i =0
    var maior =0
    while (i<split.size){//pra pegar maior palavra
        var x = split[i].length
        if(x>maior){
            maior = x
        }
        i++
    }
    maior++
    var histograma  = IntArray(maior)



    i = 0
   while (i<split.size){
       var x = split[i].length
       histograma[x]++;
       i++
   }

    i=0
    while (i<histograma.size){
        if(histograma[i]!=0){
            print("["+i+"] > "+histograma[i])
            var aux = histograma[i]
            var j =0
            while(j<aux){
                print("=")
                j++
            }
            println()
        }







        i++
    }









}