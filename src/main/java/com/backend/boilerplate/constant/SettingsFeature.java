package com.backend.boilerplate.constant;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

/**
 * @author sarvesh
 * @version 0.0.2
 * @since 0.0.2
 */
@RequiredArgsConstructor
public enum SettingsFeature {
    DEFAULT("Default Settings");

    @Getter
    private final String name;

    public static final String GENERAL_SETTINGS_FEATURE_NAME = "Settings";
}
