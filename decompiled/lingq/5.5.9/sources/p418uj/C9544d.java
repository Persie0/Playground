package p418uj;

import android.support.v4.media.session.C0166e;
import dm.C5207g;

/* JADX INFO: renamed from: uj.d */
/* JADX INFO: loaded from: classes2.dex */
public final class C9544d {

    /* JADX INFO: renamed from: a */
    public final boolean f49108a;

    /* JADX INFO: renamed from: b */
    public final String f49109b;

    /* JADX INFO: renamed from: c */
    public final boolean f49110c;

    public C9544d() {
        this(0);
    }

    public /* synthetic */ C9544d(int i10) {
        this("", false, false);
    }

    public C9544d(String str, boolean z10, boolean z11) {
        C5207g.m11111f(str, "emoji");
        this.f49108a = z10;
        this.f49109b = str;
        this.f49110c = z11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9544d)) {
            return false;
        }
        C9544d c9544d = (C9544d) obj;
        return this.f49108a == c9544d.f49108a && C5207g.m11106a(this.f49109b, c9544d.f49109b) && this.f49110c == c9544d.f49110c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v4, types: [int] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    public final int hashCode() {
        boolean z10 = this.f49108a;
        ?? r10 = z10;
        if (z10) {
            r10 = 1;
        }
        int iM758d = C0166e.m758d(this.f49109b, r10 * 31, 31);
        boolean z11 = this.f49110c;
        return iM758d + (z11 ? 1 : z11);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ResultActivity(isCorrect=");
        sb2.append(this.f49108a);
        sb2.append(", emoji=");
        sb2.append(this.f49109b);
        sb2.append(", show=");
        return C0166e.m769p(sb2, this.f49110c, ")");
    }
}
