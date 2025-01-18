function solution(s) {
    let x = s;
    let zeroCount = 0;
    let count = 0;
    
    while(x > 1){
        zeroCount += x.split("").filter(num => num==='0').length;
        let xLength = x.split("").filter(num => num==='1').length;
        x = xLength.toString(2);
        count++;
    }
    
    return [count,zeroCount];
}