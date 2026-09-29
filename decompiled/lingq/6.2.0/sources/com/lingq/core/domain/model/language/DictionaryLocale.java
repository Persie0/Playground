package com.lingq.core.domain.model.language;

import p000.ey8;
import p000.fa4;
import p000.n3c;
import p000.ux5;

/* JADX INFO: loaded from: classes.dex */
@ey8
public final class DictionaryLocale {
    public static final C1424d Companion = new C1424d();

    /* JADX INFO: renamed from: a */
    public final String f19021a;

    /* JADX INFO: renamed from: b */
    public final String f19022b;

    public /* synthetic */ DictionaryLocale(String str, int i, String str2) {
        if (1 != (i & 1)) {
            n3c.m17204b(i, 1, DictionaryLocale$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.f19021a = str;
        if ((i & 2) == 0) {
            this.f19022b = "";
        } else {
            this.f19022b = str2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DictionaryLocale)) {
            return false;
        }
        DictionaryLocale dictionaryLocale = (DictionaryLocale) obj;
        return fa4.m11650l(this.f19021a, dictionaryLocale.f19021a) && fa4.m11650l(this.f19022b, dictionaryLocale.f19022b);
    }

    public final int hashCode() {
        return this.f19022b.hashCode() + (this.f19021a.hashCode() * 31);
    }

    public final String toString() {
        return ux5.m22991n("DictionaryLocale(code=", this.f19021a, ", title=", this.f19022b, ")");
    }

    public DictionaryLocale(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.f19021a = str;
        this.f19022b = str2;
    }
}
