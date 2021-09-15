package app;
import io.jooby.annotations.*;
import io.jooby.exception.*;

public class Soma{
    @Path ( "/soma/{b}/{m}")
    @GET 
    public String rotaDaSoma(@PathParam String b, @PathParam String m){
        try {
            double s = Double.parseDouble(b) + Double.parseDouble(m);

            return String.format("%.1f", s);
        } 
        // Informar que o parâmetro inserido está errado e que é necessário adicionar outro
    
        catch (NumberFormatException nfe) {
           throw new BadRequestException(String.format("É preciso informar um paramêtro válido"));
        }
        
    }
}