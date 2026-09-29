package kh;

import android.os.Bundle;
import android.support.v4.media.session.C0166e;
import com.linguist.R;
import dm.C5207g;
import p040c4.InterfaceC1687l;

/* JADX INFO: renamed from: kh.o */
/* JADX INFO: loaded from: classes.dex */
public final class C6688o implements InterfaceC1687l {

    /* JADX INFO: renamed from: a */
    public final int f37819a;

    /* JADX INFO: renamed from: b */
    public final String f37820b;

    /* JADX INFO: renamed from: c */
    public final boolean f37821c;

    /* JADX INFO: renamed from: d */
    public final boolean f37822d;

    /* JADX INFO: renamed from: e */
    public final int f37823e;

    public C6688o() {
        this("", -1, false, false);
    }

    public C6688o(String str, int i10, boolean z10, boolean z11) {
        C5207g.m11111f(str, "itemURL");
        this.f37819a = i10;
        this.f37820b = str;
        this.f37821c = z10;
        this.f37822d = z11;
        this.f37823e = R.id.actionToPlaylists;
    }

    @Override // p040c4.InterfaceC1687l
    /* JADX INFO: renamed from: d */
    public final Bundle mo482d() {
        Bundle bundle = new Bundle();
        bundle.putInt("itemId", this.f37819a);
        bundle.putString("itemURL", this.f37820b);
        bundle.putBoolean("isCourse", this.f37821c);
        bundle.putBoolean("isRemovePlaylist", this.f37822d);
        return bundle;
    }

    @Override // p040c4.InterfaceC1687l
    /* JADX INFO: renamed from: e */
    public final int mo483e() {
        return this.f37823e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6688o)) {
            return false;
        }
        C6688o c6688o = (C6688o) obj;
        return this.f37819a == c6688o.f37819a && C5207g.m11106a(this.f37820b, c6688o.f37820b) && this.f37821c == c6688o.f37821c && this.f37822d == c6688o.f37822d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [int] */
    /* JADX WARN: Type inference failed for: r0v6, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3, types: [int] */
    /* JADX WARN: Type inference failed for: r2v2, types: [int] */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    public final int hashCode() {
        int iM758d = C0166e.m758d(this.f37820b, Integer.hashCode(this.f37819a) * 31, 31);
        ?? r10 = 1;
        boolean z10 = this.f37821c;
        ?? r11 = z10;
        if (z10) {
            r11 = 1;
        }
        int i10 = (iM758d + r11) * 31;
        boolean z11 = this.f37822d;
        if (!z11) {
            r10 = z11;
        }
        return i10 + r10;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ActionToPlaylists(itemId=");
        sb2.append(this.f37819a);
        sb2.append(", itemURL=");
        sb2.append(this.f37820b);
        sb2.append(", isCourse=");
        sb2.append(this.f37821c);
        sb2.append(", isRemovePlaylist=");
        return C0166e.m769p(sb2, this.f37822d, ")");
    }
}
