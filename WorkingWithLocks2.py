numOfKeys = int(input())
keys = list(map(int,input().split()))

numOfLocks = int(input())
locks = list(map(int,input().split()))

days = 0
for i in range(numOfLocks):
	if (keys[i] == 1):
		if (keys[i] + 1) in locks:
			days += 1
	else if (keys[i] == 104):
		if (keys[i] - 1)  in locks:
			days += 1
	else:
		if (keys[i] - 1)  in locks or (keys[i] + 1) in locks:
			days += 1

print(days)