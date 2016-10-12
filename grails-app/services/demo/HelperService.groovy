package demo

import grails.transaction.Transactional
import grails.core.GrailsApplication

@Transactional
class HelperService {

    GrailsApplication GrailsApplication

    def doSomething () {
        println "Grails Application: ${grailsApplication}"
    }
}
