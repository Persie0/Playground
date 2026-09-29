package p000;

import com.lingq.core.domain.model.library.LibraryShelf;
import com.lingq.core.domain.model.library.LibraryTab;

/* JADX INFO: loaded from: classes3.dex */
public final class t03 extends z03 {

    /* JADX INFO: renamed from: a */
    public final LibraryShelf f61699a;

    /* JADX INFO: renamed from: b */
    public final LibraryTab f61700b;

    /* JADX INFO: renamed from: c */
    public final String f61701c;

    public t03(LibraryShelf libraryShelf, LibraryTab libraryTab, String str) {
        libraryTab.getClass();
        this.f61699a = libraryShelf;
        this.f61700b = libraryTab;
        this.f61701c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t03)) {
            return false;
        }
        t03 t03Var = (t03) obj;
        return this.f61699a.equals(t03Var.f61699a) && fa4.m11650l(this.f61700b, t03Var.f61700b) && this.f61701c.equals(t03Var.f61701c);
    }

    public final int hashCode() {
        return this.f61701c.hashCode() + ((this.f61700b.hashCode() + (this.f61699a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OnNavigateToSearch(shelf=");
        sb.append(this.f61699a);
        sb.append(", tabSelected=");
        sb.append(this.f61700b);
        sb.append(", query=");
        return AbstractC3393o1.m17738m(sb, this.f61701c, ")");
    }
}
