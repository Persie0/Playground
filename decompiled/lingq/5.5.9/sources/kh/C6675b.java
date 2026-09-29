package kh;

import android.os.Bundle;
import com.linguist.R;
import dm.C5207g;
import p003a2.C0009a;
import p040c4.InterfaceC1687l;

/* JADX INFO: renamed from: kh.b */
/* JADX INFO: loaded from: classes.dex */
public final class C6675b implements InterfaceC1687l {

    /* JADX INFO: renamed from: a */
    public final String f37765a;

    /* JADX INFO: renamed from: b */
    public final boolean f37766b;

    /* JADX INFO: renamed from: c */
    public final String f37767c;

    /* JADX INFO: renamed from: d */
    public final int f37768d;

    public C6675b(String str, String str2, boolean z10) {
        C5207g.m11111f(str, "challengeCode");
        this.f37765a = str;
        this.f37766b = z10;
        this.f37767c = str2;
        this.f37768d = R.id.actionToChallengeDetails;
    }

    @Override // p040c4.InterfaceC1687l
    /* JADX INFO: renamed from: d */
    public final Bundle mo482d() {
        Bundle bundle = new Bundle();
        bundle.putString("challengeCode", this.f37765a);
        bundle.putBoolean("isPast", this.f37766b);
        bundle.putString("languageFromDeeplink", this.f37767c);
        return bundle;
    }

    @Override // p040c4.InterfaceC1687l
    /* JADX INFO: renamed from: e */
    public final int mo483e() {
        return this.f37768d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6675b)) {
            return false;
        }
        C6675b c6675b = (C6675b) obj;
        return C5207g.m11106a(this.f37765a, c6675b.f37765a) && this.f37766b == c6675b.f37766b && C5207g.m11106a(this.f37767c, c6675b.f37767c);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    public final int hashCode() {
        int iHashCode = this.f37765a.hashCode() * 31;
        boolean z10 = this.f37766b;
        ?? r10 = z10;
        if (z10) {
            r10 = 1;
        }
        return this.f37767c.hashCode() + ((iHashCode + r10) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ActionToChallengeDetails(challengeCode=");
        sb2.append(this.f37765a);
        sb2.append(", isPast=");
        sb2.append(this.f37766b);
        sb2.append(", languageFromDeeplink=");
        return C0009a.m23l(sb2, this.f37767c, ")");
    }
}
