package p487xi;

import android.os.Bundle;
import android.support.v4.media.session.C0166e;
import com.linguist.R;
import dm.C5207g;
import p003a2.C0009a;
import p040c4.InterfaceC1687l;

/* JADX INFO: renamed from: xi.p */
/* JADX INFO: loaded from: classes2.dex */
public final class C10208p implements InterfaceC1687l {

    /* JADX INFO: renamed from: a */
    public final String f51619a;

    /* JADX INFO: renamed from: b */
    public final String f51620b;

    /* JADX INFO: renamed from: c */
    public final int f51621c;

    /* JADX INFO: renamed from: d */
    public final String f51622d;

    /* JADX INFO: renamed from: e */
    public final float f51623e;

    /* JADX INFO: renamed from: f */
    public final int f51624f;

    public C10208p(String str, String str2, int i10, String str3, float f3) {
        C5207g.m11111f(str2, "stat");
        this.f51619a = str;
        this.f51620b = str2;
        this.f51621c = i10;
        this.f51622d = str3;
        this.f51623e = f3;
        this.f51624f = R.id.actionToUpdateLanguageProgress;
    }

    @Override // p040c4.InterfaceC1687l
    /* JADX INFO: renamed from: d */
    public final Bundle mo482d() {
        Bundle bundle = new Bundle();
        bundle.putString("title", this.f51619a);
        bundle.putString("stat", this.f51620b);
        bundle.putInt("numberOfFields", this.f51621c);
        bundle.putString("interval", this.f51622d);
        bundle.putFloat("progress", this.f51623e);
        return bundle;
    }

    @Override // p040c4.InterfaceC1687l
    /* JADX INFO: renamed from: e */
    public final int mo483e() {
        return this.f51624f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10208p)) {
            return false;
        }
        C10208p c10208p = (C10208p) obj;
        return C5207g.m11106a(this.f51619a, c10208p.f51619a) && C5207g.m11106a(this.f51620b, c10208p.f51620b) && this.f51621c == c10208p.f51621c && C5207g.m11106a(this.f51622d, c10208p.f51622d) && Float.compare(this.f51623e, c10208p.f51623e) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f51623e) + C0166e.m758d(this.f51622d, C0009a.m16d(this.f51621c, C0166e.m758d(this.f51620b, this.f51619a.hashCode() * 31, 31), 31), 31);
    }

    public final String toString() {
        return "ActionToUpdateLanguageProgress(title=" + this.f51619a + ", stat=" + this.f51620b + ", numberOfFields=" + this.f51621c + ", interval=" + this.f51622d + ", progress=" + this.f51623e + ")";
    }
}
