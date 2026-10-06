package p000;

import java.util.Collections;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bvg implements bvd {

    /* JADX INFO: renamed from: b */
    public final Map f4530b;

    /* JADX INFO: renamed from: c */
    public volatile Map f4531c;

    public bvg(Map map) {
        this.f4530b = Collections.unmodifiableMap(map);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof bvg) {
            return this.f4530b.equals(((bvg) obj).f4530b);
        }
        return false;
    }

    public final int hashCode() {
        return this.f4530b.hashCode();
    }

    public final String toString() {
        return "LazyHeaders{headers=" + String.valueOf(this.f4530b) + "}";
    }
}
