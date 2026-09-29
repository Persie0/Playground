package p278nh;

import android.support.v4.media.session.C0166e;
import dm.C5207g;

/* JADX INFO: renamed from: nh.l */
/* JADX INFO: loaded from: classes.dex */
public final class C7785l {

    /* JADX INFO: renamed from: a */
    public final Integer f42734a;

    /* JADX INFO: renamed from: b */
    public final String f42735b;

    /* JADX INFO: renamed from: c */
    public final boolean f42736c;

    /* JADX INFO: renamed from: d */
    public final String f42737d;

    public C7785l(Integer num, String str, boolean z10, String str2, int i10) {
        num = (i10 & 1) != 0 ? null : num;
        str = (i10 & 2) != 0 ? "" : str;
        z10 = (i10 & 4) != 0 ? false : z10;
        C5207g.m11111f(str, "dynamicText");
        C5207g.m11111f(str2, "key");
        this.f42734a = num;
        this.f42735b = str;
        this.f42736c = z10;
        this.f42737d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7785l)) {
            return false;
        }
        C7785l c7785l = (C7785l) obj;
        return C5207g.m11106a(this.f42734a, c7785l.f42734a) && C5207g.m11106a(this.f42735b, c7785l.f42735b) && this.f42736c == c7785l.f42736c && C5207g.m11106a(this.f42737d, c7785l.f42737d);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [int] */
    /* JADX WARN: Type inference failed for: r1v2, types: [int] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    public final int hashCode() {
        Integer num = this.f42734a;
        int iM758d = C0166e.m758d(this.f42735b, (num == null ? 0 : num.hashCode()) * 31, 31);
        boolean z10 = this.f42736c;
        ?? r10 = z10;
        if (z10) {
            r10 = 1;
        }
        return this.f42737d.hashCode() + ((iM758d + r10) * 31);
    }

    public final String toString() {
        return "SelectionItem(text=" + this.f42734a + ", dynamicText=" + this.f42735b + ", isSelected=" + this.f42736c + ", key=" + this.f42737d + ")";
    }
}
