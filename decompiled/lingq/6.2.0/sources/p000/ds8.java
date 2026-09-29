package p000;

import com.lingq.core.domain.model.library.Sort;

/* JADX INFO: loaded from: classes2.dex */
public final class ds8 extends hs8 {

    /* JADX INFO: renamed from: a */
    public final Sort f36179a;

    public ds8(Sort sort) {
        sort.getClass();
        this.f36179a = sort;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ds8) && this.f36179a == ((ds8) obj).f36179a;
    }

    public final int hashCode() {
        return this.f36179a.hashCode();
    }

    public final String toString() {
        return "OnSortSelected(sort=" + this.f36179a + ")";
    }
}
