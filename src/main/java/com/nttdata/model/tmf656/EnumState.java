package com.nttdata.model.tmf656;

import java.util.HashMap;
import java.util.Map;

/* Severity:
        1 – Indeterminate
        2 – Critical
        3 – Major
        4 – Minor
        5 – Warning
        6 - Cleared
 */
public enum EnumState {
    Severity1("Indeterminate"),
    Severity2("Critical"),
    Severity3("Major"),
    Severity4("Minor"),
    Severity5("Warning"),
    Severity6("Cleared");

    private static final Map<String, EnumState> enumStates = new HashMap<>();

    private final String state;

    EnumState(String state) {
        this.state = state;
    }

    public static EnumState get(String state) {
        return enumStates.get(state);
    }
}
