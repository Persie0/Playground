package com.lingq.core.domain.model.user;

import p000.AbstractC3393o1;
import p000.e65;
import p000.ey8;
import p000.fa4;

/* JADX INFO: loaded from: classes.dex */
@ey8
public final class SubscriptionDetails {
    public static final C1512n Companion = new C1512n();

    /* JADX INFO: renamed from: a */
    public final Tier f19833a;

    /* JADX INFO: renamed from: b */
    public final AccountTier f19834b;

    /* JADX INFO: renamed from: c */
    public final String f19835c;

    /* JADX INFO: renamed from: d */
    public final String f19836d;

    /* JADX INFO: renamed from: e */
    public final String f19837e;

    /* JADX INFO: renamed from: f */
    public final String f19838f;

    /* JADX INFO: renamed from: g */
    public final String f19839g;

    /* JADX INFO: renamed from: h */
    public final Boolean f19840h;

    /* JADX INFO: renamed from: i */
    public final String f19841i;

    /* JADX INFO: renamed from: j */
    public final Invoice f19842j;

    /* JADX INFO: renamed from: k */
    public final FreeTrialDetails f19843k;

    /* JADX INFO: renamed from: l */
    public final AppleDetails f19844l;

    /* JADX INFO: renamed from: m */
    public final AndroidDetails f19845m;

    /* JADX INFO: renamed from: n */
    public final Boolean f19846n;

    /* JADX INFO: renamed from: o */
    public final Boolean f19847o;

    /* JADX INFO: renamed from: p */
    public final Boolean f19848p;

    /* JADX INFO: renamed from: q */
    public final Boolean f19849q;

    /* JADX INFO: renamed from: r */
    public final Boolean f19850r;

    /* JADX INFO: renamed from: s */
    public final Integer f19851s;

    /* JADX INFO: renamed from: t */
    public final Integer f19852t;

    /* JADX INFO: renamed from: u */
    public final Boolean f19853u;

    /* JADX INFO: renamed from: v */
    public final Boolean f19854v;

    public /* synthetic */ SubscriptionDetails(int i, AccountTier accountTier, AndroidDetails androidDetails, AppleDetails appleDetails, FreeTrialDetails freeTrialDetails, Invoice invoice, Tier tier, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, Boolean bool7, Boolean bool8, Integer num, Integer num2, String str, String str2, String str3, String str4, String str5, String str6) {
        this.f19833a = (i & 1) == 0 ? new Tier() : tier;
        this.f19834b = (i & 2) == 0 ? new AccountTier() : accountTier;
        if ((i & 4) == 0) {
            this.f19835c = null;
        } else {
            this.f19835c = str;
        }
        if ((i & 8) == 0) {
            this.f19836d = null;
        } else {
            this.f19836d = str2;
        }
        if ((i & 16) == 0) {
            this.f19837e = null;
        } else {
            this.f19837e = str3;
        }
        if ((i & 32) == 0) {
            this.f19838f = null;
        } else {
            this.f19838f = str4;
        }
        if ((i & 64) == 0) {
            this.f19839g = null;
        } else {
            this.f19839g = str5;
        }
        if ((i & 128) == 0) {
            this.f19840h = null;
        } else {
            this.f19840h = bool;
        }
        if ((i & 256) == 0) {
            this.f19841i = null;
        } else {
            this.f19841i = str6;
        }
        if ((i & 512) == 0) {
            this.f19842j = null;
        } else {
            this.f19842j = invoice;
        }
        if ((i & 1024) == 0) {
            this.f19843k = null;
        } else {
            this.f19843k = freeTrialDetails;
        }
        if ((i & 2048) == 0) {
            this.f19844l = null;
        } else {
            this.f19844l = appleDetails;
        }
        if ((i & 4096) == 0) {
            this.f19845m = null;
        } else {
            this.f19845m = androidDetails;
        }
        if ((i & 8192) == 0) {
            this.f19846n = Boolean.FALSE;
        } else {
            this.f19846n = bool2;
        }
        if ((i & 16384) == 0) {
            this.f19847o = Boolean.FALSE;
        } else {
            this.f19847o = bool3;
        }
        if ((32768 & i) == 0) {
            this.f19848p = Boolean.FALSE;
        } else {
            this.f19848p = bool4;
        }
        if ((65536 & i) == 0) {
            this.f19849q = Boolean.FALSE;
        } else {
            this.f19849q = bool5;
        }
        if ((131072 & i) == 0) {
            this.f19850r = Boolean.FALSE;
        } else {
            this.f19850r = bool6;
        }
        if ((262144 & i) == 0) {
            this.f19851s = null;
        } else {
            this.f19851s = num;
        }
        if ((524288 & i) == 0) {
            this.f19852t = null;
        } else {
            this.f19852t = num2;
        }
        if ((1048576 & i) == 0) {
            this.f19853u = null;
        } else {
            this.f19853u = bool7;
        }
        if ((i & 2097152) == 0) {
            this.f19854v = null;
        } else {
            this.f19854v = bool8;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SubscriptionDetails)) {
            return false;
        }
        SubscriptionDetails subscriptionDetails = (SubscriptionDetails) obj;
        return fa4.m11650l(this.f19833a, subscriptionDetails.f19833a) && fa4.m11650l(this.f19834b, subscriptionDetails.f19834b) && fa4.m11650l(this.f19835c, subscriptionDetails.f19835c) && fa4.m11650l(this.f19836d, subscriptionDetails.f19836d) && fa4.m11650l(this.f19837e, subscriptionDetails.f19837e) && fa4.m11650l(this.f19838f, subscriptionDetails.f19838f) && fa4.m11650l(this.f19839g, subscriptionDetails.f19839g) && fa4.m11650l(this.f19840h, subscriptionDetails.f19840h) && fa4.m11650l(this.f19841i, subscriptionDetails.f19841i) && fa4.m11650l(this.f19842j, subscriptionDetails.f19842j) && fa4.m11650l(this.f19843k, subscriptionDetails.f19843k) && fa4.m11650l(this.f19844l, subscriptionDetails.f19844l) && fa4.m11650l(this.f19845m, subscriptionDetails.f19845m) && fa4.m11650l(this.f19846n, subscriptionDetails.f19846n) && fa4.m11650l(this.f19847o, subscriptionDetails.f19847o) && fa4.m11650l(this.f19848p, subscriptionDetails.f19848p) && fa4.m11650l(this.f19849q, subscriptionDetails.f19849q) && fa4.m11650l(this.f19850r, subscriptionDetails.f19850r) && fa4.m11650l(this.f19851s, subscriptionDetails.f19851s) && fa4.m11650l(this.f19852t, subscriptionDetails.f19852t) && fa4.m11650l(this.f19853u, subscriptionDetails.f19853u) && fa4.m11650l(this.f19854v, subscriptionDetails.f19854v);
    }

    public final int hashCode() {
        int iHashCode = (this.f19834b.hashCode() + (this.f19833a.hashCode() * 31)) * 31;
        String str = this.f19835c;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f19836d;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f19837e;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f19838f;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f19839g;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Boolean bool = this.f19840h;
        int iHashCode7 = (iHashCode6 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str6 = this.f19841i;
        int iHashCode8 = (iHashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Invoice invoice = this.f19842j;
        int iHashCode9 = (iHashCode8 + (invoice == null ? 0 : invoice.hashCode())) * 31;
        FreeTrialDetails freeTrialDetails = this.f19843k;
        int iHashCode10 = (iHashCode9 + (freeTrialDetails == null ? 0 : freeTrialDetails.hashCode())) * 31;
        AppleDetails appleDetails = this.f19844l;
        int iHashCode11 = (iHashCode10 + (appleDetails == null ? 0 : appleDetails.hashCode())) * 31;
        AndroidDetails androidDetails = this.f19845m;
        int iHashCode12 = (iHashCode11 + (androidDetails == null ? 0 : androidDetails.hashCode())) * 31;
        Boolean bool2 = this.f19846n;
        int iHashCode13 = (iHashCode12 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.f19847o;
        int iHashCode14 = (iHashCode13 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.f19848p;
        int iHashCode15 = (iHashCode14 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        Boolean bool5 = this.f19849q;
        int iHashCode16 = (iHashCode15 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
        Boolean bool6 = this.f19850r;
        int iHashCode17 = (iHashCode16 + (bool6 == null ? 0 : bool6.hashCode())) * 31;
        Integer num = this.f19851s;
        int iHashCode18 = (iHashCode17 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f19852t;
        int iHashCode19 = (iHashCode18 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Boolean bool7 = this.f19853u;
        int iHashCode20 = (iHashCode19 + (bool7 == null ? 0 : bool7.hashCode())) * 31;
        Boolean bool8 = this.f19854v;
        return iHashCode20 + (bool8 != null ? bool8.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SubscriptionDetails(tier=");
        sb.append(this.f19833a);
        sb.append(", effectiveTier=");
        sb.append(this.f19834b);
        sb.append(", platform=");
        AbstractC3393o1.m17725C(sb, this.f19835c, ", provider=", this.f19836d, ", duration=");
        AbstractC3393o1.m17725C(sb, this.f19837e, ", startDate=", this.f19838f, ", endDate=");
        sb.append(this.f19839g);
        sb.append(", isActive=");
        sb.append(this.f19840h);
        sb.append(", reference=");
        sb.append(this.f19841i);
        sb.append(", invoice=");
        sb.append(this.f19842j);
        sb.append(", freeTrialDetails=");
        sb.append(this.f19843k);
        sb.append(", appleDetails=");
        sb.append(this.f19844l);
        sb.append(", androidDetails=");
        sb.append(this.f19845m);
        sb.append(", canSimplifyLesson=");
        sb.append(this.f19846n);
        sb.append(", isGrandfatheredSubscriber=");
        e65.m10882n(sb, this.f19847o, ", isPremium=", this.f19848p, ", isPremiumPlus=");
        e65.m10882n(sb, this.f19849q, ", isStaff=", this.f19850r, ", lynxBalance=");
        e65.m10883o(sb, this.f19851s, ", lynxLimit=", this.f19852t, ", lynxIsUnlimited=");
        sb.append(this.f19853u);
        sb.append(", lynxIsLifetime=");
        sb.append(this.f19854v);
        sb.append(")");
        return sb.toString();
    }

    public SubscriptionDetails(Tier tier, AccountTier accountTier, String str, String str2, String str3, String str4, String str5, Boolean bool, String str6, Invoice invoice, FreeTrialDetails freeTrialDetails, AppleDetails appleDetails, AndroidDetails androidDetails, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, Integer num, Integer num2, Boolean bool7, Boolean bool8) {
        this.f19833a = tier;
        this.f19834b = accountTier;
        this.f19835c = str;
        this.f19836d = str2;
        this.f19837e = str3;
        this.f19838f = str4;
        this.f19839g = str5;
        this.f19840h = bool;
        this.f19841i = str6;
        this.f19842j = invoice;
        this.f19843k = freeTrialDetails;
        this.f19844l = appleDetails;
        this.f19845m = androidDetails;
        this.f19846n = bool2;
        this.f19847o = bool3;
        this.f19848p = bool4;
        this.f19849q = bool5;
        this.f19850r = bool6;
        this.f19851s = num;
        this.f19852t = num2;
        this.f19853u = bool7;
        this.f19854v = bool8;
    }

    public /* synthetic */ SubscriptionDetails() {
        Tier tier = new Tier();
        Boolean bool = Boolean.FALSE;
        this(tier, new AccountTier(), null, null, null, null, null, null, null, null, null, null, null, bool, bool, bool, bool, bool, null, null, null, null);
    }
}
