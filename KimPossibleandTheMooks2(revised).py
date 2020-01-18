# def consecutiveChecker(a,b):

userInput = list(map(int,input().split()))
iterations = userInput[0]
swaps = userInput[1]
binaryNumberList = []
ones = []
zeros = []

for k in range(0,iterations):
	userInput = input()
	if(userInput == "MOOK"):
		binaryNumberList.insert(0,"1")
		ones.insert(0,k)
	else:
		binaryNumberList.insert(0,"0")
		zeros.append(k)

for k in range(0,swaps):
	try:
		if(zeros[k] < ones[k]):
			binaryNumberList[(iterations - 1) - ones[k]] = "0"
			binaryNumberList[(iterations - 1) - zeros[k]] = "1"
		else:
			break
	except:
		break

binaryNumber = "".join(binaryNumberList)
print(int(binaryNumber,2))