package com.kh.animal;

/**
 * reset : 지정 버젼으로 돌아감              // 혼자만 사용할것!!!  추천하지않음!!! 팀플시 좋지않음
 *  - hard : 이후 변경사항 모두 제거
 *  - mixed : 이후 변경사항을 unstaged changes에서 관리
 *  - soft : 이후 변경사항을 staging area에 추가
 * 
 * revert : 지정한 버젼의 취소버젼을 새로 추가
 *  - history를 변경할 수 없는 경우 유용하다.
 *  - conflict 발생가능성 있음.
 */
public class Cow {
	private String name;
}
