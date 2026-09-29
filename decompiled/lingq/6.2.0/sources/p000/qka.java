package p000;

import android.os.Bundle;
import android.os.Parcelable;
import com.lingq.feature.imports.R$id;
import com.lingq.feature.imports.data.UserImportDetailType;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class qka implements t86 {

    /* JADX INFO: renamed from: a */
    public final UserImportDetailType f57879a;

    /* JADX INFO: renamed from: b */
    public final int f57880b;

    public qka(UserImportDetailType userImportDetailType) {
        userImportDetailType.getClass();
        this.f57879a = userImportDetailType;
        this.f57880b = R$id.actionToSelection;
    }

    @Override // p000.t86
    /* JADX INFO: renamed from: a */
    public final Bundle mo233a() {
        Bundle bundle = new Bundle();
        boolean zIsAssignableFrom = Parcelable.class.isAssignableFrom(UserImportDetailType.class);
        Serializable serializable = this.f57879a;
        if (zIsAssignableFrom) {
            serializable.getClass();
            bundle.putParcelable("userImportDetailType", (Parcelable) serializable);
            return bundle;
        }
        if (!Serializable.class.isAssignableFrom(UserImportDetailType.class)) {
            C3386nv.m17636w(UserImportDetailType.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
            return null;
        }
        serializable.getClass();
        bundle.putSerializable("userImportDetailType", serializable);
        return bundle;
    }

    @Override // p000.t86
    /* JADX INFO: renamed from: b */
    public final int mo234b() {
        return this.f57880b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qka) && this.f57879a == ((qka) obj).f57879a;
    }

    public final int hashCode() {
        return this.f57879a.hashCode();
    }

    public final String toString() {
        return "ActionToSelection(userImportDetailType=" + this.f57879a + ")";
    }
}
