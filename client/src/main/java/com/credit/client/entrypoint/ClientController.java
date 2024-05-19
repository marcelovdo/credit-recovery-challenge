package com.credit.client.entrypoint;

import com.credit.client.usecase.ClientUseCase;
import com.credit.client.entrypoint.adapters.CreateRequestToDTOAdapter;
import com.credit.client.entrypoint.adapters.DTOToCreateResponseAdapter;
import com.credit.client.entrypoint.adapters.DTOToFindResponseAdapter;
import com.credit.client.dto.ClientDTO;
import com.credit.client.entrypoint.request.ClientCreateRequest;
import com.credit.client.entrypoint.response.ClientCreateResponse;
import com.credit.client.entrypoint.response.ClientFindResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/client")
public class ClientController {
    @Autowired
    private ClientUseCase useCase;

    @PostMapping()
    public ResponseEntity<ClientCreateResponse> createClient(@RequestBody ClientCreateRequest request) {
        ClientDTO dto = CreateRequestToDTOAdapter.adapt(request);
        useCase.createClient(dto);
        ClientCreateResponse response = DTOToCreateResponseAdapter.adapt(dto);
        return new ResponseEntity<>(response, HttpStatus.CREATED);
    }

    @GetMapping("/{clientId}")
    public ResponseEntity<ClientFindResponse> findClient(@PathVariable String clientId) {
        ClientDTO dto = useCase.findClient(clientId);
        ClientFindResponse response = DTOToFindResponseAdapter.adapt(dto);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}
