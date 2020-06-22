def gen(a,idx, n, balance):

	if (idx == n * 2):
		if (balance == 0):
			print(''.join(a))
			return
		return

	a[idx] = '('

	gen(a, idx + 1, n, balance+1)

	if (balance == 0):
		return

	a[idx] = ')'

	gen(a, idx + 1, n, balance-1)


if __name__ == '__main__':
	n = int(input())
	a =  [0 for i in range(0,n * 2)]
	gen(a, 0, n, 0)
