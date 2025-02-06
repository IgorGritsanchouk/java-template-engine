package com.jte.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.MessageSource;
import org.springframework.test.web.servlet.MockMvc;

@WebMvcTest(LanguageController.class)
class LanguageControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private MessageSource mockMessageSource;

//    @Test
//    void testLanguageSelector() throws Exception {
//        // Setup
//        when(mockMessageSource.getMessage(eq("title.message"), any(Object[].class), eq(Locale.ENGLISH)))
//                .thenReturn("Welcome Page");
//        when(mockMessageSource.getMessage(eq("welcome.message"), any(Object[].class), eq(Locale.ENGLISH)))
//                .thenReturn("Welcome to our website!");
//        when(mockMessageSource.getMessage(eq("language.label"), any(Object[].class), eq(Locale.ENGLISH)))
//                .thenReturn("Choose a language:");
//
//        // Run the test and verify the results
//        mockMvc.perform(get("/language-selector")
//                        .accept(MediaType.TEXT_HTML))
//                .andExpect(status().isOk());
//                //.andExpect(content().string("pages/language-selector"));
//    }

//    @Test
//    void testLanguageSelector_MessageSourceThrowsNoSuchMessageException() throws Exception {
//        // Setup
//        when(mockMessageSource.getMessage(eq("invalid.message"), any(Object[].class), eq(Locale.ENGLISH)))
//                .thenThrow(NoSuchMessageException.class);
//
//        // Run the test and verify the results
//        mockMvc.perform(get("/language-selector")
//                        .accept(MediaType.TEXT_HTML))
//                //.andExpect(status().is5xxServerError());
//                .andExpect(content().string(""));
//    }

  //  @Test
//    void testChangeLanguage() throws Exception {
//        // Setup
//        // Run the test and verify the results
//        mockMvc.perform(post("/change-language")
//                        .param("language", "fr")
//                        //.with(csrf())
//                        .accept(MediaType.TEXT_HTML))
//                .andExpect(status().isOk());
//               //.andExpect(content().string("expectedResponse"));
//    }
}
