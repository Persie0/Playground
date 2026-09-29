package com.lingq.core.network.api.result;

import p000.AbstractC3393o1;
import p000.ey8;
import p000.fa4;
import p000.ux5;
import p000.wq1;

/* JADX INFO: loaded from: classes2.dex */
@ey8
public final class ResultBadge {
    public static final C1720r Companion = new C1720r();

    /* JADX INFO: renamed from: a */
    public final String f20604a;

    /* JADX INFO: renamed from: b */
    public final String f20605b;

    /* JADX INFO: renamed from: c */
    public final String f20606c;

    /* JADX INFO: renamed from: d */
    public final int f20607d;

    /* JADX INFO: renamed from: e */
    public final String f20608e;

    /* JADX INFO: renamed from: f */
    public final String f20609f;

    /* JADX INFO: renamed from: g */
    public final String f20610g;

    /* JADX INFO: renamed from: h */
    public final ResultBadgeObject f20611h;

    public /* synthetic */ ResultBadge(int i, String str, String str2, String str3, int i2, String str4, String str5, String str6, ResultBadgeObject resultBadgeObject) {
        if ((i & 1) == 0) {
            this.f20604a = null;
        } else {
            this.f20604a = str;
        }
        if ((i & 2) == 0) {
            this.f20605b = null;
        } else {
            this.f20605b = str2;
        }
        if ((i & 4) == 0) {
            this.f20606c = null;
        } else {
            this.f20606c = str3;
        }
        if ((i & 8) == 0) {
            this.f20607d = 0;
        } else {
            this.f20607d = i2;
        }
        if ((i & 16) == 0) {
            this.f20608e = null;
        } else {
            this.f20608e = str4;
        }
        if ((i & 32) == 0) {
            this.f20609f = null;
        } else {
            this.f20609f = str5;
        }
        if ((i & 64) == 0) {
            this.f20610g = null;
        } else {
            this.f20610g = str6;
        }
        if ((i & 128) == 0) {
            this.f20611h = null;
        } else {
            this.f20611h = resultBadgeObject;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ResultBadge)) {
            return false;
        }
        ResultBadge resultBadge = (ResultBadge) obj;
        return fa4.m11650l(this.f20604a, resultBadge.f20604a) && fa4.m11650l(this.f20605b, resultBadge.f20605b) && fa4.m11650l(this.f20606c, resultBadge.f20606c) && this.f20607d == resultBadge.f20607d && fa4.m11650l(this.f20608e, resultBadge.f20608e) && fa4.m11650l(this.f20609f, resultBadge.f20609f) && fa4.m11650l(this.f20610g, resultBadge.f20610g) && fa4.m11650l(this.f20611h, resultBadge.f20611h);
    }

    public final int hashCode() {
        String str = this.f20604a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f20605b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f20606c;
        int iM24106b = wq1.m24106b(this.f20607d, (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31, 31);
        String str4 = this.f20608e;
        int iHashCode3 = (iM24106b + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f20609f;
        int iHashCode4 = (iHashCode3 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f20610g;
        int iHashCode5 = (iHashCode4 + (str6 == null ? 0 : str6.hashCode())) * 31;
        ResultBadgeObject resultBadgeObject = this.f20611h;
        return iHashCode5 + (resultBadgeObject != null ? resultBadgeObject.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbM23000w = ux5.m23000w("ResultBadge(language=", this.f20604a, ", slug=", this.f20605b, ", name=");
        AbstractC3393o1.m17748w(this.f20607d, this.f20606c, ", goal=", ", stat=", sbM23000w);
        AbstractC3393o1.m17725C(sbM23000w, this.f20608e, ", metAt=", this.f20609f, ", gainedAt=");
        sbM23000w.append(this.f20610g);
        sbM23000w.append(", badgeObject=");
        sbM23000w.append(this.f20611h);
        sbM23000w.append(")");
        return sbM23000w.toString();
    }
}
