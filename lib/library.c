#include <stdlib.h>
#include <stdio.h>

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

struct List {
    long long size;
    long long capacity;
    long long item_size;
    void *pointer;
};

List create_list(long long size, long long item_size) {
    List l;
    l.size = size;
    l.capacity = size;
    l.item_size = item_size;
    l.pointer = malloc(item_size*size);
    return l;
}

List resize_list(List list, long long new_size) {
    if (new_size > list.capacity) {
        list.capacity = max(2*capacity, new_size);
        list.pointer = realloc(list.pointer, list.capacity*list.item_size);
    }
    list.size = new_size;
    return list;
}

void* getItem(List list, long long index) {
    return list.pointer + list.item_size*index;
}

void setItem(List list, long long index, void* item) {
    *(list.pointer + list.item_size*index) = (char[list.item_size]*) item;
}

void deleteList(List list) {
    free(list.pointer);
}

