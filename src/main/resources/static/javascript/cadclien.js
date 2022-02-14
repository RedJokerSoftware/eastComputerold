//créditos viaCEPhttps://viacep.com.br/exemplo/javascript/

function limpa_formulário_cep() {
            //Limpa valores do formulário de cep.
            document.getElementById('rua').value=("");
            document.getElementById('endbairro').value=("");
            document.getElementById('endcidade').value=("");
            document.getElementById('endestado').value=("");
    }

    function meu_callback(conteudo) {
        if (!("erro" in conteudo)) {
            //Atualiza os campos com os valores.
            document.getElementById('rua').value=(conteudo.logradouro);
            document.getElementById('endbairro').value=(conteudo.bairro);
            document.getElementById('endcidade').value=(conteudo.localidade);
            document.getElementById('endestado').value=(conteudo.uf);
        } //end if.
        else {
            //CEP não Encontrado.
            limpa_formulário_cep();
            alert("CEP não encontrado.");
        }
    }

 function pesquisacep(valor) {

        //Nova variável "cep" somente com dígitos.
        var cep = valor.replace(/\D/g, '');

        //Verifica se campo cep possui valor informado.
        if (cep != "") {

            //Expressão regular para validar o CEP.
            var validacep = /^[0-9]{8}$/;

            //Valida o formato do CEP.
            if(validacep.test(cep)) {

                //Preenche os campos com "..." enquanto consulta webservice.
                document.getElementById('rua').value="...";
                document.getElementById('endbairro').value="...";
                document.getElementById('endcidade').value="...";
                document.getElementById('endestado').value="...";

                //Cria um elemento javascript.
                var script = document.createElement('script');

                //Sincroniza com o callback.
                script.src = 'https://viacep.com.br/ws/'+ cep + '/json/?callback=meu_callback';

                //Insere script no documento e carrega o conteúdo.
                document.body.appendChild(script);

            } //end if.
            else {
                //cep é inválido.
                limpa_formulário_cep();
                alert("Formato de CEP inválido.");
            }
        } //end if.
        else {
            //cep sem valor, limpa formulário.
            limpa_formulário_cep();
        }
    };

//validar dados


function validar(){

var nome = document.getElementById('nome').value;
var tel = document.getElementById('tel').value;
var cpf = document.getElementById('cpf').value;
var cep = document.getElementById('CEP').value;
var rua = document.getElementById('rua').value;
var bairro = document.getElementById('endbairro').value;
var estado = document.getElementById('endestado').value;
var cpf = document.getElementById('cpf').value;
var numero = document.getElementById('endnumero').value;
var complemento = document.getElementById('endcomplemento').value;
var email = document.getElementById('email').value;
var senha = document.getElementById('senha').value;
 var valida=1;

	if(nome.length<10 || nome.length>80){
		valida=0;
		//nome invalido
		alert("nome inválido");
	}
	if(tel.length<10 || tel.length>11){
		valida=0;
		//telefone invalido
		alert("telefone inválido");
	}
	if(numero.length==0){
		valida=0;
		//numero invalido
		alert("número invalido");
	}
	
	if(senha.length<4){
		valida=0;
		//senha muito curta
		alert("senha muito curta");
	}
	if(cpf.length==11){
		//formatar o cpf para a forma completa
		var output = cpf.substring(0, 3) + "." + cpf.substring(3,6) + "."+ cpf.substring(6,9) + "-" + cpf.substring(9);
		cpf=output;
	}	
	const regexcpf = new RegExp('[0-9][0-9][0-9].[0-9][0-9][0-9].[0-9][0-9][0-9]-[0-9][0-9]');
	var vcpf=regexcpf.test(cpf);
		if(vcpf==false){
			valida=0;
			//cpf invalido
			alert("CPF inválido");
		}
	const regexmail = new RegExp('[A-z.0-9]+@[A-z.0-9]+[.][A-z.0-9]+');
	var vmail=regexmail.test(email);
		if(vmail==false){
			valida=0;
			//e-mail invalido
			alert("e-mail inválido");
		}

	if(valida==1){
//gerar json
			var strjson='{"nome": "' + nome + '","cpf": "'+ cpf + '","telefone": "'+ tel + '","cep": "'+ cep + '","rua": "'+ rua + '","bairro": "'+ bairro + '","estado": "'+ estado + '","email": "'+ email + '","senha": "'+ senha + '"}';
			var obj = JSON.parse(strjson);

			var jsn= JSON.stringify(strjson);
			alert(strjson);
				return true;
			}else{	
				return false;
			}

		
	}