# spring-dto-entity
Proyecto spring de ejemplo para mostrar como se utiliza el starter **<span style="font-size:larger;">genericrestapi-spring-boot-starter</span>**

En el proyecto se crea una instancia de BaseGenericRestController llamada **PersonaGenericRestController**.

En este caso al servicio rest se le inyecta el Repository que se desea utilizar.

También es posible inyectarle el servicio deseado.

Como podemos ver, la clase generica tiene estos 2 costructores:

```java
@Autowired
public BaseGenericRestController(BaseGenericRepository<T, ID> repository) {
    this.service = new BaseGenericService(repository);
}

@Autowired
public BaseGenericRestController(BaseGenericService<T, ID> service) {
    this.service = service;
}
```

## Ejemplo de uso del servicio rest de Persona

```
### Devuelve la lista de personas
GET http://localhost:8080/personageneric
Accept: application/json

### Devuelve la lista de personas paginadas (?page,size)
GET http://localhost:8080/personageneric?page=0&size=1


### Devuelve la lista de personas ordenadas sin paginar (?sort)
GET http://localhost:8080/personageneric?sort=id,desc


### Devuelve la lista de personas paginadas y con order (?page,size,sort)
GET http://localhost:8080/personageneric?page=0&size=1&sort=id,desc

### Da de alta una nueva persona
POST http://localhost:8080/personageneric
Content-Type: application/json

### Actualiza una persona
PUT http://localhost:8080/personageneric
Content-Type: application/json

{
  "id": "3",
  "documento": "9999999-9",
  "nombre": "Federico Anacleto",
  "apellido": "Larrayoz da Rosa",
  "tipoDocumento": {
    "id": 1,
    "nombre": "Cedula de Identidad"
  }
}

### Da de alta una nueva persona con tipo de documento
POST http://localhost:8080/personageneric
Content-Type: application/json

{
  "documento": "8888888-8",
  "nombre": "Roberto",
  "apellido": "Rodriguez",
  "tipoDocumento": {
    "id": 1
  }
}
```

Este code snippet se puede utilizar dede la herramienta del IDEA para probar servicios REST.

**"Tools/HTTP Client/Create request in HTTP client"**



