<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>��� ��� ����</title>
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
		this.body.src = "../img/mogi.jpg"; //�̹��� ��ġ�� �µ��� ����
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
				alert("�̹�Ŭ�� ��� �߰� ���� ���� : "+total)
				return;
			}
			--total;
			alert("���� ��� �� :" + total);
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
					alert("���� ����")
					clearInterval(game); 
					return; //�Լ� ���� 
				}
				movingImgs[i].move();
			}
		},1000/60);
	}
</script>
</head>
<body></body></html>