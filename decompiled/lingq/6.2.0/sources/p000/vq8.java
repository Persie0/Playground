package p000;

import com.lingq.core.domain.model.library.LibraryItem;

/* JADX INFO: loaded from: classes3.dex */
public final class vq8 extends yq8 {

    /* JADX INFO: renamed from: a */
    public final LibraryItem f65791a;

    public vq8(LibraryItem libraryItem) {
        this.f65791a = libraryItem;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vq8) && this.f65791a.equals(((vq8) obj).f65791a);
    }

    public final int hashCode() {
        return Integer.hashCode(this.f65791a.f19426a);
    }

    public final String toString() {
        return "LessonBlacklist(lesson=" + this.f65791a + ")";
    }
}
