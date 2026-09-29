package fj;

import android.os.Bundle;
import android.os.Parcelable;
import com.lingq.commons.p053ui.UserImportDetailType;
import com.linguist.R;
import dm.C5207g;
import java.io.Serializable;
import p040c4.InterfaceC1687l;

/* JADX INFO: renamed from: fj.p */
/* JADX INFO: loaded from: classes2.dex */
public final class C5555p implements InterfaceC1687l {

    /* JADX INFO: renamed from: a */
    public final UserImportDetailType f34309a;

    /* JADX INFO: renamed from: b */
    public final int f34310b = R.id.actionToAddCourse;

    public C5555p(UserImportDetailType userImportDetailType) {
        this.f34309a = userImportDetailType;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // p040c4.InterfaceC1687l
    /* JADX INFO: renamed from: d */
    public final Bundle mo482d() {
        Bundle bundle = new Bundle();
        boolean zIsAssignableFrom = Parcelable.class.isAssignableFrom(UserImportDetailType.class);
        Serializable serializable = this.f34309a;
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
        return this.f34310b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C5555p) && this.f34309a == ((C5555p) obj).f34309a;
    }

    public final int hashCode() {
        return this.f34309a.hashCode();
    }

    public final String toString() {
        return "ActionToAddCourse(userImportDetailType=" + this.f34309a + ")";
    }
}
