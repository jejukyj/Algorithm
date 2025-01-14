function solution(s){
    let answer = true;
    let array = [];
    for(let i=0; i<s.length; i++){
        s[i] === '(' ? array.push(s[i]) : (array.length > 0 ? array.pop() : array.push(s[i]));    
    }
    
    answer = array.length > 0 ? false : true;
    
    // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
    console.log(array)

    return answer;
}