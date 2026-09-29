package p278nh;

import android.support.v4.media.session.C0166e;
import dm.C5207g;
import p003a2.C0009a;

/* JADX INFO: renamed from: nh.m */
/* JADX INFO: loaded from: classes.dex */
public final class C7786m {

    /* JADX INFO: renamed from: a */
    public final String f42738a;

    /* JADX INFO: renamed from: b */
    public final String f42739b;

    /* JADX INFO: renamed from: c */
    public final boolean f42740c;

    /* JADX INFO: renamed from: d */
    public final String f42741d;

    /* JADX INFO: renamed from: e */
    public final String f42742e;

    public C7786m() {
        this(null, false, 31);
    }

    public C7786m(String str, String str2, boolean z10, String str3, String str4) {
        C5207g.m11111f(str, "name");
        C5207g.m11111f(str2, "photo");
        C5207g.m11111f(str3, "key");
        this.f42738a = str;
        this.f42739b = str2;
        this.f42740c = z10;
        this.f42741d = str3;
        this.f42742e = str4;
    }

    public /* synthetic */ C7786m(String str, boolean z10, int i10) {
        this((i10 & 1) != 0 ? "" : str, (i10 & 2) != 0 ? "" : null, (i10 & 4) != 0 ? false : z10, (i10 & 8) != 0 ? "" : null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7786m)) {
            return false;
        }
        C7786m c7786m = (C7786m) obj;
        return C5207g.m11106a(this.f42738a, c7786m.f42738a) && C5207g.m11106a(this.f42739b, c7786m.f42739b) && this.f42740c == c7786m.f42740c && C5207g.m11106a(this.f42741d, c7786m.f42741d) && C5207g.m11106a(this.f42742e, c7786m.f42742e);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [int] */
    /* JADX WARN: Type inference failed for: r1v2, types: [int] */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9 */
    public final int hashCode() {
        int iM758d = C0166e.m758d(this.f42739b, this.f42738a.hashCode() * 31, 31);
        boolean z10 = this.f42740c;
        ?? r10 = z10;
        if (z10) {
            r10 = 1;
        }
        int iM758d2 = C0166e.m758d(this.f42741d, (iM758d + r10) * 31, 31);
        String str = this.f42742e;
        return iM758d2 + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SelectionUser(name=");
        sb2.append(this.f42738a);
        sb2.append(", photo=");
        sb2.append(this.f42739b);
        sb2.append(", isSelected=");
        sb2.append(this.f42740c);
        sb2.append(", key=");
        sb2.append(this.f42741d);
        sb2.append(", role=");
        return C0009a.m23l(sb2, this.f42742e, ")");
    }
}
