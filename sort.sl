
void main()
    n:= readInt()

    int[] p

    for i:=[0:n]
        p.append(readInt())

    for i:=[0:n]
        for j:=[i+1:n]
            if p[i]>p[j]
                t:=p[i]
                p[i]=p[j]
                p[j]=t

    for v:=p
        print(v)
