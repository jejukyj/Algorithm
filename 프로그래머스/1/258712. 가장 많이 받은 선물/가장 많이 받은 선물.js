function solution(friends, gifts) {
    const len = friends.length;
    const nameMap = new Map(); //이름 키 값 저장
    const giftTable = new Array(len).fill(0).map(_ => new Array(len).fill(0)); //주고받은 선물
    const rankInfo = new Array(len).fill(0); //선물 지수
    const nextMonth = new Array(len).fill(0); //다음달 선물 받는 수
    
    friends.forEach((name, idx)=>{
        nameMap.set(name,idx); //친구들 키 값 저장
    })
    
    gifts.forEach(info => {
        const [from, to] = info.split(" ");
        giftTable[nameMap.get(from)][nameMap.get(to)]++; //준 사람, 받은 사람 카운트
    })
    
    for(let i=0; i<len; i++){
        rankInfo[i] = giftTable[i].reduce((acc, cur) => acc += cur, 0);
        
        for(let j=0; j<len; j++){
            rankInfo[i] -= giftTable[j][i]; //받은 선물 빼기
        }
    }
    
    for(let i=0; i<len; i++){
        for(let j=i+1; j<len; j++){
            if(i===j) return; //본인 제외
            if(giftTable[i][j] > giftTable[j][i]) nextMonth[i]++;
            if(giftTable[i][j] < giftTable[j][i]) nextMonth[j]++;
            if(giftTable[i][j] === giftTable[j][i]){
                if(rankInfo[i] > rankInfo[j]) nextMonth[i]++;
                if(rankInfo[i] < rankInfo[j]) nextMonth[j]++;
            }
        }
    }
    
    return Math.max(...nextMonth); //가장 선물을 많이 받은 사람의 선물의 수
}