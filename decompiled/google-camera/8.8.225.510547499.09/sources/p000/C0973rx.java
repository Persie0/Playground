package p000;

import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: rx */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class C0973rx {

    /* JADX INFO: renamed from: a */
    public final List f47566a;

    /* JADX INFO: renamed from: b */
    public final Map f47567b;

    /* JADX INFO: renamed from: c */
    public final List f47568c;

    /* JADX INFO: renamed from: d */
    private final Map f47569d;

    /* JADX INFO: renamed from: e */
    private final C0975rz f47570e = null;

    public C0973rx(List list, Map map, Map map2, List list2) {
        this.f47566a = list;
        this.f47567b = map;
        this.f47569d = map2;
        this.f47568c = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0973rx)) {
            return false;
        }
        C0973rx c0973rx = (C0973rx) obj;
        if (!ooc.m18737c(this.f47566a, c0973rx.f47566a) || !ooc.m18737c(this.f47567b, c0973rx.f47567b) || !ooc.m18737c(this.f47569d, c0973rx.f47569d) || !ooc.m18737c(this.f47568c, c0973rx.f47568c)) {
            return false;
        }
        C0975rz c0975rz = c0973rx.f47570e;
        return ooc.m18737c(null, null);
    }

    public final int hashCode() {
        return ((this.f47566a.hashCode() * 29791) + this.f47568c.hashCode()) * 31;
    }

    public final String toString() {
        return "Request(streams=" + this.f47566a + ", parameters=" + this.f47567b + ", extras=" + this.f47569d + ", listeners=" + this.f47568c + ", template=" + ((Object) null) + ')';
    }
}
