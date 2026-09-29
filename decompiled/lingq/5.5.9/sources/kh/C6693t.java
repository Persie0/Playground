package kh;

import android.os.Bundle;
import com.linguist.R;
import dm.C5207g;
import p003a2.C0009a;
import p040c4.InterfaceC1687l;

/* JADX INFO: renamed from: kh.t */
/* JADX INFO: loaded from: classes.dex */
public final class C6693t implements InterfaceC1687l {

    /* JADX INFO: renamed from: a */
    public final String f37840a;

    /* JADX INFO: renamed from: b */
    public final String f37841b;

    /* JADX INFO: renamed from: c */
    public final int f37842c;

    public C6693t(String str, String str2) {
        C5207g.m11111f(str, "url");
        this.f37840a = str;
        this.f37841b = str2;
        this.f37842c = R.id.actionToWeb;
    }

    @Override // p040c4.InterfaceC1687l
    /* JADX INFO: renamed from: d */
    public final Bundle mo482d() {
        Bundle bundle = new Bundle();
        bundle.putString("url", this.f37840a);
        bundle.putString("title", this.f37841b);
        return bundle;
    }

    @Override // p040c4.InterfaceC1687l
    /* JADX INFO: renamed from: e */
    public final int mo483e() {
        return this.f37842c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6693t)) {
            return false;
        }
        C6693t c6693t = (C6693t) obj;
        return C5207g.m11106a(this.f37840a, c6693t.f37840a) && C5207g.m11106a(this.f37841b, c6693t.f37841b);
    }

    public final int hashCode() {
        int iHashCode = this.f37840a.hashCode() * 31;
        String str = this.f37841b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ActionToWeb(url=");
        sb2.append(this.f37840a);
        sb2.append(", title=");
        return C0009a.m23l(sb2, this.f37841b, ")");
    }
}
