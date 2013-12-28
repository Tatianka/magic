#include <vector>
#include <iostream>

using namespace std;

#define LL long long

template <class T>
LL print(T v) {
    cout << v << endl;
    return 0;
}


template <class T>
vector<T>* createList(LL size) {
    vector<T>* v = new vector<T>(size);
    return v;
}

template <class T>
T* getListItem(vector<T> *list, LL index) {
    return &(*list)[index];
}

template <class T>
void setListItem(vector<T> *list, LL index, T item) {
    (*list)[index] = item;
}

// template <class T>
// void deleteList(vector<T> *list) {
//     delete list;
// }

template <class T>
vector<T> * mergeLists(vector<T> *list1, vector<T> *list2) {
    vector<T> *v = createList<T>(0);
    v->insert(v->end(), list1->begin(), list1->end());
    v->insert(v->end(), list2->begin(), list2->end());
    return v;
}


#ifdef __cplusplus
extern "C"
{
#endif

LL printInt(LL a) {
    return print(a);
}

long long iexp(long long a, long long b) {
    long long ret = 1;
    for (long long i = 0; i < b; i++) {
        ret *= a;
    }
    return ret;
}

class Range {
    LL start;
    LL end;
    LL jump;
public:
    LL get(LL i) {
        return start + i * jump;
    }

    bool last(LL i) {
        return i>=end;
    }

    Range(LL s, LL e, LL j) {
        start = s;
        end = e;
        jump = j;
    }
};

//--Int------------------
void* createListInt(LL size) {
    return (void*) createList<LL>(size);
}

void setListItemInt(void* list, LL index, LL item) {
    setListItem<LL>((vector<LL>*) list, index, item);
}

LL* getListItemInt(void* list, LL index) {
    getListItem<LL>((vector<LL>*) list, index);
}

void* mergeListsInt(void *list1, void *list2) {
    return (void*) mergeLists<LL>((vector<LL> *)list1, (vector<LL> *)list2);
}

//--Float------------------

double printFloat(double a) {
    return print(a);
}

void* createListFloat(LL size) {
    return (void*) createList<double>(size);
}

void setListItemFloat(void* list, LL index, double item) {
    setListItem<double>((vector<double>*) list, index, item);
}

double* getListItemFloat(void* list, LL index) {
    getListItem<double>((vector<double>*) list, index);
}

void* mergeListsFloat(void *list1, void *list2) {
       return (void*) mergeLists<double>((vector<double> *)list1, (vector<double> *)list2);
}

//--Range---------------------


#ifdef __cplusplus
}
#endif
