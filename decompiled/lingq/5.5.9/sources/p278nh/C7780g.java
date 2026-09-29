package p278nh;

import android.support.v4.media.C0141b;
import com.linguist.R;
import dm.C5207g;
import p003a2.C0009a;

/* JADX INFO: renamed from: nh.g */
/* JADX INFO: loaded from: classes.dex */
public final class C7780g {

    /* JADX INFO: renamed from: a */
    public final String f42717a;

    /* JADX INFO: renamed from: b */
    public final double f42718b;

    /* JADX INFO: renamed from: c */
    public final int f42719c;

    /* JADX INFO: renamed from: d */
    public final int f42720d;

    /* JADX INFO: renamed from: e */
    public final int f42721e = R.attr.tertiaryTextColor;

    public C7780g(String str, double d10, int i10, int i11) {
        this.f42717a = str;
        this.f42718b = d10;
        this.f42719c = i10;
        this.f42720d = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7780g)) {
            return false;
        }
        C7780g c7780g = (C7780g) obj;
        if (C5207g.m11106a(this.f42717a, c7780g.f42717a) && Double.compare(this.f42718b, c7780g.f42718b) == 0 && this.f42719c == c7780g.f42719c && this.f42720d == c7780g.f42720d && this.f42721e == c7780g.f42721e) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f42721e) + C0009a.m16d(this.f42720d, C0009a.m16d(this.f42719c, C0141b.m609e(this.f42718b, this.f42717a.hashCode() * 31, 31), 31), 31);
    }

    public final String toString() {
        return "NumberItem(id=" + this.f42717a + ", number=" + this.f42718b + ", title=" + this.f42719c + ", numberColor=" + this.f42720d + ", titleColor=" + this.f42721e + ")";
    }
}
