package p032bk;

import android.os.Bundle;
import android.support.v4.media.session.C0166e;
import dm.C5207g;
import p003a2.C0009a;
import p040c4.InterfaceC1680e;

/* JADX INFO: renamed from: bk.a */
/* JADX INFO: loaded from: classes2.dex */
public final class C1604a implements InterfaceC1680e {

    /* JADX INFO: renamed from: a */
    public final String f9096a;

    public C1604a(String str) {
        this.f9096a = str;
    }

    public static final C1604a fromBundle(Bundle bundle) {
        if (!C0166e.m778y(bundle, "bundle", C1604a.class, "email")) {
            throw new IllegalArgumentException("Required argument \"email\" is missing and does not have an android:defaultValue");
        }
        String string = bundle.getString("email");
        if (string != null) {
            return new C1604a(string);
        }
        throw new IllegalArgumentException("Argument \"email\" is marked as non-null but was passed a null value.");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C1604a) && C5207g.m11106a(this.f9096a, ((C1604a) obj).f9096a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f9096a.hashCode();
    }

    public final String toString() {
        return C0009a.m23l(new StringBuilder("CheckEmailFragmentArgs(email="), this.f9096a, ")");
    }
}
