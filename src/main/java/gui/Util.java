package gui;

import javafx.scene.control.Alert;

public class Util {

    public void showWarning(Warning mensagem){
        Alert boxMensagem;
        boxMensagem = new Alert(Alert.AlertType.INFORMATION);
        boxMensagem.setContentText("WARRNING!");
        boxMensagem.setHeaderText(mensagem.getTitulo());
        boxMensagem.setContentText(mensagem.getDetalhe());
        boxMensagem.showAndWait();
    }

    public enum Warning {
        ERRO_DADOS_INICIALIZACAO("Dados não encontrados para a inicialização", "Verifique"),
        ERRO_PESQUISAR_CIA_AEREA("Nenhum Valor de Cia Aerea selecionado", "Selecione um valor de Cia Aerea antes de efetuar a consulta"),
        ERRO_PESQUISAR_ORIGEM_ROTA("Nenhum Valor de Origem selecionado", "Selecione um valor de Origem antes de efetuar a consulta"),
        AEROPORTO_SEM_ROTAS("Nenhum aeroporto encontrado para a pesquisa", "");

        private String TITULO;
        private String DETALHE;

        Warning(String titulo, String detalhe){
            this.TITULO = titulo;
            this.DETALHE = detalhe;
        }

        public String getTitulo(){
            return TITULO;
        }

        public String getDetalhe(){
            return DETALHE;
        }
    }

}
