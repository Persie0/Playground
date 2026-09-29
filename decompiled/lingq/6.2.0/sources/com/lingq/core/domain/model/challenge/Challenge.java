package com.lingq.core.domain.model.challenge;

import p000.AbstractC3393o1;
import p000.ey8;
import p000.fa4;
import p000.g9a;
import p000.hn1;
import p000.ux5;
import p000.wq1;

/* JADX INFO: loaded from: classes2.dex */
@ey8
public final class Challenge {
    public static final C1395a Companion = new C1395a();

    /* JADX INFO: renamed from: a */
    public final int f18853a;

    /* JADX INFO: renamed from: b */
    public final String f18854b;

    /* JADX INFO: renamed from: c */
    public final String f18855c;

    /* JADX INFO: renamed from: d */
    public final String f18856d;

    /* JADX INFO: renamed from: e */
    public final String f18857e;

    /* JADX INFO: renamed from: f */
    public final String f18858f;

    /* JADX INFO: renamed from: g */
    public final String f18859g;

    /* JADX INFO: renamed from: h */
    public final int f18860h;

    /* JADX INFO: renamed from: i */
    public final String f18861i;

    /* JADX INFO: renamed from: j */
    public final boolean f18862j;

    /* JADX INFO: renamed from: k */
    public final int f18863k;

    /* JADX INFO: renamed from: l */
    public final boolean f18864l;

    /* JADX INFO: renamed from: m */
    public final String f18865m;

    /* JADX INFO: renamed from: n */
    public final String f18866n;

    /* JADX INFO: renamed from: o */
    public final String f18867o;

    public /* synthetic */ Challenge(int i, int i2, String str, String str2, String str3, String str4, String str5, String str6, int i3, String str7, boolean z, int i4, boolean z2, String str8, String str9, String str10) {
        if ((i & 1) == 0) {
            this.f18853a = 0;
        } else {
            this.f18853a = i2;
        }
        if ((i & 2) == 0) {
            this.f18854b = "";
        } else {
            this.f18854b = str;
        }
        if ((i & 4) == 0) {
            this.f18855c = "";
        } else {
            this.f18855c = str2;
        }
        if ((i & 8) == 0) {
            this.f18856d = "";
        } else {
            this.f18856d = str3;
        }
        if ((i & 16) == 0) {
            this.f18857e = null;
        } else {
            this.f18857e = str4;
        }
        if ((i & 32) == 0) {
            this.f18858f = null;
        } else {
            this.f18858f = str5;
        }
        if ((i & 64) == 0) {
            this.f18859g = "";
        } else {
            this.f18859g = str6;
        }
        if ((i & 128) == 0) {
            this.f18860h = 0;
        } else {
            this.f18860h = i3;
        }
        if ((i & 256) == 0) {
            this.f18861i = "";
        } else {
            this.f18861i = str7;
        }
        if ((i & 512) == 0) {
            this.f18862j = false;
        } else {
            this.f18862j = z;
        }
        if ((i & 1024) == 0) {
            this.f18863k = 0;
        } else {
            this.f18863k = i4;
        }
        if ((i & 2048) == 0) {
            this.f18864l = false;
        } else {
            this.f18864l = z2;
        }
        if ((i & 4096) == 0) {
            this.f18865m = null;
        } else {
            this.f18865m = str8;
        }
        if ((i & 8192) == 0) {
            this.f18866n = null;
        } else {
            this.f18866n = str9;
        }
        if ((i & 16384) == 0) {
            this.f18867o = null;
        } else {
            this.f18867o = str10;
        }
    }

    /* JADX INFO: renamed from: a */
    public final int m8011a() {
        return this.f18860h;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Challenge)) {
            return false;
        }
        Challenge challenge = (Challenge) obj;
        return this.f18853a == challenge.f18853a && fa4.m11650l(this.f18854b, challenge.f18854b) && fa4.m11650l(this.f18855c, challenge.f18855c) && fa4.m11650l(this.f18856d, challenge.f18856d) && fa4.m11650l(this.f18857e, challenge.f18857e) && fa4.m11650l(this.f18858f, challenge.f18858f) && fa4.m11650l(this.f18859g, challenge.f18859g) && this.f18860h == challenge.f18860h && fa4.m11650l(this.f18861i, challenge.f18861i) && this.f18862j == challenge.f18862j && this.f18863k == challenge.f18863k && this.f18864l == challenge.f18864l && fa4.m11650l(this.f18865m, challenge.f18865m) && fa4.m11650l(this.f18866n, challenge.f18866n) && fa4.m11650l(this.f18867o, challenge.f18867o);
    }

    public final int hashCode() {
        int iM22980c = ux5.m22980c(ux5.m22980c(ux5.m22980c(Integer.hashCode(this.f18853a) * 31, this.f18854b, 31), this.f18855c, 31), this.f18856d, 31);
        String str = this.f18857e;
        int iHashCode = (iM22980c + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f18858f;
        int iM24106b = wq1.m24106b(this.f18860h, ux5.m22980c((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, this.f18859g, 31), 31);
        String str3 = this.f18861i;
        int iM12428e = g9a.m12428e(wq1.m24106b(this.f18863k, g9a.m12428e((iM24106b + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.f18862j), 31), 31, this.f18864l);
        String str4 = this.f18865m;
        int iHashCode2 = (iM12428e + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f18866n;
        int iHashCode3 = (iHashCode2 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f18867o;
        return iHashCode3 + (str6 != null ? str6.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbM22995r = ux5.m22995r(this.f18853a, "Challenge(pk=", ", code=", this.f18854b, ", title=");
        AbstractC3393o1.m17725C(sbM22995r, this.f18855c, ", description=", this.f18856d, ", startDate=");
        AbstractC3393o1.m17725C(sbM22995r, this.f18857e, ", endDate=", this.f18858f, ", challengeType=");
        AbstractC3393o1.m17748w(this.f18860h, this.f18859g, ", participantsCount=", ", badgeUrl=", sbM22995r);
        ux5.m22976C(this.f18861i, ", isJoined=", ", rank=", sbM22995r, this.f18862j);
        hn1.m13368r(sbM22995r, this.f18863k, ", isCompleted=", this.f18864l, ", challengeLanguage=");
        AbstractC3393o1.m17725C(sbM22995r, this.f18865m, ", signupDeadline=", this.f18866n, ", status=");
        return AbstractC3393o1.m17738m(sbM22995r, this.f18867o, ")");
    }

    public Challenge(int i, String str, String str2, String str3, String str4, String str5, String str6, int i2, String str7, boolean z, int i3, boolean z2, String str8, String str9, String str10) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        str6.getClass();
        this.f18853a = i;
        this.f18854b = str;
        this.f18855c = str2;
        this.f18856d = str3;
        this.f18857e = str4;
        this.f18858f = str5;
        this.f18859g = str6;
        this.f18860h = i2;
        this.f18861i = str7;
        this.f18862j = z;
        this.f18863k = i3;
        this.f18864l = z2;
        this.f18865m = str8;
        this.f18866n = str9;
        this.f18867o = str10;
    }
}
