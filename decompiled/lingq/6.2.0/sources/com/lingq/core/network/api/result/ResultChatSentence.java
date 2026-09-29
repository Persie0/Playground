package com.lingq.core.network.api.result;

import java.util.List;
import kotlin.AbstractC3192a;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.EmptyList;
import p000.AbstractC3393o1;
import p000.cs4;
import p000.ey8;
import p000.fa4;
import p000.hn1;
import p000.m78;
import p000.wq1;

/* JADX INFO: loaded from: classes2.dex */
@ey8
public final class ResultChatSentence {
    public static final C1733t0 Companion = new C1733t0();

    /* JADX INFO: renamed from: h */
    public static final cs4[] f20751h;

    /* JADX INFO: renamed from: a */
    public final List f20752a;

    /* JADX INFO: renamed from: b */
    public final String f20753b;

    /* JADX INFO: renamed from: c */
    public final String f20754c;

    /* JADX INFO: renamed from: d */
    public final Integer f20755d;

    /* JADX INFO: renamed from: e */
    public final List f20756e;

    /* JADX INFO: renamed from: f */
    public final String f20757f;

    /* JADX INFO: renamed from: g */
    public final String f20758g;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        f20751h = new cs4[]{AbstractC3192a.m15357b(lazyThreadSafetyMode, new m78(28)), null, null, null, AbstractC3192a.m15357b(lazyThreadSafetyMode, new m78(29)), null, null};
    }

    public /* synthetic */ ResultChatSentence(int i, List list, String str, String str2, Integer num, List list2, String str3, String str4) {
        this.f20752a = (i & 1) == 0 ? EmptyList.f47638a : list;
        if ((i & 2) == 0) {
            this.f20753b = null;
        } else {
            this.f20753b = str;
        }
        if ((i & 4) == 0) {
            this.f20754c = null;
        } else {
            this.f20754c = str2;
        }
        if ((i & 8) == 0) {
            this.f20755d = null;
        } else {
            this.f20755d = num;
        }
        if ((i & 16) == 0) {
            this.f20756e = null;
        } else {
            this.f20756e = list2;
        }
        if ((i & 32) == 0) {
            this.f20757f = null;
        } else {
            this.f20757f = str3;
        }
        if ((i & 64) == 0) {
            this.f20758g = null;
        } else {
            this.f20758g = str4;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ResultChatSentence)) {
            return false;
        }
        ResultChatSentence resultChatSentence = (ResultChatSentence) obj;
        return fa4.m11650l(this.f20752a, resultChatSentence.f20752a) && fa4.m11650l(this.f20753b, resultChatSentence.f20753b) && fa4.m11650l(this.f20754c, resultChatSentence.f20754c) && fa4.m11650l(this.f20755d, resultChatSentence.f20755d) && fa4.m11650l(this.f20756e, resultChatSentence.f20756e) && fa4.m11650l(this.f20757f, resultChatSentence.f20757f) && fa4.m11650l(this.f20758g, resultChatSentence.f20758g);
    }

    public final int hashCode() {
        int iHashCode = this.f20752a.hashCode() * 31;
        String str = this.f20753b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f20754c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.f20755d;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        List list = this.f20756e;
        int iHashCode5 = (iHashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        String str3 = this.f20757f;
        int iHashCode6 = (iHashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f20758g;
        return iHashCode6 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ResultChatSentence(tokens=");
        sb.append(this.f20752a);
        sb.append(", text=");
        sb.append(this.f20753b);
        sb.append(", normalizedText=");
        hn1.m13371u(sb, this.f20754c, ", index=", this.f20755d, ", timestamp=");
        wq1.m24130z(", url=", this.f20757f, ", opentag=", sb, this.f20756e);
        return AbstractC3393o1.m17738m(sb, this.f20758g, ")");
    }
}
