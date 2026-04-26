# Taller Pruebas Unitarias - TDD Registraduria

**Curso:** Testing y Validacion de Software  
**Universidad de La Sabana - Maestria en Ingenieria de Software**

## Integrantes
*Juan Camilo Silva y Ana Sofia Rodriguez Ferro*

## Estructura
src/
├─ main/java/edu/unisabana/tyvs/domain/
│   ├─ model/   → Person.java, Gender.java, RegisterResult.java
│   └─ service/ → Registry.java
└─ test/java/edu/unisabana/tyvs/domain/
└─ service/ → RegistryTest.java (11 tests)

#### Ejecucion
```bash
mvn clean test      # corre los 11 tests
mvn clean verify    # + reporte JaCoCo en target/site/jacoco/index.html
```

## Historia TDD (Red -> Green -> Refactor)

**Ciclo 1 - Camino feliz**
- RED: `shouldRegisterValidPerson` falla (Registry retorna null).
- GREEN: `registerVoter` retorna `VALID` directamente.
- REFACTOR: Estructura basica, constantes extraidas.

**Ciclo 2 - Persona fallecida**
- RED: `shouldRejectDeadPerson` falla.
- GREEN: `if (!p.isAlive()) return DEAD;`
- REFACTOR: Ordenamiento de guardas por prioridad.

**Ciclo 3 - Validaciones defensivas**
- RED: `shouldReturnInvalidWhenPersonIsNull` y `shouldRejectWhenIdIsZero` fallan.
- GREEN: Guardas defensivas al inicio del metodo.
- REFACTOR: Constante `MIN_VALID_ID`.

**Ciclo 4 - Rango de edad**
- RED: `shouldRejectNegativeAge` y `shouldRejectInvalidAgeOver120` fallan.
- GREEN: `if (p.getAge() < 0 || p.getAge() > MAX_AGE) return INVALID_AGE;`
- REFACTOR: Separacion clara de UNDERAGE vs INVALID_AGE.

**Ciclo 5 - Duplicados**
- RED: `shouldReturnDuplicatedWhenSameIdRegisteredTwice` falla.
- GREEN: `Set<Integer> registeredIds` + verificacion antes de guardar.
- REFACTOR: Javadoc completo en todos los metodos con formato BDD.