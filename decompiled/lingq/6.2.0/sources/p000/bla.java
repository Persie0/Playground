package p000;

import android.os.Bundle;
import android.os.Parcelable;
import com.lingq.feature.imports.data.UserImportDetailType;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class bla implements v76 {
    public static final ala Companion = new ala();

    /* JADX INFO: renamed from: a */
    public final UserImportDetailType f8663a;

    public bla(UserImportDetailType userImportDetailType) {
        this.f8663a = userImportDetailType;
    }

    public static final bla fromBundle(Bundle bundle) {
        Companion.getClass();
        bundle.getClass();
        bundle.setClassLoader(bla.class.getClassLoader());
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
            return new bla(userImportDetailType);
        }
        C3386nv.m17626m("Argument \"userImportDetailType\" is marked as non-null but was passed a null value.");
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bla) && this.f8663a == ((bla) obj).f8663a;
    }

    public final int hashCode() {
        return this.f8663a.hashCode();
    }

    public final String toString() {
        return "UserImportSelectionFragmentArgs(userImportDetailType=" + this.f8663a + ")";
    }
}
