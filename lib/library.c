#include <stdlib.h>
#include <stdio.h>
#include <string.h>

long long printInt(long long a) {
        printf("%lld\n", a);
        return 0;
}

long long iexp(long long a, long long b) {
        long long ret = 1;
        for (long long i = 0; i < b; i++) {
                ret *= a;
        }
        return ret;
}

long long* create_list(long long size) {
    long long *l = (long long*) malloc(sizeof(long long)*(size+2));
    *l = size;
    *(l+1) = size;
    // printf("Create: %p\n", l);
    return l;
}

long long* resize_list(long long *list, long long new_size) {
    long long *l = list;
    long long capacity = *(l+1);
    if (new_size > capacity) {
        capacity = 2*capacity;
        if (new_size > capacity) {
            capacity = new_size;
        }
        l = realloc(l, 2+capacity*sizeof(long long));
    }
    *l = new_size;
    *(l+1) = capacity;
    return l;
}

long long* getItem(long long *list, long long index) {
    // printf("Get: %p\n", list);
    return list + 2 + index;
}

void setItem(long long *list, long long index, long long item) {
    long long * p = list + 2 + index;
    *p = item;
}

void deleteList(long long *list) {
    free(list);
}

long long * mergeLists(long long *list1, long long *list2) {
    // printf("Merge %p %p\n", list1, list2);
    long long * l = create_list(*list1 + *list2);
    memcpy(l + 2, list1 + 2, (*list1)*sizeof(long long));
    memcpy(l + (*list1) + 2, list2 + 2, (*list2)*sizeof(long long));
    return l;
}

