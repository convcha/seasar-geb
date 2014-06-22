package sample

import spock.lang.Specification

class SampleSpec extends Specification {
    def "長さ確認"() {
        expect:
        name.size() == length

        where:
        name|length
        "spock"|5
        "Kirk"|4
        "Scotty"|6
    }
}
