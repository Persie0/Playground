package com.lingq.core.network.api.result;

import p000.ey8;
import p000.fa4;
import p000.ux5;

/* JADX INFO: loaded from: classes2.dex */
@ey8
public final class ResultUserReferral {
    public static final C1755w4 Companion = new C1755w4();

    /* JADX INFO: renamed from: a */
    public final String f21664a;

    /* JADX INFO: renamed from: b */
    public final String f21665b;

    /* JADX INFO: renamed from: c */
    public final Boolean f21666c;

    /* JADX INFO: renamed from: d */
    public final Integer f21667d;

    /* JADX INFO: renamed from: e */
    public final Integer f21668e;

    /* JADX INFO: renamed from: f */
    public final String f21669f;

    /* JADX INFO: renamed from: g */
    public final Integer f21670g;

    /* JADX INFO: renamed from: h */
    public final String f21671h;

    /* JADX INFO: renamed from: i */
    public final ReferralUser f21672i;

    /* JADX INFO: renamed from: j */
    public final String f21673j;

    public /* synthetic */ ResultUserReferral(int i, String str, String str2, Boolean bool, Integer num, Integer num2, String str3, Integer num3, String str4, ReferralUser referralUser, String str5) {
        if ((i & 1) == 0) {
            this.f21664a = null;
        } else {
            this.f21664a = str;
        }
        if ((i & 2) == 0) {
            this.f21665b = null;
        } else {
            this.f21665b = str2;
        }
        if ((i & 4) == 0) {
            this.f21666c = null;
        } else {
            this.f21666c = bool;
        }
        if ((i & 8) == 0) {
            this.f21667d = null;
        } else {
            this.f21667d = num;
        }
        if ((i & 16) == 0) {
            this.f21668e = null;
        } else {
            this.f21668e = num2;
        }
        if ((i & 32) == 0) {
            this.f21669f = null;
        } else {
            this.f21669f = str3;
        }
        if ((i & 64) == 0) {
            this.f21670g = null;
        } else {
            this.f21670g = num3;
        }
        if ((i & 128) == 0) {
            this.f21671h = null;
        } else {
            this.f21671h = str4;
        }
        if ((i & 256) == 0) {
            this.f21672i = null;
        } else {
            this.f21672i = referralUser;
        }
        if ((i & 512) == 0) {
            this.f21673j = null;
        } else {
            this.f21673j = str5;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ResultUserReferral)) {
            return false;
        }
        ResultUserReferral resultUserReferral = (ResultUserReferral) obj;
        return fa4.m11650l(this.f21664a, resultUserReferral.f21664a) && fa4.m11650l(this.f21665b, resultUserReferral.f21665b) && fa4.m11650l(this.f21666c, resultUserReferral.f21666c) && fa4.m11650l(this.f21667d, resultUserReferral.f21667d) && fa4.m11650l(this.f21668e, resultUserReferral.f21668e) && fa4.m11650l(this.f21669f, resultUserReferral.f21669f) && fa4.m11650l(this.f21670g, resultUserReferral.f21670g) && fa4.m11650l(this.f21671h, resultUserReferral.f21671h) && fa4.m11650l(this.f21672i, resultUserReferral.f21672i) && fa4.m11650l(this.f21673j, resultUserReferral.f21673j);
    }

    public final int hashCode() {
        String str = this.f21664a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f21665b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.f21666c;
        int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        Integer num = this.f21667d;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f21668e;
        int iHashCode5 = (iHashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str3 = this.f21669f;
        int iHashCode6 = (iHashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num3 = this.f21670g;
        int iHashCode7 = (iHashCode6 + (num3 == null ? 0 : num3.hashCode())) * 31;
        String str4 = this.f21671h;
        int iHashCode8 = (iHashCode7 + (str4 == null ? 0 : str4.hashCode())) * 31;
        ReferralUser referralUser = this.f21672i;
        int iHashCode9 = (iHashCode8 + (referralUser == null ? 0 : referralUser.hashCode())) * 31;
        String str5 = this.f21673j;
        return iHashCode9 + (str5 != null ? str5.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbM23000w = ux5.m23000w("ResultUserReferral(dateJoined=", this.f21664a, ", email=", this.f21665b, ", hasUpgraded=");
        sbM23000w.append(this.f21666c);
        sbM23000w.append(", lingqsEarned=");
        sbM23000w.append(this.f21667d);
        sbM23000w.append(", pk=");
        sbM23000w.append(this.f21668e);
        sbM23000w.append(", tierCategory=");
        sbM23000w.append(this.f21669f);
        sbM23000w.append(", tierLevel=");
        sbM23000w.append(this.f21670g);
        sbM23000w.append(", url=");
        sbM23000w.append(this.f21671h);
        sbM23000w.append(", user=");
        sbM23000w.append(this.f21672i);
        sbM23000w.append(", username=");
        sbM23000w.append(this.f21673j);
        sbM23000w.append(")");
        return sbM23000w.toString();
    }
}
