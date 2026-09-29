package p014aj;

import android.os.Bundle;
import com.linguist.R;
import dm.C5207g;
import p003a2.C0009a;
import p040c4.InterfaceC1687l;

/* JADX INFO: renamed from: aj.s */
/* JADX INFO: loaded from: classes2.dex */
public final class C0102s implements InterfaceC1687l {

    /* JADX INFO: renamed from: a */
    public final String f258a;

    /* JADX INFO: renamed from: b */
    public final String f259b;

    /* JADX INFO: renamed from: c */
    public final int f260c = R.id.actionToNotificationsSettingsParent;

    public C0102s(String str, String str2) {
        this.f258a = str;
        this.f259b = str2;
    }

    @Override // p040c4.InterfaceC1687l
    /* JADX INFO: renamed from: d */
    public final Bundle mo482d() {
        Bundle bundle = new Bundle();
        bundle.putString("languageCode", this.f258a);
        bundle.putString("title", this.f259b);
        return bundle;
    }

    @Override // p040c4.InterfaceC1687l
    /* JADX INFO: renamed from: e */
    public final int mo483e() {
        return this.f260c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0102s)) {
            return false;
        }
        C0102s c0102s = (C0102s) obj;
        if (C5207g.m11106a(this.f258a, c0102s.f258a) && C5207g.m11106a(this.f259b, c0102s.f259b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f259b.hashCode() + (this.f258a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ActionToNotificationsSettingsParent(languageCode=");
        sb2.append(this.f258a);
        sb2.append(", title=");
        return C0009a.m23l(sb2, this.f259b, ")");
    }
}
