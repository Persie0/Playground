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
import p000.m78;
import p000.ux5;

/* JADX INFO: loaded from: classes2.dex */
@ey8
public final class ResultChatHistorySimple {
    public static final C1685l0 Companion = new C1685l0();

    /* JADX INFO: renamed from: f */
    public static final cs4[] f20715f = {null, null, null, null, AbstractC3192a.m15357b(LazyThreadSafetyMode.PUBLICATION, new m78(24))};

    /* JADX INFO: renamed from: a */
    public final int f20716a;

    /* JADX INFO: renamed from: b */
    public final double f20717b;

    /* JADX INFO: renamed from: c */
    public final String f20718c;

    /* JADX INFO: renamed from: d */
    public final String f20719d;

    /* JADX INFO: renamed from: e */
    public final List f20720e;

    public /* synthetic */ ResultChatHistorySimple(int i, int i2, double d, String str, String str2, List list) {
        this.f20716a = (i & 1) == 0 ? 0 : i2;
        if ((i & 2) == 0) {
            this.f20717b = 0.0d;
        } else {
            this.f20717b = d;
        }
        if ((i & 4) == 0) {
            this.f20718c = "";
        } else {
            this.f20718c = str;
        }
        if ((i & 8) == 0) {
            this.f20719d = "";
        } else {
            this.f20719d = str2;
        }
        if ((i & 16) == 0) {
            this.f20720e = EmptyList.f47638a;
        } else {
            this.f20720e = list;
        }
    }

    /* JADX INFO: renamed from: a */
    public final int m8343a() {
        return this.f20716a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ResultChatHistorySimple)) {
            return false;
        }
        ResultChatHistorySimple resultChatHistorySimple = (ResultChatHistorySimple) obj;
        return this.f20716a == resultChatHistorySimple.f20716a && Double.compare(this.f20717b, resultChatHistorySimple.f20717b) == 0 && fa4.m11650l(this.f20718c, resultChatHistorySimple.f20718c) && fa4.m11650l(this.f20719d, resultChatHistorySimple.f20719d) && fa4.m11650l(this.f20720e, resultChatHistorySimple.f20720e);
    }

    public final int hashCode() {
        return this.f20720e.hashCode() + ux5.m22980c(ux5.m22980c(g9a.m12424a(this.f20717b, Integer.hashCode(this.f20716a) * 31, 31), this.f20718c, 31), this.f20719d, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ResultChatHistorySimple(id=");
        sb.append(this.f20716a);
        sb.append(", coins=");
        sb.append(this.f20717b);
        AbstractC3393o1.m17725C(sb, ", targetLanguage=", this.f20718c, ", dictionaryLanguage=", this.f20719d);
        sb.append(", history=");
        sb.append(this.f20720e);
        sb.append(")");
        return sb.toString();
    }
}
