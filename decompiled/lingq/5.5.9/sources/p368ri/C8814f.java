package p368ri;

import android.os.Bundle;
import android.support.v4.media.session.C0166e;
import dm.C5207g;
import p003a2.C0009a;
import p040c4.InterfaceC1680e;

/* JADX INFO: renamed from: ri.f */
/* JADX INFO: loaded from: classes2.dex */
public final class C8814f implements InterfaceC1680e {

    /* JADX INFO: renamed from: a */
    public final String f46701a;

    /* JADX INFO: renamed from: b */
    public final String f46702b;

    public C8814f(String str, String str2) {
        this.f46701a = str;
        this.f46702b = str2;
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    public static final C8814f fromBundle(Bundle bundle) {
        if (!C0166e.m778y(bundle, "bundle", C8814f.class, "url")) {
            throw new IllegalArgumentException("Required argument \"url\" is missing and does not have an android:defaultValue");
        }
        String string = bundle.getString("url");
        if (string != null) {
            return new C8814f(string, bundle.containsKey("title") ? bundle.getString("title") : null);
        }
        throw new IllegalArgumentException("Argument \"url\" is marked as non-null but was passed a null value.");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8814f)) {
            return false;
        }
        C8814f c8814f = (C8814f) obj;
        return C5207g.m11106a(this.f46701a, c8814f.f46701a) && C5207g.m11106a(this.f46702b, c8814f.f46702b);
    }

    public final int hashCode() {
        int iHashCode = this.f46701a.hashCode() * 31;
        String str = this.f46702b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("WebViewFragmentArgs(url=");
        sb2.append(this.f46701a);
        sb2.append(", title=");
        return C0009a.m23l(sb2, this.f46702b, ")");
    }
}
