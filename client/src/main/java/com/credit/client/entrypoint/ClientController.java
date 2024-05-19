package com.credit.client.entrypoint;

import com.credit.client.usecase.CreateClientUseCase;
import com.credit.client.adapters.CreateRequestToDTOAdapter;
import com.credit.client.adapters.DTOToCreateResponseAdapter;
import com.credit.client.adapters.DTOToFindResponseAdapter;
import com.credit.client.dto.ClientDTO;
import com.credit.client.entrypoint.request.ClientCreateRequest;
import com.credit.client.entrypoint.response.ClientCreateResponse;
import com.credit.client.entrypoint.response.ClientFindResponse;
import com.credit.client.usecase.FindClientUseCase;
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
