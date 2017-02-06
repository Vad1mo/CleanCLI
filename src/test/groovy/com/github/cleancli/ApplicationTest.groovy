package com.github.cleancli;

import spock.lang.Specification

class ApplicationTest extends Specification {
    def "application should start"() {
        given:
        def mainMock = Mock(Application)

        when:

        then:
        Application.main()
    }
}
