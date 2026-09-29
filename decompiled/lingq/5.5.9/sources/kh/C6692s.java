package kh;

import android.os.Bundle;
import com.linguist.R;
import dm.C5207g;
import p003a2.C0009a;
import p040c4.InterfaceC1687l;

/* JADX INFO: renamed from: kh.s */
/* JADX INFO: loaded from: classes.dex */
public final class C6692s implements InterfaceC1687l {

    /* JADX INFO: renamed from: a */
    public final String f37837a;

    /* JADX INFO: renamed from: b */
    public final String f37838b;

    /* JADX INFO: renamed from: c */
    public final int f37839c;

    public C6692s(String str, String str2) {
        C5207g.m11111f(str2, "offer");
        this.f37837a = str;
        this.f37838b = str2;
        this.f37839c = R.id.actionToUpgrade;
    }

    @Override // p040c4.InterfaceC1687l
    /* JADX INFO: renamed from: d */
    public final Bundle mo482d() {
        Bundle bundle = new Bundle();
        bundle.putString("attemptedAction", this.f37837a);
        bundle.putString("offer", this.f37838b);
        return bundle;
    }

    @Override // p040c4.InterfaceC1687l
    /* JADX INFO: renamed from: e */
    public final int mo483e() {
        return this.f37839c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6692s)) {
            return false;
        }
        C6692s c6692s = (C6692s) obj;
        return C5207g.m11106a(this.f37837a, c6692s.f37837a) && C5207g.m11106a(this.f37838b, c6692s.f37838b);
    }

    public final int hashCode() {
        return this.f37838b.hashCode() + (this.f37837a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ActionToUpgrade(attemptedAction=");
        sb2.append(this.f37837a);
        sb2.append(", offer=");
        return C0009a.m23l(sb2, this.f37838b, ")");
    }
}
