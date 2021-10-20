package com.capitole.ecommerce.infrastructure.rest.controller;

import com.capitole.ecommerce.application.ProductFinder;
import com.capitole.ecommerce.domain.Price;
import com.capitole.ecommerce.infrastructure.db.springdata.config.Utils;
import com.capitole.ecommerce.infrastructure.db.springdata.jpa.ProductNotExists;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.Serializable;
import java.util.HashMap;

@RestController
public class PricesGetController {

    private final ProductFinder productFinder;

    public PricesGetController(ProductFinder productFinder) {
        this.productFinder = productFinder;
    }

    @GetMapping("products/{date}/{productId}/{brandId}")
    public ResponseEntity<HashMap<String, Serializable>> findProduct(@PathVariable String date,
                                                                     @PathVariable Integer productId,
                                                                     @PathVariable Integer brandId) {
        Price response = productFinder.getProduct(
                        Utils.stringToDate(date),
                        productId,
                        brandId);

        return ResponseEntity.ok().body(new HashMap<String, Serializable>() {{
            put("brandId", response.brandId().value());
            put("start_date", response.startDate().value());
            put("end_date", response.endDate().value());
            put("price_list", response.priceList().value());
            put("product_id", response.productId().value());
            put("priority", response.priority().value());
            put("price", response.price().value());
            put("curr", response.curr().value());
        }});
    }

    @ResponseStatus(value= HttpStatus.NO_CONTENT)
    @ExceptionHandler(ProductNotExists.class)
    public ResponseEntity<String> conflict() {
        return ResponseEntity.ok("Producto no disponible");
    }
}
