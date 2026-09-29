package si;

import android.os.Bundle;
import android.support.v4.media.session.C0166e;
import dm.C5207g;
import p003a2.C0009a;
import p040c4.InterfaceC1680e;

/* JADX INFO: renamed from: si.j */
/* JADX INFO: loaded from: classes2.dex */
public final class C9026j implements InterfaceC1680e {

    /* JADX INFO: renamed from: a */
    public final String f47261a;

    /* JADX INFO: renamed from: b */
    public final String f47262b;

    public C9026j(String str, String str2) {
        this.f47261a = str;
        this.f47262b = str2;
    }

    /* JADX WARN: Unreachable blocks removed: 3, instructions: 3 */
    public static final C9026j fromBundle(Bundle bundle) {
        if (!C0166e.m778y(bundle, "bundle", C9026j.class, "challengeCode")) {
            throw new IllegalArgumentException("Required argument \"challengeCode\" is missing and does not have an android:defaultValue");
        }
        String string = bundle.getString("challengeCode");
        if (string == null) {
            throw new IllegalArgumentException("Argument \"challengeCode\" is marked as non-null but was passed a null value.");
        }
        if (!bundle.containsKey("title")) {
            throw new IllegalArgumentException("Required argument \"title\" is missing and does not have an android:defaultValue");
        }
        String string2 = bundle.getString("title");
        if (string2 != null) {
            return new C9026j(string, string2);
        }
        throw new IllegalArgumentException("Argument \"title\" is marked as non-null but was passed a null value.");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9026j)) {
            return false;
        }
        C9026j c9026j = (C9026j) obj;
        return C5207g.m11106a(this.f47261a, c9026j.f47261a) && C5207g.m11106a(this.f47262b, c9026j.f47262b);
    }

    public final int hashCode() {
        return this.f47262b.hashCode() + (this.f47261a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ChallengeShareFragmentArgs(challengeCode=");
        sb2.append(this.f47261a);
        sb2.append(", title=");
        return C0009a.m23l(sb2, this.f47262b, ")");
    }
}
