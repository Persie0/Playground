package com.lingq.core.network.api.result;

import p000.ey8;

/* JADX INFO: loaded from: classes2.dex */
@ey8
public final class ResultLanguageStatValue {
    public static final C1734t1 Companion = new C1734t1();

    /* JADX INFO: renamed from: a */
    public final double f20914a;

    /* JADX INFO: renamed from: b */
    public final double f20915b;

    public /* synthetic */ ResultLanguageStatValue(double d, double d2, int i) {
        if ((i & 1) == 0) {
            this.f20914a = 0.0d;
        } else {
            this.f20914a = d;
        }
        if ((i & 2) == 0) {
            this.f20915b = 0.0d;
        } else {
            this.f20915b = d2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ResultLanguageStatValue)) {
            return false;
        }
        ResultLanguageStatValue resultLanguageStatValue = (ResultLanguageStatValue) obj;
        return Double.compare(this.f20914a, resultLanguageStatValue.f20914a) == 0 && Double.compare(this.f20915b, resultLanguageStatValue.f20915b) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.f20915b) + (Double.hashCode(this.f20914a) * 31);
    }

    public final String toString() {
        return "ResultLanguageStatValue(overall=" + this.f20914a + ", change=" + this.f20915b + ")";
    }

    public ResultLanguageStatValue() {
        this.f20914a = 0.0d;
        this.f20915b = 0.0d;
    }
}
