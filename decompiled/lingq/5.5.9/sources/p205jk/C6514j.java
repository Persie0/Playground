package p205jk;

import android.support.v4.media.session.C0166e;
import dm.C5207g;

/* JADX INFO: renamed from: jk.j */
/* JADX INFO: loaded from: classes2.dex */
public final class C6514j {

    /* JADX INFO: renamed from: a */
    public final String f37142a;

    /* JADX INFO: renamed from: b */
    public final String f37143b;

    /* JADX INFO: renamed from: c */
    public final String f37144c;

    /* JADX INFO: renamed from: d */
    public final String f37145d;

    /* JADX INFO: renamed from: e */
    public final String f37146e;

    /* JADX INFO: renamed from: f */
    public final boolean f37147f;

    /* JADX INFO: renamed from: g */
    public final boolean f37148g;

    public /* synthetic */ C6514j(String str, String str2, String str3, String str4, String str5, int i10) {
        this(str, str2, str3, (i10 & 8) != 0 ? "" : str4, (i10 & 16) != 0 ? "" : str5, false, false);
    }

    public C6514j(String str, String str2, String str3, String str4, String str5, boolean z10, boolean z11) {
        C5207g.m11111f(str, "id");
        C5207g.m11111f(str4, "pricePerMonth");
        C5207g.m11111f(str5, "savePercentage");
        this.f37142a = str;
        this.f37143b = str2;
        this.f37144c = str3;
        this.f37145d = str4;
        this.f37146e = str5;
        this.f37147f = z10;
        this.f37148g = z11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6514j)) {
            return false;
        }
        C6514j c6514j = (C6514j) obj;
        return C5207g.m11106a(this.f37142a, c6514j.f37142a) && C5207g.m11106a(this.f37143b, c6514j.f37143b) && C5207g.m11106a(this.f37144c, c6514j.f37144c) && C5207g.m11106a(this.f37145d, c6514j.f37145d) && C5207g.m11106a(this.f37146e, c6514j.f37146e) && this.f37147f == c6514j.f37147f && this.f37148g == c6514j.f37148g;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v7, types: [int] */
    /* JADX WARN: Type inference failed for: r0v9, types: [int] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6, types: [int] */
    /* JADX WARN: Type inference failed for: r2v2, types: [int] */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    public final int hashCode() {
        int iM758d = C0166e.m758d(this.f37146e, C0166e.m758d(this.f37145d, C0166e.m758d(this.f37144c, C0166e.m758d(this.f37143b, this.f37142a.hashCode() * 31, 31), 31), 31), 31);
        ?? r10 = 1;
        boolean z10 = this.f37147f;
        ?? r11 = z10;
        if (z10) {
            r11 = 1;
        }
        int i10 = (iM758d + r11) * 31;
        boolean z11 = this.f37148g;
        if (!z11) {
            r10 = z11;
        }
        return i10 + r10;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("UpgradeItem(id=");
        sb2.append(this.f37142a);
        sb2.append(", upgradeTitle=");
        sb2.append(this.f37143b);
        sb2.append(", price=");
        sb2.append(this.f37144c);
        sb2.append(", pricePerMonth=");
        sb2.append(this.f37145d);
        sb2.append(", savePercentage=");
        sb2.append(this.f37146e);
        sb2.append(", isPopular=");
        sb2.append(this.f37147f);
        sb2.append(", isOffer=");
        return C0166e.m769p(sb2, this.f37148g, ")");
    }
}
