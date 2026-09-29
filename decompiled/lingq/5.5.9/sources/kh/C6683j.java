package kh;

import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.media.session.C0166e;
import com.lingq.shared.uimodel.library.LibraryShelf;
import com.lingq.shared.uimodel.library.LibraryTab;
import com.linguist.R;
import dm.C5207g;
import java.io.Serializable;
import p040c4.InterfaceC1687l;

/* JADX INFO: renamed from: kh.j */
/* JADX INFO: loaded from: classes.dex */
public final class C6683j implements InterfaceC1687l {

    /* JADX INFO: renamed from: a */
    public final LibraryShelf f37800a;

    /* JADX INFO: renamed from: b */
    public final String f37801b;

    /* JADX INFO: renamed from: c */
    public final LibraryTab f37802c;

    /* JADX INFO: renamed from: d */
    public final String f37803d;

    /* JADX INFO: renamed from: e */
    public final int f37804e = R.id.actionToCollections;

    public C6683j(LibraryShelf libraryShelf, String str, LibraryTab libraryTab, String str2) {
        this.f37800a = libraryShelf;
        this.f37801b = str;
        this.f37802c = libraryTab;
        this.f37803d = str2;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // p040c4.InterfaceC1687l
    /* JADX INFO: renamed from: d */
    public final Bundle mo482d() {
        Bundle bundle = new Bundle();
        boolean zIsAssignableFrom = Parcelable.class.isAssignableFrom(LibraryShelf.class);
        Parcelable parcelable = this.f37800a;
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
        bundle.putString("title", this.f37801b);
        boolean zIsAssignableFrom2 = Parcelable.class.isAssignableFrom(LibraryTab.class);
        Parcelable parcelable2 = this.f37802c;
        if (zIsAssignableFrom2) {
            bundle.putParcelable("tabSelected", parcelable2);
        } else if (Serializable.class.isAssignableFrom(LibraryTab.class)) {
            bundle.putSerializable("tabSelected", (Serializable) parcelable2);
        }
        bundle.putString("query", this.f37803d);
        return bundle;
    }

    @Override // p040c4.InterfaceC1687l
    /* JADX INFO: renamed from: e */
    public final int mo483e() {
        return this.f37804e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6683j)) {
            return false;
        }
        C6683j c6683j = (C6683j) obj;
        if (C5207g.m11106a(this.f37800a, c6683j.f37800a) && C5207g.m11106a(this.f37801b, c6683j.f37801b) && C5207g.m11106a(this.f37802c, c6683j.f37802c) && C5207g.m11106a(this.f37803d, c6683j.f37803d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int iM758d = C0166e.m758d(this.f37801b, this.f37800a.hashCode() * 31, 31);
        LibraryTab libraryTab = this.f37802c;
        return this.f37803d.hashCode() + ((iM758d + (libraryTab == null ? 0 : libraryTab.hashCode())) * 31);
    }

    public final String toString() {
        return "ActionToCollections(shelf=" + this.f37800a + ", title=" + this.f37801b + ", tabSelected=" + this.f37802c + ", query=" + this.f37803d + ")";
    }
}
