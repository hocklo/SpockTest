import spock.lang.Specification

import static org.spockframework.util.Assert.notNull
/**
 * Created by hocklo on 7/06/17.
 */
class SpockSpecTest extends Specification{
    def "Testing the SpockDTO with Spock"(){
        setup:
        def SpockDTO spockDTO = new SpockDTO()

        when:
        spockDTO.setDescription("Hola")

        then:
        notNull(spockDTO.getDescription())
        spockDTO.getDescription() == "Hola"
    }
}
