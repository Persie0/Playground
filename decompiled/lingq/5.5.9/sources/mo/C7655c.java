package mo;

import dm.C5207g;
import jm.C6526i;

/* JADX INFO: renamed from: mo.c */
/* JADX INFO: loaded from: classes2.dex */
public final class C7655c {

    /* JADX INFO: renamed from: a */
    public final String f42130a;

    /* JADX INFO: renamed from: b */
    public final C6526i f42131b;

    public C7655c(String str, C6526i c6526i) {
        this.f42130a = str;
        this.f42131b = c6526i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7655c)) {
            return false;
        }
        C7655c c7655c = (C7655c) obj;
        if (C5207g.m11106a(this.f42130a, c7655c.f42130a) && C5207g.m11106a(this.f42131b, c7655c.f42131b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f42131b.hashCode() + (this.f42130a.hashCode() * 31);
    }

    public final String toString() {
        return "MatchGroup(value=" + this.f42130a + ", range=" + this.f42131b + ')';
    }
}
