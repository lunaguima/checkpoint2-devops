# 🎌 API de Catálogo de Animes - Checkpoint 2

API de animes desenvolvida com **Java Spring Boot** e **MySQL**, orquestrada via **Docker** e publicada na **Oracle Cloud**.

---

## 👤 Identificação

- **Nome:** Luna de Carvalho Guimarães
- **Turma:** TDSPG

---

## 🚀 Como acessar

A aplicação foi publicada na Oracle Cloud durante o desenvolvimento do checkpoint. A instância foi desligada após a avaliação, então a URL abaixo não está mais ativa — o projeto pode ser executado localmente seguindo as instruções abaixo.

- **URL Base (ambiente de demonstração, offline):** `http://167.234.247.117`
- **Link de Listagem:** `/obras`

### Rodando localmente

```bash
docker-compose up --build
```

A aplicação sobe utilizando as configurações do `docker-compose.yml`.

---

## 🛠️ Tecnologias Utilizadas

- **Java 17 & Spring Boot 3**
- **MySQL 8.0**
- **Docker & Docker Compose**
- **Oracle Cloud Infrastructure (OCI)**

---

## 🛣️ Endpoints Disponíveis

Para interagir com o sistema, utilize a **URL Base** seguida pelos caminhos abaixo:

- `GET` **/obras** ➔ Retorna a lista de todos os animes.
- `POST` **/obras** ➔ Cadastra um novo anime no catálogo.
- `PUT` **/obras/{id}** ➔ Atualiza os dados de um anime existente.
- `DELETE` **/obras/{id}** ➔ Remove um anime do catálogo.
