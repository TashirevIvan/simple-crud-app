package com.example.simplecrudapp.services;

import com.example.simplecrudapp.controllers.Person;
import com.example.simplecrudapp.repo.Client;
import com.example.simplecrudapp.repo.ClientRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class StartServiceImpl implements StartService {

    private final ClientRepository clientRepository;

    @Override
    public String calcAge(Person person) {
        //save person.name as client.name

        Client client = new Client();
        client.setEmail("lalala.com");
        client.setName(person.getName());
        clientRepository.save(client);

        //>30 ?
        if (person.getAge() > 30) {
            return person.getName() + " > 30 y";
        } else {
            return person.getName() + " <= 30 y";
        }
    }

    @Override
    public List<Client> getAllClients() {


        List<Client> clientList = clientRepository.findAll();

        return clientList;
    }


}


