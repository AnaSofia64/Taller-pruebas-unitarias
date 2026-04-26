# Registro de Defectos - Taller Pruebas Unitarias

## Defecto 01
- **Caso:** Persona con edad -1
- **Esperado:** `INVALID_AGE`
- **Obtenido (version inicial):** `VALID`
- **Causa probable:** Faltaba la condicion `p.getAge() < 0` en `registerVoter`.
- **Estado:** Cerrado ✅

## Defecto 02
- **Caso:** Persona con id = 0
- **Esperado:** `INVALID`
- **Obtenido (version inicial):** `VALID`
- **Causa probable:** La validacion original solo rechazaba null, sin verificar el ID.
- **Estado:** Cerrado ✅

## Defecto 03
- **Caso:** Persona con edad = 121
- **Esperado:** `INVALID_AGE`
- **Obtenido (version inicial):** `VALID`
- **Causa probable:** Solo se habia validado el limite inferior de edad.
- **Estado:** Cerrado ✅