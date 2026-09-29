package si;

import android.os.Bundle;
import android.support.v4.media.session.C0166e;
import dm.C5207g;
import p003a2.C0009a;
import p040c4.InterfaceC1680e;

/* JADX INFO: renamed from: si.e */
/* JADX INFO: loaded from: classes2.dex */
public final class C9021e implements InterfaceC1680e {

    /* JADX INFO: renamed from: a */
    public final String f47250a;

    /* JADX INFO: renamed from: b */
    public final boolean f47251b;

    /* JADX INFO: renamed from: c */
    public final String f47252c;

    public C9021e(String str, String str2, boolean z10) {
        this.f47250a = str;
        this.f47251b = z10;
        this.f47252c = str2;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    public static final C9021e fromBundle(Bundle bundle) {
        String string;
        if (!C0166e.m778y(bundle, "bundle", C9021e.class, "challengeCode")) {
            throw new IllegalArgumentException("Required argument \"challengeCode\" is missing and does not have an android:defaultValue");
        }
        String string2 = bundle.getString("challengeCode");
        if (string2 == null) {
            throw new IllegalArgumentException("Argument \"challengeCode\" is marked as non-null but was passed a null value.");
        }
        boolean z10 = bundle.containsKey("isPast") ? bundle.getBoolean("isPast") : true;
        if (bundle.containsKey("languageFromDeeplink")) {
            string = bundle.getString("languageFromDeeplink");
            if (string == null) {
                throw new IllegalArgumentException("Argument \"languageFromDeeplink\" is marked as non-null but was passed a null value.");
            }
        } else {
            string = "";
        }
        return new C9021e(string2, string, z10);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9021e)) {
            return false;
        }
        C9021e c9021e = (C9021e) obj;
        return C5207g.m11106a(this.f47250a, c9021e.f47250a) && this.f47251b == c9021e.f47251b && C5207g.m11106a(this.f47252c, c9021e.f47252c);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    public final int hashCode() {
        int iHashCode = this.f47250a.hashCode() * 31;
        boolean z10 = this.f47251b;
        ?? r10 = z10;
        if (z10) {
            r10 = 1;
        }
        return this.f47252c.hashCode() + ((iHashCode + r10) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ChallengeDetailsFragmentArgs(challengeCode=");
        sb2.append(this.f47250a);
        sb2.append(", isPast=");
        sb2.append(this.f47251b);
        sb2.append(", languageFromDeeplink=");
        return C0009a.m23l(sb2, this.f47252c, ")");
    }
}
