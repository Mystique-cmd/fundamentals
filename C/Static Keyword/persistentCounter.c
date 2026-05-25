#include <stdio.h>
int next_id(){
    static int counter;
    counter++;
    return counter;
}

int main(){
    int x=1;
    while (x==1){
        printf("%d",next_id());
    }
    return 0;
}