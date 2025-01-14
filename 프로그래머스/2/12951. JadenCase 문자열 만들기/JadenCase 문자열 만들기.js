function solution(s) {
    let array=[];
    let answer = '';
    array = s.split(' ');
    for(let i=0; i<array.length; i++){
        let first = array[i].charAt(0).toUpperCase();
        let last = array[i].slice(1).toLowerCase();
        let sentence = first + last;
        array[i] = sentence;
    }
    answer = array.join(' ');
    return answer;
}