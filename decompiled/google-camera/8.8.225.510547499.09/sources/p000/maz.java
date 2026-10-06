package p000;

import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class maz {

    /* JADX INFO: renamed from: a */
    public final Map f39747a;

    /* JADX INFO: renamed from: b */
    public final Throwable f39748b;

    public maz(Map map, Throwable th) {
        map.getClass();
        this.f39747a = map;
        this.f39748b = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof maz)) {
            return false;
        }
        maz mazVar = (maz) obj;
        return ooc.m18737c(this.f39747a, mazVar.f39747a) && ooc.m18737c(this.f39748b, mazVar.f39748b);
    }

    public final int hashCode() {
        int iHashCode = this.f39747a.hashCode() * 31;
        Throwable th = this.f39748b;
        return iHashCode + (th == null ? 0 : th.hashCode());
    }

    public final String toString() {
        return "ResourceCheck(resources=" + this.f39747a + ", error=" + this.f39748b + ")";
    }
}
