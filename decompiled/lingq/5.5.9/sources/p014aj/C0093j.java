package p014aj;

import android.os.Bundle;
import android.support.v4.media.session.C0166e;
import dm.C5207g;
import p003a2.C0009a;
import p040c4.InterfaceC1680e;

/* JADX INFO: renamed from: aj.j */
/* JADX INFO: loaded from: classes2.dex */
public final class C0093j implements InterfaceC1680e {

    /* JADX INFO: renamed from: a */
    public final String f248a;

    /* JADX INFO: renamed from: b */
    public final String f249b;

    public C0093j() {
        this("", "");
    }

    public C0093j(String str, String str2) {
        C5207g.m11111f(str, "languageCode");
        C5207g.m11111f(str2, "title");
        this.f248a = str;
        this.f249b = str2;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    public static final C0093j fromBundle(Bundle bundle) {
        String string;
        String string2 = "";
        if (C0166e.m778y(bundle, "bundle", C0093j.class, "languageCode")) {
            string = bundle.getString("languageCode");
            if (string == null) {
                throw new IllegalArgumentException("Argument \"languageCode\" is marked as non-null but was passed a null value.");
            }
        } else {
            string = "";
        }
        if (bundle.containsKey("title") && (string2 = bundle.getString("title")) == null) {
            throw new IllegalArgumentException("Argument \"title\" is marked as non-null but was passed a null value.");
        }
        return new C0093j(string, string2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0093j)) {
            return false;
        }
        C0093j c0093j = (C0093j) obj;
        return C5207g.m11106a(this.f248a, c0093j.f248a) && C5207g.m11106a(this.f249b, c0093j.f249b);
    }

    public final int hashCode() {
        return this.f249b.hashCode() + (this.f248a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("NotificationsDailyLingQFragmentArgs(languageCode=");
        sb2.append(this.f248a);
        sb2.append(", title=");
        return C0009a.m23l(sb2, this.f249b, ")");
    }
}
