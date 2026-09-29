package p000;

import com.lingq.core.domain.model.library.LibraryItem;

/* JADX INFO: loaded from: classes3.dex */
public final class x03 extends z03 {

    /* JADX INFO: renamed from: a */
    public final LibraryItem f67589a;

    public x03(LibraryItem libraryItem) {
        this.f67589a = libraryItem;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof x03) && this.f67589a.equals(((x03) obj).f67589a);
    }

    public final int hashCode() {
        return Integer.hashCode(this.f67589a.f19426a);
    }

    public final String toString() {
        return "OnOpenLessonInfo(lesson=" + this.f67589a + ")";
    }
}
