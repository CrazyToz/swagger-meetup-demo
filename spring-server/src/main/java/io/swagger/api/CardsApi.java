/**
 * NOTE: This class is auto generated by the swagger code generator program (2.3.1).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package io.swagger.api;

import io.swagger.model.Card;
import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-09-10T05:38:24.221Z")

@Api(value = "cards", description = "the cards API")
@CrossOrigin(origins = "*")
public interface CardsApi {

    @ApiOperation(value = "Find card details", nickname = "cardsCardNumberGet", notes = "Find card details, like owner and validity date", response = Card.class, tags={ "card", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = Card.class),
        @ApiResponse(code = 404, message = "Card not found") })
    @RequestMapping(value = "/cards/{cardNumber}",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<Card> cardsCardNumberGet(@ApiParam(value = "card number",required=true) @PathVariable("cardNumber") String cardNumber);

}
