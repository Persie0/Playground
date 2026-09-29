package si;

import android.os.Bundle;
import android.support.v4.media.session.C0166e;
import dm.C5207g;
import p003a2.C0009a;
import p040c4.InterfaceC1680e;

/* JADX INFO: renamed from: si.q */
/* JADX INFO: loaded from: classes2.dex */
public final class C9033q implements InterfaceC1680e {

    /* JADX INFO: renamed from: a */
    public final String f47273a;

    public C9033q() {
        this("");
    }

    public C9033q(String str) {
        C5207g.m11111f(str, "languageFromDeeplink");
        this.f47273a = str;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    public static final C9033q fromBundle(Bundle bundle) {
        String string;
        if (C0166e.m778y(bundle, "bundle", C9033q.class, "languageFromDeeplink")) {
            string = bundle.getString("languageFromDeeplink");
            if (string == null) {
                throw new IllegalArgumentException("Argument \"languageFromDeeplink\" is marked as non-null but was passed a null value.");
            }
        } else {
            string = "";
        }
        return new C9033q(string);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C9033q) && C5207g.m11106a(this.f47273a, ((C9033q) obj).f47273a);
    }

    public final int hashCode() {
        return this.f47273a.hashCode();
    }

    public final String toString() {
        return C0009a.m23l(new StringBuilder("ChallengesFragmentArgs(languageFromDeeplink="), this.f47273a, ")");
    }
}
