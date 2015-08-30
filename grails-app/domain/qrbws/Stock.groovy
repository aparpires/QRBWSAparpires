package qrbws

import grails.rest.Resource

@Resource(uri = '/api/stock', formats=['json'])

class Stock {

    Book book
    Integer availableBalance

    static constraints = {
        book nullable: false
        availableBalance min: 0
    }
}
