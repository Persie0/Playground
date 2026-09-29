package p000;

import com.lingq.core.domain.model.library.LibraryItem;

/* JADX INFO: loaded from: classes2.dex */
public final class y03 extends z03 {

    /* JADX INFO: renamed from: a */
    public final LibraryItem f69047a;

    public y03(LibraryItem libraryItem) {
        this.f69047a = libraryItem;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof y03) && this.f69047a.equals(((y03) obj).f69047a);
    }

    public final int hashCode() {
        return Integer.hashCode(this.f69047a.f19426a);
    }

    public final String toString() {
        return "OnReportLesson(lesson=" + this.f69047a + ")";
    }
}
