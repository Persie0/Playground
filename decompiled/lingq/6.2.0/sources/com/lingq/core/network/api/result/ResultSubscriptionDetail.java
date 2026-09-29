package com.lingq.core.network.api.result;

import com.lingq.core.domain.model.user.AccountTier;
import com.lingq.core.domain.model.user.AndroidDetails;
import com.lingq.core.domain.model.user.AppleDetails;
import com.lingq.core.domain.model.user.FreeTrialDetails;
import com.lingq.core.domain.model.user.Invoice;
import com.lingq.core.domain.model.user.Tier;
import kotlin.AbstractC3192a;
import kotlin.LazyThreadSafetyMode;
import p000.AbstractC3393o1;
import p000.b98;
import p000.cs4;
import p000.e65;
import p000.ey8;
import p000.fa4;

/* JADX INFO: loaded from: classes.dex */
@ey8
public final class ResultSubscriptionDetail {
    public static final C1633c4 Companion = new C1633c4();

    /* JADX INFO: renamed from: w */
    public static final cs4[] f21543w;

    /* JADX INFO: renamed from: a */
    public final Tier f21544a;

    /* JADX INFO: renamed from: b */
    public final String f21545b;

    /* JADX INFO: renamed from: c */
    public final String f21546c;

    /* JADX INFO: renamed from: d */
    public final String f21547d;

    /* JADX INFO: renamed from: e */
    public final String f21548e;

    /* JADX INFO: renamed from: f */
    public final String f21549f;

    /* JADX INFO: renamed from: g */
    public final Boolean f21550g;

    /* JADX INFO: renamed from: h */
    public final String f21551h;

    /* JADX INFO: renamed from: i */
    public final Invoice f21552i;

    /* JADX INFO: renamed from: j */
    public final FreeTrialDetails f21553j;

    /* JADX INFO: renamed from: k */
    public final AppleDetails f21554k;

    /* JADX INFO: renamed from: l */
    public final AndroidDetails f21555l;

    /* JADX INFO: renamed from: m */
    public final Boolean f21556m;

    /* JADX INFO: renamed from: n */
    public final Boolean f21557n;

    /* JADX INFO: renamed from: o */
    public final Boolean f21558o;

    /* JADX INFO: renamed from: p */
    public final Boolean f21559p;

    /* JADX INFO: renamed from: q */
    public final Boolean f21560q;

    /* JADX INFO: renamed from: r */
    public final AccountTier f21561r;

    /* JADX INFO: renamed from: s */
    public final Integer f21562s;

    /* JADX INFO: renamed from: t */
    public final Integer f21563t;

    /* JADX INFO: renamed from: u */
    public final Boolean f21564u;

    /* JADX INFO: renamed from: v */
    public final Boolean f21565v;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        f21543w = new cs4[]{AbstractC3192a.m15357b(lazyThreadSafetyMode, new b98(3)), null, null, null, null, null, null, null, AbstractC3192a.m15357b(lazyThreadSafetyMode, new b98(4)), AbstractC3192a.m15357b(lazyThreadSafetyMode, new b98(5)), AbstractC3192a.m15357b(lazyThreadSafetyMode, new b98(6)), AbstractC3192a.m15357b(lazyThreadSafetyMode, new b98(7)), null, null, null, null, null, null, null, null, null, null};
    }

    public /* synthetic */ ResultSubscriptionDetail(int i, AccountTier accountTier, AndroidDetails androidDetails, AppleDetails appleDetails, FreeTrialDetails freeTrialDetails, Invoice invoice, Tier tier, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, Boolean bool7, Boolean bool8, Integer num, Integer num2, String str, String str2, String str3, String str4, String str5, String str6) {
        if ((i & 1) == 0) {
            this.f21544a = null;
        } else {
            this.f21544a = tier;
        }
        if ((i & 2) == 0) {
            this.f21545b = null;
        } else {
            this.f21545b = str;
        }
        if ((i & 4) == 0) {
            this.f21546c = null;
        } else {
            this.f21546c = str2;
        }
        if ((i & 8) == 0) {
            this.f21547d = null;
        } else {
            this.f21547d = str3;
        }
        if ((i & 16) == 0) {
            this.f21548e = null;
        } else {
            this.f21548e = str4;
        }
        if ((i & 32) == 0) {
            this.f21549f = null;
        } else {
            this.f21549f = str5;
        }
        if ((i & 64) == 0) {
            this.f21550g = null;
        } else {
            this.f21550g = bool;
        }
        if ((i & 128) == 0) {
            this.f21551h = null;
        } else {
            this.f21551h = str6;
        }
        if ((i & 256) == 0) {
            this.f21552i = null;
        } else {
            this.f21552i = invoice;
        }
        if ((i & 512) == 0) {
            this.f21553j = null;
        } else {
            this.f21553j = freeTrialDetails;
        }
        if ((i & 1024) == 0) {
            this.f21554k = null;
        } else {
            this.f21554k = appleDetails;
        }
        if ((i & 2048) == 0) {
            this.f21555l = null;
        } else {
            this.f21555l = androidDetails;
        }
        if ((i & 4096) == 0) {
            this.f21556m = Boolean.FALSE;
        } else {
            this.f21556m = bool2;
        }
        if ((i & 8192) == 0) {
            this.f21557n = Boolean.FALSE;
        } else {
            this.f21557n = bool3;
        }
        if ((i & 16384) == 0) {
            this.f21558o = Boolean.FALSE;
        } else {
            this.f21558o = bool4;
        }
        if ((32768 & i) == 0) {
            this.f21559p = Boolean.FALSE;
        } else {
            this.f21559p = bool5;
        }
        if ((65536 & i) == 0) {
            this.f21560q = Boolean.FALSE;
        } else {
            this.f21560q = bool6;
        }
        if ((131072 & i) == 0) {
            this.f21561r = null;
        } else {
            this.f21561r = accountTier;
        }
        if ((262144 & i) == 0) {
            this.f21562s = null;
        } else {
            this.f21562s = num;
        }
        if ((524288 & i) == 0) {
            this.f21563t = null;
        } else {
            this.f21563t = num2;
        }
        if ((1048576 & i) == 0) {
            this.f21564u = null;
        } else {
            this.f21564u = bool7;
        }
        if ((i & 2097152) == 0) {
            this.f21565v = null;
        } else {
            this.f21565v = bool8;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ResultSubscriptionDetail)) {
            return false;
        }
        ResultSubscriptionDetail resultSubscriptionDetail = (ResultSubscriptionDetail) obj;
        return fa4.m11650l(this.f21544a, resultSubscriptionDetail.f21544a) && fa4.m11650l(this.f21545b, resultSubscriptionDetail.f21545b) && fa4.m11650l(this.f21546c, resultSubscriptionDetail.f21546c) && fa4.m11650l(this.f21547d, resultSubscriptionDetail.f21547d) && fa4.m11650l(this.f21548e, resultSubscriptionDetail.f21548e) && fa4.m11650l(this.f21549f, resultSubscriptionDetail.f21549f) && fa4.m11650l(this.f21550g, resultSubscriptionDetail.f21550g) && fa4.m11650l(this.f21551h, resultSubscriptionDetail.f21551h) && fa4.m11650l(this.f21552i, resultSubscriptionDetail.f21552i) && fa4.m11650l(this.f21553j, resultSubscriptionDetail.f21553j) && fa4.m11650l(this.f21554k, resultSubscriptionDetail.f21554k) && fa4.m11650l(this.f21555l, resultSubscriptionDetail.f21555l) && fa4.m11650l(this.f21556m, resultSubscriptionDetail.f21556m) && fa4.m11650l(this.f21557n, resultSubscriptionDetail.f21557n) && fa4.m11650l(this.f21558o, resultSubscriptionDetail.f21558o) && fa4.m11650l(this.f21559p, resultSubscriptionDetail.f21559p) && fa4.m11650l(this.f21560q, resultSubscriptionDetail.f21560q) && fa4.m11650l(this.f21561r, resultSubscriptionDetail.f21561r) && fa4.m11650l(this.f21562s, resultSubscriptionDetail.f21562s) && fa4.m11650l(this.f21563t, resultSubscriptionDetail.f21563t) && fa4.m11650l(this.f21564u, resultSubscriptionDetail.f21564u) && fa4.m11650l(this.f21565v, resultSubscriptionDetail.f21565v);
    }

    public final int hashCode() {
        Tier tier = this.f21544a;
        int iHashCode = (tier == null ? 0 : tier.hashCode()) * 31;
        String str = this.f21545b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f21546c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f21547d;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f21548e;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f21549f;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Boolean bool = this.f21550g;
        int iHashCode7 = (iHashCode6 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str6 = this.f21551h;
        int iHashCode8 = (iHashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Invoice invoice = this.f21552i;
        int iHashCode9 = (iHashCode8 + (invoice == null ? 0 : invoice.hashCode())) * 31;
        FreeTrialDetails freeTrialDetails = this.f21553j;
        int iHashCode10 = (iHashCode9 + (freeTrialDetails == null ? 0 : freeTrialDetails.hashCode())) * 31;
        AppleDetails appleDetails = this.f21554k;
        int iHashCode11 = (iHashCode10 + (appleDetails == null ? 0 : appleDetails.hashCode())) * 31;
        AndroidDetails androidDetails = this.f21555l;
        int iHashCode12 = (iHashCode11 + (androidDetails == null ? 0 : androidDetails.hashCode())) * 31;
        Boolean bool2 = this.f21556m;
        int iHashCode13 = (iHashCode12 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.f21557n;
        int iHashCode14 = (iHashCode13 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.f21558o;
        int iHashCode15 = (iHashCode14 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        Boolean bool5 = this.f21559p;
        int iHashCode16 = (iHashCode15 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
        Boolean bool6 = this.f21560q;
        int iHashCode17 = (iHashCode16 + (bool6 == null ? 0 : bool6.hashCode())) * 31;
        AccountTier accountTier = this.f21561r;
        int iHashCode18 = (iHashCode17 + (accountTier == null ? 0 : accountTier.hashCode())) * 31;
        Integer num = this.f21562s;
        int iHashCode19 = (iHashCode18 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f21563t;
        int iHashCode20 = (iHashCode19 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Boolean bool7 = this.f21564u;
        int iHashCode21 = (iHashCode20 + (bool7 == null ? 0 : bool7.hashCode())) * 31;
        Boolean bool8 = this.f21565v;
        return iHashCode21 + (bool8 != null ? bool8.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ResultSubscriptionDetail(tier=");
        sb.append(this.f21544a);
        sb.append(", platform=");
        sb.append(this.f21545b);
        sb.append(", provider=");
        AbstractC3393o1.m17725C(sb, this.f21546c, ", duration=", this.f21547d, ", startDate=");
        AbstractC3393o1.m17725C(sb, this.f21548e, ", endDate=", this.f21549f, ", isActive=");
        sb.append(this.f21550g);
        sb.append(", reference=");
        sb.append(this.f21551h);
        sb.append(", invoice=");
        sb.append(this.f21552i);
        sb.append(", freeTrialDetails=");
        sb.append(this.f21553j);
        sb.append(", appleDetails=");
        sb.append(this.f21554k);
        sb.append(", androidDetails=");
        sb.append(this.f21555l);
        sb.append(", canSimplifyLesson=");
        e65.m10882n(sb, this.f21556m, ", isGrandfatheredSubscriber=", this.f21557n, ", isPremium=");
        e65.m10882n(sb, this.f21558o, ", isPremiumPlus=", this.f21559p, ", isStaff=");
        sb.append(this.f21560q);
        sb.append(", effectiveTier=");
        sb.append(this.f21561r);
        sb.append(", lynxBalance=");
        e65.m10883o(sb, this.f21562s, ", lynxLimit=", this.f21563t, ", lynxIsUnlimited=");
        sb.append(this.f21564u);
        sb.append(", lynxIsLifetime=");
        sb.append(this.f21565v);
        sb.append(")");
        return sb.toString();
    }
}
