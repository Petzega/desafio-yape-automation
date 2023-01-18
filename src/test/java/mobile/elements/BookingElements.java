package mobile.elements;

import com.aventstack.extentreports.App;
import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;

public class BookingElements {

    public static By IMAGE_BUTTON_CERRAR_SIGN_IN = AppiumBy.xpath("//android.widget.ImageButton[@content-desc=\"Desplazarse hacia arriba\"]");
    public static By IMAGE_BUTTON_CERRAR_SIGN_IN_1 = AppiumBy.xpath("//android.widget.ImageButton[@content-desc=\"Navigate up\"]");
    public static By INPUT_BUSCAR_DESTINO = AppiumBy.id("com.booking:id/facet_search_box_accommodation_destination");
    public static By INPUT_TEXT_BUSCAR_DESTINO = AppiumBy.id("com.booking:id/facet_with_bui_free_search_booking_header_toolbar_content");
    public static By BUTTON_INICIA_SESION_Y_AHORRA = AppiumBy.id("com.booking:id/action_primary");
    public static By RESULTADO_BUSQUEDA = AppiumBy.id("com.booking:id/view_disambiguation_destination_title");
    public static By DATEPICKER_FECHA(String value) {
        return AppiumBy.xpath(String.format("//android.view.View[@content-desc=\"%s\"]", value));
    }
    public static By DATEPICKER_FECHA_SWIPE_START = AppiumBy.xpath("//android.view.View[@content-desc=\"01 febrero 2023\"]");
    public static By DATEPICKER_FECHA_SWIPE_END = AppiumBy.xpath("//android.view.View[@content-desc=\"18 enero 2023\"]");
    public static By BUTTON_SELECCIONAR_FECHAS = AppiumBy.id("com.booking:id/facet_date_picker_confirm");
    public static By BUTTON_SELECCIONAR_RESIDENTES = AppiumBy.id("com.booking:id/facet_search_box_accommodation_occupancy");
    public static By LABEL_HABITACION = AppiumBy.xpath("//android.view.ViewGroup[@resource-id='com.booking:id/group_config_rooms_count']/descendant::android.widget.TextView[@resource-id='com.booking:id/bui_input_stepper_value']");
    public static By OPTION_ADD_HABITACION = AppiumBy.xpath("//android.view.ViewGroup[@resource-id='com.booking:id/group_config_rooms_count']/descendant::android.widget.Button[@resource-id='com.booking:id/bui_input_stepper_add_button']");
    public static By LABEL_ADULTO = AppiumBy.xpath("//android.view.ViewGroup[@resource-id='com.booking:id/group_config_adults_count']/descendant::android.widget.TextView[@resource-id='com.booking:id/bui_input_stepper_value']");
    public static By OPTION_ADD_ADULTO = AppiumBy.xpath("//android.view.ViewGroup[@resource-id='com.booking:id/group_config_adults_count']/descendant::android.widget.Button[@resource-id='com.booking:id/bui_input_stepper_add_button']");
    public static By LABEL_MENOR = AppiumBy.xpath("//android.view.ViewGroup[@resource-id='com.booking:id/group_config_children_count']/descendant::android.widget.TextView[@resource-id='com.booking:id/bui_input_stepper_value']");
    public static By OPTION_ADD_MENOR = AppiumBy.xpath("//android.view.ViewGroup[@resource-id='com.booking:id/group_config_children_count']/descendant::android.widget.Button[@resource-id='com.booking:id/bui_input_stepper_add_button']");
    public static By SCROLL_EDAD_MENOR = AppiumBy.id("android:id/numberpicker_input");
    public static By BUTTON_OK_EDAD_MENOR = AppiumBy.id("android:id/button1");
    public static By BUTTON_APLICAR_RESIDENTES = AppiumBy.id("com.booking:id/group_config_apply_button");
    public static By BUTTON_BUSCAR_BOOKING = AppiumBy.id("com.booking:id/facet_search_box_cta");
    public static By BUTTON_ELIGE_HABITACION = AppiumBy.id("com.booking:id/select_room_cta");
    public static By LABEL_TIPO_HABITACION = AppiumBy.id("com.booking:id/rooms_item_title");
    public static By LAYOUT_LIST_ITEM = AppiumBy.id("com.booking:id/list_item");
    public static By TEXTVIEW_BANNER_TITLE = AppiumBy.id("com.booking:id/info_banner_title");
    public static By BUTTON_SELECCIONAR_HABITACION = AppiumBy.id("com.booking:id/rooms_item_select_text_view");
    public static By BUTTON_RESERVA_AHORA = AppiumBy.xpath("//android.widget.Button[@resource-id='com.booking:id/main_action']");
    public static By BUTTON_RESERVA_HABITACION = AppiumBy.xpath("//android.widget.TextView[@resource-id='com.booking:id/rooms_item_title']");
    public static By INPUT_NOMBRE = By.xpath("//android.widget.TextView[@text=\"Nombre *\"]");
    public static By INPUT_TEXT_NOMBRE = By.xpath("//android.widget.TextView[@text=\"Nombre *\"]/following-sibling::android.widget.EditText[@resource-id=\"com.booking:id/bui_input_container_content\"]");
    public static By INPUT_TEXT_APELLIDO = By.xpath("//android.widget.TextView[@text=\"Apellido *\"]/following-sibling::android.widget.EditText[@resource-id=\"com.booking:id/bui_input_container_content\"]");
    public static By INPUT_TEXT_EMAIL = By.xpath("//android.widget.TextView[@text=\"E-mail *\"]/following-sibling::android.widget.EditText[@resource-id=\"com.booking:id/bui_input_container_content\"]");
    public static By INPUT_TEXT_DIRECCION = By.xpath("//android.widget.TextView[@text=\"Dirección *\"]/following-sibling::android.widget.EditText[@resource-id=\"com.booking:id/bui_input_container_content\"]");
    public static By INPUT_CODIGO_POSTAL = By.xpath("//android.widget.TextView[@text=\"Código postal *\"]");
    public static By INPUT_TEXT_CODIGO_POSTAL = By.xpath("//android.widget.TextView[@text=\"Código postal *\"]/following-sibling::android.widget.EditText[@resource-id=\"com.booking:id/bui_input_container_content\"]");
    public static By INPUT_TEXT_CIUDAD = By.xpath("//android.widget.TextView[@text=\"Ciudad *\"]/following-sibling::android.widget.EditText[@resource-id=\"com.booking:id/bui_input_container_content\"]");
    public static By INPUT_TEXT_PAIS = By.xpath("//android.widget.TextView[@text=\"País/región *\"]/following-sibling::android.widget.EditText[@resource-id=\"com.booking:id/bui_input_container_content\"]");
    public static By INPUT_TEXT_TELEFONO_MOVIL = By.xpath("//android.widget.TextView[@text=\"Teléfono móvil *\"]/following-sibling::android.widget.EditText[@resource-id=\"com.booking:id/bui_input_container_content\"]");
    public static By RADIOBUTTON_NEGOCIOS = By.id("com.booking:id/business_purpose_business");
    public static By RADIOBUTTON_OCIO = By.id("com.booking:id/business_purpose_leisure");
    public static By BUTTON_SIGUIENTE_PASO = By.id("com.booking:id/action_button");
    public static By LABEL_FECHA_ENTRADA = By.id("com.booking:id/checkin_date");
    public static By LABEL_FECHA_SALIDA = By.id("com.booking:id/checkout_date");
    public static By BUTTON_RESERVA_AHORA_FINAL = By.id("com.booking:id/action_button");
}