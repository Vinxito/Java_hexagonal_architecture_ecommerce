package com.capitole.prices.infrastructure.controller;

import com.capitole.prices.infrastructure.AcceptanceTestCase;
import org.junit.Before;
import org.junit.Test;

public class PricesGetControllerShould extends AcceptanceTestCase {

    @Before
    public void setup(){
        prepare();
    }

    @Test
    public void find_first_price() throws Exception {

        String date = "2020-06-14-10.00.00";
        String productId = "35455";
        String brandId = "1";

        String expected = "Producto no disponible";

        givenThereIsAItem(date, productId, brandId, expected);
    }

    @Test
    public void find_second_price() throws Exception {

        String date = "2020-06-14-16.00.00";
        String productId = "35455";
        String brandId = "1";

        String expected = "Producto no disponible";

        givenThereIsAItem(date, productId, brandId, expected);
    }

    @Test
    public void find_third_price() throws Exception {
        String date = "2020-06-14-21.00.00";
        String productId = "35455";
        String brandId = "1";

        String expected = "Producto no disponible";

        givenThereIsAItem(date, productId, brandId, expected);
    }

    @Test
    public void find_fourth_price() throws Exception {
        String date = "2020-06-15-10.00.00";
        String productId = "35455";
        String brandId = "1";

        String expected = "{\"end_date\":\"2020-12-31\",\"price_list\":1,\"price\":35.5,\"brandId\":1,\"product_id\":35455," +
                "\"priority\":0,\"curr\":\"EUR\",\"start_date\":\"2020-06-15\"}";

        givenThereIsAItem(date, productId, brandId, expected);
    }

    @Test
    public void find_fifth_price() throws Exception {
        String date = "2020-06-16-21.00.00";
        String productId = "35455";
        String brandId = "1";

        String expected = "{\"end_date\":\"2020-12-31\",\"price_list\":1,\"price\":35.5,\"brandId\":1,\"product_id\":35455," +
                "\"priority\":0,\"curr\":\"EUR\",\"start_date\":\"2020-06-15\"}";

        givenThereIsAItem(date, productId, brandId, expected);
    }

    private void givenThereIsAItem(String date, String productId, String brandId, String expected) throws Exception {
        assertRequestWithoutBody("GET", String.format("/products/%s/%s/%s", date, productId, brandId), 200, expected);
    }
}
