package com.lingq.core.network.api.result;

import p000.AbstractC3393o1;
import p000.ey8;
import p000.fa4;
import p000.ux5;

/* JADX INFO: loaded from: classes2.dex */
@ey8
public final class ResultTranslationV3 {
    public static final C1707o4 Companion = new C1707o4();

    /* JADX INFO: renamed from: a */
    public final String f21623a;

    /* JADX INFO: renamed from: b */
    public final String f21624b;

    /* JADX INFO: renamed from: c */
    public final String f21625c;

    public /* synthetic */ ResultTranslationV3(String str, int i, String str2, String str3) {
        if ((i & 1) == 0) {
            this.f21623a = null;
        } else {
            this.f21623a = str;
        }
        if ((i & 2) == 0) {
            this.f21624b = null;
        } else {
            this.f21624b = str2;
        }
        if ((i & 4) == 0) {
            this.f21625c = null;
        } else {
            this.f21625c = str3;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ResultTranslationV3)) {
            return false;
        }
        ResultTranslationV3 resultTranslationV3 = (ResultTranslationV3) obj;
        return fa4.m11650l(this.f21623a, resultTranslationV3.f21623a) && fa4.m11650l(this.f21624b, resultTranslationV3.f21624b) && fa4.m11650l(this.f21625c, resultTranslationV3.f21625c);
    }

    public final int hashCode() {
        String str = this.f21623a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f21624b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f21625c;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        return AbstractC3393o1.m17738m(ux5.m23000w("ResultTranslationV3(language=", this.f21623a, ", text=", this.f21624b, ", type="), this.f21625c, ")");
    }
}
