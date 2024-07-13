CREATE TABLE topicos(
    id INT AUTO_INCREMENT PRIMARY KEY,
    titulo VARCHAR(255) NOT NULL UNIQUE,
    mensagem TEXT NOT NULL,
    data TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    estado ENUM('aberto', 'fechado'),
    autor VARCHAR(100) NOT NULL,
    curso VARCHAR(100) NOT NULL
);