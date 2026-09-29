package com.lingq.core.domain.model.token;

import java.util.List;
import kotlin.AbstractC3192a;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.EmptyList;
import p000.cs4;
import p000.e5a;
import p000.ey8;
import p000.fa4;
import p000.n3c;

/* JADX INFO: loaded from: classes2.dex */
@ey8
public final class TokenTranslations {
    public static final C1497m Companion = new C1497m();

    /* JADX INFO: renamed from: c */
    public static final cs4[] f19616c = {null, AbstractC3192a.m15357b(LazyThreadSafetyMode.PUBLICATION, new e5a(0))};

    /* JADX INFO: renamed from: a */
    public final String f19617a;

    /* JADX INFO: renamed from: b */
    public final List f19618b;

    public /* synthetic */ TokenTranslations(int i, String str, List list) {
        if (1 != (i & 1)) {
            n3c.m17204b(i, 1, TokenTranslations$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.f19617a = str;
        if ((i & 2) == 0) {
            this.f19618b = EmptyList.f47638a;
        } else {
            this.f19618b = list;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TokenTranslations)) {
            return false;
        }
        TokenTranslations tokenTranslations = (TokenTranslations) obj;
        return fa4.m11650l(this.f19617a, tokenTranslations.f19617a) && fa4.m11650l(this.f19618b, tokenTranslations.f19618b);
    }

    public final int hashCode() {
        return this.f19618b.hashCode() + (this.f19617a.hashCode() * 31);
    }

    public final String toString() {
        return "TokenTranslations(termWithLanguageAndTarget=" + this.f19617a + ", translations=" + this.f19618b + ")";
    }

    public TokenTranslations(String str, List list) {
        str.getClass();
        list.getClass();
        this.f19617a = str;
        this.f19618b = list;
    }
}
