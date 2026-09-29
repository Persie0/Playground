package p000;

import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class od2 {

    /* JADX INFO: renamed from: a */
    public final Map f54199a;

    /* JADX INFO: renamed from: b */
    public final Map f54200b;

    /* JADX INFO: renamed from: c */
    public final Map f54201c;

    /* JADX INFO: renamed from: d */
    public final List f54202d;

    public od2(Map map, Map map2, Map map3, List list) {
        this.f54199a = map;
        this.f54200b = map2;
        this.f54201c = map3;
        this.f54202d = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof od2)) {
            return false;
        }
        od2 od2Var = (od2) obj;
        return fa4.m11650l(this.f54199a, od2Var.f54199a) && fa4.m11650l(this.f54200b, od2Var.f54200b) && fa4.m11650l(this.f54201c, od2Var.f54201c) && fa4.m11650l(this.f54202d, od2Var.f54202d);
    }

    public final int hashCode() {
        Map map = this.f54199a;
        int iHashCode = (map == null ? 0 : map.hashCode()) * 31;
        Map map2 = this.f54200b;
        int iHashCode2 = (iHashCode + (map2 == null ? 0 : map2.hashCode())) * 31;
        Map map3 = this.f54201c;
        int iHashCode3 = (iHashCode2 + (map3 == null ? 0 : map3.hashCode())) * 31;
        List list = this.f54202d;
        return iHashCode3 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        return "DiagnosticsSnapshot(tags=" + this.f54199a + ", counters=" + this.f54200b + ", histograms=" + this.f54201c + ", events=" + this.f54202d + ')';
    }
}
