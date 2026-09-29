package p000;

import android.os.Bundle;
import android.os.Parcelable;
import com.lingq.core.navigation.model.LibraryShelfNavArg;
import com.lingq.core.navigation.model.LibraryTabNavArg;
import com.lingq.feature.search.R$id;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class jc6 implements t86 {

    /* JADX INFO: renamed from: a */
    public final LibraryShelfNavArg f45409a;

    /* JADX INFO: renamed from: b */
    public final String f45410b;

    /* JADX INFO: renamed from: c */
    public final LibraryTabNavArg f45411c;

    /* JADX INFO: renamed from: d */
    public final String f45412d;

    /* JADX INFO: renamed from: e */
    public final int f45413e;

    public jc6(LibraryShelfNavArg libraryShelfNavArg, String str, LibraryTabNavArg libraryTabNavArg, String str2) {
        str.getClass();
        str2.getClass();
        this.f45409a = libraryShelfNavArg;
        this.f45410b = str;
        this.f45411c = libraryTabNavArg;
        this.f45412d = str2;
        this.f45413e = R$id.actionToSearch;
    }

    @Override // p000.t86
    /* JADX INFO: renamed from: a */
    public final Bundle mo233a() {
        Bundle bundle = new Bundle();
        boolean zIsAssignableFrom = Parcelable.class.isAssignableFrom(LibraryShelfNavArg.class);
        Parcelable parcelable = this.f45409a;
        if (zIsAssignableFrom) {
            bundle.putParcelable("shelf", parcelable);
        } else {
            if (!Serializable.class.isAssignableFrom(LibraryShelfNavArg.class)) {
                C3386nv.m17636w(LibraryShelfNavArg.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
                return null;
            }
            bundle.putSerializable("shelf", (Serializable) parcelable);
        }
        bundle.putString("title", this.f45410b);
        boolean zIsAssignableFrom2 = Parcelable.class.isAssignableFrom(LibraryTabNavArg.class);
        Parcelable parcelable2 = this.f45411c;
        if (zIsAssignableFrom2) {
            bundle.putParcelable("tabSelected", parcelable2);
        } else if (Serializable.class.isAssignableFrom(LibraryTabNavArg.class)) {
            bundle.putSerializable("tabSelected", (Serializable) parcelable2);
        }
        bundle.putString("query", this.f45412d);
        return bundle;
    }

    @Override // p000.t86
    /* JADX INFO: renamed from: b */
    public final int mo234b() {
        return this.f45413e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jc6)) {
            return false;
        }
        jc6 jc6Var = (jc6) obj;
        return this.f45409a.equals(jc6Var.f45409a) && fa4.m11650l(this.f45410b, jc6Var.f45410b) && fa4.m11650l(this.f45411c, jc6Var.f45411c) && fa4.m11650l(this.f45412d, jc6Var.f45412d);
    }

    public final int hashCode() {
        int iM22980c = ux5.m22980c(this.f45409a.hashCode() * 31, this.f45410b, 31);
        LibraryTabNavArg libraryTabNavArg = this.f45411c;
        return this.f45412d.hashCode() + ((iM22980c + (libraryTabNavArg == null ? 0 : libraryTabNavArg.hashCode())) * 31);
    }

    public final String toString() {
        return "ActionToSearch(shelf=" + this.f45409a + ", title=" + this.f45410b + ", tabSelected=" + this.f45411c + ", query=" + this.f45412d + ")";
    }
}
