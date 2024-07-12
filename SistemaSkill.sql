-- Criação das sequences
CREATE SEQUENCE usuario_seq START WITH 1 INCREMENT BY 1;
CREATE SEQUENCE skill_seq START WITH 1 INCREMENT BY 1;
CREATE SEQUENCE imagem_seq START WITH 1 INCREMENT BY 1;

-- Criação da tabela Usuario
CREATE TABLE Usuario (
    id BIGINT PRIMARY KEY DEFAULT nextval('usuario_seq'),
    nome VARCHAR(255) NOT NULL,
    login VARCHAR(255) NOT NULL UNIQUE,
    senha VARCHAR(255) NOT NULL
    );

-- Criação da tabela Skill
CREATE TABLE Skill (
    id BIGINT PRIMARY KEY DEFAULT nextval('skill_seq'),
    nome VARCHAR(255) NOT NULL,
    descricao TEXT,
    imagem_url VARCHAR(255),
    tecnologia VARCHAR(255)
);

-- Criação da tabela Imagem
CREATE TABLE Imagem (
    id BIGINT PRIMARY KEY DEFAULT nextval('imagem_seq'),
    url VARCHAR(255) NOT NULL,
    descricao TEXT
);

-- Criação da tabela SkillUsuario
CREATE TABLE SkillUsuario (
    usuario_id BIGINT NOT NULL,
    skill_id BIGINT NOT NULL,
    nivel VARCHAR(50) NOT NULL,
    PRIMARY KEY (usuario_id, skill_id),
    FOREIGN KEY (usuario_id) REFERENCES Usuario(id) ON DELETE CASCADE,
    FOREIGN KEY (skill_id) REFERENCES Skill(id) ON DELETE CASCADE
);
