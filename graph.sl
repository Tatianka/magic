void dfs(int v, int[][] p, bool[] visited)
    if (visited[v])
        return
    visited[v] = true
    for i:=p[v]
        dfs(i, p, visited)

void main()
    n := readInt()
    m := readInt()

    v := new int[][](n)

    for (i:=[0:m])
        a := readInt()
        b := readInt()

        v[a].append(b)
        v[b].append(a)

    visited := new bool[](n)

    components := 0

    for (i := [0:n])
        if (!visited[i])
            components++
            dfs(i, p, visited)
