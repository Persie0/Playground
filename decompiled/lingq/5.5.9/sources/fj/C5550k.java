package fj;

import android.os.Bundle;
import android.os.Parcelable;
import com.lingq.commons.p053ui.UserImportDetailType;
import com.linguist.R;
import dm.C5207g;
import java.io.Serializable;
import p040c4.InterfaceC1687l;

/* JADX INFO: renamed from: fj.k */
/* JADX INFO: loaded from: classes2.dex */
public final class C5550k implements InterfaceC1687l {

    /* JADX INFO: renamed from: a */
    public final UserImportDetailType f34301a;

    /* JADX INFO: renamed from: b */
    public final int f34302b = R.id.actionToSelection;

    public C5550k(UserImportDetailType userImportDetailType) {
        this.f34301a = userImportDetailType;
    }

    @Override // p040c4.InterfaceC1687l
    /* JADX INFO: renamed from: d */
    public final Bundle mo482d() {
        Bundle bundle = new Bundle();
        boolean zIsAssignableFrom = Parcelable.class.isAssignableFrom(UserImportDetailType.class);
        Serializable serializable = this.f34301a;
        if (zIsAssignableFrom) {
            C5207g.m11109d(serializable, "null cannot be cast to non-null type android.os.Parcelable");
            bundle.putParcelable("userImportDetailType", (Parcelable) serializable);
        } else {
            if (!Serializable.class.isAssignableFrom(UserImportDetailType.class)) {
                throw new UnsupportedOperationException(UserImportDetailType.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
            }
            C5207g.m11109d(serializable, "null cannot be cast to non-null type java.io.Serializable");
            bundle.putSerializable("userImportDetailType", serializable);
        }
        return bundle;
    }

    @Override // p040c4.InterfaceC1687l
    /* JADX INFO: renamed from: e */
    public final int mo483e() {
        return this.f34302b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C5550k) && this.f34301a == ((C5550k) obj).f34301a;
    }

    public final int hashCode() {
        return this.f34301a.hashCode();
    }

    public final String toString() {
        return "ActionToSelection(userImportDetailType=" + this.f34301a + ")";
    }
}
