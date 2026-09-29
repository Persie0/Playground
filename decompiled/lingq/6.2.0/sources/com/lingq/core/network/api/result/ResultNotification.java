package com.lingq.core.network.api.result;

import p000.AbstractC3393o1;
import p000.ey8;
import p000.fa4;
import p000.ux5;

/* JADX INFO: loaded from: classes2.dex */
@ey8
public final class ResultNotification {
    public static final C1780x2 Companion = new C1780x2();

    /* JADX INFO: renamed from: a */
    public final int f21343a;

    /* JADX INFO: renamed from: b */
    public final String f21344b;

    /* JADX INFO: renamed from: c */
    public final String f21345c;

    /* JADX INFO: renamed from: d */
    public final String f21346d;

    /* JADX INFO: renamed from: e */
    public final String f21347e;

    /* JADX INFO: renamed from: f */
    public final String f21348f;

    /* JADX INFO: renamed from: g */
    public final String f21349g;

    /* JADX INFO: renamed from: h */
    public final Boolean f21350h;

    /* JADX INFO: renamed from: i */
    public final String f21351i;

    public /* synthetic */ ResultNotification(int i, int i2, String str, String str2, String str3, String str4, String str5, String str6, Boolean bool, String str7) {
        this.f21343a = (i & 1) == 0 ? 0 : i2;
        if ((i & 2) == 0) {
            this.f21344b = null;
        } else {
            this.f21344b = str;
        }
        if ((i & 4) == 0) {
            this.f21345c = null;
        } else {
            this.f21345c = str2;
        }
        if ((i & 8) == 0) {
            this.f21346d = null;
        } else {
            this.f21346d = str3;
        }
        if ((i & 16) == 0) {
            this.f21347e = null;
        } else {
            this.f21347e = str4;
        }
        if ((i & 32) == 0) {
            this.f21348f = null;
        } else {
            this.f21348f = str5;
        }
        if ((i & 64) == 0) {
            this.f21349g = null;
        } else {
            this.f21349g = str6;
        }
        if ((i & 128) == 0) {
            this.f21350h = null;
        } else {
            this.f21350h = bool;
        }
        if ((i & 256) == 0) {
            this.f21351i = null;
        } else {
            this.f21351i = str7;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ResultNotification)) {
            return false;
        }
        ResultNotification resultNotification = (ResultNotification) obj;
        return this.f21343a == resultNotification.f21343a && fa4.m11650l(this.f21344b, resultNotification.f21344b) && fa4.m11650l(this.f21345c, resultNotification.f21345c) && fa4.m11650l(this.f21346d, resultNotification.f21346d) && fa4.m11650l(this.f21347e, resultNotification.f21347e) && fa4.m11650l(this.f21348f, resultNotification.f21348f) && fa4.m11650l(this.f21349g, resultNotification.f21349g) && fa4.m11650l(this.f21350h, resultNotification.f21350h) && fa4.m11650l(this.f21351i, resultNotification.f21351i);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f21343a) * 31;
        String str = this.f21344b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f21345c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f21346d;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f21347e;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f21348f;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f21349g;
        int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Boolean bool = this.f21350h;
        int iHashCode8 = (iHashCode7 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str7 = this.f21351i;
        return iHashCode8 + (str7 != null ? str7.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbM22995r = ux5.m22995r(this.f21343a, "ResultNotification(pk=", ", url=", this.f21344b, ", language=");
        AbstractC3393o1.m17725C(sbM22995r, this.f21345c, ", type=", this.f21346d, ", title=");
        AbstractC3393o1.m17725C(sbM22995r, this.f21347e, ", message=", this.f21348f, ", image=");
        sbM22995r.append(this.f21349g);
        sbM22995r.append(", isNew=");
        sbM22995r.append(this.f21350h);
        sbM22995r.append(", timestamp=");
        return AbstractC3393o1.m17738m(sbM22995r, this.f21351i, ")");
    }
}
