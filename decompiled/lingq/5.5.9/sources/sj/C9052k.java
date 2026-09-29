package sj;

import android.os.Bundle;
import android.support.v4.media.session.C0166e;
import dm.C5207g;
import p003a2.C0009a;
import p040c4.InterfaceC1680e;

/* JADX INFO: renamed from: sj.k */
/* JADX INFO: loaded from: classes2.dex */
public final class C9052k implements InterfaceC1680e {

    /* JADX INFO: renamed from: a */
    public final String f47336a;

    /* JADX INFO: renamed from: b */
    public final String f47337b;

    public C9052k() {
        this("", "");
    }

    public C9052k(String str, String str2) {
        C5207g.m11111f(str, "username");
        C5207g.m11111f(str2, "password");
        this.f47336a = str;
        this.f47337b = str2;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    public static final C9052k fromBundle(Bundle bundle) {
        String string;
        String string2 = "";
        if (C0166e.m778y(bundle, "bundle", C9052k.class, "username")) {
            string = bundle.getString("username");
            if (string == null) {
                throw new IllegalArgumentException("Argument \"username\" is marked as non-null but was passed a null value.");
            }
        } else {
            string = "";
        }
        if (bundle.containsKey("password") && (string2 = bundle.getString("password")) == null) {
            throw new IllegalArgumentException("Argument \"password\" is marked as non-null but was passed a null value.");
        }
        return new C9052k(string, string2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9052k)) {
            return false;
        }
        C9052k c9052k = (C9052k) obj;
        return C5207g.m11106a(this.f47336a, c9052k.f47336a) && C5207g.m11106a(this.f47337b, c9052k.f47337b);
    }

    public final int hashCode() {
        return this.f47337b.hashCode() + (this.f47336a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("OnboardingFinishFragmentArgs(username=");
        sb2.append(this.f47336a);
        sb2.append(", password=");
        return C0009a.m23l(sb2, this.f47337b, ")");
    }
}
