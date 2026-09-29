package bj;

import android.os.Bundle;
import android.support.v4.media.session.C0166e;
import dm.C5207g;
import p040c4.InterfaceC1680e;

/* JADX INFO: renamed from: bj.y */
/* JADX INFO: loaded from: classes2.dex */
public final class C1602y implements InterfaceC1680e {

    /* JADX INFO: renamed from: a */
    public final int f9087a;

    /* JADX INFO: renamed from: b */
    public final String f9088b;

    /* JADX INFO: renamed from: c */
    public final boolean f9089c;

    /* JADX INFO: renamed from: d */
    public final boolean f9090d;

    public C1602y() {
        this("", -1, false, false);
    }

    public C1602y(String str, int i10, boolean z10, boolean z11) {
        C5207g.m11111f(str, "itemURL");
        this.f9087a = i10;
        this.f9088b = str;
        this.f9089c = z10;
        this.f9090d = z11;
    }

    public static final C1602y fromBundle(Bundle bundle) {
        String string;
        int i10 = C0166e.m778y(bundle, "bundle", C1602y.class, "itemId") ? bundle.getInt("itemId") : -1;
        if (bundle.containsKey("itemURL")) {
            string = bundle.getString("itemURL");
            if (string == null) {
                throw new IllegalArgumentException("Argument \"itemURL\" is marked as non-null but was passed a null value.");
            }
        } else {
            string = "";
        }
        boolean z10 = false;
        boolean z11 = bundle.containsKey("isCourse") ? bundle.getBoolean("isCourse") : false;
        if (bundle.containsKey("isRemovePlaylist")) {
            z10 = bundle.getBoolean("isRemovePlaylist");
        }
        return new C1602y(string, i10, z11, z10);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1602y)) {
            return false;
        }
        C1602y c1602y = (C1602y) obj;
        return this.f9087a == c1602y.f9087a && C5207g.m11106a(this.f9088b, c1602y.f9088b) && this.f9089c == c1602y.f9089c && this.f9090d == c1602y.f9090d;
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
        int iM758d = C0166e.m758d(this.f9088b, Integer.hashCode(this.f9087a) * 31, 31);
        ?? r10 = 1;
        boolean z10 = this.f9089c;
        ?? r11 = z10;
        if (z10) {
            r11 = 1;
        }
        int i10 = (iM758d + r11) * 31;
        boolean z11 = this.f9090d;
        if (!z11) {
            r10 = z11;
        }
        return i10 + r10;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PlaylistsFragmentArgs(itemId=");
        sb2.append(this.f9087a);
        sb2.append(", itemURL=");
        sb2.append(this.f9088b);
        sb2.append(", isCourse=");
        sb2.append(this.f9089c);
        sb2.append(", isRemovePlaylist=");
        return C0166e.m769p(sb2, this.f9090d, ")");
    }
}
