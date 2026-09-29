package p048cj;

import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.media.session.C0166e;
import com.lingq.shared.uimodel.library.LibraryShelf;
import com.lingq.shared.uimodel.library.LibraryTab;
import com.linguist.R;
import dm.C5207g;
import java.io.Serializable;
import p040c4.InterfaceC1687l;

/* JADX INFO: renamed from: cj.d */
/* JADX INFO: loaded from: classes2.dex */
public final class C2030d implements InterfaceC1687l {

    /* JADX INFO: renamed from: a */
    public final LibraryShelf f10465a;

    /* JADX INFO: renamed from: b */
    public final String f10466b;

    /* JADX INFO: renamed from: c */
    public final LibraryTab f10467c;

    /* JADX INFO: renamed from: d */
    public final String f10468d;

    /* JADX INFO: renamed from: e */
    public final int f10469e = R.id.actionToCollections;

    public C2030d(LibraryShelf libraryShelf, String str, LibraryTab libraryTab, String str2) {
        this.f10465a = libraryShelf;
        this.f10466b = str;
        this.f10467c = libraryTab;
        this.f10468d = str2;
    }

    @Override // p040c4.InterfaceC1687l
    /* JADX INFO: renamed from: d */
    public final Bundle mo482d() {
        Bundle bundle = new Bundle();
        boolean zIsAssignableFrom = Parcelable.class.isAssignableFrom(LibraryShelf.class);
        Parcelable parcelable = this.f10465a;
        if (zIsAssignableFrom) {
            C5207g.m11109d(parcelable, "null cannot be cast to non-null type android.os.Parcelable");
            bundle.putParcelable("shelf", parcelable);
        } else {
            if (!Serializable.class.isAssignableFrom(LibraryShelf.class)) {
                throw new UnsupportedOperationException(LibraryShelf.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
            }
            C5207g.m11109d(parcelable, "null cannot be cast to non-null type java.io.Serializable");
            bundle.putSerializable("shelf", (Serializable) parcelable);
        }
        bundle.putString("title", this.f10466b);
        boolean zIsAssignableFrom2 = Parcelable.class.isAssignableFrom(LibraryTab.class);
        Parcelable parcelable2 = this.f10467c;
        if (zIsAssignableFrom2) {
            bundle.putParcelable("tabSelected", parcelable2);
        } else if (Serializable.class.isAssignableFrom(LibraryTab.class)) {
            bundle.putSerializable("tabSelected", (Serializable) parcelable2);
        }
        bundle.putString("query", this.f10468d);
        return bundle;
    }

    @Override // p040c4.InterfaceC1687l
    /* JADX INFO: renamed from: e */
    public final int mo483e() {
        return this.f10469e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2030d)) {
            return false;
        }
        C2030d c2030d = (C2030d) obj;
        if (C5207g.m11106a(this.f10465a, c2030d.f10465a) && C5207g.m11106a(this.f10466b, c2030d.f10466b) && C5207g.m11106a(this.f10467c, c2030d.f10467c) && C5207g.m11106a(this.f10468d, c2030d.f10468d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int iM758d = C0166e.m758d(this.f10466b, this.f10465a.hashCode() * 31, 31);
        LibraryTab libraryTab = this.f10467c;
        return this.f10468d.hashCode() + ((iM758d + (libraryTab == null ? 0 : libraryTab.hashCode())) * 31);
    }

    public final String toString() {
        return "ActionToCollections(shelf=" + this.f10465a + ", title=" + this.f10466b + ", tabSelected=" + this.f10467c + ", query=" + this.f10468d + ")";
    }
}
