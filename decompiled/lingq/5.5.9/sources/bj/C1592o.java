package bj;

import android.os.Bundle;
import android.support.v4.media.session.C0166e;
import dm.C5207g;
import p003a2.C0009a;
import p040c4.InterfaceC1680e;

/* JADX INFO: renamed from: bj.o */
/* JADX INFO: loaded from: classes2.dex */
public final class C1592o implements InterfaceC1680e {

    /* JADX INFO: renamed from: a */
    public final String f9078a;

    public C1592o() {
        this("");
    }

    public C1592o(String str) {
        C5207g.m11111f(str, "playlistLanguageFromDeeplink");
        this.f9078a = str;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    public static final C1592o fromBundle(Bundle bundle) {
        String string;
        if (C0166e.m778y(bundle, "bundle", C1592o.class, "playlistLanguageFromDeeplink")) {
            string = bundle.getString("playlistLanguageFromDeeplink");
            if (string == null) {
                throw new IllegalArgumentException("Argument \"playlistLanguageFromDeeplink\" is marked as non-null but was passed a null value.");
            }
        } else {
            string = "";
        }
        return new C1592o(string);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1592o) && C5207g.m11106a(this.f9078a, ((C1592o) obj).f9078a);
    }

    public final int hashCode() {
        return this.f9078a.hashCode();
    }

    public final String toString() {
        return C0009a.m23l(new StringBuilder("PlaylistFragmentArgs(playlistLanguageFromDeeplink="), this.f9078a, ")");
    }
}
