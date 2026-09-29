package p000;

import com.lingq.core.domain.model.library.LibraryItem;

/* JADX INFO: loaded from: classes3.dex */
public final class r03 extends z03 {

    /* JADX INFO: renamed from: a */
    public final LibraryItem f58437a;

    public r03(LibraryItem libraryItem) {
        this.f58437a = libraryItem;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r03) && this.f58437a.equals(((r03) obj).f58437a);
    }

    public final int hashCode() {
        return Integer.hashCode(this.f58437a.f19426a);
    }

    public final String toString() {
        return "OnAddLessonToPlaylist(lesson=" + this.f58437a + ")";
    }
}
