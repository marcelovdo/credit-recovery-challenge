package com.credit.client.entrypoint.request;

import java.math.BigInteger;

public record ClientCreateRequest(
        String id,
        String name,
        BigInteger debit
) {
}
