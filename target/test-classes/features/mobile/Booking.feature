#language: es
  Característica: Realizar reserva en Booking.com
    Como usuario
    Quiero acceder a booking.com
    Para realizar una reserva

  @Test01
  Esquema del escenario: Realizar reserva para la ciudad de "<ciudad>"
    Dado el usuario ingresa a la aplicacion de booking.com
    Cuando busque la ciudad de "<ciudad>"
    Y seleccione la fecha de inicio "<fechaInicio>" con la fecha fin "<fechaFin>"
    Y "<habitacion>" habitacion para "<adulto>" adultos con "<menor>" menor de edad "<edad>"
    Y realice el Booking con los datos del cliente
      | nombre | apellido | email                     | direccion                      | codigoPostal | ciudad | pais  | telefonoMovil | propositoViaje |
      | Peter     | Zegarra  | test@gmail.com | Ca. Siempre Viva 123 | Peru 2023     | Lima    | Perú | 987654321     | ocio                   |
    Entonces se realiza la reserva
    Ejemplos:
      | data|ciudad|fechaInicio |fechaFin      | habitacion | adulto| menor| edad |
      | 1     | cusco |2023-02-14|2023-02-28| 1                  | 2         |1           | 5       |
