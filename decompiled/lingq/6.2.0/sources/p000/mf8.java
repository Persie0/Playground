package p000;

import android.os.Bundle;
import android.os.Parcelable;
import com.lingq.core.settings.ViewKeys;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class mf8 implements v76 {
    public static final lf8 Companion = new lf8();

    /* JADX INFO: renamed from: a */
    public final ViewKeys f51256a;

    public mf8(ViewKeys viewKeys) {
        this.f51256a = viewKeys;
    }

    public static final mf8 fromBundle(Bundle bundle) {
        Companion.getClass();
        bundle.getClass();
        bundle.setClassLoader(mf8.class.getClassLoader());
        if (!bundle.containsKey("viewKey")) {
            C3386nv.m17626m("Required argument \"viewKey\" is missing and does not have an android:defaultValue");
            return null;
        }
        if (!Parcelable.class.isAssignableFrom(ViewKeys.class) && !Serializable.class.isAssignableFrom(ViewKeys.class)) {
            C3386nv.m17636w(ViewKeys.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
            return null;
        }
        ViewKeys viewKeys = (ViewKeys) bundle.get("viewKey");
        if (viewKeys != null) {
            return new mf8(viewKeys);
        }
        C3386nv.m17626m("Argument \"viewKey\" is marked as non-null but was passed a null value.");
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mf8) && this.f51256a == ((mf8) obj).f51256a;
    }

    public final int hashCode() {
        return this.f51256a.hashCode();
    }

    public final String toString() {
        return "ReviewSettingsFragmentArgs(viewKey=" + this.f51256a + ")";
    }
}
