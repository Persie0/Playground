package p000;

import android.os.Bundle;
import android.os.Parcelable;
import com.lingq.core.navigation.model.LibraryShelfNavArg;
import com.lingq.core.navigation.model.LibraryTabNavArg;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class nq8 implements v76 {
    public static final mq8 Companion = new mq8();

    /* JADX INFO: renamed from: a */
    public final LibraryShelfNavArg f53141a;

    /* JADX INFO: renamed from: b */
    public final String f53142b;

    /* JADX INFO: renamed from: c */
    public final LibraryTabNavArg f53143c;

    /* JADX INFO: renamed from: d */
    public final String f53144d;

    public nq8(LibraryShelfNavArg libraryShelfNavArg, String str, LibraryTabNavArg libraryTabNavArg, String str2) {
        this.f53141a = libraryShelfNavArg;
        this.f53142b = str;
        this.f53143c = libraryTabNavArg;
        this.f53144d = str2;
    }

    public static final nq8 fromBundle(Bundle bundle) {
        LibraryTabNavArg libraryTabNavArg;
        String string;
        Companion.getClass();
        bundle.getClass();
        bundle.setClassLoader(nq8.class.getClassLoader());
        if (!bundle.containsKey("shelf")) {
            C3386nv.m17626m("Required argument \"shelf\" is missing and does not have an android:defaultValue");
            return null;
        }
        if (!Parcelable.class.isAssignableFrom(LibraryShelfNavArg.class) && !Serializable.class.isAssignableFrom(LibraryShelfNavArg.class)) {
            C3386nv.m17636w(LibraryShelfNavArg.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
            return null;
        }
        LibraryShelfNavArg libraryShelfNavArg = (LibraryShelfNavArg) bundle.get("shelf");
        if (libraryShelfNavArg == null) {
            C3386nv.m17626m("Argument \"shelf\" is marked as non-null but was passed a null value.");
            return null;
        }
        if (!bundle.containsKey("title")) {
            C3386nv.m17626m("Required argument \"title\" is missing and does not have an android:defaultValue");
            return null;
        }
        String string2 = bundle.getString("title");
        if (string2 == null) {
            C3386nv.m17626m("Argument \"title\" is marked as non-null but was passed a null value.");
            return null;
        }
        if (!bundle.containsKey("tabSelected")) {
            libraryTabNavArg = null;
        } else {
            if (!Parcelable.class.isAssignableFrom(LibraryTabNavArg.class) && !Serializable.class.isAssignableFrom(LibraryTabNavArg.class)) {
                C3386nv.m17636w(LibraryTabNavArg.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
                return null;
            }
            libraryTabNavArg = (LibraryTabNavArg) bundle.get("tabSelected");
        }
        if (bundle.containsKey("query")) {
            string = bundle.getString("query");
            if (string == null) {
                C3386nv.m17626m("Argument \"query\" is marked as non-null but was passed a null value.");
                return null;
            }
        } else {
            string = "";
        }
        return new nq8(libraryShelfNavArg, string2, libraryTabNavArg, string);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nq8)) {
            return false;
        }
        nq8 nq8Var = (nq8) obj;
        return this.f53141a.equals(nq8Var.f53141a) && this.f53142b.equals(nq8Var.f53142b) && fa4.m11650l(this.f53143c, nq8Var.f53143c) && this.f53144d.equals(nq8Var.f53144d);
    }

    public final int hashCode() {
        int iM22980c = ux5.m22980c(this.f53141a.hashCode() * 31, this.f53142b, 31);
        LibraryTabNavArg libraryTabNavArg = this.f53143c;
        return this.f53144d.hashCode() + ((iM22980c + (libraryTabNavArg == null ? 0 : libraryTabNavArg.hashCode())) * 31);
    }

    public final String toString() {
        return "SearchFragmentArgs(shelf=" + this.f53141a + ", title=" + this.f53142b + ", tabSelected=" + this.f53143c + ", query=" + this.f53144d + ")";
    }
}
