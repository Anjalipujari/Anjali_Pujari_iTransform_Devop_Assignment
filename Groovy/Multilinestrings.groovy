package Assignment

//Make a multi-line string. Compute the number of vowels on each line.
def string= """Hello Good evening,
			Welcome to my multiline string,
			with an example """.trim()

def vowels=["a","e","i","o","u"]
s = string.tokenize('\n')
def f1 = s[0]
def first = f1.findAll{ it -> it in vowels }
println " First line has:" + first.size() + " vowels "

def s1 = s[1]
def second = s1.findAll{ it -> it in vowels }
println " First line has:" + second.size() + " vowels "

def t1 = s[2]
def third = t1.findAll{ it -> it in vowels }
println " First line has:" + third.size() + " vowels "


