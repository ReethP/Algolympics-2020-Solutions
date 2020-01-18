cases = int(input())
casesOutput = []
actualvalue = []
for i in range(0,cases):
	userInput = input().split()
	weight = int(userInput[0])
	string = userInput[1]
	value = 0
	for k in string:
		value+=ord(k)-64
	casesOutput.append("NO" if value > weight else "YES")

for i in casesOutput:
	print(i)