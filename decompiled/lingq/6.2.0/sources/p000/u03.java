package p000;

import com.lingq.core.domain.model.library.LibraryItem;

/* JADX INFO: loaded from: classes3.dex */
public final class u03 extends z03 {

    /* JADX INFO: renamed from: a */
    public final LibraryItem f63167a;

    public u03(LibraryItem libraryItem) {
        libraryItem.getClass();
        this.f63167a = libraryItem;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u03) && fa4.m11650l(this.f63167a, ((u03) obj).f63167a);
    }

    public final int hashCode() {
        return Integer.hashCode(this.f63167a.f19426a);
    }

    public final String toString() {
        return "OnOpenCourse(course=" + this.f63167a + ")";
    }
}
