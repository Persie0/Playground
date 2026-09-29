package fj;

import android.os.Bundle;
import android.support.v4.media.session.C0166e;
import dm.C5207g;
import p003a2.C0009a;
import p040c4.InterfaceC1680e;

/* JADX INFO: renamed from: fj.n */
/* JADX INFO: loaded from: classes2.dex */
public final class C5553n implements InterfaceC1680e {

    /* JADX INFO: renamed from: a */
    public final String f34307a;

    /* JADX INFO: renamed from: b */
    public final String f34308b;

    public C5553n() {
        this("", "");
    }

    public C5553n(String str, String str2) {
        C5207g.m11111f(str, "url");
        C5207g.m11111f(str2, "title");
        this.f34307a = str;
        this.f34308b = str2;
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    public static final C5553n fromBundle(Bundle bundle) {
        String string;
        String string2 = "";
        if (C0166e.m778y(bundle, "bundle", C5553n.class, "url")) {
            string = bundle.getString("url");
            if (string == null) {
                throw new IllegalArgumentException("Argument \"url\" is marked as non-null but was passed a null value.");
            }
        } else {
            string = "";
        }
        if (bundle.containsKey("title") && (string2 = bundle.getString("title")) == null) {
            throw new IllegalArgumentException("Argument \"title\" is marked as non-null but was passed a null value.");
        }
        return new C5553n(string, string2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5553n)) {
            return false;
        }
        C5553n c5553n = (C5553n) obj;
        return C5207g.m11106a(this.f34307a, c5553n.f34307a) && C5207g.m11106a(this.f34308b, c5553n.f34308b);
    }

    public final int hashCode() {
        return this.f34308b.hashCode() + (this.f34307a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("UserImportParentFragmentArgs(url=");
        sb2.append(this.f34307a);
        sb2.append(", title=");
        return C0009a.m23l(sb2, this.f34308b, ")");
    }
}
