CREATE TABLE resposta (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    id_Topico BIGINT,
    autor VARCHAR(255),
    mensagem TEXT,
    FOREIGN KEY (id_Topico) REFERENCES topicos(id)
);