package bj;

import android.os.Bundle;
import android.support.v4.media.session.C0166e;
import dm.C5207g;
import p003a2.C0009a;
import p040c4.InterfaceC1680e;

/* JADX INFO: renamed from: bj.i */
/* JADX INFO: loaded from: classes2.dex */
public final class C1586i implements InterfaceC1680e {

    /* JADX INFO: renamed from: a */
    public final String f9066a;

    /* JADX INFO: renamed from: b */
    public final boolean f9067b;

    /* JADX INFO: renamed from: c */
    public final int f9068c;

    /* JADX INFO: renamed from: d */
    public final String f9069d;

    public C1586i() {
        this("", -1, "", true);
    }

    public C1586i(String str, int i10, String str2, boolean z10) {
        C5207g.m11111f(str, "oldName");
        C5207g.m11111f(str2, "itemURL");
        this.f9066a = str;
        this.f9067b = z10;
        this.f9068c = i10;
        this.f9069d = str2;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    public static final C1586i fromBundle(Bundle bundle) {
        String string;
        String string2 = "";
        if (C0166e.m778y(bundle, "bundle", C1586i.class, "oldName")) {
            string = bundle.getString("oldName");
            if (string == null) {
                throw new IllegalArgumentException("Argument \"oldName\" is marked as non-null but was passed a null value.");
            }
        } else {
            string = string2;
        }
        boolean z10 = bundle.containsKey("isAdd") ? bundle.getBoolean("isAdd") : true;
        int i10 = bundle.containsKey("itemId") ? bundle.getInt("itemId") : -1;
        if (bundle.containsKey("itemURL") && (string2 = bundle.getString("itemURL")) == null) {
            throw new IllegalArgumentException("Argument \"itemURL\" is marked as non-null but was passed a null value.");
        }
        return new C1586i(string, i10, string2, z10);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1586i)) {
            return false;
        }
        C1586i c1586i = (C1586i) obj;
        return C5207g.m11106a(this.f9066a, c1586i.f9066a) && this.f9067b == c1586i.f9067b && this.f9068c == c1586i.f9068c && C5207g.m11106a(this.f9069d, c1586i.f9069d);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    public final int hashCode() {
        int iHashCode = this.f9066a.hashCode() * 31;
        boolean z10 = this.f9067b;
        ?? r10 = z10;
        if (z10) {
            r10 = 1;
        }
        return this.f9069d.hashCode() + C0009a.m16d(this.f9068c, (iHashCode + r10) * 31, 31);
    }

    public final String toString() {
        return "PlaylistAddFragmentArgs(oldName=" + this.f9066a + ", isAdd=" + this.f9067b + ", itemId=" + this.f9068c + ", itemURL=" + this.f9069d + ")";
    }
}
