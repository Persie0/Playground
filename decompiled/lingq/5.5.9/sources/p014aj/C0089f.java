package p014aj;

import android.os.Bundle;
import android.support.v4.media.session.C0166e;
import dm.C5207g;
import p003a2.C0009a;
import p040c4.InterfaceC1680e;

/* JADX INFO: renamed from: aj.f */
/* JADX INFO: loaded from: classes2.dex */
public final class C0089f implements InterfaceC1680e {

    /* JADX INFO: renamed from: a */
    public final String f243a;

    /* JADX INFO: renamed from: b */
    public final String f244b;

    public C0089f(String str, String str2) {
        this.f243a = str;
        this.f244b = str2;
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    public static final C0089f fromBundle(Bundle bundle) {
        if (!C0166e.m778y(bundle, "bundle", C0089f.class, "languageCode")) {
            throw new IllegalArgumentException("Required argument \"languageCode\" is missing and does not have an android:defaultValue");
        }
        String string = bundle.getString("languageCode");
        if (string == null) {
            throw new IllegalArgumentException("Argument \"languageCode\" is marked as non-null but was passed a null value.");
        }
        if (!bundle.containsKey("title")) {
            throw new IllegalArgumentException("Required argument \"title\" is missing and does not have an android:defaultValue");
        }
        String string2 = bundle.getString("title");
        if (string2 != null) {
            return new C0089f(string, string2);
        }
        throw new IllegalArgumentException("Argument \"title\" is marked as non-null but was passed a null value.");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0089f)) {
            return false;
        }
        C0089f c0089f = (C0089f) obj;
        if (C5207g.m11106a(this.f243a, c0089f.f243a) && C5207g.m11106a(this.f244b, c0089f.f244b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f244b.hashCode() + (this.f243a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("NotificationSettingsParentFragmentArgs(languageCode=");
        sb2.append(this.f243a);
        sb2.append(", title=");
        return C0009a.m23l(sb2, this.f244b, ")");
    }
}
