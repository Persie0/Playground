package com.lingq.core.network.api.result;

import p000.ey8;
import p000.fa4;
import p000.wq1;

/* JADX INFO: loaded from: classes2.dex */
@ey8
public final class ResultTranslationSimple {
    public static final C1701n4 Companion = new C1701n4();

    /* JADX INFO: renamed from: a */
    public final String f21622a;

    public /* synthetic */ ResultTranslationSimple(int i, String str) {
        if ((i & 1) == 0) {
            this.f21622a = "";
        } else {
            this.f21622a = str;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ResultTranslationSimple) && fa4.m11650l(this.f21622a, ((ResultTranslationSimple) obj).f21622a);
    }

    public final int hashCode() {
        return this.f21622a.hashCode();
    }

    public final String toString() {
        return wq1.m24118n("ResultTranslationSimple(translatedText=", this.f21622a, ")");
    }
}
