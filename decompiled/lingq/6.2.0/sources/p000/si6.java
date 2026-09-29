package p000;

import com.lingq.core.settings.FilterType;

/* JADX INFO: loaded from: classes3.dex */
public final class si6 implements vg6 {

    /* JADX INFO: renamed from: a */
    public final FilterType f60900a;

    public si6(FilterType filterType) {
        this.f60900a = filterType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof si6) && this.f60900a == ((si6) obj).f60900a;
    }

    public final int hashCode() {
        return this.f60900a.hashCode();
    }

    public final String toString() {
        return "FilterSelection(filterType=" + this.f60900a + ")";
    }
}
