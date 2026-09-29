package com.lingq.core.domain.model.library;

import kotlin.enums.AbstractC3201a;
import p000.ys2;

/* JADX INFO: loaded from: classes.dex */
public enum Accent {
    Standard("standard_arabic"),
    Egyptian("egyptian_arabic"),
    Levantine("levantine_arabic"),
    Formal("formal_persian"),
    Spoken("spoken_persian"),
    European("european_portuguese"),
    Brazilian("brazilian_portuguese"),
    EuropeanSpanish("european_spanish"),
    LatinAmerican("latin_american_spanish"),
    Canadian("canadian_english"),
    British("british_english"),
    American("american_english"),
    France("france_french"),
    CanadianFrench("canada_french");

    private static final /* synthetic */ ys2 $ENTRIES = AbstractC3201a.m15404a(values());
    private final String value;

    Accent(String str) {
        this.value = str;
    }

    public static ys2 getEntries() {
        return $ENTRIES;
    }

    public final String getValue() {
        return this.value;
    }
}
