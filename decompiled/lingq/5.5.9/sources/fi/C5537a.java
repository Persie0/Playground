package fi;

import android.support.v4.media.session.C0166e;
import dm.C5207g;
import p003a2.C0009a;

/* JADX INFO: renamed from: fi.a */
/* JADX INFO: loaded from: classes.dex */
public final class C5537a {

    /* JADX INFO: renamed from: a */
    public final int f34235a;

    /* JADX INFO: renamed from: b */
    public final String f34236b;

    /* JADX INFO: renamed from: c */
    public final String f34237c;

    /* JADX INFO: renamed from: d */
    public final int f34238d;

    /* JADX INFO: renamed from: e */
    public final int f34239e;

    /* JADX INFO: renamed from: f */
    public final String f34240f;

    /* JADX INFO: renamed from: g */
    public final boolean f34241g;

    /* JADX INFO: renamed from: h */
    public final boolean f34242h;

    /* JADX INFO: renamed from: i */
    public final String f34243i;

    /* JADX INFO: renamed from: j */
    public final String f34244j;

    /* JADX INFO: renamed from: k */
    public final String f34245k;

    /* JADX INFO: renamed from: l */
    public final boolean f34246l;

    /* JADX INFO: renamed from: m */
    public final int f34247m;

    /* JADX INFO: renamed from: n */
    public final String f34248n;

    public C5537a(int i10, String str, String str2, int i11, int i12, String str3, boolean z10, boolean z11, String str4, String str5, String str6, boolean z12, int i13, String str7) {
        C5207g.m11111f(str, "code");
        C5207g.m11111f(str2, "title");
        C5207g.m11111f(str3, "badgeUrl");
        this.f34235a = i10;
        this.f34236b = str;
        this.f34237c = str2;
        this.f34238d = i11;
        this.f34239e = i12;
        this.f34240f = str3;
        this.f34241g = z10;
        this.f34242h = z11;
        this.f34243i = str4;
        this.f34244j = str5;
        this.f34245k = str6;
        this.f34246l = z12;
        this.f34247m = i13;
        this.f34248n = str7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5537a)) {
            return false;
        }
        C5537a c5537a = (C5537a) obj;
        return this.f34235a == c5537a.f34235a && C5207g.m11106a(this.f34236b, c5537a.f34236b) && C5207g.m11106a(this.f34237c, c5537a.f34237c) && this.f34238d == c5537a.f34238d && this.f34239e == c5537a.f34239e && C5207g.m11106a(this.f34240f, c5537a.f34240f) && this.f34241g == c5537a.f34241g && this.f34242h == c5537a.f34242h && C5207g.m11106a(this.f34243i, c5537a.f34243i) && C5207g.m11106a(this.f34244j, c5537a.f34244j) && C5207g.m11106a(this.f34245k, c5537a.f34245k) && this.f34246l == c5537a.f34246l && this.f34247m == c5537a.f34247m && C5207g.m11106a(this.f34248n, c5537a.f34248n);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [int] */
    /* JADX WARN: Type inference failed for: r0v18, types: [int] */
    /* JADX WARN: Type inference failed for: r0v8, types: [int] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7, types: [int] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v2, types: [int] */
    /* JADX WARN: Type inference failed for: r2v4, types: [int] */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
    public final int hashCode() {
        int iM758d = C0166e.m758d(this.f34240f, C0009a.m16d(this.f34239e, C0009a.m16d(this.f34238d, C0166e.m758d(this.f34237c, C0166e.m758d(this.f34236b, Integer.hashCode(this.f34235a) * 31, 31), 31), 31), 31), 31);
        ?? r10 = 1;
        boolean z10 = this.f34241g;
        ?? r11 = z10;
        if (z10) {
            r11 = 1;
        }
        int i10 = (iM758d + r11) * 31;
        boolean z11 = this.f34242h;
        ?? r12 = z11;
        if (z11) {
            r12 = 1;
        }
        int i11 = (i10 + r12) * 31;
        String str = this.f34243i;
        int iHashCode = (i11 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f34244j;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f34245k;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        boolean z12 = this.f34246l;
        if (!z12) {
            r10 = z12;
        }
        int iM16d = C0009a.m16d(this.f34247m, (iHashCode3 + r10) * 31, 31);
        String str4 = this.f34248n;
        return iM16d + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ChallengeInfo(pk=");
        sb2.append(this.f34235a);
        sb2.append(", code=");
        sb2.append(this.f34236b);
        sb2.append(", title=");
        sb2.append(this.f34237c);
        sb2.append(", participantsCount=");
        sb2.append(this.f34238d);
        sb2.append(", rank=");
        sb2.append(this.f34239e);
        sb2.append(", badgeUrl=");
        sb2.append(this.f34240f);
        sb2.append(", isJoined=");
        sb2.append(this.f34241g);
        sb2.append(", isPast=");
        sb2.append(this.f34242h);
        sb2.append(", startDate=");
        sb2.append(this.f34243i);
        sb2.append(", endDate=");
        sb2.append(this.f34244j);
        sb2.append(", challengeType=");
        sb2.append(this.f34245k);
        sb2.append(", isCompleted=");
        sb2.append(this.f34246l);
        sb2.append(", knownWords=");
        sb2.append(this.f34247m);
        sb2.append(", challengeLanguage=");
        return C0009a.m23l(sb2, this.f34248n, ")");
    }
}
