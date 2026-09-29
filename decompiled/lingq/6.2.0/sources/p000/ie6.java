package p000;

import com.lingq.core.domain.model.library.LibraryShelf;
import com.lingq.core.domain.model.library.LibraryTab;

/* JADX INFO: loaded from: classes3.dex */
public final class ie6 extends hf6 {

    /* JADX INFO: renamed from: a */
    public final LibraryShelf f44020a;

    /* JADX INFO: renamed from: b */
    public final LibraryTab f44021b;

    public ie6(LibraryShelf libraryShelf, LibraryTab libraryTab) {
        libraryShelf.getClass();
        this.f44020a = libraryShelf;
        this.f44021b = libraryTab;
    }

    /* JADX INFO: renamed from: a */
    public final LibraryShelf m13811a() {
        return this.f44020a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ie6)) {
            return false;
        }
        ie6 ie6Var = (ie6) obj;
        return fa4.m11650l(this.f44020a, ie6Var.f44020a) && fa4.m11650l(this.f44021b, ie6Var.f44021b);
    }

    public final int hashCode() {
        int iHashCode = this.f44020a.hashCode() * 31;
        LibraryTab libraryTab = this.f44021b;
        return iHashCode + (libraryTab == null ? 0 : libraryTab.hashCode());
    }

    public final String toString() {
        return "Collections(shelf=" + this.f44020a + ", selectedTab=" + this.f44021b + ")";
    }

    public /* synthetic */ ie6(LibraryShelf libraryShelf) {
        this(libraryShelf, null);
    }
}
