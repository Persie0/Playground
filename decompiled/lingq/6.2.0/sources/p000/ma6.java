package p000;

import com.lingq.core.domain.model.library.LibraryShelf;
import com.lingq.core.domain.model.library.LibraryTab;

/* JADX INFO: loaded from: classes3.dex */
public final class ma6 extends tqb {

    /* JADX INFO: renamed from: b */
    public final LibraryShelf f50837b;

    /* JADX INFO: renamed from: c */
    public final LibraryTab f50838c;

    /* JADX INFO: renamed from: d */
    public final String f50839d;

    /* JADX INFO: renamed from: e */
    public final String f50840e;

    public ma6(LibraryShelf libraryShelf, LibraryTab libraryTab, String str, String str2) {
        str.getClass();
        this.f50837b = libraryShelf;
        this.f50838c = libraryTab;
        this.f50839d = str;
        this.f50840e = str2;
    }

    /* JADX INFO: renamed from: a */
    public final String m16715a() {
        return this.f50840e;
    }

    /* JADX INFO: renamed from: b */
    public final LibraryShelf m16716b() {
        return this.f50837b;
    }

    /* JADX INFO: renamed from: c */
    public final LibraryTab m16717c() {
        return this.f50838c;
    }

    /* JADX INFO: renamed from: d */
    public final String m16718d() {
        return this.f50839d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ma6)) {
            return false;
        }
        ma6 ma6Var = (ma6) obj;
        return this.f50837b.equals(ma6Var.f50837b) && fa4.m11650l(this.f50838c, ma6Var.f50838c) && fa4.m11650l(this.f50839d, ma6Var.f50839d) && this.f50840e.equals(ma6Var.f50840e);
    }

    public final int hashCode() {
        int iHashCode = this.f50837b.hashCode() * 31;
        LibraryTab libraryTab = this.f50838c;
        return this.f50840e.hashCode() + ux5.m22980c((iHashCode + (libraryTab == null ? 0 : libraryTab.hashCode())) * 31, this.f50839d, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SearchContent(shelf=");
        sb.append(this.f50837b);
        sb.append(", tabSelected=");
        sb.append(this.f50838c);
        sb.append(", title=");
        return wq1.m24125u(sb, this.f50839d, ", query=", this.f50840e, ")");
    }
}
