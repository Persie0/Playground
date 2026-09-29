package p000;

import android.os.Bundle;
import android.os.Parcelable;
import com.lingq.feature.imports.R$id;
import com.lingq.feature.imports.data.UserImportDetailType;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class cla implements t86 {

    /* JADX INFO: renamed from: a */
    public final UserImportDetailType f10240a;

    /* JADX INFO: renamed from: b */
    public final int f10241b = R$id.actionToAddCourse;

    public cla(UserImportDetailType userImportDetailType) {
        this.f10240a = userImportDetailType;
    }

    @Override // p000.t86
    /* JADX INFO: renamed from: a */
    public final Bundle mo233a() {
        Bundle bundle = new Bundle();
        boolean zIsAssignableFrom = Parcelable.class.isAssignableFrom(UserImportDetailType.class);
        Serializable serializable = this.f10240a;
        if (zIsAssignableFrom) {
            bundle.putParcelable("userImportDetailType", (Parcelable) serializable);
            return bundle;
        }
        if (Serializable.class.isAssignableFrom(UserImportDetailType.class)) {
            bundle.putSerializable("userImportDetailType", serializable);
            return bundle;
        }
        C3386nv.m17636w(UserImportDetailType.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
        return null;
    }

    @Override // p000.t86
    /* JADX INFO: renamed from: b */
    public final int mo234b() {
        return this.f10241b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cla) && this.f10240a == ((cla) obj).f10240a;
    }

    public final int hashCode() {
        return this.f10240a.hashCode();
    }

    public final String toString() {
        return "ActionToAddCourse(userImportDetailType=" + this.f10240a + ")";
    }
}
