function solution(num) {
    let count=0;
    for(let i=0; i<500; i++){
        if(num === 1)
            break;
        num = num%2===0 ? num/2 : num*3+1;
        count++;
    }
    return num === 1 ? count : -1;
}