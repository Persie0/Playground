package kh;

import android.os.Bundle;
import android.os.Parcelable;
import com.lingq.p055ui.imports.ImportData;
import com.linguist.R;
import dm.C5207g;
import java.io.Serializable;
import p040c4.InterfaceC1687l;

/* JADX INFO: renamed from: kh.n */
/* JADX INFO: loaded from: classes.dex */
public final class C6687n implements InterfaceC1687l {

    /* JADX INFO: renamed from: a */
    public final ImportData f37816a;

    /* JADX INFO: renamed from: b */
    public final String f37817b;

    /* JADX INFO: renamed from: c */
    public final int f37818c;

    public C6687n() {
        this(null, "");
    }

    public C6687n(ImportData importData, String str) {
        C5207g.m11111f(str, "languageFromDeeplink");
        this.f37816a = importData;
        this.f37817b = str;
        this.f37818c = R.id.actionToStart;
    }

    @Override // p040c4.InterfaceC1687l
    /* JADX INFO: renamed from: d */
    public final Bundle mo482d() {
        Bundle bundle = new Bundle();
        boolean zIsAssignableFrom = Parcelable.class.isAssignableFrom(ImportData.class);
        Parcelable parcelable = this.f37816a;
        if (zIsAssignableFrom) {
            bundle.putParcelable("shareData", parcelable);
        } else if (Serializable.class.isAssignableFrom(ImportData.class)) {
            bundle.putSerializable("shareData", (Serializable) parcelable);
        }
        bundle.putString("languageFromDeeplink", this.f37817b);
        return bundle;
    }

    @Override // p040c4.InterfaceC1687l
    /* JADX INFO: renamed from: e */
    public final int mo483e() {
        return this.f37818c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6687n)) {
            return false;
        }
        C6687n c6687n = (C6687n) obj;
        return C5207g.m11106a(this.f37816a, c6687n.f37816a) && C5207g.m11106a(this.f37817b, c6687n.f37817b);
    }

    public final int hashCode() {
        ImportData importData = this.f37816a;
        return this.f37817b.hashCode() + ((importData == null ? 0 : importData.hashCode()) * 31);
    }

    public final String toString() {
        return "ActionToStart(shareData=" + this.f37816a + ", languageFromDeeplink=" + this.f37817b + ")";
    }
}
