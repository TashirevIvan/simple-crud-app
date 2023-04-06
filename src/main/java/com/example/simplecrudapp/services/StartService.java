package com.example.simplecrudapp.services;

import com.example.simplecrudapp.controllers.Person;
import com.example.simplecrudapp.repo.Client;

import java.util.List;

public interface StartService {
   String calcAge(Person person);

   List<Client> getAllClients();
}
