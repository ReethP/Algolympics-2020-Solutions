iterations = int(input())
for i in range(0,iterations):
	number = int(input())
	divisible = 0
	if(number%3 == 0):
		print("AGENT 003")
		divisible = 1
	if(number%5 == 0):
		print("AGENT 005")
		divisible = 1
	if(number%7 == 0):
		print("AGENT 007")
		divisible = 1
	if(divisible == 0):
		print("NONE")
	print("---")