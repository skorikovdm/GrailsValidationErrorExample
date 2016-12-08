package org.test

class Triangle {

    int sideA
    int sideB
    int sideC

    def validation

    static transients = ["validation"]

    static constraints = {
    	validation validator: { val, obj, errors ->
    		return obj.validateObject(errors)
        }
    }

    def validateObject(errors) {

    	println("validation called")

        if (!sideA || !sideB || !sideC) return

    	if ((sideA >= (sideB + sideC)) ||
    		(sideB >= (sideA + sideC)) ||
    		(sideC >= (sideA + sideB))) {

    		errors.reject("invalid.sides", "Invalid sides")
    	}
    }
}
