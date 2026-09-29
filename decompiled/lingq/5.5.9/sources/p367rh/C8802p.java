package p367rh;

import android.support.v4.media.session.C0166e;
import dm.C5207g;

/* JADX INFO: renamed from: rh.p */
/* JADX INFO: loaded from: classes.dex */
public final class C8802p {

    /* JADX INFO: renamed from: a */
    public final int f46663a;

    /* JADX INFO: renamed from: b */
    public final String f46664b;

    /* JADX INFO: renamed from: c */
    public final String f46665c;

    /* JADX INFO: renamed from: d */
    public final boolean f46666d;

    /* JADX INFO: renamed from: e */
    public final Integer f46667e;

    public C8802p(int i10, String str, String str2, boolean z10) {
        C5207g.m11111f(str, "language");
        C5207g.m11111f(str2, "type");
        this.f46663a = i10;
        this.f46664b = str;
        this.f46665c = str2;
        this.f46666d = z10;
        this.f46667e = 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8802p)) {
            return false;
        }
        C8802p c8802p = (C8802p) obj;
        return this.f46663a == c8802p.f46663a && C5207g.m11106a(this.f46664b, c8802p.f46664b) && C5207g.m11106a(this.f46665c, c8802p.f46665c) && this.f46666d == c8802p.f46666d && C5207g.m11106a(this.f46667e, c8802p.f46667e);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [int] */
    /* JADX WARN: Type inference failed for: r1v3, types: [int] */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9 */
    public final int hashCode() {
        int iM758d = C0166e.m758d(this.f46665c, C0166e.m758d(this.f46664b, Integer.hashCode(this.f46663a) * 31, 31), 31);
        boolean z10 = this.f46666d;
        ?? r10 = z10;
        if (z10) {
            r10 = 1;
        }
        int i10 = (iM758d + r10) * 31;
        Integer num = this.f46667e;
        return i10 + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        return "LibraryDownload(id=" + this.f46663a + ", language=" + this.f46664b + ", type=" + this.f46665c + ", isDownloaded=" + this.f46666d + ", downloadProgress=" + this.f46667e + ")";
    }
}
