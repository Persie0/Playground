package com.lingq.core.network.api.result;

import p000.ey8;
import p000.fa4;
import p000.hn1;

/* JADX INFO: loaded from: classes2.dex */
@ey8
public final class ResultLippSentenceTranslation {
    public static final C1717q2 Companion = new C1717q2();

    /* JADX INFO: renamed from: a */
    public final int f21314a;

    /* JADX INFO: renamed from: b */
    public final String f21315b;

    public /* synthetic */ ResultLippSentenceTranslation(int i, String str, int i2) {
        this.f21314a = (i & 1) == 0 ? 0 : i2;
        if ((i & 2) == 0) {
            this.f21315b = "";
        } else {
            this.f21315b = str;
        }
    }

    /* JADX INFO: renamed from: a */
    public final int m8372a() {
        return this.f21314a;
    }

    /* JADX INFO: renamed from: b */
    public final String m8373b() {
        return this.f21315b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ResultLippSentenceTranslation)) {
            return false;
        }
        ResultLippSentenceTranslation resultLippSentenceTranslation = (ResultLippSentenceTranslation) obj;
        return this.f21314a == resultLippSentenceTranslation.f21314a && fa4.m11650l(this.f21315b, resultLippSentenceTranslation.f21315b);
    }

    public final int hashCode() {
        return this.f21315b.hashCode() + (Integer.hashCode(this.f21314a) * 31);
    }

    public final String toString() {
        return hn1.m13354d(this.f21314a, "ResultLippSentenceTranslation(index=", ", text=", this.f21315b, ")");
    }
}
