### Buildar e executar a aplicação Android

- on macOS/Linux
  ```shell
  ./gradlew :composeApp:assembleDebug
  ```
- on Windows
  ```shell
  .\gradlew.bat :composeApp:assembleDebug
  ```

### Buildar e executar a aplicação iOS

Para compilar e executar a versão de desenvolvimento do aplicativo iOS, use a configuração de execução do widget de execução
na barra de ferramentas do seu IDE ou abra o diretório [/iosApp](./iosApp) no Xcode e execute-o a partir daí.

## Resposta à Questão Teórica

No modelo Multi-Activity do Android cada tela é geralmente uma Activity separada e a navegação é feita pelo sistema (Intents). Já no modelo Single Activity com Compose a gente só tem uma Activity que mostra telas diferentes trocando os composables, então a navegação fica dentro do app.

Na prática isso quer dizer que, se a navegação e as telas estiverem em `commonMain`, fica bem mais fácil reaproveitar o código entre Android e iOS — você escreve a maior parte uma vez só. No modelo Multi-Activity isso tende a ficar preso ao Android e dá mais trabalho para compartilhar.

Ainda assim, algumas coisas são específicas de cada plataforma (por exemplo, o botão físico de voltar, deep links ou APIs nativas) e precisam de código separado.

Single Activity + navegação em `commonMain` facilita o reaproveitamento entre plataformas.