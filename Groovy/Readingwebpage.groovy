package Assignment
//Using the Groovy JDK, access your home page and display the source code. Print the length of each line of the home page.
def urlContents = "https://www.w3schools.com/".toURL().getText()
println urlContents.eachLine {println it} 
println urlContents.eachLine { it -> println "The Line is :" + it + "and its size is :" + it.size() }
