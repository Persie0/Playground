package com.lingq.core.network.api.result;

import java.util.List;
import kotlin.AbstractC3192a;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.EmptyList;
import p000.b98;
import p000.cs4;
import p000.ey8;
import p000.fa4;
import p000.g9a;
import p000.n3c;
import p000.ux5;
import p000.wq1;

/* JADX INFO: loaded from: classes.dex */
@ey8
public final class ResultTtsVoice {
    public static final C1743u4 Companion = new C1743u4();

    /* JADX INFO: renamed from: k */
    public static final cs4[] f21650k;

    /* JADX INFO: renamed from: a */
    public final String f21651a;

    /* JADX INFO: renamed from: b */
    public final String f21652b;

    /* JADX INFO: renamed from: c */
    public final List f21653c;

    /* JADX INFO: renamed from: d */
    public final Boolean f21654d;

    /* JADX INFO: renamed from: e */
    public final boolean f21655e;

    /* JADX INFO: renamed from: f */
    public final boolean f21656f;

    /* JADX INFO: renamed from: g */
    public final List f21657g;

    /* JADX INFO: renamed from: h */
    public final String f21658h;

    /* JADX INFO: renamed from: i */
    public final boolean f21659i;

    /* JADX INFO: renamed from: j */
    public final List f21660j;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        f21650k = new cs4[]{null, null, AbstractC3192a.m15357b(lazyThreadSafetyMode, new b98(8)), null, null, null, AbstractC3192a.m15357b(lazyThreadSafetyMode, new b98(9)), null, null, AbstractC3192a.m15357b(lazyThreadSafetyMode, new b98(10))};
    }

    public /* synthetic */ ResultTtsVoice(int i, Boolean bool, String str, String str2, String str3, List list, List list2, List list3, boolean z, boolean z2, boolean z3) {
        if (7 != (i & 7)) {
            n3c.m17204b(i, 7, ResultTtsVoice$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.f21651a = str;
        this.f21652b = str2;
        this.f21653c = list;
        if ((i & 8) == 0) {
            this.f21654d = null;
        } else {
            this.f21654d = bool;
        }
        if ((i & 16) == 0) {
            this.f21655e = false;
        } else {
            this.f21655e = z;
        }
        if ((i & 32) == 0) {
            this.f21656f = false;
        } else {
            this.f21656f = z2;
        }
        int i2 = i & 64;
        EmptyList emptyList = EmptyList.f47638a;
        if (i2 == 0) {
            this.f21657g = emptyList;
        } else {
            this.f21657g = list2;
        }
        if ((i & 128) == 0) {
            this.f21658h = null;
        } else {
            this.f21658h = str3;
        }
        if ((i & 256) == 0) {
            this.f21659i = false;
        } else {
            this.f21659i = z3;
        }
        if ((i & 512) == 0) {
            this.f21660j = emptyList;
        } else {
            this.f21660j = list3;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ResultTtsVoice)) {
            return false;
        }
        ResultTtsVoice resultTtsVoice = (ResultTtsVoice) obj;
        return fa4.m11650l(this.f21651a, resultTtsVoice.f21651a) && fa4.m11650l(this.f21652b, resultTtsVoice.f21652b) && fa4.m11650l(this.f21653c, resultTtsVoice.f21653c) && fa4.m11650l(this.f21654d, resultTtsVoice.f21654d) && this.f21655e == resultTtsVoice.f21655e && this.f21656f == resultTtsVoice.f21656f && fa4.m11650l(this.f21657g, resultTtsVoice.f21657g) && fa4.m11650l(this.f21658h, resultTtsVoice.f21658h) && this.f21659i == resultTtsVoice.f21659i && fa4.m11650l(this.f21660j, resultTtsVoice.f21660j);
    }

    public final int hashCode() {
        int iM22979b = ux5.m22979b(ux5.m22980c(this.f21651a.hashCode() * 31, this.f21652b, 31), 31, this.f21653c);
        Boolean bool = this.f21654d;
        int iM22979b2 = ux5.m22979b(g9a.m12428e(g9a.m12428e((iM22979b + (bool == null ? 0 : bool.hashCode())) * 31, 31, this.f21655e), 31, this.f21656f), 31, this.f21657g);
        String str = this.f21658h;
        return this.f21660j.hashCode() + g9a.m12428e((iM22979b2 + (str != null ? str.hashCode() : 0)) * 31, 31, this.f21659i);
    }

    public final String toString() {
        StringBuilder sbM23000w = ux5.m23000w("ResultTtsVoice(name=", this.f21651a, ", title=", this.f21652b, ", voicesByApp=");
        sbM23000w.append(this.f21653c);
        sbM23000w.append(", alternative=");
        sbM23000w.append(this.f21654d);
        sbM23000w.append(", isPremium=");
        wq1.m24101A(sbM23000w, this.f21655e, ", freeTrial=", this.f21656f, ", priority=");
        wq1.m24130z(", accentCode=", this.f21658h, ", isSelectable=", sbM23000w, this.f21657g);
        sbM23000w.append(this.f21659i);
        sbM23000w.append(", tags=");
        sbM23000w.append(this.f21660j);
        sbM23000w.append(")");
        return sbM23000w.toString();
    }
}
