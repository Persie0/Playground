package kh;

import android.os.Bundle;
import com.linguist.R;
import dm.C5207g;
import p003a2.C0009a;
import p040c4.InterfaceC1687l;

/* JADX INFO: renamed from: kh.d */
/* JADX INFO: loaded from: classes.dex */
public final class C6677d implements InterfaceC1687l {

    /* JADX INFO: renamed from: a */
    public final String f37772a;

    /* JADX INFO: renamed from: b */
    public final int f37773b;

    public C6677d() {
        this("");
    }

    public C6677d(String str) {
        C5207g.m11111f(str, "languageFromDeeplink");
        this.f37772a = str;
        this.f37773b = R.id.actionToChallenges;
    }

    @Override // p040c4.InterfaceC1687l
    /* JADX INFO: renamed from: d */
    public final Bundle mo482d() {
        Bundle bundle = new Bundle();
        bundle.putString("languageFromDeeplink", this.f37772a);
        return bundle;
    }

    @Override // p040c4.InterfaceC1687l
    /* JADX INFO: renamed from: e */
    public final int mo483e() {
        return this.f37773b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C6677d) && C5207g.m11106a(this.f37772a, ((C6677d) obj).f37772a);
    }

    public final int hashCode() {
        return this.f37772a.hashCode();
    }

    public final String toString() {
        return C0009a.m23l(new StringBuilder("ActionToChallenges(languageFromDeeplink="), this.f37772a, ")");
    }
}
