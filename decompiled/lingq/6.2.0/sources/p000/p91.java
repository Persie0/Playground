package p000;

import com.lingq.core.domain.model.library.Sort;

/* JADX INFO: loaded from: classes2.dex */
public final class p91 {

    /* JADX INFO: renamed from: a */
    public final Sort f55799a;

    public p91(Sort sort) {
        sort.getClass();
        this.f55799a = sort;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p91) && this.f55799a == ((p91) obj).f55799a;
    }

    public final int hashCode() {
        return this.f55799a.hashCode();
    }

    public final String toString() {
        return "CollectionSortState(sort=" + this.f55799a + ")";
    }
}
