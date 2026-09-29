package p000;

import android.os.Bundle;
import android.os.Parcelable;
import com.lingq.feature.imports.data.UserImportDetailType;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class yja implements v76 {
    public static final xja Companion = new xja();

    /* JADX INFO: renamed from: a */
    public final UserImportDetailType f69920a;

    public yja(UserImportDetailType userImportDetailType) {
        this.f69920a = userImportDetailType;
    }

    public static final yja fromBundle(Bundle bundle) {
        Companion.getClass();
        bundle.getClass();
        bundle.setClassLoader(yja.class.getClassLoader());
        if (!bundle.containsKey("userImportDetailType")) {
            C3386nv.m17626m("Required argument \"userImportDetailType\" is missing and does not have an android:defaultValue");
            return null;
        }
        if (!Parcelable.class.isAssignableFrom(UserImportDetailType.class) && !Serializable.class.isAssignableFrom(UserImportDetailType.class)) {
            C3386nv.m17636w(UserImportDetailType.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
            return null;
        }
        UserImportDetailType userImportDetailType = (UserImportDetailType) bundle.get("userImportDetailType");
        if (userImportDetailType != null) {
            return new yja(userImportDetailType);
        }
        C3386nv.m17626m("Argument \"userImportDetailType\" is marked as non-null but was passed a null value.");
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yja) && this.f69920a == ((yja) obj).f69920a;
    }

    public final int hashCode() {
        return this.f69920a.hashCode();
    }

    public final String toString() {
        return "UserImportAddCourseFragmentArgs(userImportDetailType=" + this.f69920a + ")";
    }
}
