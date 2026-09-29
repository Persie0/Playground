package p000;

import com.lingq.core.domain.model.library.LibraryItem;

/* JADX INFO: loaded from: classes3.dex */
public final class w03 extends z03 {

    /* JADX INFO: renamed from: a */
    public final LibraryItem f66162a;

    public w03(LibraryItem libraryItem) {
        this.f66162a = libraryItem;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof w03) && this.f66162a.equals(((w03) obj).f66162a);
    }

    public final int hashCode() {
        return Integer.hashCode(this.f66162a.f19426a);
    }

    public final String toString() {
        return "OnOpenLessonCourse(lesson=" + this.f66162a + ")";
    }
}
