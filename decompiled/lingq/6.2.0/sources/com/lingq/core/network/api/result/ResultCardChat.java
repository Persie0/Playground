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
import p000.ux5;
import p000.wq1;

/* JADX INFO: loaded from: classes2.dex */
@ey8
public final class ResultCardChat {
    public static final C1750w Companion = new C1750w();

    /* JADX INFO: renamed from: p */
    public static final cs4[] f20636p;

    /* JADX INFO: renamed from: a */
    public final String f20637a;

    /* JADX INFO: renamed from: b */
    public final int f20638b;

    /* JADX INFO: renamed from: c */
    public final String f20639c;

    /* JADX INFO: renamed from: d */
    public final String f20640d;

    /* JADX INFO: renamed from: e */
    public final int f20641e;

    /* JADX INFO: renamed from: f */
    public final Integer f20642f;

    /* JADX INFO: renamed from: g */
    public final String f20643g;

    /* JADX INFO: renamed from: h */
    public final String f20644h;

    /* JADX INFO: renamed from: i */
    public final String f20645i;

    /* JADX INFO: renamed from: j */
    public final String f20646j;

    /* JADX INFO: renamed from: k */
    public final int f20647k;

    /* JADX INFO: renamed from: l */
    public final List f20648l;

    /* JADX INFO: renamed from: m */
    public final List f20649m;

    /* JADX INFO: renamed from: n */
    public final List f20650n;

    /* JADX INFO: renamed from: o */
    public final List f20651o;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        f20636p = new cs4[]{null, null, null, null, null, null, null, null, null, null, null, AbstractC3192a.m15357b(lazyThreadSafetyMode, new m78(17)), AbstractC3192a.m15357b(lazyThreadSafetyMode, new m78(18)), AbstractC3192a.m15357b(lazyThreadSafetyMode, new m78(19)), AbstractC3192a.m15357b(lazyThreadSafetyMode, new m78(20))};
    }

    public /* synthetic */ ResultCardChat(int i, String str, int i2, String str2, String str3, int i3, Integer num, String str4, String str5, String str6, String str7, int i4, List list, List list2, List list3, List list4) {
        this.f20637a = (i & 1) == 0 ? "" : str;
        if ((i & 2) == 0) {
            this.f20638b = 0;
        } else {
            this.f20638b = i2;
        }
        if ((i & 4) == 0) {
            this.f20639c = null;
        } else {
            this.f20639c = str2;
        }
        if ((i & 8) == 0) {
            this.f20640d = null;
        } else {
            this.f20640d = str3;
        }
        if ((i & 16) == 0) {
            this.f20641e = 0;
        } else {
            this.f20641e = i3;
        }
        if ((i & 32) == 0) {
            this.f20642f = null;
        } else {
            this.f20642f = num;
        }
        if ((i & 64) == 0) {
            this.f20643g = null;
        } else {
            this.f20643g = str4;
        }
        if ((i & 128) == 0) {
            this.f20644h = null;
        } else {
            this.f20644h = str5;
        }
        if ((i & 256) == 0) {
            this.f20645i = null;
        } else {
            this.f20645i = str6;
        }
        if ((i & 512) == 0) {
            this.f20646j = null;
        } else {
            this.f20646j = str7;
        }
        if ((i & 1024) == 0) {
            this.f20647k = 0;
        } else {
            this.f20647k = i4;
        }
        int i5 = i & 2048;
        EmptyList emptyList = EmptyList.f47638a;
        if (i5 == 0) {
            this.f20648l = emptyList;
        } else {
            this.f20648l = list;
        }
        if ((i & 4096) == 0) {
            this.f20649m = emptyList;
        } else {
            this.f20649m = list2;
        }
        if ((i & 8192) == 0) {
            this.f20650n = emptyList;
        } else {
            this.f20650n = list3;
        }
        if ((i & 16384) == 0) {
            this.f20651o = emptyList;
        } else {
            this.f20651o = list4;
        }
    }

    /* JADX INFO: renamed from: a */
    public final String m8330a() {
        return this.f20637a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ResultCardChat)) {
            return false;
        }
        ResultCardChat resultCardChat = (ResultCardChat) obj;
        return fa4.m11650l(this.f20637a, resultCardChat.f20637a) && this.f20638b == resultCardChat.f20638b && fa4.m11650l(this.f20639c, resultCardChat.f20639c) && fa4.m11650l(this.f20640d, resultCardChat.f20640d) && this.f20641e == resultCardChat.f20641e && fa4.m11650l(this.f20642f, resultCardChat.f20642f) && fa4.m11650l(this.f20643g, resultCardChat.f20643g) && fa4.m11650l(this.f20644h, resultCardChat.f20644h) && fa4.m11650l(this.f20645i, resultCardChat.f20645i) && fa4.m11650l(this.f20646j, resultCardChat.f20646j) && this.f20647k == resultCardChat.f20647k && fa4.m11650l(this.f20648l, resultCardChat.f20648l) && fa4.m11650l(this.f20649m, resultCardChat.f20649m) && fa4.m11650l(this.f20650n, resultCardChat.f20650n) && fa4.m11650l(this.f20651o, resultCardChat.f20651o);
    }

    public final int hashCode() {
        int iM24106b = wq1.m24106b(this.f20638b, this.f20637a.hashCode() * 31, 31);
        String str = this.f20639c;
        int iHashCode = (iM24106b + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f20640d;
        int iM24106b2 = wq1.m24106b(this.f20641e, (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31);
        Integer num = this.f20642f;
        int iHashCode2 = (iM24106b2 + (num == null ? 0 : num.hashCode())) * 31;
        String str3 = this.f20643g;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f20644h;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f20645i;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f20646j;
        return this.f20651o.hashCode() + ux5.m22979b(ux5.m22979b(ux5.m22979b(wq1.m24106b(this.f20647k, (iHashCode5 + (str6 != null ? str6.hashCode() : 0)) * 31, 31), 31, this.f20648l), 31, this.f20649m), 31, this.f20650n);
    }

    public final String toString() {
        StringBuilder sbM17741p = AbstractC3393o1.m17741p(this.f20638b, "ResultCardChat(term=", this.f20637a, ", id=", ", url=");
        AbstractC3393o1.m17725C(sbM17741p, this.f20639c, ", fragment=", this.f20640d, ", status=");
        sbM17741p.append(this.f20641e);
        sbM17741p.append(", extendedStatus=");
        sbM17741p.append(this.f20642f);
        sbM17741p.append(", lastReviewedCorrect=");
        AbstractC3393o1.m17725C(sbM17741p, this.f20643g, ", srsDueDate=", this.f20644h, ", notes=");
        AbstractC3393o1.m17725C(sbM17741p, this.f20645i, ", audio=", this.f20646j, ", importance=");
        sbM17741p.append(this.f20647k);
        sbM17741p.append(", meanings=");
        sbM17741p.append(this.f20648l);
        sbM17741p.append(", tags=");
        hn1.m13372v(sbM17741p, this.f20649m, ", gTags=", this.f20650n, ", words=");
        return hn1.m13356f(sbM17741p, this.f20651o, ")");
    }

    public ResultCardChat(String str, int i, String str2, String str3, int i2, Integer num, String str4, String str5, String str6, String str7, int i3, List list, List list2, List list3, List list4) {
        str.getClass();
        list.getClass();
        list2.getClass();
        list3.getClass();
        list4.getClass();
        this.f20637a = str;
        this.f20638b = i;
        this.f20639c = str2;
        this.f20640d = str3;
        this.f20641e = i2;
        this.f20642f = num;
        this.f20643g = str4;
        this.f20644h = str5;
        this.f20645i = str6;
        this.f20646j = str7;
        this.f20647k = i3;
        this.f20648l = list;
        this.f20649m = list2;
        this.f20650n = list3;
        this.f20651o = list4;
    }
}
