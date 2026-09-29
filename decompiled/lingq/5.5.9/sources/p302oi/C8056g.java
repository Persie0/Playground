package p302oi;

import android.os.Bundle;
import android.os.Parcelable;
import com.lingq.p055ui.imports.ImportData;
import com.linguist.R;
import dm.C5207g;
import java.io.Serializable;
import p040c4.InterfaceC1687l;

/* JADX INFO: renamed from: oi.g */
/* JADX INFO: loaded from: classes.dex */
public final class C8056g implements InterfaceC1687l {

    /* JADX INFO: renamed from: a */
    public final ImportData f43746a;

    /* JADX INFO: renamed from: b */
    public final int f43747b;

    /* JADX INFO: renamed from: c */
    public final int f43748c;

    public C8056g() {
        this(null, 0);
    }

    public C8056g(ImportData importData, int i10) {
        this.f43746a = importData;
        this.f43747b = i10;
        this.f43748c = R.id.actionToHome;
    }

    @Override // p040c4.InterfaceC1687l
    /* JADX INFO: renamed from: d */
    public final Bundle mo482d() {
        Bundle bundle = new Bundle();
        boolean zIsAssignableFrom = Parcelable.class.isAssignableFrom(ImportData.class);
        Parcelable parcelable = this.f43746a;
        if (zIsAssignableFrom) {
            bundle.putParcelable("shareData", parcelable);
        } else if (Serializable.class.isAssignableFrom(ImportData.class)) {
            bundle.putSerializable("shareData", (Serializable) parcelable);
        }
        bundle.putInt("currentTrack", this.f43747b);
        return bundle;
    }

    @Override // p040c4.InterfaceC1687l
    /* JADX INFO: renamed from: e */
    public final int mo483e() {
        return this.f43748c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8056g)) {
            return false;
        }
        C8056g c8056g = (C8056g) obj;
        return C5207g.m11106a(this.f43746a, c8056g.f43746a) && this.f43747b == c8056g.f43747b;
    }

    public final int hashCode() {
        ImportData importData = this.f43746a;
        return Integer.hashCode(this.f43747b) + ((importData == null ? 0 : importData.hashCode()) * 31);
    }

    public final String toString() {
        return "ActionToHome(shareData=" + this.f43746a + ", currentTrack=" + this.f43747b + ")";
    }
}
