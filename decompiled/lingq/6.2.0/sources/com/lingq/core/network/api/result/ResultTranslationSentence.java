package com.lingq.core.network.api.result;

import java.util.List;
import kotlin.AbstractC3192a;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.EmptyList;
import p000.cs4;
import p000.ey8;
import p000.fa4;
import p000.g98;
import p000.hn1;
import p000.ux5;

/* JADX INFO: loaded from: classes2.dex */
@ey8
public final class ResultTranslationSentence {
    public static final C1689l4 Companion = new C1689l4();

    /* JADX INFO: renamed from: f */
    public static final cs4[] f21610f;

    /* JADX INFO: renamed from: a */
    public final int f21611a;

    /* JADX INFO: renamed from: b */
    public final List f21612b;

    /* JADX INFO: renamed from: c */
    public final String f21613c;

    /* JADX INFO: renamed from: d */
    public final List f21614d;

    /* JADX INFO: renamed from: e */
    public final List f21615e;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        f21610f = new cs4[]{null, AbstractC3192a.m15357b(lazyThreadSafetyMode, new g98(14)), null, AbstractC3192a.m15357b(lazyThreadSafetyMode, new g98(15)), AbstractC3192a.m15357b(lazyThreadSafetyMode, new g98(16))};
    }

    public /* synthetic */ ResultTranslationSentence(int i, int i2, List list, String str, List list2, List list3) {
        this.f21611a = (i & 1) == 0 ? 0 : i2;
        int i3 = i & 2;
        EmptyList emptyList = EmptyList.f47638a;
        if (i3 == 0) {
            this.f21612b = emptyList;
        } else {
            this.f21612b = list;
        }
        if ((i & 4) == 0) {
            this.f21613c = "";
        } else {
            this.f21613c = str;
        }
        if ((i & 8) == 0) {
            this.f21614d = emptyList;
        } else {
            this.f21614d = list2;
        }
        if ((i & 16) == 0) {
            this.f21615e = emptyList;
        } else {
            this.f21615e = list3;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ResultTranslationSentence)) {
            return false;
        }
        ResultTranslationSentence resultTranslationSentence = (ResultTranslationSentence) obj;
        return this.f21611a == resultTranslationSentence.f21611a && fa4.m11650l(this.f21612b, resultTranslationSentence.f21612b) && fa4.m11650l(this.f21613c, resultTranslationSentence.f21613c) && fa4.m11650l(this.f21614d, resultTranslationSentence.f21614d) && fa4.m11650l(this.f21615e, resultTranslationSentence.f21615e);
    }

    public final int hashCode() {
        return this.f21615e.hashCode() + ux5.m22979b(ux5.m22980c(ux5.m22979b(Integer.hashCode(this.f21611a) * 31, 31, this.f21612b), this.f21613c, 31), 31, this.f21614d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ResultTranslationSentence(index=");
        sb.append(this.f21611a);
        sb.append(", timestamp=");
        sb.append(this.f21612b);
        sb.append(", text=");
        hn1.m13366p(this.f21613c, ", translations=", ", notes=", sb, this.f21614d);
        return hn1.m13356f(sb, this.f21615e, ")");
    }
}
