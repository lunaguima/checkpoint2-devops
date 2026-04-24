# 🎌 API de Catálogo de Animes - Checkpoint 2

 API de animes desenvolvida com **Java Spring Boot** e **MySQL**, orquestrada via **Docker** e publicada na **Oracle Cloud**.

---

## 👤 Identificação
- **Nome:** Luna de Carvalho Guimarães
- **RM:** 562290
- **Turma:** TDSPG

---

## 🚀 Como acessar

A aplicação está rodando na Oracle Cloud no seguinte endereço:

* **URL Base:** `http://167.234.247.117`
* **Link de Listagem:** [http://167.234.247.117/obras](http://167.234.247.117/obras)

---

## 🛠️ Tecnologias Utilizadas
- **Java 17 & Spring Boot 3**
- **MySQL 8.0**
- **Docker & Docker Compose**
- **Oracle Cloud Infrastructure (OCI)**

---

## 🛣️ Endpoints Disponíveis

Para interagir com o sistema, utilize a **URL Base** seguida pelos caminhos abaixo:

* `GET` **/obras** ➔ Retorna a lista de todos os animes.
* `POST` **/obras** ➔ Cadastra um novo anime no catálogo.
* `PUT` **/obras/{id}** ➔ Atualiza os dados de um anime existente.
* `DELETE` **/obras/{id}** ➔ Remove um anime do catálogo.