package com.mongodb.service.mapper;

import static com.mongodb.domain.ContractAsserts.*;
import static com.mongodb.domain.ContractTestSamples.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ContractMapperTest {

    private ContractMapper contractMapper;

    @BeforeEach
    void setUp() {
        contractMapper = new ContractMapperImpl();
    }

    @Test
    void shouldConvertToDtoAndBack() {
        var expected = getContractSample1();
        var actual = contractMapper.toEntity(contractMapper.toDto(expected));
        assertContractAllPropertiesEquals(expected, actual);
    }
}
