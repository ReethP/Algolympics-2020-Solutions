numOfKeys = int(input())
keys = list(map(int,input().split()))

numOfLocks = int(input())
locks = list(map(int,input().split()))

locksOpened = []

for i in range(numOfKeys):
	if (keys[i] != 1):
		if (keys[i] - 1) in locks and ((keys[i]-1) not in locksOpened):
			locksOpened.append(locks[locks.index(keys[i] - 1)])
	elif (keys[i] != 104):
		if (keys[i] + 1)  in locks and ((keys[i]+1) not in locksOpened):
			locksOpened.append(locks[locks.index(keys[i] + 1)])

print(len(locksOpened))