package com.lingq.core.network.api.result;

import java.util.List;
import kotlin.AbstractC3192a;
import kotlin.LazyThreadSafetyMode;
import p000.AbstractC3393o1;
import p000.b98;
import p000.cs4;
import p000.ey8;
import p000.fa4;
import p000.g9a;
import p000.hn1;
import p000.n3c;
import p000.ux5;
import p000.wq1;

/* JADX INFO: loaded from: classes.dex */
@ey8
public final class ResultOffer {
    public static final C1792z2 Companion = new C1792z2();

    /* JADX INFO: renamed from: r */
    public static final cs4[] f21358r = {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, AbstractC3192a.m15357b(LazyThreadSafetyMode.PUBLICATION, new b98(0))};

    /* JADX INFO: renamed from: a */
    public final int f21359a;

    /* JADX INFO: renamed from: b */
    public final String f21360b;

    /* JADX INFO: renamed from: c */
    public final String f21361c;

    /* JADX INFO: renamed from: d */
    public final String f21362d;

    /* JADX INFO: renamed from: e */
    public final String f21363e;

    /* JADX INFO: renamed from: f */
    public final ResultOfferDate f21364f;

    /* JADX INFO: renamed from: g */
    public final ResultOfferCoupon f21365g;

    /* JADX INFO: renamed from: h */
    public final Integer f21366h;

    /* JADX INFO: renamed from: i */
    public final String f21367i;

    /* JADX INFO: renamed from: j */
    public final String f21368j;

    /* JADX INFO: renamed from: k */
    public final boolean f21369k;

    /* JADX INFO: renamed from: l */
    public final boolean f21370l;

    /* JADX INFO: renamed from: m */
    public final String f21371m;

    /* JADX INFO: renamed from: n */
    public final ResultOfferUrl f21372n;

    /* JADX INFO: renamed from: o */
    public final ResultOfferAccentColor f21373o;

    /* JADX INFO: renamed from: p */
    public final String f21374p;

    /* JADX INFO: renamed from: q */
    public final List f21375q;

    public /* synthetic */ ResultOffer(int i, int i2, String str, String str2, String str3, String str4, ResultOfferDate resultOfferDate, ResultOfferCoupon resultOfferCoupon, Integer num, String str5, String str6, boolean z, boolean z2, String str7, ResultOfferUrl resultOfferUrl, ResultOfferAccentColor resultOfferAccentColor, String str8, List list) {
        if (90215 != (i & 90215)) {
            n3c.m17204b(i, 90215, ResultOffer$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.f21359a = i2;
        this.f21360b = str;
        this.f21361c = str2;
        if ((i & 8) == 0) {
            this.f21362d = null;
        } else {
            this.f21362d = str3;
        }
        if ((i & 16) == 0) {
            this.f21363e = "Public";
        } else {
            this.f21363e = str4;
        }
        this.f21364f = resultOfferDate;
        this.f21365g = resultOfferCoupon;
        if ((i & 128) == 0) {
            this.f21366h = null;
        } else {
            this.f21366h = num;
        }
        if ((i & 256) == 0) {
            this.f21367i = null;
        } else {
            this.f21367i = str5;
        }
        if ((i & 512) == 0) {
            this.f21368j = null;
        } else {
            this.f21368j = str6;
        }
        if ((i & 1024) == 0) {
            this.f21369k = true;
        } else {
            this.f21369k = z;
        }
        if ((i & 2048) == 0) {
            this.f21370l = true;
        } else {
            this.f21370l = z2;
        }
        if ((i & 4096) == 0) {
            this.f21371m = null;
        } else {
            this.f21371m = str7;
        }
        this.f21372n = resultOfferUrl;
        this.f21373o = resultOfferAccentColor;
        if ((i & 32768) == 0) {
            this.f21374p = null;
        } else {
            this.f21374p = str8;
        }
        this.f21375q = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ResultOffer)) {
            return false;
        }
        ResultOffer resultOffer = (ResultOffer) obj;
        return this.f21359a == resultOffer.f21359a && fa4.m11650l(this.f21360b, resultOffer.f21360b) && fa4.m11650l(this.f21361c, resultOffer.f21361c) && fa4.m11650l(this.f21362d, resultOffer.f21362d) && fa4.m11650l(this.f21363e, resultOffer.f21363e) && fa4.m11650l(this.f21364f, resultOffer.f21364f) && fa4.m11650l(this.f21365g, resultOffer.f21365g) && fa4.m11650l(this.f21366h, resultOffer.f21366h) && fa4.m11650l(this.f21367i, resultOffer.f21367i) && fa4.m11650l(this.f21368j, resultOffer.f21368j) && this.f21369k == resultOffer.f21369k && this.f21370l == resultOffer.f21370l && fa4.m11650l(this.f21371m, resultOffer.f21371m) && fa4.m11650l(this.f21372n, resultOffer.f21372n) && fa4.m11650l(this.f21373o, resultOffer.f21373o) && fa4.m11650l(this.f21374p, resultOffer.f21374p) && fa4.m11650l(this.f21375q, resultOffer.f21375q);
    }

    public final int hashCode() {
        int iM22980c = ux5.m22980c(ux5.m22980c(Integer.hashCode(this.f21359a) * 31, this.f21360b, 31), this.f21361c, 31);
        String str = this.f21362d;
        int iHashCode = (this.f21365g.hashCode() + ((this.f21364f.hashCode() + ux5.m22980c((iM22980c + (str == null ? 0 : str.hashCode())) * 31, this.f21363e, 31)) * 31)) * 31;
        Integer num = this.f21366h;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.f21367i;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f21368j;
        int iM12428e = g9a.m12428e(g9a.m12428e((iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.f21369k), 31, this.f21370l);
        String str4 = this.f21371m;
        int iHashCode4 = (this.f21373o.hashCode() + ((this.f21372n.hashCode() + ((iM12428e + (str4 == null ? 0 : str4.hashCode())) * 31)) * 31)) * 31;
        String str5 = this.f21374p;
        return this.f21375q.hashCode() + ((iHashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sbM22995r = ux5.m22995r(this.f21359a, "ResultOffer(id=", ", title=", this.f21360b, ", code=");
        AbstractC3393o1.m17725C(sbM22995r, this.f21361c, ", type=", this.f21362d, ", visibility=");
        sbM22995r.append(this.f21363e);
        sbM22995r.append(", date=");
        sbM22995r.append(this.f21364f);
        sbM22995r.append(", coupon=");
        sbM22995r.append(this.f21365g);
        sbM22995r.append(", tier=");
        sbM22995r.append(this.f21366h);
        sbM22995r.append(", event=");
        AbstractC3393o1.m17725C(sbM22995r, this.f21367i, ", discount=", this.f21368j, ", countdown=");
        wq1.m24101A(sbM22995r, this.f21369k, ", isActive=", this.f21370l, ", ctaText=");
        sbM22995r.append(this.f21371m);
        sbM22995r.append(", offerCodeUrl=");
        sbM22995r.append(this.f21372n);
        sbM22995r.append(", accentColor=");
        sbM22995r.append(this.f21373o);
        sbM22995r.append(", trialHeader=");
        sbM22995r.append(this.f21374p);
        sbM22995r.append(", banners=");
        return hn1.m13356f(sbM22995r, this.f21375q, ")");
    }
}
