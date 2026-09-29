package com.facebook.appevents.cloudbridge;

import p000.C3769xr;

/* JADX INFO: loaded from: classes2.dex */
public enum AppEventsConversionsAPITransformer$DataProcessingParameterName {
    OPTIONS("data_processing_options"),
    COUNTRY("data_processing_options_country"),
    STATE("data_processing_options_state");

    public static final C3769xr Companion = new C3769xr();
    private final String rawValue;

    AppEventsConversionsAPITransformer$DataProcessingParameterName(String str) {
        this.rawValue = str;
    }

    public final String getRawValue() {
        return this.rawValue;
    }
}
