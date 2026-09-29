package p015ak;

import android.os.Bundle;
import android.support.v4.media.session.C0166e;
import dm.C5207g;
import p003a2.C0009a;
import p040c4.InterfaceC1680e;

/* JADX INFO: renamed from: ak.e */
/* JADX INFO: loaded from: classes2.dex */
public final class C0108e implements InterfaceC1680e {

    /* JADX INFO: renamed from: a */
    public final String f275a;

    public C0108e() {
        this("");
    }

    public C0108e(String str) {
        C5207g.m11111f(str, "authCode");
        this.f275a = str;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    public static final C0108e fromBundle(Bundle bundle) {
        String string;
        if (C0166e.m778y(bundle, "bundle", C0108e.class, "authCode")) {
            string = bundle.getString("authCode");
            if (string == null) {
                throw new IllegalArgumentException("Argument \"authCode\" is marked as non-null but was passed a null value.");
            }
        } else {
            string = "";
        }
        return new C0108e(string);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0108e) && C5207g.m11106a(this.f275a, ((C0108e) obj).f275a);
    }

    public final int hashCode() {
        return this.f275a.hashCode();
    }

    public final String toString() {
        return C0009a.m23l(new StringBuilder("LoginFragmentArgs(authCode="), this.f275a, ")");
    }
}
