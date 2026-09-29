package p159hi;

import android.support.v4.media.C0141b;
import android.support.v4.media.session.C0166e;
import dm.C5207g;
import p003a2.C0009a;

/* JADX INFO: renamed from: hi.a */
/* JADX INFO: loaded from: classes.dex */
public final class C6050a {

    /* JADX INFO: renamed from: a */
    public final int f35721a;

    /* JADX INFO: renamed from: b */
    public final Integer f35722b;

    /* JADX INFO: renamed from: c */
    public final int f35723c;

    /* JADX INFO: renamed from: d */
    public final String f35724d;

    /* JADX INFO: renamed from: e */
    public final double f35725e;

    /* JADX INFO: renamed from: f */
    public final double f35726f;

    /* JADX INFO: renamed from: g */
    public final boolean f35727g;

    /* JADX INFO: renamed from: h */
    public final boolean f35728h;

    /* JADX INFO: renamed from: i */
    public final String f35729i;

    /* JADX INFO: renamed from: j */
    public final String f35730j;

    /* JADX INFO: renamed from: k */
    public final String f35731k;

    /* JADX INFO: renamed from: l */
    public final String f35732l;

    /* JADX INFO: renamed from: m */
    public final int f35733m;

    public C6050a(int i10, Integer num, int i11, String str, double d10, double d11, boolean z10, boolean z11, String str2, String str3, String str4, String str5, int i12) {
        this.f35721a = i10;
        this.f35722b = num;
        this.f35723c = i11;
        this.f35724d = str;
        this.f35725e = d10;
        this.f35726f = d11;
        this.f35727g = z10;
        this.f35728h = z11;
        this.f35729i = str2;
        this.f35730j = str3;
        this.f35731k = str4;
        this.f35732l = str5;
        this.f35733m = i12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6050a)) {
            return false;
        }
        C6050a c6050a = (C6050a) obj;
        return this.f35721a == c6050a.f35721a && C5207g.m11106a(this.f35722b, c6050a.f35722b) && this.f35723c == c6050a.f35723c && C5207g.m11106a(this.f35724d, c6050a.f35724d) && Double.compare(this.f35725e, c6050a.f35725e) == 0 && Double.compare(this.f35726f, c6050a.f35726f) == 0 && this.f35727g == c6050a.f35727g && this.f35728h == c6050a.f35728h && C5207g.m11106a(this.f35729i, c6050a.f35729i) && C5207g.m11106a(this.f35730j, c6050a.f35730j) && C5207g.m11106a(this.f35731k, c6050a.f35731k) && C5207g.m11106a(this.f35732l, c6050a.f35732l) && this.f35733m == c6050a.f35733m;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v10, types: [int] */
    /* JADX WARN: Type inference failed for: r2v24 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r3v2, types: [int] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5 */
    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f35721a) * 31;
        int iHashCode2 = 0;
        Integer num = this.f35722b;
        int iM16d = C0009a.m16d(this.f35723c, (iHashCode + (num == null ? 0 : num.hashCode())) * 31, 31);
        String str = this.f35724d;
        int iM609e = C0141b.m609e(this.f35726f, C0141b.m609e(this.f35725e, (iM16d + (str == null ? 0 : str.hashCode())) * 31, 31), 31);
        boolean z10 = this.f35727g;
        ?? r10 = z10;
        if (z10) {
            r10 = 1;
        }
        int i10 = (iM609e + r10) * 31;
        boolean z11 = this.f35728h;
        int i11 = (i10 + (z11 ? 1 : z11)) * 31;
        String str2 = this.f35729i;
        int iHashCode3 = (i11 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f35730j;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f35731k;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f35732l;
        if (str5 != null) {
            iHashCode2 = str5.hashCode();
        }
        return Integer.hashCode(this.f35733m) + ((iHashCode5 + iHashCode2) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("LessonCompleteData(id=");
        sb2.append(this.f35721a);
        sb2.append(", nextLessonId=");
        sb2.append(this.f35722b);
        sb2.append(", collectionId=");
        sb2.append(this.f35723c);
        sb2.append(", collectionTitle=");
        sb2.append(this.f35724d);
        sb2.append(", readTimes=");
        sb2.append(this.f35725e);
        sb2.append(", listenTimes=");
        sb2.append(this.f35726f);
        sb2.append(", isFavorite=");
        sb2.append(this.f35727g);
        sb2.append(", isRoseGiven=");
        sb2.append(this.f35728h);
        sb2.append(", url=");
        sb2.append(this.f35729i);
        sb2.append(", audioUrl=");
        sb2.append(this.f35730j);
        sb2.append(", originalImageUrl=");
        sb2.append(this.f35731k);
        sb2.append(", status=");
        sb2.append(this.f35732l);
        sb2.append(", price=");
        return C0166e.m768o(sb2, this.f35733m, ")");
    }
}
