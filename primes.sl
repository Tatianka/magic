bool check(int p)
    for i in [2:p]
        if p % i == 0
            return false
    return true

void main()
    n = readInt()

    t = 0
    i = 2

    while t<n
        if check(i)
            printInt(i)
            t++
        i++
