package qrbws

import grails.transaction.Transactional

@Transactional
class StockService {

    Stock desconta(Livro livro) {
        Stock stock = Stock.findByLivro(livro)
        stock.disponivel = stock.disponivel - 1
        stock.save flush: true
    }

    Stock incrementa(Livro livro) {
        Stock stock = Stock.findByLivro(livro)
        stock.disponivel = stock.disponivel + 1
        stock.save flush: true
    }

    boolean temStock(Livro livro) {
        Stock.findByLivro(livro).disponivel
    }

    // TODO: Disponível tem que ser igual ou inferior a total
}
