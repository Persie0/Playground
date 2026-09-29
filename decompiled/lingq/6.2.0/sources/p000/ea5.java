package p000;

import com.lingq.core.domain.model.library.LibraryItem;
import com.lingq.core.domain.model.library.LibraryItemCounter;

/* JADX INFO: loaded from: classes.dex */
public final class ea5 {

    /* JADX INFO: renamed from: a */
    public final LibraryItem f36924a;

    /* JADX INFO: renamed from: b */
    public final LibraryItemCounter f36925b;

    public ea5(LibraryItem libraryItem, LibraryItemCounter libraryItemCounter) {
        libraryItem.getClass();
        this.f36924a = libraryItem;
        this.f36925b = libraryItemCounter;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ea5)) {
            return false;
        }
        ea5 ea5Var = (ea5) obj;
        return fa4.m11650l(this.f36924a, ea5Var.f36924a) && fa4.m11650l(this.f36925b, ea5Var.f36925b);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f36924a.f19426a) * 31;
        LibraryItemCounter libraryItemCounter = this.f36925b;
        return iHashCode + (libraryItemCounter == null ? 0 : libraryItemCounter.hashCode());
    }

    public final String toString() {
        return "LibraryItemWithCounter(libraryItem=" + this.f36924a + ", counter=" + this.f36925b + ")";
    }
}
