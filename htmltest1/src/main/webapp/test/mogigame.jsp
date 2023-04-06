<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>모기 잡기 게임</title>
<script type="text/javascript">
   function nextRandomInteger(limit) {
	   return Math.round(Math.random() * limit);
   }
   function randomSpeed(maxSpeed) {
	   return Math.random()*maxSpeed - Math.random()*maxSpeed; 
   }
   let canvasWidth = 700;  
   let canvasHeight = 500;
   let total = 10;
   function MovingImg() { 
		this.x = nextRandomInteger(canvasWidth);
		this.y = nextRandomInteger(canvasHeight);		
		this.vX = randomSpeed(4);
		this.vY = randomSpeed(4);
		//<img />
		this.body = document.createElement("img");
		this.body.src = "../img/mogi.jpg"; //이미지 위치에 맞도록 설정
		this.body.setAttribute("style","background-color:white");
		this.body.style.width = "35px";
		this.body.style.height = "35px";
		this.body.style.position = "absolute";
		let myimg = this.body;
		this.body.onclick = function() {
			let al = myimg.src.indexOf("truebird.png")
			if(al > 0){
				let mogi=[];
				mogi.push(new MovingImg());
				let game2 = setInterval(function() {
					for(let i in mogi) {
						mogi[i].move();
					}
				},1000/60);
				++total;
				alert("이미클릭 모기 추가 남은 모기수 : "+total)
				return;
			}
			--total;
			alert("남은 모기 수 :" + total);
			myimg.src = "../img/truebird.png";
		}
		document.body.appendChild(this.body);
	}
   MovingImg.prototype.move = function() {
		if(this.x < 0 || this.x > canvasWidth) {
			this.vX *= -1;
		}
		if(this.y < 0 || this.y > canvasHeight) {
			this.vY *= -1;
		}
		this.x += this.vX;
		this.y += this.vY;
		this.body.style.left = this.x + "px";
		this.body.style.top = this.y + "px";
	}
	window.onload = function() {
		let movingImgs = [];
		for(let i=0;i<10;i++) {
		  movingImgs.push(new MovingImg());
		}
		let game = setInterval(function() {
			for(let i in movingImgs) {
				if(total < 1) {
					alert("게임 종료")
					clearInterval(game); 
					return; //함수 종료 
				}
				movingImgs[i].move();
			}
		},1000/60);
	}
</script>
</head>
<body></body></html>