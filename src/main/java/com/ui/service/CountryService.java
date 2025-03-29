package com.ui.service;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class CountryService {

    public Map<String, String> getAllCountries() {
        Map<String, String> countries = new HashMap<>();
        countries.put("UK", "United Kingdom");
        countries.put("USA", "United States");
        countries.put("NZ", "New Zealand");
        countries.put("CA", "Canada");
        countries.put("AU", "Australia");
        return countries;
    }
}
