package p000;

import com.lingq.core.domain.model.library.LibraryFastSearch;

/* JADX INFO: loaded from: classes2.dex */
public final class d03 extends e03 {

    /* JADX INFO: renamed from: a */
    public final LibraryFastSearch f34774a;

    /* JADX INFO: renamed from: b */
    public final z03 f34775b;

    public d03(LibraryFastSearch libraryFastSearch, t03 t03Var) {
        this.f34774a = libraryFastSearch;
        this.f34775b = t03Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d03)) {
            return false;
        }
        d03 d03Var = (d03) obj;
        return this.f34774a.equals(d03Var.f34774a) && fa4.m11650l(this.f34775b, d03Var.f34775b);
    }

    public final int hashCode() {
        int iHashCode = this.f34774a.hashCode() * 31;
        z03 z03Var = this.f34775b;
        return iHashCode + (z03Var == null ? 0 : z03Var.hashCode());
    }

    public final String toString() {
        return "Selection(searchData=" + this.f34774a + ", navigationAction=" + this.f34775b + ")";
    }
}
