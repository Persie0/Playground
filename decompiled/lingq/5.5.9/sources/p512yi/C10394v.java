package p512yi;

import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.media.session.C0166e;
import com.lingq.shared.uimodel.library.LibraryShelf;
import com.lingq.shared.uimodel.library.LibraryTab;
import com.linguist.R;
import dm.C5207g;
import java.io.Serializable;
import p040c4.InterfaceC1687l;

/* JADX INFO: renamed from: yi.v */
/* JADX INFO: loaded from: classes2.dex */
public final class C10394v implements InterfaceC1687l {

    /* JADX INFO: renamed from: a */
    public final LibraryShelf f52186a;

    /* JADX INFO: renamed from: b */
    public final String f52187b;

    /* JADX INFO: renamed from: c */
    public final LibraryTab f52188c;

    /* JADX INFO: renamed from: d */
    public final String f52189d;

    /* JADX INFO: renamed from: e */
    public final int f52190e;

    public C10394v(LibraryShelf libraryShelf, String str, LibraryTab libraryTab, String str2) {
        C5207g.m11111f(libraryShelf, "shelf");
        C5207g.m11111f(str, "title");
        this.f52186a = libraryShelf;
        this.f52187b = str;
        this.f52188c = libraryTab;
        this.f52189d = str2;
        this.f52190e = R.id.actionToCollections;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // p040c4.InterfaceC1687l
    /* JADX INFO: renamed from: d */
    public final Bundle mo482d() {
        Bundle bundle = new Bundle();
        boolean zIsAssignableFrom = Parcelable.class.isAssignableFrom(LibraryShelf.class);
        Parcelable parcelable = this.f52186a;
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
        bundle.putString("title", this.f52187b);
        boolean zIsAssignableFrom2 = Parcelable.class.isAssignableFrom(LibraryTab.class);
        Parcelable parcelable2 = this.f52188c;
        if (zIsAssignableFrom2) {
            bundle.putParcelable("tabSelected", parcelable2);
        } else if (Serializable.class.isAssignableFrom(LibraryTab.class)) {
            bundle.putSerializable("tabSelected", (Serializable) parcelable2);
        }
        bundle.putString("query", this.f52189d);
        return bundle;
    }

    @Override // p040c4.InterfaceC1687l
    /* JADX INFO: renamed from: e */
    public final int mo483e() {
        return this.f52190e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10394v)) {
            return false;
        }
        C10394v c10394v = (C10394v) obj;
        return C5207g.m11106a(this.f52186a, c10394v.f52186a) && C5207g.m11106a(this.f52187b, c10394v.f52187b) && C5207g.m11106a(this.f52188c, c10394v.f52188c) && C5207g.m11106a(this.f52189d, c10394v.f52189d);
    }

    public final int hashCode() {
        int iM758d = C0166e.m758d(this.f52187b, this.f52186a.hashCode() * 31, 31);
        LibraryTab libraryTab = this.f52188c;
        return this.f52189d.hashCode() + ((iM758d + (libraryTab == null ? 0 : libraryTab.hashCode())) * 31);
    }

    public final String toString() {
        return "ActionToCollections(shelf=" + this.f52186a + ", title=" + this.f52187b + ", tabSelected=" + this.f52188c + ", query=" + this.f52189d + ")";
    }
}
