package p000;

import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: ud */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class C1034ud {

    /* JADX INFO: renamed from: a */
    public final List f47725a;

    /* JADX INFO: renamed from: b */
    public final Map f47726b;

    public C1034ud(List list, Map map) {
        this.f47725a = list;
        this.f47726b = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1034ud)) {
            return false;
        }
        C1034ud c1034ud = (C1034ud) obj;
        return ooc.m18737c(this.f47725a, c1034ud.f47725a) && ooc.m18737c(this.f47726b, c1034ud.f47726b);
    }

    public final int hashCode() {
        return (this.f47725a.hashCode() * 31) + this.f47726b.hashCode();
    }

    public final String toString() {
        return "OutputConfigurations(all=" + this.f47725a + ", deferred=" + this.f47726b + ')';
    }
}
