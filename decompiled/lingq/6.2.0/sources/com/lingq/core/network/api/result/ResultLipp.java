package com.lingq.core.network.api.result;

import java.util.List;
import kotlin.AbstractC3192a;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.EmptyList;
import p000.AbstractC3393o1;
import p000.cs4;
import p000.ey8;
import p000.fa4;
import p000.g9a;
import p000.ux5;
import p000.x88;

/* JADX INFO: loaded from: classes2.dex */
@ey8
public final class ResultLipp {
    public static final C1711p2 Companion = new C1711p2();

    /* JADX INFO: renamed from: f */
    public static final cs4[] f21308f;

    /* JADX INFO: renamed from: a */
    public final String f21309a;

    /* JADX INFO: renamed from: b */
    public final List f21310b;

    /* JADX INFO: renamed from: c */
    public final List f21311c;

    /* JADX INFO: renamed from: d */
    public final boolean f21312d;

    /* JADX INFO: renamed from: e */
    public final String f21313e;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        f21308f = new cs4[]{null, AbstractC3192a.m15357b(lazyThreadSafetyMode, new x88(21)), AbstractC3192a.m15357b(lazyThreadSafetyMode, new x88(22)), null, null};
    }

    public /* synthetic */ ResultLipp(int i, String str, List list, List list2, boolean z, String str2) {
        if ((i & 1) == 0) {
            this.f21309a = null;
        } else {
            this.f21309a = str;
        }
        int i2 = i & 2;
        EmptyList emptyList = EmptyList.f47638a;
        if (i2 == 0) {
            this.f21310b = emptyList;
        } else {
            this.f21310b = list;
        }
        if ((i & 4) == 0) {
            this.f21311c = emptyList;
        } else {
            this.f21311c = list2;
        }
        if ((i & 8) == 0) {
            this.f21312d = false;
        } else {
            this.f21312d = z;
        }
        if ((i & 16) == 0) {
            this.f21313e = null;
        } else {
            this.f21313e = str2;
        }
    }

    /* JADX INFO: renamed from: a */
    public final String m8369a() {
        return this.f21309a;
    }

    /* JADX INFO: renamed from: b */
    public final List m8370b() {
        return this.f21310b;
    }

    /* JADX INFO: renamed from: c */
    public final List m8371c() {
        return this.f21311c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ResultLipp)) {
            return false;
        }
        ResultLipp resultLipp = (ResultLipp) obj;
        return fa4.m11650l(this.f21309a, resultLipp.f21309a) && fa4.m11650l(this.f21310b, resultLipp.f21310b) && fa4.m11650l(this.f21311c, resultLipp.f21311c) && this.f21312d == resultLipp.f21312d && fa4.m11650l(this.f21313e, resultLipp.f21313e);
    }

    public final int hashCode() {
        String str = this.f21309a;
        int iM12428e = g9a.m12428e(ux5.m22979b(ux5.m22979b((str == null ? 0 : str.hashCode()) * 31, 31, this.f21310b), 31, this.f21311c), 31, this.f21312d);
        String str2 = this.f21313e;
        return iM12428e + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ResultLipp(language=");
        sb.append(this.f21309a);
        sb.append(", paragraphs=");
        sb.append(this.f21310b);
        sb.append(", sentenceTranslations=");
        sb.append(this.f21311c);
        sb.append(", success=");
        sb.append(this.f21312d);
        sb.append(", error=");
        return AbstractC3393o1.m17738m(sb, this.f21313e, ")");
    }
}
