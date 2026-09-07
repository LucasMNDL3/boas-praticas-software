1. Qual era o principal problema do código original?
R: O nome das variáveis não estavam intuitivas (n,a,b,c), poderiam ser mais específicas sobre
qual era sua função. A lógica havia sido feita toda dentro do próprio "main", não tinha uma
divisão de responsabilidades. Era um código funcional, porém, difícil de entender. 

2. Quais melhorias você realizou?
R: Renomeação das variáveis, modularização dos três métodos para responsabilidades únicas,
extração do valor 6 para a constante de MEDIA_APROVACAO, e a padronização de nomenclatura e 
identação.

3. Como a modularização facilitou a organização do código?
R:  Após fazer com que cada método tivesse uma responsabilidade específica, com a modularização,
ficou mais fácil de identificar,testar ou alterar o código, caso necessário. Caso, necessite alguma
alteração, se torna fácil de ir direto ao ponto. Sem perigo de quebrar o cálculo ou a exibição.

4. Como o Git ajudou a controlar as alterações?
R: O Git permite isolar o código para que possamos trabalhar/realizar melhorias em uma branch, sem 
que a versão original fosse afetada. Permite também o registro de cada etapa em seu histórico, com mensagens
descritivas, realizar a comparação de um antes e depois através do diff do Pull Request, e também realizar a mudança
de forma controlada, permitindo uma rastreabilidade e possibilidade de rollback.