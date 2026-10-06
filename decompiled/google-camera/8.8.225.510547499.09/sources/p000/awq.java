package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class awq {

    /* JADX INFO: renamed from: a */
    public final avy f2607a;

    /* JADX INFO: renamed from: b */
    public final awo f2608b;

    /* JADX INFO: renamed from: c */
    private final awp f2609c;

    public awq(avy avyVar, awp awpVar, awo awoVar) {
        this.f2607a = avyVar;
        this.f2609c = awpVar;
        this.f2608b = awoVar;
        if (avyVar.m2066b() == 0 && avyVar.m2065a() == 0) {
            throw new IllegalArgumentException("Bounds must be non zero");
        }
        if (avyVar.f2564a != 0 && avyVar.f2565b != 0) {
            throw new IllegalArgumentException("Bounding rectangle must start at the top or left window edge for folding features");
        }
    }

    /* JADX INFO: renamed from: a */
    public final awn m2076a() {
        avy avyVar = this.f2607a;
        return avyVar.m2066b() > avyVar.m2065a() ? awn.f2599b : awn.f2598a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!ooc.m18737c(getClass(), obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        awq awqVar = (awq) obj;
        return ooc.m18737c(this.f2607a, awqVar.f2607a) && ooc.m18737c(this.f2609c, awqVar.f2609c) && ooc.m18737c(this.f2608b, awqVar.f2608b);
    }

    public final int hashCode() {
        return (((this.f2607a.hashCode() * 31) + this.f2609c.hashCode()) * 31) + this.f2608b.hashCode();
    }

    public final String toString() {
        return awq.class.getSimpleName() + " { " + this.f2607a + ", type=" + this.f2609c + ", state=" + this.f2608b + " }";
    }
}
