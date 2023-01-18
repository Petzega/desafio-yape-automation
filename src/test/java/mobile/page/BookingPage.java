package mobile.page;

import io.cucumber.datatable.DataTable;
import mobile.elements.BookingElements;
import org.openqa.selenium.WebElement;
import utils.AndroidUtils;
import utils.PublicVariables;

public class BookingPage extends AndroidUtils {

    public void buscarDestinoPage(String ciudad) {
        if (validateElement(10, BookingElements.BUTTON_INICIA_SESION_Y_AHORRA)) {
            doClickElement(5, BookingElements.BUTTON_INICIA_SESION_Y_AHORRA);
        } else if (validateElement(10, BookingElements.IMAGE_BUTTON_CERRAR_SIGN_IN)) {
            doClickElement(5, BookingElements.IMAGE_BUTTON_CERRAR_SIGN_IN);
        } else if (validateElement(10, BookingElements.IMAGE_BUTTON_CERRAR_SIGN_IN_1)) {
            doClickElement(5, BookingElements.IMAGE_BUTTON_CERRAR_SIGN_IN_1);
        }
        doClickElement(10, BookingElements.INPUT_BUSCAR_DESTINO);
        setTextElement(10, BookingElements.INPUT_TEXT_BUSCAR_DESTINO, ciudad);
        doClickElement(10, BookingElements.RESULTADO_BUSQUEDA);
    }

    public void ingresarFechasPage(String fechaInicio, String fechaFin) {
        PublicVariables.FECHA_INICIO = fechaInicio;
        PublicVariables.FECHA_FIN = fechaFin;
        String startDate = getDay(fechaInicio) + " " + getMonth(fechaInicio) + " " + datesPart(fechaInicio).getYear();
        String endDate = getDay(fechaFin) + " " + getMonth(fechaFin) + " " + datesPart(fechaFin).getYear();
        WebElement start = doWaitVisibiliTyOfElementLocated(10, BookingElements.DATEPICKER_FECHA_SWIPE_START);
        WebElement end = doWaitVisibiliTyOfElementLocated(10, BookingElements.DATEPICKER_FECHA_SWIPE_END);
        doVerticalSwipeToElement(start, end);
        doClickElement(10, BookingElements.DATEPICKER_FECHA(startDate));
        doClickElement(10, BookingElements.DATEPICKER_FECHA(endDate));
        doClickElement(10, BookingElements.BUTTON_SELECCIONAR_FECHAS);
    }

    public void seleccionarResidentesPage(String habitacion, String adulto, String menor, String edad) {
        doClickElement(10, BookingElements.BUTTON_SELECCIONAR_RESIDENTES);
        while (!validateText(10, BookingElements.LABEL_HABITACION, habitacion)) {
            doSleep(500);
            doClickElement(10, BookingElements.OPTION_ADD_HABITACION);
        }
        while (!validateText(10, BookingElements.LABEL_ADULTO, adulto)) {
            doSleep(500);
            doClickElement(10, BookingElements.OPTION_ADD_ADULTO);
        }
        doSleep(500 );
        while (!validateText(10, BookingElements.LABEL_MENOR, menor)) {
            doClickElement(10, BookingElements.OPTION_ADD_MENOR);
            while (!validatePartialText(10, BookingElements.SCROLL_EDAD_MENOR, edad)) {
                doVerticalSwipe(0.5, 0.4, 0.5);
            }
            doClickElement(5, BookingElements.BUTTON_OK_EDAD_MENOR);
        }
        doClickElement(5, BookingElements.BUTTON_APLICAR_RESIDENTES);
    }

    public void seleccionarBookingPage() {
        doClickElement(10, BookingElements.BUTTON_BUSCAR_BOOKING);
        doSleep(3000);
        tapView(555, 1822);
        doClickElement(10, BookingElements.BUTTON_ELIGE_HABITACION);
        if (validateElement(10, BookingElements.LABEL_TIPO_HABITACION)) {
            doVerticalSwipeToElement(doWaitVisibiliTyOfElementLocated(10, BookingElements.LAYOUT_LIST_ITEM), doWaitVisibiliTyOfElementLocated(10, BookingElements.TEXTVIEW_BANNER_TITLE));
            doClickElement(10, BookingElements.BUTTON_SELECCIONAR_HABITACION);
            doClickElement(10, BookingElements.BUTTON_RESERVA_AHORA);
        } else if (validateElement(10, BookingElements.BUTTON_ELIGE_HABITACION)) {
            doClickElement(10, BookingElements.BUTTON_RESERVA_HABITACION);
        }
    }

    public void completarFormularioPage(DataTable dataTable) {
        setTextElement(10, BookingElements.INPUT_TEXT_NOMBRE, getDataTable(dataTable, "nombre"));
        setTextElement(10, BookingElements.INPUT_TEXT_APELLIDO, getDataTable(dataTable, "apellido"));
        setTextElement(10, BookingElements.INPUT_TEXT_EMAIL, getDataTable(dataTable, "email"));
        if (validateElement(10, BookingElements.INPUT_TEXT_DIRECCION))
            setTextElement(10, BookingElements.INPUT_TEXT_DIRECCION, getDataTable(dataTable, "direccion"));
        WebElement start = doWaitVisibiliTyOfElementLocated(10, BookingElements.INPUT_TEXT_PAIS);
        WebElement end = doWaitVisibiliTyOfElementLocated(10, BookingElements.INPUT_NOMBRE);
        doVerticalSwipeToElement(start, end);
        if (validateElement(10, BookingElements.INPUT_CODIGO_POSTAL))
            setTextElement(10, BookingElements.INPUT_TEXT_CODIGO_POSTAL, getDataTable(dataTable, "codigoPostal"));
        if (validateElement(10, BookingElements.INPUT_TEXT_CIUDAD))
            setTextElement(10, BookingElements.INPUT_TEXT_CIUDAD, getDataTable(dataTable, "ciudad"));
        setTextElement(10, BookingElements.INPUT_TEXT_PAIS, getDataTable(dataTable, "pais"));
        setTextElement(10, BookingElements.INPUT_TEXT_TELEFONO_MOVIL, getDataTable(dataTable, "telefonoMovil"));
        if (getDataTable(dataTable, "propositoViaje").equalsIgnoreCase("negocios")) {
            doClickElement(10, BookingElements.RADIOBUTTON_NEGOCIOS);
        } else if (getDataTable(dataTable, "propositoViaje").equalsIgnoreCase("ocio")) {
            doClickElement(10, BookingElements.RADIOBUTTON_OCIO);
        }
        doClickElement(10, BookingElements.BUTTON_SIGUIENTE_PASO);
    }

    public void validarPrevioBookingPage() {
        String checkIn = getDay(PublicVariables.FECHA_INICIO) + " "  + getMonthShort(PublicVariables.FECHA_INICIO) + " " + datesPart(PublicVariables.FECHA_INICIO).getYear();
        String checkOut = getDay(PublicVariables.FECHA_FIN) + " "  + getMonthShort(PublicVariables.FECHA_FIN) + " " + datesPart(PublicVariables.FECHA_FIN ).getYear();
        assertContainsText(10, BookingElements.LABEL_FECHA_ENTRADA, checkIn);
        assertContainsText(10, BookingElements.LABEL_FECHA_SALIDA, checkOut);
        doClickElement(10, BookingElements.BUTTON_RESERVA_AHORA_FINAL);
    }
}
