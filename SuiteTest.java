package es.iessoterohernandez.daw.endes.pruebaJUnit;

import static org.junit.jupiter.api.Assertions.*;

import org.hamcrest.CoreMatchers;
import org.junit.jupiter.api.Test;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses( { TestCuenta.class, TestMovimiento.class } )
class SuiteTest extends CoreMatchers {

}
