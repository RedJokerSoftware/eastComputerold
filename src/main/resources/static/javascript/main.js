var botaosanduiche = document.getElementById('botaosanduiche');
const navbarlinks = document.getElementsByClassName('secaobotoescabecalho')[0]
botaosanduiche.addEventListener('click', () => {
navbarlinks.classList.toggle('active')
})
	
function trocartema(){
	var element = document.body;
  	element.classList.toggle("lightmode");
}

function botao1click(){
		
}

function main(){
	
}

window.onscroll = function() {
	scrollFunction();
}

function scrollFunction() {
 	if (document.body.scrollTop > 50 || document.documentElement.scrollTop > 50) {
		document.getElementById("header").style.height = "80px";
  	} else {
    		document.getElementById("header").style.height = "150px";
  	}
}