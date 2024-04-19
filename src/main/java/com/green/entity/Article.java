package com.green.entity;

import io.micrometer.common.lang.NonNull;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

// 실제 database 의 table 구조를 만든다 : Create Table 을 실행함
// import jakarta.persistence.
@Entity  // 아래 있는 column으로 table만들어준다
@NoArgsConstructor  //기본생성자
@ToString
@Getter
@Setter
public class Article {
	// primary key        : @id
	// 값을 자동으로 채움 : @GeneratedValue
	@Id
	@GeneratedValue //자동으로 만들어줌->create sequence
	private  Long    id;      // long :null 입력안됨 -> Long
	@Column
	private  String  title;
	@Column
	private  String  content;
	
	
	// 생성자
	public Article(Long id, String title, String content) {		
		this.id = id;
		this.title = title;
		this.content = content;
	}
	
	// toString - relation(외래키 설정시)할 때 오류날  수 있어서 @로 하는것이 낫다.
//	@Override
//	public String toString() {
//		return "Article [id=" + id + ", title=" + title + ", content=" + content + "]";
//	}
	
}
