package com.lingq.core.domain.model.language;

import p000.ey8;
import p000.n3c;

/* JADX INFO: loaded from: classes2.dex */
@ey8
public final class LanguageStatValue {
    public static final C1429i Companion = new C1429i();

    /* JADX INFO: renamed from: a */
    public final double f19076a;

    /* JADX INFO: renamed from: b */
    public final double f19077b;

    public /* synthetic */ LanguageStatValue(double d, double d2, int i) {
        if (3 != (i & 3)) {
            n3c.m17204b(i, 3, LanguageStatValue$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.f19076a = d;
        this.f19077b = d2;
    }

    /* JADX INFO: renamed from: a */
    public final double m8025a() {
        return this.f19077b;
    }

    /* JADX INFO: renamed from: b */
    public final double m8026b() {
        return this.f19076a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LanguageStatValue)) {
            return false;
        }
        LanguageStatValue languageStatValue = (LanguageStatValue) obj;
        return Double.compare(this.f19076a, languageStatValue.f19076a) == 0 && Double.compare(this.f19077b, languageStatValue.f19077b) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.f19077b) + (Double.hashCode(this.f19076a) * 31);
    }

    public final String toString() {
        return "LanguageStatValue(overall=" + this.f19076a + ", change=" + this.f19077b + ")";
    }

    public LanguageStatValue(double d, double d2) {
        this.f19076a = d;
        this.f19077b = d2;
    }
}
