package Assignment
//1.Create a list of strings. Sort them alphabetically. Sort them by length. Sort them by length in descending order.
def str = ["Apple","Orange","Pineapple","Kiwi","Banana","Grapes"]

println str.sort()
println str.sort { it.size() }
println str.sort { -it.size() }
