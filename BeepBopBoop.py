cases = int(input())
for i in range(0,cases):
	numberOfSounds = int(input())
	bop = 1
	for k in range(0,numberOfSounds):
		sound = input()
		if(sound == "BEEP" or sound == "BOOP"):
			continue
		else:
			bop = 0
	if(bop == 1):
		print("IT'S A BOP!")
	else:
		print("IT'S NOT A BOP!")