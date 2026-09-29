package p000;

import com.lingq.core.domain.model.library.LibraryItem;

/* JADX INFO: loaded from: classes.dex */
public final class y58 {

    /* JADX INFO: renamed from: a */
    public final boolean f69324a;

    /* JADX INFO: renamed from: b */
    public final LibraryItem f69325b;

    public y58(LibraryItem libraryItem, boolean z) {
        this.f69324a = z;
        this.f69325b = libraryItem;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y58)) {
            return false;
        }
        y58 y58Var = (y58) obj;
        return this.f69324a == y58Var.f69324a && fa4.m11650l(this.f69325b, y58Var.f69325b);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f69324a) * 31;
        LibraryItem libraryItem = this.f69325b;
        return iHashCode + (libraryItem == null ? 0 : Integer.hashCode(libraryItem.f19426a));
    }

    public final String toString() {
        return "RemovePaidLessonWarningDialogState(show=" + this.f69324a + ", item=" + this.f69325b + ")";
    }

    public /* synthetic */ y58(int i) {
        this(null, false);
    }
}
