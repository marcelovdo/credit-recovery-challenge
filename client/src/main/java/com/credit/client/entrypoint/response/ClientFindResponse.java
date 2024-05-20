package com.credit.client.entrypoint.response;

import java.math.BigInteger;

public record ClientFindResponse(
        String id,
        String name,
        BigInteger debit
) {
}
