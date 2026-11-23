# MSBank

> Core banking educacional em Java 21 — dinheiro em unidades mínimas, livro-razão de dupla entrada e arquitetura hexagonal.

**Português** | [English](#english)

---

## Português

MSBank é um **core banking educacional** escrito em Java 21. Ele demonstra como
software financeiro trata dinheiro com correção: valores em centavos (unidades
mínimas), arredondamento explícito, um livro-razão imutável de dupla entrada onde
cada operação soma zero, e regras de negócio inspiradas no sistema bancário
brasileiro.

> **Aviso:** este é um projeto educacional. Ele não é um banco real, não movimenta
> dinheiro de verdade e simplifica vários aspectos de regulação, segurança e
> operação. As simplificações estão listadas na documentação.

### Estado do projeto

Em construção. A fundação (build multi-módulo, domínio de dinheiro e validadores
brasileiros, livro-razão) está sendo implementada de forma incremental, com testes
para cada garantia importante.

### Licença

Distribuído sob a licença MIT. Veja [LICENSE](LICENSE).

---

<a id="english"></a>

## English

MSBank is an **educational core banking** system written in Java 21. It shows how
financial software handles money correctly: amounts in minor units (cents),
explicit rounding, an immutable double-entry ledger where every operation sums to
zero, and business rules inspired by the Brazilian banking system.

> **Disclaimer:** this is an educational project. It is not a real bank, it does
> not move real money, and it simplifies many aspects of regulation, security and
> operations. The simplifications are listed in the documentation.

### Project status

Under construction. The foundation (multi-module build, money domain and Brazilian
validators, ledger) is being implemented incrementally, with tests for every
important guarantee.

### License

Released under the MIT License. See [LICENSE](LICENSE).
