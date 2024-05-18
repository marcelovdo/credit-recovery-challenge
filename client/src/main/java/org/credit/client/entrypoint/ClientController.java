package org.credit.client.entrypoint;

import org.credit.client.adapters.CreateRequestToDTOAdapter;
import org.credit.client.adapters.DTOToCreateResponseAdapter;
import org.credit.client.adapters.DTOToFindResponseAdapter;
import org.credit.client.dto.ClientDTO;
import org.credit.client.entrypoint.request.ClientCreateRequest;
import org.credit.client.entrypoint.response.ClientCreateResponse;
import org.credit.client.entrypoint.response.ClientFindResponse;
import org.credit.client.usecase.CreateClientUseCase;
import org.credit.client.usecase.FindClientUseCase;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/client")
public class ClientController {
    @PostMapping()
    public ResponseEntity<ClientCreateResponse> createClient(@RequestBody ClientCreateRequest request) {
        ClientDTO dto = CreateRequestToDTOAdapter.adapt(request);
        CreateClientUseCase.createClient(dto);
        ClientCreateResponse response = DTOToCreateResponseAdapter.adapt(dto);
        return new ResponseEntity<>(response, HttpStatus.CREATED);
    }

    @GetMapping("/{clientId}")
    public ResponseEntity<ClientFindResponse> findClient(@PathVariable String clientId) {
        ClientDTO dto = FindClientUseCase.findClient(clientId);
        ClientFindResponse response = DTOToFindResponseAdapter.adapt(dto);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}
