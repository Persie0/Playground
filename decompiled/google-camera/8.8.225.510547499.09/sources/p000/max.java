package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class max {

    /* JADX INFO: renamed from: a */
    public final oer f39744a;

    /* JADX INFO: renamed from: b */
    public final Throwable f39745b;

    public max(oer oerVar, Throwable th) {
        oerVar.getClass();
        this.f39744a = oerVar;
        this.f39745b = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof max)) {
            return false;
        }
        max maxVar = (max) obj;
        return this.f39744a == maxVar.f39744a && ooc.m18737c(this.f39745b, maxVar.f39745b);
    }

    public final int hashCode() {
        return (this.f39744a.hashCode() * 31) + this.f39745b.hashCode();
    }

    public final String toString() {
        return "Error(logReason=" + this.f39744a + ", error=" + this.f39745b + ")";
    }
}
