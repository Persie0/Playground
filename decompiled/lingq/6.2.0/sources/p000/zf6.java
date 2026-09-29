package p000;

import com.lingq.core.settings.FilterType;

/* JADX INFO: loaded from: classes3.dex */
public final class zf6 extends fg6 {

    /* JADX INFO: renamed from: a */
    public final FilterType f71493a;

    public zf6(FilterType filterType) {
        this.f71493a = filterType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zf6) && this.f71493a == ((zf6) obj).f71493a;
    }

    public final int hashCode() {
        return this.f71493a.hashCode();
    }

    public final String toString() {
        return "OnFilterSelection(filterType=" + this.f71493a + ")";
    }
}
