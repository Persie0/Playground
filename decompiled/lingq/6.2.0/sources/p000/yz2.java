package p000;

import com.lingq.core.domain.model.library.LibraryItem;

/* JADX INFO: loaded from: classes2.dex */
public final class yz2 extends e03 {

    /* JADX INFO: renamed from: a */
    public final LibraryItem f70666a;

    public yz2(LibraryItem libraryItem) {
        libraryItem.getClass();
        this.f70666a = libraryItem;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yz2) && fa4.m11650l(this.f70666a, ((yz2) obj).f70666a);
    }

    public final int hashCode() {
        return Integer.hashCode(this.f70666a.f19426a);
    }

    public final String toString() {
        return "Course(course=" + this.f70666a + ")";
    }
}
