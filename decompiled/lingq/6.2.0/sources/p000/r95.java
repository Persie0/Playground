package p000;

import com.lingq.core.domain.model.library.LibraryShelf;

/* JADX INFO: loaded from: classes3.dex */
public final class r95 extends w95 {

    /* JADX INFO: renamed from: a */
    public final LibraryShelf f58944a;

    public r95(LibraryShelf libraryShelf) {
        libraryShelf.getClass();
        this.f58944a = libraryShelf;
    }

    /* JADX INFO: renamed from: a */
    public final LibraryShelf m20450a() {
        return this.f58944a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r95) && fa4.m11650l(this.f58944a, ((r95) obj).f58944a);
    }

    public final int hashCode() {
        return Integer.hashCode(-1) + (this.f58944a.hashCode() * 31);
    }

    public final String toString() {
        return "NavigateToShelfOverview(shelf=" + this.f58944a + ", miniStoriesCourseId=-1)";
    }
}
