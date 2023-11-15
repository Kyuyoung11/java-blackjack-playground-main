## 기능 목록
1. 게임 참여 플레이어 입력  
   * 입력받기
   * 쉼표 기준 분리
2. 플레이어별 베팅금액 입력 받기   
   (게임시작)
    카드 지급 룰
    * [플레이어] 카드 합 = 21 => 베팅 금액의 1.5배를 딜러에게 받는다. (딜러도 21이면 베팅 금액만 돌려받음)
    * [플레이어] 카드 합이 21 초과가 아닌 이상 계속 받을 수 있음
    * [딜러] 카드 합 <= 16 => 1장의 카드를 추가로 받는다
    * [딜러] 카드 합 >= 17 => 추가로 받을 수 없음
    * [딜러] 카드 합 > 21 => 플레이어들의 승리로 베팅 금액 지급
3. 첫 지급) 플레이어, 딜러에게 각각 2장씩 카드 지급
4. 플레이어, 딜러에게 카드 추가
   * 플레이어
     * 플레이어별 추가 카드 여부 입력 (21초과하지않는 한 계속 받을 수 있음)
     * 카드 지급
   * 딜러
     * 위 조건에 따라서 카드 추가/유지
5. 결과 계산
6. 수익 정산

----
## [NEXTSTEP 플레이그라운드의 미션 진행 과정](https://github.com/next-step/nextstep-docs/blob/master/playground/README.md)

---
## 학습 효과를 높이기 위해 추천하는 미션 진행 방법

---
1. 피드백 강의 전까지 미션 진행 
> 피드백 강의 전까지 혼자 힘으로 미션 진행. 미션을 진행하면서 하나의 작업이 끝날 때 마다 add, commit
> 예를 들어 다음 숫자 야구 게임의 경우 0, 1, 2단계까지 구현을 완료한 후 push

![mission baseball](https://raw.githubusercontent.com/next-step/nextstep-docs/master/playground/images/mission_baseball.png)

---
2. 피드백 앞 단계까지 미션 구현을 완료한 후 피드백 강의를 학습한다.

---
3. Git 브랜치를 master 또는 main으로 변경한 후 피드백을 반영하기 위한 새로운 브랜치를 생성한 후 처음부터 다시 미션 구현을 도전한다.

```
git branch -a // 모든 로컬 브랜치 확인
git checkout master // 기본 브랜치가 master인 경우
git checkout main // 기본 브랜치가 main인 경우

git checkout -b 브랜치이름
ex) git checkout -b apply-feedback
```
