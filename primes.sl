bool check(int p)
    for (i:=[2:p])
        if (p % i == 0)
            return false
    return true

void main()
    n := readInt()

    t := 0
    i := 2

    while (t<n)
        if (check(i))
            print(i)
            t++
        i++
