package com.lingq.core.network.api.result;

import p000.AbstractC3393o1;
import p000.ey8;
import p000.fa4;
import p000.g9a;
import p000.hn1;
import p000.ux5;
import p000.wq1;

/* JADX INFO: loaded from: classes2.dex */
@ey8
public final class ResultChallenge {
    public static final C1615a0 Companion = new C1615a0();

    /* JADX INFO: renamed from: a */
    public final String f20658a;

    /* JADX INFO: renamed from: b */
    public final String f20659b;

    /* JADX INFO: renamed from: c */
    public final String f20660c;

    /* JADX INFO: renamed from: d */
    public final String f20661d;

    /* JADX INFO: renamed from: e */
    public final Boolean f20662e;

    /* JADX INFO: renamed from: f */
    public final String f20663f;

    /* JADX INFO: renamed from: g */
    public final int f20664g;

    /* JADX INFO: renamed from: h */
    public final String f20665h;

    /* JADX INFO: renamed from: i */
    public final boolean f20666i;

    /* JADX INFO: renamed from: j */
    public final Participant f20667j;

    /* JADX INFO: renamed from: k */
    public final int f20668k;

    /* JADX INFO: renamed from: l */
    public final String f20669l;

    /* JADX INFO: renamed from: m */
    public final String f20670m;

    /* JADX INFO: renamed from: n */
    public final String f20671n;

    /* JADX INFO: renamed from: o */
    public final String f20672o;

    /* JADX INFO: renamed from: p */
    public final String f20673p;

    /* JADX INFO: renamed from: q */
    public final String f20674q;

    /* JADX INFO: renamed from: r */
    public final int f20675r;

    public /* synthetic */ ResultChallenge(int i, String str, String str2, String str3, String str4, Boolean bool, String str5, int i2, String str6, boolean z, Participant participant, int i3, String str7, String str8, String str9, String str10, String str11, String str12, int i4) {
        if ((i & 1) == 0) {
            this.f20658a = null;
        } else {
            this.f20658a = str;
        }
        if ((i & 2) == 0) {
            this.f20659b = null;
        } else {
            this.f20659b = str2;
        }
        if ((i & 4) == 0) {
            this.f20660c = null;
        } else {
            this.f20660c = str3;
        }
        if ((i & 8) == 0) {
            this.f20661d = null;
        } else {
            this.f20661d = str4;
        }
        if ((i & 16) == 0) {
            this.f20662e = null;
        } else {
            this.f20662e = bool;
        }
        if ((i & 32) == 0) {
            this.f20663f = null;
        } else {
            this.f20663f = str5;
        }
        if ((i & 64) == 0) {
            this.f20664g = 0;
        } else {
            this.f20664g = i2;
        }
        if ((i & 128) == 0) {
            this.f20665h = null;
        } else {
            this.f20665h = str6;
        }
        if ((i & 256) == 0) {
            this.f20666i = false;
        } else {
            this.f20666i = z;
        }
        if ((i & 512) == 0) {
            this.f20667j = null;
        } else {
            this.f20667j = participant;
        }
        if ((i & 1024) == 0) {
            this.f20668k = 0;
        } else {
            this.f20668k = i3;
        }
        if ((i & 2048) == 0) {
            this.f20669l = null;
        } else {
            this.f20669l = str7;
        }
        if ((i & 4096) == 0) {
            this.f20670m = null;
        } else {
            this.f20670m = str8;
        }
        if ((i & 8192) == 0) {
            this.f20671n = null;
        } else {
            this.f20671n = str9;
        }
        if ((i & 16384) == 0) {
            this.f20672o = null;
        } else {
            this.f20672o = str10;
        }
        if ((32768 & i) == 0) {
            this.f20673p = null;
        } else {
            this.f20673p = str11;
        }
        if ((65536 & i) == 0) {
            this.f20674q = null;
        } else {
            this.f20674q = str12;
        }
        if ((i & 131072) == 0) {
            this.f20675r = 0;
        } else {
            this.f20675r = i4;
        }
    }

    /* JADX INFO: renamed from: a */
    public final String m8333a() {
        return this.f20658a;
    }

    /* JADX INFO: renamed from: b */
    public final String m8334b() {
        return this.f20659b;
    }

    /* JADX INFO: renamed from: c */
    public final String m8335c() {
        return this.f20665h;
    }

    /* JADX INFO: renamed from: d */
    public final Participant m8336d() {
        return this.f20667j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ResultChallenge)) {
            return false;
        }
        ResultChallenge resultChallenge = (ResultChallenge) obj;
        return fa4.m11650l(this.f20658a, resultChallenge.f20658a) && fa4.m11650l(this.f20659b, resultChallenge.f20659b) && fa4.m11650l(this.f20660c, resultChallenge.f20660c) && fa4.m11650l(this.f20661d, resultChallenge.f20661d) && fa4.m11650l(this.f20662e, resultChallenge.f20662e) && fa4.m11650l(this.f20663f, resultChallenge.f20663f) && this.f20664g == resultChallenge.f20664g && fa4.m11650l(this.f20665h, resultChallenge.f20665h) && this.f20666i == resultChallenge.f20666i && fa4.m11650l(this.f20667j, resultChallenge.f20667j) && this.f20668k == resultChallenge.f20668k && fa4.m11650l(this.f20669l, resultChallenge.f20669l) && fa4.m11650l(this.f20670m, resultChallenge.f20670m) && fa4.m11650l(this.f20671n, resultChallenge.f20671n) && fa4.m11650l(this.f20672o, resultChallenge.f20672o) && fa4.m11650l(this.f20673p, resultChallenge.f20673p) && fa4.m11650l(this.f20674q, resultChallenge.f20674q) && this.f20675r == resultChallenge.f20675r;
    }

    public final int hashCode() {
        String str = this.f20658a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f20659b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f20660c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f20661d;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Boolean bool = this.f20662e;
        int iHashCode5 = (iHashCode4 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str5 = this.f20663f;
        int iM24106b = wq1.m24106b(this.f20664g, (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31, 31);
        String str6 = this.f20665h;
        int iM12428e = g9a.m12428e((iM24106b + (str6 == null ? 0 : str6.hashCode())) * 31, 31, this.f20666i);
        Participant participant = this.f20667j;
        int iM24106b2 = wq1.m24106b(this.f20668k, (iM12428e + (participant == null ? 0 : participant.hashCode())) * 31, 31);
        String str7 = this.f20669l;
        int iHashCode6 = (iM24106b2 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.f20670m;
        int iHashCode7 = (iHashCode6 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.f20671n;
        int iHashCode8 = (iHashCode7 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.f20672o;
        int iHashCode9 = (iHashCode8 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.f20673p;
        int iHashCode10 = (iHashCode9 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.f20674q;
        return Integer.hashCode(this.f20675r) + ((iHashCode10 + (str12 != null ? str12.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sbM23000w = ux5.m23000w("ResultChallenge(challengeType=", this.f20658a, ", code=", this.f20659b, ", description=");
        AbstractC3393o1.m17725C(sbM23000w, this.f20660c, ", displayTitle=", this.f20661d, ", eligibleToJoin=");
        sbM23000w.append(this.f20662e);
        sbM23000w.append(", endDate=");
        sbM23000w.append(this.f20663f);
        sbM23000w.append(", id=");
        hn1.m13361k(this.f20664g, ", imageUrl=", this.f20665h, ", isDisabled=", sbM23000w);
        sbM23000w.append(this.f20666i);
        sbM23000w.append(", participant=");
        sbM23000w.append(this.f20667j);
        sbM23000w.append(", participantsCount=");
        hn1.m13361k(this.f20668k, ", signupDeadline=", this.f20669l, ", signupStart=", sbM23000w);
        AbstractC3393o1.m17725C(sbM23000w, this.f20670m, ", startDate=", this.f20671n, ", status=");
        AbstractC3393o1.m17725C(sbM23000w, this.f20672o, ", title=", this.f20673p, ", language=");
        sbM23000w.append(this.f20674q);
        sbM23000w.append(", rank=");
        sbM23000w.append(this.f20675r);
        sbM23000w.append(")");
        return sbM23000w.toString();
    }
}
