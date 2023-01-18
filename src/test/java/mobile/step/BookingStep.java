package mobile.step;

import io.cucumber.datatable.DataTable;
import mobile.page.BookingPage;
import utils.DriverFactory;

import java.sql.DataTruncation;

public class BookingStep {

    BookingPage bookingPage = new BookingPage();

    public void launchBookingAppStep() {
        DriverFactory.startDriver();
    }

    public void buscarDestinoStep(String ciudad) {
        bookingPage.buscarDestinoPage(ciudad);
    }

    public void ingresarFechasStep(String fechaInicio, String fechaFin) {
        bookingPage.ingresarFechasPage(fechaInicio, fechaFin);
    }

    public void seleccionarResidentesStep(String habitacion, String adulto, String menor, String edad) {
        bookingPage.seleccionarResidentesPage(habitacion, adulto, menor, edad);
    }

    public void seleccionarBookingStep(DataTable dataTable) {
        bookingPage.seleccionarBookingPage();
        bookingPage.completarFormularioPage(dataTable);
    }

    public void validarPrevioBookingStep() {
        bookingPage.validarPrevioBookingPage();
    }
}
