package org.credit.client.entrypoint;

import org.credit.client.adapters.CreateRequestToDTOAdapter;
import org.credit.client.dto.ClientDTO;
import org.credit.client.entrypoint.request.ClientCreateRequest;
import org.credit.client.entrypoint.response.ClientCreateResponse;
import org.credit.client.entrypoint.response.ClientFindResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/client")
public class ClientController {
    @PostMapping()
    public ResponseEntity<ClientCreateResponse> createClient(ClientCreateRequest request) {
        ClientDTO dto = CreateRequestToDTOAdapter.adapt(request);
        //CreateClientUseCase.createClient(dto);
        //ClientCreateResponse response = DTOToCreateResponseAdapter.adapt(dto);
        return new ResponseEntity<>(null, HttpStatus.CREATED);
    }

    @GetMapping("/{clientId}")
    public ResponseEntity<ClientFindResponse> findClient(@PathVariable String clientId) {
        //ClientDTO dto = FindClientUseCase.createClient(clientId);
        //ClientFindResponse response = DTOToFindResponseAdapter.adapt(dto);
        return new ResponseEntity<>(null, HttpStatus.CREATED);
    }
}
