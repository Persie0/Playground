package com.lingq.core.network.api.result;

import com.lingq.core.domain.model.library.LibraryItemType;
import java.util.List;
import kotlin.AbstractC3192a;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.EmptyList;
import p000.AbstractC3393o1;
import p000.cs4;
import p000.ey8;
import p000.fa4;
import p000.g9a;
import p000.hn1;
import p000.ux5;
import p000.wq1;
import p000.x88;

/* JADX INFO: loaded from: classes2.dex */
@ey8
public final class ResultCourse {
    public static final C1616a1 Companion = new C1616a1();

    /* JADX INFO: renamed from: G */
    public static final cs4[] f20784G = {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, AbstractC3192a.m15357b(LazyThreadSafetyMode.PUBLICATION, new x88(0)), null, null, null};

    /* JADX INFO: renamed from: A */
    public final boolean f20785A;

    /* JADX INFO: renamed from: B */
    public final String f20786B;

    /* JADX INFO: renamed from: C */
    public final List f20787C;

    /* JADX INFO: renamed from: D */
    public final String f20788D;

    /* JADX INFO: renamed from: E */
    public final Integer f20789E;

    /* JADX INFO: renamed from: F */
    public final String f20790F;

    /* JADX INFO: renamed from: a */
    public final int f20791a;

    /* JADX INFO: renamed from: b */
    public final String f20792b;

    /* JADX INFO: renamed from: c */
    public final String f20793c;

    /* JADX INFO: renamed from: d */
    public final String f20794d;

    /* JADX INFO: renamed from: e */
    public final int f20795e;

    /* JADX INFO: renamed from: f */
    public final String f20796f;

    /* JADX INFO: renamed from: g */
    public final String f20797g;

    /* JADX INFO: renamed from: h */
    public final Integer f20798h;

    /* JADX INFO: renamed from: i */
    public final String f20799i;

    /* JADX INFO: renamed from: j */
    public final String f20800j;

    /* JADX INFO: renamed from: k */
    public final String f20801k;

    /* JADX INFO: renamed from: l */
    public final String f20802l;

    /* JADX INFO: renamed from: m */
    public final String f20803m;

    /* JADX INFO: renamed from: n */
    public final String f20804n;

    /* JADX INFO: renamed from: o */
    public final String f20805o;

    /* JADX INFO: renamed from: p */
    public final String f20806p;

    /* JADX INFO: renamed from: q */
    public final String f20807q;

    /* JADX INFO: renamed from: r */
    public final int f20808r;

    /* JADX INFO: renamed from: s */
    public final int f20809s;

    /* JADX INFO: renamed from: t */
    public final String f20810t;

    /* JADX INFO: renamed from: u */
    public final int f20811u;

    /* JADX INFO: renamed from: v */
    public final int f20812v;

    /* JADX INFO: renamed from: w */
    public final int f20813w;

    /* JADX INFO: renamed from: x */
    public final double f20814x;

    /* JADX INFO: renamed from: y */
    public final Float f20815y;

    /* JADX INFO: renamed from: z */
    public final boolean f20816z;

    public /* synthetic */ ResultCourse(int i, int i2, String str, String str2, String str3, int i3, String str4, String str5, Integer num, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, int i4, int i5, String str15, int i6, int i7, int i8, double d, Float f, boolean z, boolean z2, String str16, List list, String str17, Integer num2, String str18) {
        if ((i & 1) == 0) {
            this.f20791a = 0;
        } else {
            this.f20791a = i2;
        }
        if ((i & 2) == 0) {
            this.f20792b = LibraryItemType.Collection.getValue();
        } else {
            this.f20792b = str;
        }
        if ((i & 4) == 0) {
            this.f20793c = null;
        } else {
            this.f20793c = str2;
        }
        if ((i & 8) == 0) {
            this.f20794d = null;
        } else {
            this.f20794d = str3;
        }
        if ((i & 16) == 0) {
            this.f20795e = 0;
        } else {
            this.f20795e = i3;
        }
        if ((i & 32) == 0) {
            this.f20796f = null;
        } else {
            this.f20796f = str4;
        }
        if ((i & 64) == 0) {
            this.f20797g = null;
        } else {
            this.f20797g = str5;
        }
        if ((i & 128) == 0) {
            this.f20798h = 0;
        } else {
            this.f20798h = num;
        }
        if ((i & 256) == 0) {
            this.f20799i = null;
        } else {
            this.f20799i = str6;
        }
        if ((i & 512) == 0) {
            this.f20800j = null;
        } else {
            this.f20800j = str7;
        }
        if ((i & 1024) == 0) {
            this.f20801k = null;
        } else {
            this.f20801k = str8;
        }
        if ((i & 2048) == 0) {
            this.f20802l = null;
        } else {
            this.f20802l = str9;
        }
        if ((i & 4096) == 0) {
            this.f20803m = null;
        } else {
            this.f20803m = str10;
        }
        if ((i & 8192) == 0) {
            this.f20804n = null;
        } else {
            this.f20804n = str11;
        }
        if ((i & 16384) == 0) {
            this.f20805o = null;
        } else {
            this.f20805o = str12;
        }
        if ((32768 & i) == 0) {
            this.f20806p = null;
        } else {
            this.f20806p = str13;
        }
        if ((65536 & i) == 0) {
            this.f20807q = null;
        } else {
            this.f20807q = str14;
        }
        if ((131072 & i) == 0) {
            this.f20808r = 0;
        } else {
            this.f20808r = i4;
        }
        if ((262144 & i) == 0) {
            this.f20809s = 0;
        } else {
            this.f20809s = i5;
        }
        if ((524288 & i) == 0) {
            this.f20810t = null;
        } else {
            this.f20810t = str15;
        }
        if ((1048576 & i) == 0) {
            this.f20811u = 0;
        } else {
            this.f20811u = i6;
        }
        if ((2097152 & i) == 0) {
            this.f20812v = 0;
        } else {
            this.f20812v = i7;
        }
        if ((4194304 & i) == 0) {
            this.f20813w = 0;
        } else {
            this.f20813w = i8;
        }
        this.f20814x = (8388608 & i) == 0 ? 0.0d : d;
        if ((16777216 & i) == 0) {
            this.f20815y = null;
        } else {
            this.f20815y = f;
        }
        if ((33554432 & i) == 0) {
            this.f20816z = false;
        } else {
            this.f20816z = z;
        }
        if ((67108864 & i) == 0) {
            this.f20785A = false;
        } else {
            this.f20785A = z2;
        }
        this.f20786B = (134217728 & i) == 0 ? "" : str16;
        this.f20787C = (268435456 & i) == 0 ? EmptyList.f47638a : list;
        if ((536870912 & i) == 0) {
            this.f20788D = null;
        } else {
            this.f20788D = str17;
        }
        if ((1073741824 & i) == 0) {
            this.f20789E = null;
        } else {
            this.f20789E = num2;
        }
        if ((i & Integer.MIN_VALUE) == 0) {
            this.f20790F = null;
        } else {
            this.f20790F = str18;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ResultCourse)) {
            return false;
        }
        ResultCourse resultCourse = (ResultCourse) obj;
        return this.f20791a == resultCourse.f20791a && fa4.m11650l(this.f20792b, resultCourse.f20792b) && fa4.m11650l(this.f20793c, resultCourse.f20793c) && fa4.m11650l(this.f20794d, resultCourse.f20794d) && this.f20795e == resultCourse.f20795e && fa4.m11650l(this.f20796f, resultCourse.f20796f) && fa4.m11650l(this.f20797g, resultCourse.f20797g) && fa4.m11650l(this.f20798h, resultCourse.f20798h) && fa4.m11650l(this.f20799i, resultCourse.f20799i) && fa4.m11650l(this.f20800j, resultCourse.f20800j) && fa4.m11650l(this.f20801k, resultCourse.f20801k) && fa4.m11650l(this.f20802l, resultCourse.f20802l) && fa4.m11650l(this.f20803m, resultCourse.f20803m) && fa4.m11650l(this.f20804n, resultCourse.f20804n) && fa4.m11650l(this.f20805o, resultCourse.f20805o) && fa4.m11650l(this.f20806p, resultCourse.f20806p) && fa4.m11650l(this.f20807q, resultCourse.f20807q) && this.f20808r == resultCourse.f20808r && this.f20809s == resultCourse.f20809s && fa4.m11650l(this.f20810t, resultCourse.f20810t) && this.f20811u == resultCourse.f20811u && this.f20812v == resultCourse.f20812v && this.f20813w == resultCourse.f20813w && Double.compare(this.f20814x, resultCourse.f20814x) == 0 && fa4.m11650l(this.f20815y, resultCourse.f20815y) && this.f20816z == resultCourse.f20816z && this.f20785A == resultCourse.f20785A && fa4.m11650l(this.f20786B, resultCourse.f20786B) && fa4.m11650l(this.f20787C, resultCourse.f20787C) && fa4.m11650l(this.f20788D, resultCourse.f20788D) && fa4.m11650l(this.f20789E, resultCourse.f20789E) && fa4.m11650l(this.f20790F, resultCourse.f20790F);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f20791a) * 31;
        String str = this.f20792b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f20793c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f20794d;
        int iM24106b = wq1.m24106b(this.f20795e, (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31, 31);
        String str4 = this.f20796f;
        int iHashCode4 = (iM24106b + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f20797g;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Integer num = this.f20798h;
        int iHashCode6 = (iHashCode5 + (num == null ? 0 : num.hashCode())) * 31;
        String str6 = this.f20799i;
        int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.f20800j;
        int iHashCode8 = (iHashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.f20801k;
        int iHashCode9 = (iHashCode8 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.f20802l;
        int iHashCode10 = (iHashCode9 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.f20803m;
        int iHashCode11 = (iHashCode10 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.f20804n;
        int iHashCode12 = (iHashCode11 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.f20805o;
        int iHashCode13 = (iHashCode12 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.f20806p;
        int iHashCode14 = (iHashCode13 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.f20807q;
        int iM24106b2 = wq1.m24106b(this.f20809s, wq1.m24106b(this.f20808r, (iHashCode14 + (str14 == null ? 0 : str14.hashCode())) * 31, 31), 31);
        String str15 = this.f20810t;
        int iM12424a = g9a.m12424a(this.f20814x, wq1.m24106b(this.f20813w, wq1.m24106b(this.f20812v, wq1.m24106b(this.f20811u, (iM24106b2 + (str15 == null ? 0 : str15.hashCode())) * 31, 31), 31), 31), 31);
        Float f = this.f20815y;
        int iM22979b = ux5.m22979b(ux5.m22980c(g9a.m12428e(g9a.m12428e((iM12424a + (f == null ? 0 : f.hashCode())) * 31, 31, this.f20816z), 31, this.f20785A), this.f20786B, 31), 31, this.f20787C);
        String str16 = this.f20788D;
        int iHashCode15 = (iM22979b + (str16 == null ? 0 : str16.hashCode())) * 31;
        Integer num2 = this.f20789E;
        int iHashCode16 = (iHashCode15 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str17 = this.f20790F;
        return iHashCode16 + (str17 != null ? str17.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbM22995r = ux5.m22995r(this.f20791a, "ResultCourse(pk=", ", type=", this.f20792b, ", title=");
        AbstractC3393o1.m17725C(sbM22995r, this.f20793c, ", description=", this.f20794d, ", pos=");
        hn1.m13361k(this.f20795e, ", url=", this.f20796f, ", imageUrl=", sbM22995r);
        hn1.m13371u(sbM22995r, this.f20797g, ", providerId=", this.f20798h, ", providerName=");
        AbstractC3393o1.m17725C(sbM22995r, this.f20799i, ", providerDescription=", this.f20800j, ", originalImageUrl=");
        AbstractC3393o1.m17725C(sbM22995r, this.f20801k, ", providerImageUrl=", this.f20802l, ", sharedById=");
        AbstractC3393o1.m17725C(sbM22995r, this.f20803m, ", sharedByName=", this.f20804n, ", sharedByImageUrl=");
        AbstractC3393o1.m17725C(sbM22995r, this.f20805o, ", sharedByRole=", this.f20806p, ", level=");
        AbstractC3393o1.m17748w(this.f20808r, this.f20807q, ", newWordsCount=", ", lessonsCount=", sbM22995r);
        hn1.m13361k(this.f20809s, ", owner=", this.f20810t, ", price=", sbM22995r);
        hn1.m13360j(this.f20811u, this.f20812v, ", cardsCount=", ", rosesCount=", sbM22995r);
        sbM22995r.append(this.f20813w);
        sbM22995r.append(", difficulty=");
        sbM22995r.append(this.f20814x);
        sbM22995r.append(", progress=");
        sbM22995r.append(this.f20815y);
        sbM22995r.append(", isAvailable=");
        sbM22995r.append(this.f20816z);
        sbM22995r.append(", myCourse=");
        sbM22995r.append(this.f20785A);
        sbM22995r.append(", ofQuery=");
        sbM22995r.append(this.f20786B);
        sbM22995r.append(", lessons=");
        sbM22995r.append(this.f20787C);
        sbM22995r.append(", tags=");
        sbM22995r.append(this.f20788D);
        sbM22995r.append(", duration=");
        sbM22995r.append(this.f20789E);
        sbM22995r.append(", status=");
        sbM22995r.append(this.f20790F);
        sbM22995r.append(")");
        return sbM22995r.toString();
    }
}
