
# Strategy

O design pattern strategy, é um padrão de projeto comportamental cujo objetivo é encapsular a lógica em classes separadas que implementam uma interface em comum.

Para isso, criamos objetos que representam várias estratégias e um objeto de contexto cujo comportamento varia de acordo com a estratégia.

### Exemplo
Para esse exemplo, vamos criar uma aplicação que gera relatórios de acordo com a estratégia de execução, primeiro vamos definir a nossa interface e suas implementações

```
public interface Relatorio<T> {
    void gerar(T filtro);
}

public class RelatorioCliente implements Relatorio<FiltroCliente> {
    @Override
    public void gerar(FiltroCliente filtro) {
        System.out.println("Gerando relatório de clientes:\n" +filtro);
    }
}

public class RelatorioVenda implements Relatorio<FiltroVenda> {  
  
    @Override  
  public void gerar(FiltroVenda filtro) {  
        System.out.println("Gerando relatório de vendas com o filtro: \n" + filtro);  
  }  
}
```
Agora vamos criar a classe de contexto, responsável por definir qual estratégia será aplicada para gerar o relatório

```
public class Contexto<T> {  
  
    private Relatorio<T> relatorio;  
  
 public void setContexto(Relatorio relatorio) {  
        this.relatorio = relatorio;  
  }  
  
    public void gerar(T filtro) {  
        relatorio.gerar(filtro);  
  }  
}
```
Finalmente, na classe principal vamos utilizar a classe de contexto

```
public class App {  
  
    public static void main(String[] args) {  
        Contexto relatorio = new Contexto();  
  
  relatorio.setContexto(new RelatorioCliente());  
  relatorio.gerar(new FiltroCliente("João"));  
  
  relatorio.setContexto(new RelatorioVenda());  
  relatorio.gerar(new FiltroVenda(LocalDate.now().minusDays(1), LocalDate.now()));  
  }  
}
```
Saída do programa
```
Gerando relatório de clientes com o filtro: 
Cliente{nome='João'}
Gerando relatório de vendas com o filtro: 
Venda{dataInicio=2022-05-22, dataFim=2022-05-23}
```