import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { SQLite, SQLiteObject } from '@ionic-native/sqlite';

@Injectable()
export class DatabaseProvider {

  constructor(private sqlite: SQLite) {
    console.log('Hello DatabaseProvider Provider');
  }

  public conexaoBD(){
    // Criando a conexão com o banco de dados SQLite
    return this.sqlite.create({
      name: 'products.db',
      location: 'default'
    })
  }

  // Metodo que instala a estrutura do banco de dados
  public estruturaBD(){
    return this.conexaoBD()
    .then((bd:SQLiteObject) => {

      this.criacaoTabelas(bd);

    })
    .catch(e => console.error(e));

  }
  // Metodo que cria as tabelas do banco de dados
  private criacaoTabelas(bd:SQLiteObject){
    bd.sqlBatch([
      ['CREATE TABLE IF NOT EXISTS contatos (id integer primary key AUTOINCREMENT NOT NULL, nome TEXT, email TEXT, telefone TEXT, dt_nascimento DATE)'],
    ])
      .then(() => console.log('Tabelas criadas'))
      .catch(e => console.error('Erro ao criar as tabelas', e));
  }

}
