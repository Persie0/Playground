package kh;

import android.os.Bundle;
import android.os.Parcelable;
import com.lingq.p055ui.imports.ImportData;
import com.linguist.R;
import dm.C5207g;
import java.io.Serializable;
import p040c4.InterfaceC1687l;

/* JADX INFO: renamed from: kh.m */
/* JADX INFO: loaded from: classes.dex */
public final class C6686m implements InterfaceC1687l {

    /* JADX INFO: renamed from: a */
    public final ImportData f37813a;

    /* JADX INFO: renamed from: b */
    public final String f37814b;

    /* JADX INFO: renamed from: c */
    public final int f37815c;

    public C6686m() {
        this(null, "");
    }

    public C6686m(ImportData importData, String str) {
        C5207g.m11111f(str, "languageFromDeeplink");
        this.f37813a = importData;
        this.f37814b = str;
        this.f37815c = R.id.actionToLogout;
    }

    @Override // p040c4.InterfaceC1687l
    /* JADX INFO: renamed from: d */
    public final Bundle mo482d() {
        Bundle bundle = new Bundle();
        boolean zIsAssignableFrom = Parcelable.class.isAssignableFrom(ImportData.class);
        Parcelable parcelable = this.f37813a;
        if (zIsAssignableFrom) {
            bundle.putParcelable("shareData", parcelable);
        } else if (Serializable.class.isAssignableFrom(ImportData.class)) {
            bundle.putSerializable("shareData", (Serializable) parcelable);
        }
        bundle.putString("languageFromDeeplink", this.f37814b);
        return bundle;
    }

    @Override // p040c4.InterfaceC1687l
    /* JADX INFO: renamed from: e */
    public final int mo483e() {
        return this.f37815c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6686m)) {
            return false;
        }
        C6686m c6686m = (C6686m) obj;
        return C5207g.m11106a(this.f37813a, c6686m.f37813a) && C5207g.m11106a(this.f37814b, c6686m.f37814b);
    }

    public final int hashCode() {
        ImportData importData = this.f37813a;
        return this.f37814b.hashCode() + ((importData == null ? 0 : importData.hashCode()) * 31);
    }

    public final String toString() {
        return "ActionToLogout(shareData=" + this.f37813a + ", languageFromDeeplink=" + this.f37814b + ")";
    }
}
