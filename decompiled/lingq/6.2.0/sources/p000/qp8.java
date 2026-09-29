package p000;

import com.lingq.feature.search.filter.model.FilterType;

/* JADX INFO: loaded from: classes3.dex */
public final class qp8 extends sp8 {

    /* JADX INFO: renamed from: a */
    public final FilterType f58031a;

    public qp8(FilterType filterType) {
        this.f58031a = filterType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qp8) && this.f58031a == ((qp8) obj).f58031a;
    }

    public final int hashCode() {
        return this.f58031a.hashCode();
    }

    public final String toString() {
        return "OnOpenSelection(filterType=" + this.f58031a + ")";
    }
}
