# while e do-while
>São 2 estruturas de repetição baseadas em decisão onde a quantidade de repetições é potencialmente infinita
>
>Como em todo laço de repetição é importante ter atenção ao critério de >permanência para que em algum momento seja possível sair dele.

```java
>sintaxe - while
>Scanner entrada = new Scanner(System.in);
>
>String resposta="sim";
>
>
>while(resposta.equal("sim")){
>
>  System.out.println("Gostaria de repetir mais uma vez? (sim ou não)")
>
>   resposta=entrada.next();
>
>}
>para entrar no while é necessário atender a condição de permanência, que será testada novamente ao termino de cada loop
>
>
```

---

```java
sintaxe - do while
Scanner entrada = new Scanner(System.in);
String resposta="sim";

do{

  System.out.println(" Já entramos no laço, mas você gostaria de repetir mais uma vez? (sim ou não)")

   resposta=entrada.next();

}while(resposta.equal("sim"));



para entrar na repetição nada foi solicitado, ou seja . é permitido executar o bloco de comando e somente no final testar a condição de permanência, que será testada novamente ao termino de cada loop
```

