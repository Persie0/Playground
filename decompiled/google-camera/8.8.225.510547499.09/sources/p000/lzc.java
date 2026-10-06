package p000;

import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class lzc {

    /* JADX INFO: renamed from: a */
    public final lzb f39614a;

    /* JADX INFO: renamed from: b */
    public final List f39615b;

    public lzc() {
        new lzb(null, null, null, null, null, 0L, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, 0L, 4194303);
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lzc)) {
            return false;
        }
        lzc lzcVar = (lzc) obj;
        return ooc.m18737c(this.f39614a, lzcVar.f39614a) && ooc.m18737c(this.f39615b, lzcVar.f39615b);
    }

    public final int hashCode() {
        return (this.f39614a.hashCode() * 31) + this.f39615b.hashCode();
    }

    public final String toString() {
        return "ResourceWithAnnotachments(resource=" + this.f39614a + ", annotachments=" + this.f39615b + ")";
    }

    public lzc(lzb lzbVar, List list) {
        lzbVar.getClass();
        list.getClass();
        this.f39614a = lzbVar;
        this.f39615b = list;
    }
}
