package com.lingq.core.domain.model.token;

import java.util.List;
import kotlin.AbstractC3192a;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.EmptyList;
import p000.cs4;
import p000.ey8;
import p000.fa4;
import p000.hn1;
import p000.ks8;

/* JADX INFO: loaded from: classes2.dex */
@ey8
public final class TokenReadings {
    public static final C1494j Companion = new C1494j();

    /* JADX INFO: renamed from: g */
    public static final cs4[] f19604g;

    /* JADX INFO: renamed from: a */
    public final List f19605a;

    /* JADX INFO: renamed from: b */
    public final List f19606b;

    /* JADX INFO: renamed from: c */
    public final List f19607c;

    /* JADX INFO: renamed from: d */
    public final List f19608d;

    /* JADX INFO: renamed from: e */
    public final List f19609e;

    /* JADX INFO: renamed from: f */
    public final List f19610f;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        f19604g = new cs4[]{AbstractC3192a.m15357b(lazyThreadSafetyMode, new ks8(23)), AbstractC3192a.m15357b(lazyThreadSafetyMode, new ks8(24)), AbstractC3192a.m15357b(lazyThreadSafetyMode, new ks8(25)), AbstractC3192a.m15357b(lazyThreadSafetyMode, new ks8(26)), AbstractC3192a.m15357b(lazyThreadSafetyMode, new ks8(27)), AbstractC3192a.m15357b(lazyThreadSafetyMode, new ks8(28))};
    }

    public /* synthetic */ TokenReadings(int i, List list, List list2, List list3, List list4, List list5, List list6) {
        int i2 = i & 1;
        EmptyList emptyList = EmptyList.f47638a;
        if (i2 == 0) {
            this.f19605a = emptyList;
        } else {
            this.f19605a = list;
        }
        if ((i & 2) == 0) {
            this.f19606b = emptyList;
        } else {
            this.f19606b = list2;
        }
        if ((i & 4) == 0) {
            this.f19607c = emptyList;
        } else {
            this.f19607c = list3;
        }
        if ((i & 8) == 0) {
            this.f19608d = emptyList;
        } else {
            this.f19608d = list4;
        }
        if ((i & 16) == 0) {
            this.f19609e = emptyList;
        } else {
            this.f19609e = list5;
        }
        if ((i & 32) == 0) {
            this.f19610f = emptyList;
        } else {
            this.f19610f = list6;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TokenReadings)) {
            return false;
        }
        TokenReadings tokenReadings = (TokenReadings) obj;
        return fa4.m11650l(this.f19605a, tokenReadings.f19605a) && fa4.m11650l(this.f19606b, tokenReadings.f19606b) && fa4.m11650l(this.f19607c, tokenReadings.f19607c) && fa4.m11650l(this.f19608d, tokenReadings.f19608d) && fa4.m11650l(this.f19609e, tokenReadings.f19609e) && fa4.m11650l(this.f19610f, tokenReadings.f19610f);
    }

    public final int hashCode() {
        List list = this.f19605a;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        List list2 = this.f19606b;
        int iHashCode2 = (iHashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        List list3 = this.f19607c;
        int iHashCode3 = (iHashCode2 + (list3 == null ? 0 : list3.hashCode())) * 31;
        List list4 = this.f19608d;
        int iHashCode4 = (iHashCode3 + (list4 == null ? 0 : list4.hashCode())) * 31;
        List list5 = this.f19609e;
        int iHashCode5 = (iHashCode4 + (list5 == null ? 0 : list5.hashCode())) * 31;
        List list6 = this.f19610f;
        return iHashCode5 + (list6 != null ? list6.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TokenReadings(romaji=");
        sb.append(this.f19605a);
        sb.append(", hiragana=");
        sb.append(this.f19606b);
        sb.append(", pinyin=");
        hn1.m13372v(sb, this.f19607c, ", hant=", this.f19608d, ", hans=");
        sb.append(this.f19609e);
        sb.append(", jyutping=");
        sb.append(this.f19610f);
        sb.append(")");
        return sb.toString();
    }

    public TokenReadings(List list, List list2, List list3, List list4, List list5, List list6) {
        this.f19605a = list;
        this.f19606b = list2;
        this.f19607c = list3;
        this.f19608d = list4;
        this.f19609e = list5;
        this.f19610f = list6;
    }
}
