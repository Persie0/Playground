package p205jk;

import android.os.Bundle;
import android.support.v4.media.session.C0166e;
import dm.C5207g;
import p003a2.C0009a;
import p040c4.InterfaceC1680e;

/* JADX INFO: renamed from: jk.g */
/* JADX INFO: loaded from: classes2.dex */
public final class C6511g implements InterfaceC1680e {

    /* JADX INFO: renamed from: a */
    public final String f37140a;

    /* JADX INFO: renamed from: b */
    public final String f37141b;

    public C6511g(String str, String str2) {
        this.f37140a = str;
        this.f37141b = str2;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    public static final C6511g fromBundle(Bundle bundle) {
        String string;
        if (!C0166e.m778y(bundle, "bundle", C6511g.class, "attemptedAction")) {
            throw new IllegalArgumentException("Required argument \"attemptedAction\" is missing and does not have an android:defaultValue");
        }
        String string2 = bundle.getString("attemptedAction");
        if (string2 == null) {
            throw new IllegalArgumentException("Argument \"attemptedAction\" is marked as non-null but was passed a null value.");
        }
        if (bundle.containsKey("offer")) {
            string = bundle.getString("offer");
            if (string == null) {
                throw new IllegalArgumentException("Argument \"offer\" is marked as non-null but was passed a null value.");
            }
        } else {
            string = "";
        }
        return new C6511g(string2, string);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6511g)) {
            return false;
        }
        C6511g c6511g = (C6511g) obj;
        return C5207g.m11106a(this.f37140a, c6511g.f37140a) && C5207g.m11106a(this.f37141b, c6511g.f37141b);
    }

    public final int hashCode() {
        return this.f37141b.hashCode() + (this.f37140a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("UpgradeFragmentArgs(attemptedAction=");
        sb2.append(this.f37140a);
        sb2.append(", offer=");
        return C0009a.m23l(sb2, this.f37141b, ")");
    }
}
