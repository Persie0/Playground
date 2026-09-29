package com.lingq.core.domain.model.token;

import p000.ey8;
import p000.fa4;
import p000.ux5;

/* JADX INFO: loaded from: classes2.dex */
@ey8
public final class TokenFurigana {
    public static final C1492h Companion = new C1492h();

    /* JADX INFO: renamed from: a */
    public final String f19592a;

    /* JADX INFO: renamed from: b */
    public final String f19593b;

    public /* synthetic */ TokenFurigana(String str, int i, String str2) {
        if ((i & 1) == 0) {
            this.f19592a = null;
        } else {
            this.f19592a = str;
        }
        if ((i & 2) == 0) {
            this.f19593b = null;
        } else {
            this.f19593b = str2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TokenFurigana)) {
            return false;
        }
        TokenFurigana tokenFurigana = (TokenFurigana) obj;
        return fa4.m11650l(this.f19592a, tokenFurigana.f19592a) && fa4.m11650l(this.f19593b, tokenFurigana.f19593b);
    }

    public final int hashCode() {
        String str = this.f19592a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f19593b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return ux5.m22991n("TokenFurigana(chunk=", this.f19592a, ", furigana=", this.f19593b, ")");
    }

    public TokenFurigana(String str, String str2) {
        this.f19592a = str;
        this.f19593b = str2;
    }
}
