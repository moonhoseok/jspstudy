--/jspstudy1/src/main/java/sql/study.sql
drop table member;

create table member (
	id varchar(20) primary key,
	pass varchar(20),
	name varchar(20),
	gender int(1),
	tel varchar(15),
	email varchar(50),
	picture varchar(200)
	
);

select *from member

create table book(
	writer varchar(30) primary key,
	title varchar(100),
	content varchar(1000)
)
select *from book

drop table board;
create table board(
	num int primary key, -- 게시글번호. 기본키 
	writer varchar(30),	-- 작성자 이름
	pass varchar(20),	-- 비밀번호
	title varchar(100),	-- 게시글 제목
	content varchar(2000), --게시글 내용
	file1 varchar(200),	-- 게시글 첨부파일
	boardid varchar(2),	-- 게시판종료 : 1:공지사항 2:자유게시판 3:QnA
	regdate datetime,	-- 게시글 등록일시 
	readcnt int(10),	-- 조회수 상세보기 할 때 마다 증가
	grp int,			-- 답글 작성시 원글의 게시글번호
	grplevel int(3),	-- 답글의 레벨. 
	grpstep int(5)		-- 그룹의 출력 순서
	
);
select *from board