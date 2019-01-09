package com.cloudcmr.app;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.Matchers.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@AutoConfigureMockMvc
@SpringBootTest(properties = "classpath:application-integrationtest.yml")
public class CloudCmrAppIntegrationTest {

    @Autowired
    private MockMvc mvc;

    @Autowired
    private MemberRepository repository;

    @Test
    public void givenMemberss_whenGetMembers_thenStatus200()
            throws Exception {

        createTestMember("bob", "marley");

        mvc.perform(get("/api/members/1")
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(content()
                        .contentTypeCompatibleWith(MediaType.APPLICATION_JSON))
                .andExpect(jsonPath("$.lastName", is("bob")))
                .andExpect(jsonPath("$.firstName", is("marley")));
    }

    private void createTestMember(String lastname, String firstname) {
        Member member = new Member();
        member.setFirstName(firstname);
        member.setLastName(lastname);
        repository.save(member);
    }
}
