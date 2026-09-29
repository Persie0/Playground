package com.lingq.core.domain.model.token;

import java.util.List;
import kotlin.AbstractC3192a;
import kotlin.LazyThreadSafetyMode;
import p000.cs4;
import p000.ey8;
import p000.fa4;
import p000.hn1;
import p000.ks8;
import p000.ux5;

/* JADX INFO: loaded from: classes2.dex */
@ey8
public final class TokenRelatedPhrase {
    public static final C1495k Companion = new C1495k();

    /* JADX INFO: renamed from: d */
    public static final cs4[] f19611d = {null, null, AbstractC3192a.m15357b(LazyThreadSafetyMode.PUBLICATION, new ks8(29))};

    /* JADX INFO: renamed from: a */
    public String f19612a;

    /* JADX INFO: renamed from: b */
    public String f19613b;

    /* JADX INFO: renamed from: c */
    public List f19614c;

    public TokenRelatedPhrase(String str, String str2, List list) {
        this.f19612a = str;
        this.f19613b = str2;
        this.f19614c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TokenRelatedPhrase)) {
            return false;
        }
        TokenRelatedPhrase tokenRelatedPhrase = (TokenRelatedPhrase) obj;
        return fa4.m11650l(this.f19612a, tokenRelatedPhrase.f19612a) && fa4.m11650l(this.f19613b, tokenRelatedPhrase.f19613b) && fa4.m11650l(this.f19614c, tokenRelatedPhrase.f19614c);
    }

    public final int hashCode() {
        return this.f19614c.hashCode() + ux5.m22980c(this.f19612a.hashCode() * 31, this.f19613b, 31);
    }

    public final String toString() {
        String str = this.f19612a;
        String str2 = this.f19613b;
        return hn1.m13356f(ux5.m23000w("TokenRelatedPhrase(term=", str, ", normalizedTerm=", str2, ", meanings="), this.f19614c, ")");
    }
}
