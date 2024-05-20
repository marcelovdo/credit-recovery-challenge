package com.credit.client.entrypoint.request;

import java.math.BigInteger;

public record ClientUpdateRequest(
        String name,
        BigInteger debit
) {
}
