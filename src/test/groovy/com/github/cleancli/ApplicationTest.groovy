package com.github.cleancli;

import spock.lang.Specification

class ApplicationTest extends Specification {
    def "application should start"() {
        given:
        GroovyMock(Application, global: true)

        expect:
        Application.main(null)
    }
}
