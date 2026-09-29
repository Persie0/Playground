package p000;

import com.lingq.core.domain.model.library.LibraryItem;

/* JADX INFO: renamed from: ou */
/* JADX INFO: loaded from: classes.dex */
public final class C3436ou {

    /* JADX INFO: renamed from: a */
    public final boolean f54986a;

    /* JADX INFO: renamed from: b */
    public final LibraryItem f54987b;

    public C3436ou(LibraryItem libraryItem, boolean z) {
        this.f54986a = z;
        this.f54987b = libraryItem;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3436ou)) {
            return false;
        }
        C3436ou c3436ou = (C3436ou) obj;
        return this.f54986a == c3436ou.f54986a && fa4.m11650l(this.f54987b, c3436ou.f54987b);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f54986a) * 31;
        LibraryItem libraryItem = this.f54987b;
        return iHashCode + (libraryItem == null ? 0 : Integer.hashCode(libraryItem.f19426a));
    }

    public final String toString() {
        return "ArchiveConfirmationDialogState(show=" + this.f54986a + ", item=" + this.f54987b + ")";
    }

    public /* synthetic */ C3436ou() {
        this(null, false);
    }
}
