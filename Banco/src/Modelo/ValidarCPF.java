package Modelo;

import java.util.InputMismatchException;

public class ValidarCPF 
{
     // definimos nossos atributos
    int ultimoNumero;
    int penultimoNumero;
    int soma;
    int resultado;
    int numero;
    int peso;
    String CPF;

    public ValidarCPF(String CPF) 
    {
        this.CPF = CPF;
        ValidarCPF();
    }

    // iniciamos nosso metodo do tipo booelan e que ira receber uma String 
    public boolean ValidarCPF()
    {   
        
        // começamos nossa primeira validação, se os numeros forem iguais ou a string for maior que 11 caracteres
        if(
            CPF.equals("00000000000") ||
            CPF.equals("11111111111") ||
            CPF.equals("22222222222") ||
            CPF.equals("33333333333") ||
            CPF.equals("44444444444") ||
            CPF.equals("55555555555") ||
            CPF.equals("66666666666") || 
            CPF.equals("77777777777") ||
            CPF.equals("88888888888") || 
            CPF.equals("99999999999") ||
            CPF.length() != 11
            )
        // se sim entao retornara falso
        {
        return false;
        }

        // iniciamos nosso bloco de tratamento de erros
        try 
        {
           // iniciamos a validaçao do primeiro digito
            
           // iniciamos nossos atributos soma e peso
           // o atributo soma sera responsavel por armazenar a soma dos numeros do CPF
           // o atributo peso responsavel por armazenar os numeros que sera feito a conta de multiplicacao com os numeros do CPF
           soma = 0;
           peso = 10;
           
           //iniciamos nosso laço for com a variavel int i, enquanto a variavel i for menor que 9 ele ira rodar o laço e ao final adicionar +1 a i
           for(int i = 0; i < 9; i++)
           {
               // usamos charAt para pegar o caracter definido pela variabel i que no começo do laço é 0
               // charAt ira buscar o numero com base da tabela ASCII, busca em char mas tras o valor em decimal, entao usamos -48 para passar esse numero decimal para o valor correto
               numero = (CPF.charAt(i) - 48);
               
               // definimos que soma sera igual ao seu proprio valor mais a multiplicação do atributo numero pelo atributo peso
               soma = soma + (numero * peso);
               
               // definimos que a acada passada do laço a variavel peso sera igual a ela mesma -1
               peso = peso - 1;
               // System.out.println(soma); essa linha foi usada para testes do laço 
           }
           
           // logo apos o termino do laço definimos a logica do atributo resultado
           // resultado sera igual ao resto da divisao do valor do atributo soma dividido por 11, menos 11
           resultado = 11 - (soma % 11);
           
           // iniciamos nossa segunda validacao
           // se o valor do resultado for igual a 0 ou 1 entao:
           if(resultado == 0 || resultado == 1)
           {
               // adicionando o valor 0 em char que seria 48
               penultimoNumero = '0'; 
           }
           // se nao:
           else
           {
               //passando o numero pra a base ASCII novamente, porque vamos usar novamente
               penultimoNumero = (resultado + 48);
           }
           
           // iniciamos a validaçao do primeiro digito
            
           // iniciamos nossos atributos soma e peso
           // o atributo soma sera responsavel por armazenar a soma dos numeros do CPF
           // o atributo peso responsavel por armazenar os numeros que sera feito a conta de multiplicacao com os numeros do CPF
           
           soma = 0;
           peso = 11;
           
           // iniciamos nosso laço for com a variavel int i, enquanto a variavel i for menor que 9 ele ira rodar o laço e ao final adicionar +1 a i
           for(int i = 0; i < 10; i++)
           {
               // usamos charAt para pegar o caracter definido pela variabel i que no começo do laço é 0
               // charAt ira buscar o numero com base da tabela ASCII, busca em char mas tras o valor em decimal, entao usamos -48 para passar esse numero decimal para o valor correto
               numero = (CPF.charAt(i) - 48);
               
               // definimos que soma sera igual ao seu proprio valor mais a multiplicação do atributo numero pelo atributo peso
               soma = soma + (numero * peso);
               
               // definimos que a acada passada do laço a variavel peso sera igual a ela mesma -1
               peso = peso - 1;
               // System.out.println(soma); essa linha foi usada para testes do laço 
           }
           
           // logo apos o termino do laço definimos a logica do atributo resultado
           // resultado sera igual ao resto da divisao do valor do atributo soma dividido por 11, menos 11
           resultado = 11 - (soma % 11);
                      
           // iniciamos nossa segunda validacao
           // se o valor do resultado for igual a 0 ou 1 entao:
           if(resultado == 0 || resultado == 1)
           {
               // adicionando o valor 0 em char que seria 48
               ultimoNumero = '0';
           }
           else
           {
               //passando o numero pra a base ASCII novamente, porque vamos usar novamente
               ultimoNumero = (resultado + 48);
           }
           
            // essas linhas foram usadas para testes
            //System.out.println("");
            // System.out.println("numero em que vai ser pesquisado em decimal: " + penultimoNumero);
            // System.out.println("numero em que vai ser pesquisado em decimal: " +ultimoNumero);
            // aqui ele faz a pesquisa, ele pega o valor 2 e 9 mas ele ira usar a sua contra parte decimal, no caso o 50 e 57 para a comparação
            // System.out.println("numero em que vai ser pesquisado em char: " + CPF.charAt(9));
            // System.out.println("numero em que vai ser pesquisado em char: " + CPF.charAt(10));
        
            // iniciamos nossa ultima validação, validando se o caracter da posição 9 for igual ao valor armazenado no atributo penultimoNumero e se 
            // iniciamos nossa ultima validação, validando se o caracter da posição 10 for igual ao valor armazenado no atributo ultimoNumero
            if(penultimoNumero == CPF.charAt(9) && ultimoNumero == CPF.charAt(10))
            {
                // se sim o retorno sera verdadeiro
                return true;
            }
            // se nao:
            else
            {
                // o retorno sera falso
                return false;
            }
            
        }
        // iniciamos nosso catch
        // InputMismatchExceptionem Java. Essa exceção é lançada por uma instância da Scannerclasse 
        // para indicar que um token recuperado não corresponde ao padrão para o tipo esperado ou que o token recuperado está fora do intervalo.
        catch (InputMismatchException erro) 
        {
            // caso algum erro detectado entao o retorno sera falso
            return false;
        }

    }
}
