function solution(arr, divisor) {
    let answer = [];
    arr.map((element)=>{
        if(element%divisor === 0)
            answer.push(element);
    })
    if(answer.length === 0)
        answer.push(-1);
    
    return answer.sort((a,b) => a-b);
}