package p367rh;

import android.support.v4.media.session.C0166e;
import dm.C5207g;
import p003a2.C0009a;

/* JADX INFO: renamed from: rh.s */
/* JADX INFO: loaded from: classes.dex */
public final class C8805s {

    /* JADX INFO: renamed from: a */
    public final String f46673a;

    /* JADX INFO: renamed from: b */
    public final String f46674b;

    /* JADX INFO: renamed from: c */
    public final int f46675c;

    /* JADX INFO: renamed from: d */
    public Integer f46676d;

    /* JADX INFO: renamed from: e */
    public final boolean f46677e;

    public C8805s(int i10, Integer num, String str, String str2, boolean z10) {
        C5207g.m11111f(str, "nameWithLanguage");
        C5207g.m11111f(str2, "language");
        this.f46673a = str;
        this.f46674b = str2;
        this.f46675c = i10;
        this.f46676d = num;
        this.f46677e = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8805s)) {
            return false;
        }
        C8805s c8805s = (C8805s) obj;
        return C5207g.m11106a(this.f46673a, c8805s.f46673a) && C5207g.m11106a(this.f46674b, c8805s.f46674b) && this.f46675c == c8805s.f46675c && C5207g.m11106a(this.f46676d, c8805s.f46676d) && this.f46677e == c8805s.f46677e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v7, types: [int] */
    /* JADX WARN: Type inference failed for: r1v6, types: [int] */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v9 */
    public final int hashCode() {
        int iM16d = C0009a.m16d(this.f46675c, C0166e.m758d(this.f46674b, this.f46673a.hashCode() * 31, 31), 31);
        Integer num = this.f46676d;
        int iHashCode = (iM16d + (num == null ? 0 : num.hashCode())) * 31;
        boolean z10 = this.f46677e;
        ?? r10 = z10;
        if (z10) {
            r10 = 1;
        }
        return iHashCode + r10;
    }

    public final String toString() {
        Integer num = this.f46676d;
        StringBuilder sb2 = new StringBuilder("PlaylistAndLessonsJoin(nameWithLanguage=");
        sb2.append(this.f46673a);
        sb2.append(", language=");
        sb2.append(this.f46674b);
        sb2.append(", contentId=");
        sb2.append(this.f46675c);
        sb2.append(", order=");
        sb2.append(num);
        sb2.append(", isCourse=");
        return C0166e.m769p(sb2, this.f46677e, ")");
    }
}
