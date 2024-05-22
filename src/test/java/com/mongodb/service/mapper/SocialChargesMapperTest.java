package com.mongodb.service.mapper;

import static com.mongodb.domain.SocialChargesAsserts.*;
import static com.mongodb.domain.SocialChargesTestSamples.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SocialChargesMapperTest {

    private SocialChargesMapper socialChargesMapper;

    @BeforeEach
    void setUp() {
        socialChargesMapper = new SocialChargesMapperImpl();
    }

    @Test
    void shouldConvertToDtoAndBack() {
        var expected = getSocialChargesSample1();
        var actual = socialChargesMapper.toEntity(socialChargesMapper.toDto(expected));
        assertSocialChargesAllPropertiesEquals(expected, actual);
    }
}
