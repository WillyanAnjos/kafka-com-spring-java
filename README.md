# Ambiente Kafka com Docker Compose

Este projeto sobe um ambiente básico com **Kafka** e **Zookeeper** usando Docker Compose.

---

## 📌 O que é o Kafka?

**Apache Kafka** é uma plataforma de streaming de eventos distribuída e de código aberto usada por milhares de empresas para:

- Pipelines de dados de alto desempenho  
- Análise de streaming  
- Integração de dados  
- Aplicações de missão crítica

---

### 🗂 Conceitos principais

#### **Producer**
Os **producers** (produtores) são responsáveis por criar e enviar mensagens para o Kafka.

#### **Mensagens**
As mensagens são o *payload* de dados — por exemplo, um produto que você quer cadastrar.  
Elas são enviadas para **tópicos**.

#### **Tópicos**
São como “pastas” ou categorias que armazenam as mensagens.

Exemplos de tópicos:

- `Compras`
- `Logs`
- `TransferenciasBancarias`

Cada tópico contém apenas mensagens relacionadas ao seu assunto.

#### **Partições**
Dentro de cada tópico existem **partições**, que dividem as mensagens em filas para melhorar desempenho e paralelismo.  
As mensagens de cada partição são entregues aos consumidores de forma ordenada.

#### **Consumer**
Os **consumers** (consumidores) leem as mensagens dos tópicos.  
Eles podem trabalhar em grupo para dividir a carga de leitura das partições.

---

## 🚀 Serviços

- **Zookeeper** – gerencia a coordenação do Kafka.  
- **Kafka** – broker que armazena e distribui mensagens.

---

## 📋 Pré-requisitos

- [Docker](https://docs.docker.com/get-docker/)  
- [Docker Compose](https://docs.docker.com/compose/)

---

## ▶️ Como subir o ambiente

Clone o repositório e execute:

```bash
docker-compose up -d
