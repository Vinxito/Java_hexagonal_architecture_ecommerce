package com.capitole.prices.infrastructure;

import com.capitole.ecommerce.infrastructure.db.springdata.config.Starter;
import com.capitole.ecommerce.infrastructure.db.springdata.jpa.IPriceJpaRepository;
import com.capitole.prices.domain.PriceJpaMother;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpMethod;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.http.MediaType.APPLICATION_JSON;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.request;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Starter.class)
@AutoConfigureMockMvc
public abstract class AcceptanceTestCase {

    @Autowired
    protected MockMvc mockMvc;

    @Autowired
    protected IPriceJpaRepository priceRepository;

    protected void assertRequestWithoutBody(String method, String endpoint, Integer expectedStatusCode, String expected) throws Exception {
        mockMvc.perform(request(HttpMethod.valueOf(method), endpoint).contentType(APPLICATION_JSON))
                .andExpect(status().is(expectedStatusCode)).andExpect(content().string(expected));
    }

    protected void prepare() {
        priceRepository.save(PriceJpaMother.createOnDates("2020-06-14-00.00.00", "2020-12-31-23.59.59"));

        priceRepository.save(PriceJpaMother.createOnDates("2020-06-14-15.00.00", "2020-06-14-18.30.00"));

        priceRepository.save(PriceJpaMother.createOnDates("2020-06-15-00.00.00", "2020-06-15-11.00.00"));

        priceRepository.save(PriceJpaMother.createOnDates("2020-06-15-16.00.00", "2020-12-31-23.59.59"));
    }
}
