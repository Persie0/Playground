package p000;

import com.lingq.core.domain.model.library.LibraryItem;

/* JADX INFO: loaded from: classes2.dex */
public final class h51 extends b61 {

    /* JADX INFO: renamed from: a */
    public final LibraryItem f41798a;

    public h51(LibraryItem libraryItem) {
        libraryItem.getClass();
        this.f41798a = libraryItem;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h51) && fa4.m11650l(this.f41798a, ((h51) obj).f41798a);
    }

    public final int hashCode() {
        return Integer.hashCode(this.f41798a.f19426a);
    }

    public final String toString() {
        return "OnCourseDownloadRequested(course=" + this.f41798a + ")";
    }
}
