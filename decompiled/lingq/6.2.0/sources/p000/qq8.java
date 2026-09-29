package p000;

import com.lingq.core.domain.model.library.LibraryItem;

/* JADX INFO: loaded from: classes3.dex */
public final class qq8 extends yq8 {

    /* JADX INFO: renamed from: a */
    public final LibraryItem f58085a;

    public qq8(LibraryItem libraryItem) {
        this.f58085a = libraryItem;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qq8) && this.f58085a.equals(((qq8) obj).f58085a);
    }

    public final int hashCode() {
        return Integer.hashCode(this.f58085a.f19426a);
    }

    public final String toString() {
        return "CourseBlacklist(course=" + this.f58085a + ")";
    }
}
