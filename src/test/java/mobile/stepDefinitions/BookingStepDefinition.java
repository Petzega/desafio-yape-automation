package mobile.stepDefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.es.*;
import mobile.step.BookingStep;

public class BookingStepDefinition {

    BookingStep bookingStep = new BookingStep();
    @Dado("el usuario ingresa a la aplicacion de booking.com")
    public void elUsuarioIngresaALaAplicacionDeBookingCom() {
        bookingStep.launchBookingAppStep();
    }

    @Cuando("busque la ciudad de {string}")
    public void busqueLaCiudadDeCusco(String ciudad) {
        bookingStep.buscarDestinoStep(ciudad);
    }

    @Y("seleccione la fecha de inicio {string} con la fecha fin {string}")
    public void seleccioneLaFechaDeInicioConLaFechaFin(String fechaInicio, String fechaFin) {
        bookingStep.ingresarFechasStep(fechaInicio, fechaFin);
    }

    @Y("{string} habitacion para {string} adultos con {string} menor de edad {string}")
    public void laHabitacionParaAdultosConMenorDeEdad(String habitacion, String adulto, String menor, String edad) {
        bookingStep.seleccionarResidentesStep(habitacion, adulto, menor, edad);
    }

    @Y("realice el Booking con los datos del cliente")
    public void realiceElBookingConLosDatosDelCliente(DataTable dataTable) {
        bookingStep.seleccionarBookingStep(dataTable);
    }
    @Entonces("se realiza la reserva")
    public void seRealizaLaReserva() {
        bookingStep.validarPrevioBookingStep();
    }
}
