package validationerror

import org.test.Triangle

class TestController {

    def index() {

        def triangle = new Triangle(sideA: 1, sideB: 2, sideC: 4)
        triangle.validate()
        render "Result of validation: ${triangle.hasErrors()}"
    }
}
