package p000;

import android.os.Bundle;
import android.os.Parcelable;
import com.lingq.core.navigation.model.DictionaryToUseDataNavArg;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class jf2 implements v76 {
    public static final if2 Companion = new if2();

    /* JADX INFO: renamed from: a */
    public final DictionaryToUseDataNavArg f45498a;

    public jf2(DictionaryToUseDataNavArg dictionaryToUseDataNavArg) {
        this.f45498a = dictionaryToUseDataNavArg;
    }

    public static final jf2 fromBundle(Bundle bundle) {
        Companion.getClass();
        bundle.getClass();
        bundle.setClassLoader(jf2.class.getClassLoader());
        if (!bundle.containsKey("dictionaryData")) {
            C3386nv.m17626m("Required argument \"dictionaryData\" is missing and does not have an android:defaultValue");
            return null;
        }
        if (!Parcelable.class.isAssignableFrom(DictionaryToUseDataNavArg.class) && !Serializable.class.isAssignableFrom(DictionaryToUseDataNavArg.class)) {
            C3386nv.m17636w(DictionaryToUseDataNavArg.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
            return null;
        }
        DictionaryToUseDataNavArg dictionaryToUseDataNavArg = (DictionaryToUseDataNavArg) bundle.get("dictionaryData");
        if (dictionaryToUseDataNavArg != null) {
            return new jf2(dictionaryToUseDataNavArg);
        }
        C3386nv.m17626m("Argument \"dictionaryData\" is marked as non-null but was passed a null value.");
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jf2) && this.f45498a.equals(((jf2) obj).f45498a);
    }

    public final int hashCode() {
        return this.f45498a.hashCode();
    }

    public final String toString() {
        return "DictionaryContentFragmentArgs(dictionaryData=" + this.f45498a + ")";
    }
}
