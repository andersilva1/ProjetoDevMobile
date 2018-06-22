import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { DatabaseProvider } from '../database/database';
import { SQLiteObject } from '@ionic-native/sqlite';


@Injectable()
export class ContatoProvider {

  constructor(private dbProvider: DatabaseProvider) {  }

  // Metodo que insere os valores de contato
  public insert(contato: Contato){
    return this.dbProvider.conexaoBD()
    // Objeto responsavel pela inserção
    .then((bd: SQLiteObject) => {
      let sql = 'INSERT INTO contato (nome, email, telefone, dt_nascimento) VALUES (?,?,?,?)';
      let dados = [contato.nome, contato.email, contato.telefone, contato.dt_nascimento];

      return bd.executeSql(sql,dados) // Método que executa instruções SQL
        .catch(e => console.error(e))
    })
    .catch(e => console.error(e))
  }

  // Metodo que atualiza os valores de contato
  public update(contato: Contato){
    return this.dbProvider.conexaoBD()
    .then((bd: SQLiteObject) => {
      let sql = 'UPDATE contato SET nome = ?, email = ?, telefone = ?, dt_nascimento = ? WHERE id = ?';
      let dados = [contato.nome, contato.email, contato.telefone, contato.dt_nascimento, contato.id];

      return bd.executeSql(sql,dados)
        .catch(e => console.error(e))
    })
    .catch(e => console.error(e))
  }

  // Metodo que exclui os valores de contato
  public remove(id: number){
    return this.dbProvider.conexaoBD()
    .then((bd: SQLiteObject) => {
      let sql = 'DELETE FROM contato WHERE id = ?';
      let dados = [id];

      return bd.executeSql(sql,dados)
        .catch(e => console.error(e))
    })
    .catch(e => console.error(e))
  }

  // Metodo que recupera o valor de um contato
  public get(id: number){
    return this.dbProvider.conexaoBD()
    .then((bd: SQLiteObject) => {
      let sql = 'SELECT * FROM contato WHERE id = ?';
      let dados =   [id];

      return bd.executeSql(sql,dados)

        .then((dado: any) => {
          if (dado.rows.length > 0){
            let item = dado.rows.item(0);
            let contato = new Contato();
            contato.id = item.id;
            contato.nome = item.nome;
            contato.email = item.email;
            contato.telefone = item.telefone;
            contato.dt_nascimento = item.dt_nascimento

            return contato;
          }

          return null;

        })
        .catch(e => console.error(e))
    })
    .catch(e => console.error(e))
  }

  // Metodo que recupera o valor de todos os contatos
  public getAll(nome: String = null){
    return this.dbProvider.conexaoBD()
    .then((bd: SQLiteObject) => {
      let sql = 'SELECT * FROM contato';
      let dados: any[];

      return bd.executeSql(sql,dados)

        .then((dados: any) => {
          if (dados.rows.length > 0){
            let contatos: any[] = [];
            for (var i = 0; i < dados.rows.length; i++){
              var contato = dados.rows.item(i);
              contatos.push(contato);
            }
            return contatos;
          } else{
            return [];
          }
        })
        .catch(e => console.error(e))
    })
    .catch(e => console.error(e))
  }

}

// Criação da classe Contato
export class Contato{
  id: number;
  nome: String;
  email: String;
  telefone: String;
  dt_nascimento: Date;
}
