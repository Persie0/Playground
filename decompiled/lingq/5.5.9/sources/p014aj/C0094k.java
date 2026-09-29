package p014aj;

import android.os.Bundle;
import com.linguist.R;
import dm.C5207g;
import p003a2.C0009a;
import p040c4.InterfaceC1687l;

/* JADX INFO: renamed from: aj.k */
/* JADX INFO: loaded from: classes2.dex */
public final class C0094k implements InterfaceC1687l {

    /* JADX INFO: renamed from: a */
    public final String f250a;

    /* JADX INFO: renamed from: b */
    public final int f251b = R.id.actionToSelection;

    public C0094k(String str) {
        this.f250a = str;
    }

    @Override // p040c4.InterfaceC1687l
    /* JADX INFO: renamed from: d */
    public final Bundle mo482d() {
        Bundle bundle = new Bundle();
        bundle.putString("code", this.f250a);
        return bundle;
    }

    @Override // p040c4.InterfaceC1687l
    /* JADX INFO: renamed from: e */
    public final int mo483e() {
        return this.f251b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C0094k) && C5207g.m11106a(this.f250a, ((C0094k) obj).f250a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f250a.hashCode();
    }

    public final String toString() {
        return C0009a.m23l(new StringBuilder("ActionToSelection(code="), this.f250a, ")");
    }
}
