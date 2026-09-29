package p000;

import com.lingq.core.domain.model.library.LibraryShelf;

/* JADX INFO: loaded from: classes.dex */
public final class x85 {

    /* JADX INFO: renamed from: a */
    public final String f67931a;

    /* JADX INFO: renamed from: b */
    public final LibraryShelf f67932b;

    public x85(String str, LibraryShelf libraryShelf) {
        str.getClass();
        this.f67931a = str;
        this.f67932b = libraryShelf;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x85)) {
            return false;
        }
        x85 x85Var = (x85) obj;
        return fa4.m11650l(this.f67931a, x85Var.f67931a) && this.f67932b.equals(x85Var.f67932b);
    }

    public final int hashCode() {
        return this.f67932b.hashCode() + (this.f67931a.hashCode() * 31);
    }

    public final String toString() {
        return "LibraryHeaderWithTabsState(header=" + this.f67931a + ", shelf=" + this.f67932b + ")";
    }
}
