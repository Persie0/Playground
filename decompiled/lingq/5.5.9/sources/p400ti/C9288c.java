package p400ti;

import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.media.session.C0166e;
import com.lingq.shared.uimodel.library.LibraryShelf;
import com.lingq.shared.uimodel.library.LibraryTab;
import dm.C5207g;
import java.io.Serializable;
import p040c4.InterfaceC1680e;

/* JADX INFO: renamed from: ti.c */
/* JADX INFO: loaded from: classes2.dex */
public final class C9288c implements InterfaceC1680e {

    /* JADX INFO: renamed from: a */
    public final LibraryShelf f47985a;

    /* JADX INFO: renamed from: b */
    public final String f47986b;

    /* JADX INFO: renamed from: c */
    public final LibraryTab f47987c;

    /* JADX INFO: renamed from: d */
    public final String f47988d;

    public C9288c(LibraryShelf libraryShelf, String str, LibraryTab libraryTab, String str2) {
        this.f47985a = libraryShelf;
        this.f47986b = str;
        this.f47987c = libraryTab;
        this.f47988d = str2;
    }

    /* JADX WARN: Unreachable blocks removed: 4, instructions: 4 */
    public static final C9288c fromBundle(Bundle bundle) {
        LibraryTab libraryTab;
        String string;
        if (!C0166e.m778y(bundle, "bundle", C9288c.class, "shelf")) {
            throw new IllegalArgumentException("Required argument \"shelf\" is missing and does not have an android:defaultValue");
        }
        if (!Parcelable.class.isAssignableFrom(LibraryShelf.class) && !Serializable.class.isAssignableFrom(LibraryShelf.class)) {
            throw new UnsupportedOperationException(LibraryShelf.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
        }
        LibraryShelf libraryShelf = (LibraryShelf) bundle.get("shelf");
        if (libraryShelf == null) {
            throw new IllegalArgumentException("Argument \"shelf\" is marked as non-null but was passed a null value.");
        }
        if (!bundle.containsKey("title")) {
            throw new IllegalArgumentException("Required argument \"title\" is missing and does not have an android:defaultValue");
        }
        String string2 = bundle.getString("title");
        if (string2 == null) {
            throw new IllegalArgumentException("Argument \"title\" is marked as non-null but was passed a null value.");
        }
        if (bundle.containsKey("tabSelected")) {
            if (!Parcelable.class.isAssignableFrom(LibraryTab.class) && !Serializable.class.isAssignableFrom(LibraryTab.class)) {
                throw new UnsupportedOperationException(LibraryTab.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
            }
            libraryTab = (LibraryTab) bundle.get("tabSelected");
        } else {
            libraryTab = null;
        }
        if (bundle.containsKey("query")) {
            string = bundle.getString("query");
            if (string == null) {
                throw new IllegalArgumentException("Argument \"query\" is marked as non-null but was passed a null value.");
            }
        } else {
            string = "";
        }
        return new C9288c(libraryShelf, string2, libraryTab, string);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9288c)) {
            return false;
        }
        C9288c c9288c = (C9288c) obj;
        return C5207g.m11106a(this.f47985a, c9288c.f47985a) && C5207g.m11106a(this.f47986b, c9288c.f47986b) && C5207g.m11106a(this.f47987c, c9288c.f47987c) && C5207g.m11106a(this.f47988d, c9288c.f47988d);
    }

    public final int hashCode() {
        int iM758d = C0166e.m758d(this.f47986b, this.f47985a.hashCode() * 31, 31);
        LibraryTab libraryTab = this.f47987c;
        return this.f47988d.hashCode() + ((iM758d + (libraryTab == null ? 0 : libraryTab.hashCode())) * 31);
    }

    public final String toString() {
        return "CollectionsFragmentArgs(shelf=" + this.f47985a + ", title=" + this.f47986b + ", tabSelected=" + this.f47987c + ", query=" + this.f47988d + ")";
    }
}
