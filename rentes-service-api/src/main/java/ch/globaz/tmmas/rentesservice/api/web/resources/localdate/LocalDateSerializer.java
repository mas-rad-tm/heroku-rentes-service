package ch.globaz.tmmas.rentesservice.api.web.resources.localdate;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;

import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import static ch.globaz.tmmas.rentesservice.api.web.resources.localdate.DateFormatter.DATE_FORMAT;

/**
 * Created by seb on .
 * <p>
 * ${VERSION}
 */
public class LocalDateSerializer extends StdSerializer<LocalDate> {


    public LocalDateSerializer(){
        super(LocalDate.class);
    }

    @Override
    public void serialize(LocalDate value, JsonGenerator gen, SerializerProvider sp) throws IOException, JsonProcessingException {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(DATE_FORMAT);

        gen.writeString(value.format(formatter));
    }
}