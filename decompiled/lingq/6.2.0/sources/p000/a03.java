package p000;

import com.lingq.core.domain.model.library.LibraryItem;
import com.lingq.core.domain.model.library.LibraryItemCounter;

/* JADX INFO: loaded from: classes2.dex */
public final class a03 extends e03 {

    /* JADX INFO: renamed from: a */
    public final LibraryItem f17a;

    /* JADX INFO: renamed from: b */
    public final LibraryItemCounter f18b;

    public a03(LibraryItem libraryItem, LibraryItemCounter libraryItemCounter) {
        this.f17a = libraryItem;
        this.f18b = libraryItemCounter;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a03)) {
            return false;
        }
        a03 a03Var = (a03) obj;
        return this.f17a.equals(a03Var.f17a) && fa4.m11650l(this.f18b, a03Var.f18b);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f17a.f19426a) * 31;
        LibraryItemCounter libraryItemCounter = this.f18b;
        return iHashCode + (libraryItemCounter == null ? 0 : libraryItemCounter.hashCode());
    }

    public final String toString() {
        return "Lesson(lesson=" + this.f17a + ", counter=" + this.f18b + ")";
    }
}
