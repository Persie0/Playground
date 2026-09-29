package com.lingq.core.domain.model.token;

import p000.ey8;
import p000.fa4;
import p000.wq1;

/* JADX INFO: loaded from: classes2.dex */
@ey8
public final class TokenTranslationSimple {
    public static final C1496l Companion = new C1496l();

    /* JADX INFO: renamed from: a */
    public final String f19615a;

    public /* synthetic */ TokenTranslationSimple(int i, String str) {
        if ((i & 1) == 0) {
            this.f19615a = "";
        } else {
            this.f19615a = str;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof TokenTranslationSimple) && fa4.m11650l(this.f19615a, ((TokenTranslationSimple) obj).f19615a);
    }

    public final int hashCode() {
        return this.f19615a.hashCode();
    }

    public final String toString() {
        return wq1.m24118n("TokenTranslationSimple(translatedText=", this.f19615a, ")");
    }

    public TokenTranslationSimple(String str) {
        str.getClass();
        this.f19615a = str;
    }
}
