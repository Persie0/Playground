package bj;

import android.os.Bundle;
import com.linguist.R;
import dm.C5207g;
import p003a2.C0009a;
import p040c4.InterfaceC1687l;

/* JADX INFO: renamed from: bj.z */
/* JADX INFO: loaded from: classes2.dex */
public final class C1603z implements InterfaceC1687l {

    /* JADX INFO: renamed from: a */
    public final String f9091a;

    /* JADX INFO: renamed from: b */
    public final boolean f9092b;

    /* JADX INFO: renamed from: c */
    public final int f9093c;

    /* JADX INFO: renamed from: d */
    public final String f9094d;

    /* JADX INFO: renamed from: e */
    public final int f9095e;

    public C1603z() {
        this("", -1, "", true);
    }

    public C1603z(String str, int i10, String str2, boolean z10) {
        C5207g.m11111f(str, "oldName");
        C5207g.m11111f(str2, "itemURL");
        this.f9091a = str;
        this.f9092b = z10;
        this.f9093c = i10;
        this.f9094d = str2;
        this.f9095e = R.id.actionToAddPlaylist;
    }

    @Override // p040c4.InterfaceC1687l
    /* JADX INFO: renamed from: d */
    public final Bundle mo482d() {
        Bundle bundle = new Bundle();
        bundle.putString("oldName", this.f9091a);
        bundle.putBoolean("isAdd", this.f9092b);
        bundle.putInt("itemId", this.f9093c);
        bundle.putString("itemURL", this.f9094d);
        return bundle;
    }

    @Override // p040c4.InterfaceC1687l
    /* JADX INFO: renamed from: e */
    public final int mo483e() {
        return this.f9095e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1603z)) {
            return false;
        }
        C1603z c1603z = (C1603z) obj;
        if (C5207g.m11106a(this.f9091a, c1603z.f9091a) && this.f9092b == c1603z.f9092b && this.f9093c == c1603z.f9093c && C5207g.m11106a(this.f9094d, c1603z.f9094d)) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    public final int hashCode() {
        int iHashCode = this.f9091a.hashCode() * 31;
        boolean z10 = this.f9092b;
        ?? r10 = z10;
        if (z10) {
            r10 = 1;
        }
        return this.f9094d.hashCode() + C0009a.m16d(this.f9093c, (iHashCode + r10) * 31, 31);
    }

    public final String toString() {
        return "ActionToAddPlaylist(oldName=" + this.f9091a + ", isAdd=" + this.f9092b + ", itemId=" + this.f9093c + ", itemURL=" + this.f9094d + ")";
    }
}
