package p000;

import com.lingq.core.settings.FilterType;

/* JADX INFO: loaded from: classes3.dex */
public final class kza extends qza {

    /* JADX INFO: renamed from: a */
    public final FilterType f48826a;

    public kza(FilterType filterType) {
        this.f48826a = filterType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kza) && this.f48826a == ((kza) obj).f48826a;
    }

    public final int hashCode() {
        return this.f48826a.hashCode();
    }

    public final String toString() {
        return "OnFilterTypeSelected(filterType=" + this.f48826a + ")";
    }
}
