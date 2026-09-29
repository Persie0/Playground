package p000;

import com.lingq.core.domain.model.library.LibraryTab;

/* JADX INFO: loaded from: classes3.dex */
public final class es8 extends hs8 {

    /* JADX INFO: renamed from: a */
    public final LibraryTab f37778a;

    public es8(LibraryTab libraryTab) {
        libraryTab.getClass();
        this.f37778a = libraryTab;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof es8) && fa4.m11650l(this.f37778a, ((es8) obj).f37778a);
    }

    public final int hashCode() {
        return this.f37778a.hashCode();
    }

    public final String toString() {
        return "OnTabClicked(tab=" + this.f37778a + ")";
    }
}
