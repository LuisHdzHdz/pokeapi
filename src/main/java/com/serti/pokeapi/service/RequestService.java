package com.serti.pokeapi.service;

import jakarta.servlet.http.HttpServletRequest;

public interface RequestService {
     
    String getClientIp(HttpServletRequest request);
     
}