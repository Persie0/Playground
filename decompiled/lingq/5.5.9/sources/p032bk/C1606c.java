package p032bk;

import android.os.Bundle;
import com.linguist.R;
import dm.C5207g;
import p003a2.C0009a;
import p040c4.InterfaceC1687l;

/* JADX INFO: renamed from: bk.c */
/* JADX INFO: loaded from: classes2.dex */
public final class C1606c implements InterfaceC1687l {

    /* JADX INFO: renamed from: a */
    public final String f9097a;

    /* JADX INFO: renamed from: b */
    public final int f9098b = R.id.actionToCheckEmail;

    public C1606c(String str) {
        this.f9097a = str;
    }

    @Override // p040c4.InterfaceC1687l
    /* JADX INFO: renamed from: d */
    public final Bundle mo482d() {
        Bundle bundle = new Bundle();
        bundle.putString("email", this.f9097a);
        return bundle;
    }

    @Override // p040c4.InterfaceC1687l
    /* JADX INFO: renamed from: e */
    public final int mo483e() {
        return this.f9098b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1606c) && C5207g.m11106a(this.f9097a, ((C1606c) obj).f9097a);
    }

    public final int hashCode() {
        return this.f9097a.hashCode();
    }

    public final String toString() {
        return C0009a.m23l(new StringBuilder("ActionToCheckEmail(email="), this.f9097a, ")");
    }
}
