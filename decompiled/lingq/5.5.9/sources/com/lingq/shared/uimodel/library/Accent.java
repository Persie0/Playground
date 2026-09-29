package com.lingq.shared.uimodel.library;

import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13364d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012¨\u0006\u0013"}, m13365d2 = {"Lcom/lingq/shared/uimodel/library/Accent;", "", "value", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "Standard", "Egyptian", "Levantine", "Formal", "Spoken", "European", "Brazilian", "EuropeanSpanish", "LatinAmerican", "Canadian", "British", "American", "shared_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
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
    American("american_english");

    private final String value;

    Accent(String str) {
        this.value = str;
    }

    public final String getValue() {
        return this.value;
    }
}
