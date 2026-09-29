package com.lingq.core.network.api.result;

import p000.ey8;
import p000.fa4;
import p000.n3c;
import p000.ux5;

/* JADX INFO: loaded from: classes.dex */
@ey8
public final class ResultDictionaryLocale {
    public static final C1650f1 Companion = new C1650f1();

    /* JADX INFO: renamed from: a */
    public final String f20838a;

    /* JADX INFO: renamed from: b */
    public final String f20839b;

    public /* synthetic */ ResultDictionaryLocale(String str, int i, String str2) {
        if (1 != (i & 1)) {
            n3c.m17204b(i, 1, ResultDictionaryLocale$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.f20838a = str;
        if ((i & 2) == 0) {
            this.f20839b = "";
        } else {
            this.f20839b = str2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ResultDictionaryLocale)) {
            return false;
        }
        ResultDictionaryLocale resultDictionaryLocale = (ResultDictionaryLocale) obj;
        return fa4.m11650l(this.f20838a, resultDictionaryLocale.f20838a) && fa4.m11650l(this.f20839b, resultDictionaryLocale.f20839b);
    }

    public final int hashCode() {
        return this.f20839b.hashCode() + (this.f20838a.hashCode() * 31);
    }

    public final String toString() {
        return ux5.m22991n("ResultDictionaryLocale(code=", this.f20838a, ", title=", this.f20839b, ")");
    }
}
