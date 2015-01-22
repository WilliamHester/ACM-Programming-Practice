while True:
	n, m = map(int, input().split())
	if n == m == 0:
		break
	candidates = {}
	names = []
	
	for i in range(n):
		names.append(input().strip())
		candidates[names[-1]] = []

	for i in range(m):
		supp, cand = input().strip().split()
		if cand not in candidates:
			names.append(cand)
			candidates[cand] = []
		candidates[cand].append(supp.strip())

	for n in names:
		for s in candidates[n]:
			print (s)