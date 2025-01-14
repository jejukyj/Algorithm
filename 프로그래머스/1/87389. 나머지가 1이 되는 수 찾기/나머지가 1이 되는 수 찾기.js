
function solution(n){
    let num = 0;
    for(let i=1; i<=n; i++){
        if(n%i === 1){
            num = i;
            break;
        }
    }
    return num;
}