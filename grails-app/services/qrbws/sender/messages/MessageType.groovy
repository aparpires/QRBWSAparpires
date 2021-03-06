package qrbws.sender.messages

enum MessageType {
    CADASTRO_USUARIO(0, "Cadastro de usuário"),
    AVISO_DEVOLUCAO(1, "Aviso devolução de livro");

    int code
    String description;

    MessageType(int code, String description) {
        this.code = code
        this.description = description;
    }
}