package Assignment
// a. to print charaters in string

String str = "Hello, Groovy!"
println "Number of characters in string :" + str.length()

// b. a string variable containing a name

String name = "Anjali"
////Print a hello statement with your name 
println "Hello $name"
//using string concatenation
println "Hello ".concat(name)
// using groovy string
println "Hello " + name


//d.Define a string variable containing the sentence, "Hello, World. How are you?". 
String str1 = "Hello, World. How are you?"
println str1
//
////Split the sentence into an array using the split method
println str1.split()

//Count the number of words
def countLines(s) { s.split(" , ").size() }
def countWords(s) { s.split(" ").size() - countLines(s) + 1 }

println countWords(str1)

//the tokenize method
println str1.tokenize()
//e.use array notation (square brackets) to print the substring "World".
println str1[7..11]
//f.Use array notation to print the last word, but reversed.
println str1[25..22]
