package p000;

import com.lingq.core.domain.model.library.LibraryItem;
import com.lingq.core.domain.model.library.LibraryItemCounter;

/* JADX INFO: loaded from: classes2.dex */
public final class d71 {

    /* JADX INFO: renamed from: a */
    public final LibraryItem f35073a;

    /* JADX INFO: renamed from: b */
    public final LibraryItemCounter f35074b;

    public d71(LibraryItem libraryItem, LibraryItemCounter libraryItemCounter) {
        libraryItem.getClass();
        libraryItemCounter.getClass();
        this.f35073a = libraryItem;
        this.f35074b = libraryItemCounter;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d71)) {
            return false;
        }
        d71 d71Var = (d71) obj;
        return fa4.m11650l(this.f35073a, d71Var.f35073a) && fa4.m11650l(this.f35074b, d71Var.f35074b);
    }

    public final int hashCode() {
        return this.f35074b.hashCode() + (Integer.hashCode(this.f35073a.f19426a) * 31);
    }

    public final String toString() {
        return "CollectionHeaderState(course=" + this.f35073a + ", counter=" + this.f35074b + ")";
    }
}
