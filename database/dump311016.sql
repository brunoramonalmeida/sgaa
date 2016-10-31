SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

CREATE SCHEMA IF NOT EXISTS `Project_PraticaII` DEFAULT CHARACTER SET latin1 ;
USE `Project_PraticaII` ;

-- -----------------------------------------------------
-- Table `Project_PraticaII`.`Alternativa`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `Project_PraticaII`.`Alternativa` (
  `cod_alternativa` INT(11) NOT NULL AUTO_INCREMENT,
  `a` TEXT NOT NULL,
  `b` TEXT NOT NULL,
  `c` TEXT NOT NULL,
  `d` TEXT NOT NULL,
  `e` TEXT NOT NULL,
  PRIMARY KEY (`cod_alternativa`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `Project_PraticaII`.`Avaliacao`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `Project_PraticaII`.`Avaliacao` (
  `cod_avaliacao` INT(11) NOT NULL AUTO_INCREMENT,
  `nome_avaliacao` VARCHAR(10) NOT NULL,
  `descricao` VARCHAR(20) NOT NULL,
  `valor` FLOAT NOT NULL,
  `peso` FLOAT NOT NULL,
  `data_geracao` DATE NOT NULL,
  `data_aplicacao` DATE NOT NULL,
  PRIMARY KEY (`cod_avaliacao`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `Project_PraticaII`.`Curso`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `Project_PraticaII`.`Curso` (
  `codCurso` INT(11) NOT NULL AUTO_INCREMENT,
  `nome` VARCHAR(30) NOT NULL,
  `quantPeriodo` INT(11) NOT NULL,
  PRIMARY KEY (`codCurso`))
ENGINE = InnoDB
AUTO_INCREMENT = 2
DEFAULT CHARACTER SET = latin1;


-- -----------------------------------------------------
-- Table `Project_PraticaII`.`Disciplina`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `Project_PraticaII`.`Disciplina` (
  `codDisciplina` INT(11) NOT NULL AUTO_INCREMENT,
  `nome` VARCHAR(40) NOT NULL,
  `periodo` INT(11) NOT NULL,
  `qntHora` INT(11) NOT NULL,
  PRIMARY KEY (`codDisciplina`))
ENGINE = InnoDB
AUTO_INCREMENT = 2
DEFAULT CHARACTER SET = latin1;


-- -----------------------------------------------------
-- Table `Project_PraticaII`.`Pessoa`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `Project_PraticaII`.`Pessoa` (
  `matricula` INT(7) NOT NULL,
  `nome` VARCHAR(40) NOT NULL,
  `area_conhecimento` VARCHAR(40) NOT NULL,
  PRIMARY KEY (`matricula`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `Project_PraticaII`.`Questoes`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `Project_PraticaII`.`Questoes` (
  `cod_questao` INT(11) NOT NULL AUTO_INCREMENT,
  `assunto` VARCHAR(30) NOT NULL,
  `enunciado` TEXT NOT NULL,
  `resposta` CHAR(1) NOT NULL,
  `grau_dificul` VARCHAR(15) NOT NULL,
  `Curso_codCurso` INT(11) NOT NULL,
  `Disciplina_codDisciplina` INT(11) NOT NULL,
  `Pessoa_matricula` INT(7) NOT NULL,
  PRIMARY KEY (`cod_questao`),
  INDEX `fk_Questoes_Curso1_idx` (`Curso_codCurso` ASC),
  INDEX `fk_Questoes_Disciplina1_idx` (`Disciplina_codDisciplina` ASC),
  INDEX `fk_Questoes_Pessoa1_idx` (`Pessoa_matricula` ASC),
  CONSTRAINT `fk_Questoes_Curso1`
    FOREIGN KEY (`Curso_codCurso`)
    REFERENCES `Project_PraticaII`.`Curso` (`codCurso`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Questoes_Disciplina1`
    FOREIGN KEY (`Disciplina_codDisciplina`)
    REFERENCES `Project_PraticaII`.`Disciplina` (`codDisciplina`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Questoes_Pessoa1`
    FOREIGN KEY (`Pessoa_matricula`)
    REFERENCES `Project_PraticaII`.`Pessoa` (`matricula`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
AUTO_INCREMENT = 2
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `Project_PraticaII`.`Avaliacao_questoes`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `Project_PraticaII`.`Avaliacao_questoes` (
  `Avaliacao_cod_avaliacao` INT(11) NOT NULL DEFAULT '0',
  `Questoes_cod_questao` INT(11) NOT NULL,
  `data_geracao` DATE NOT NULL,
  `semestre` VARCHAR(10) NOT NULL,
  `bimestre` VARCHAR(10) NOT NULL,
  PRIMARY KEY (`Avaliacao_cod_avaliacao`, `Questoes_cod_questao`),
  INDEX `fk_Questoes_has_Avaliacao_Avaliacao1_idx` (`Avaliacao_cod_avaliacao` ASC),
  INDEX `fk_Avaliacao_questoes_Questoes1_idx` (`Questoes_cod_questao` ASC),
  CONSTRAINT `fk_Avaliacao_questoes_Questoes1`
    FOREIGN KEY (`Questoes_cod_questao`)
    REFERENCES `Project_PraticaII`.`Questoes` (`cod_questao`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Questoes_has_Avaliacao_Avaliacao1`
    FOREIGN KEY (`Avaliacao_cod_avaliacao`)
    REFERENCES `Project_PraticaII`.`Avaliacao` (`cod_avaliacao`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `Project_PraticaII`.`Questoes_has_Alternativa`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `Project_PraticaII`.`Questoes_has_Alternativa` (
  `Questoes_cod_questao` INT(11) NOT NULL,
  `Alternativa_cod_alternativa` INT(11) NOT NULL,
  PRIMARY KEY (`Questoes_cod_questao`, `Alternativa_cod_alternativa`),
  INDEX `fk_Questoes_has_Alternativa_Questoes1_idx` (`Questoes_cod_questao` ASC),
  INDEX `fk_Questoes_has_Alternativa_Alternativa1_idx` (`Alternativa_cod_alternativa` ASC),
  CONSTRAINT `fk_Questoes_has_Alternativa_Alternativa1`
    FOREIGN KEY (`Alternativa_cod_alternativa`)
    REFERENCES `Project_PraticaII`.`Alternativa` (`cod_alternativa`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Questoes_has_Alternativa_Questoes1`
    FOREIGN KEY (`Questoes_cod_questao`)
    REFERENCES `Project_PraticaII`.`Questoes` (`cod_questao`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
