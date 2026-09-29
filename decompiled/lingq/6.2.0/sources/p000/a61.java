package p000;

import com.lingq.core.domain.model.library.Sort;

/* JADX INFO: loaded from: classes2.dex */
public final class a61 extends b61 {

    /* JADX INFO: renamed from: a */
    public final Sort f276a;

    public a61(Sort sort) {
        sort.getClass();
        this.f276a = sort;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a61) && this.f276a == ((a61) obj).f276a;
    }

    public final int hashCode() {
        return this.f276a.hashCode();
    }

    public final String toString() {
        return "OnSortSelected(sort=" + this.f276a + ")";
    }
}
