package p258m6;

/* JADX INFO: renamed from: m6.k */
/* JADX INFO: loaded from: classes.dex */
public final class C7491k {

    /* JADX INFO: renamed from: a */
    public Class<?> f41380a;

    /* JADX INFO: renamed from: b */
    public Class<?> f41381b;

    /* JADX INFO: renamed from: c */
    public Class<?> f41382c;

    public C7491k() {
    }

    public C7491k(Class<?> cls, Class<?> cls2, Class<?> cls3) {
        this.f41380a = cls;
        this.f41381b = cls2;
        this.f41382c = cls3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C7491k.class == obj.getClass()) {
            C7491k c7491k = (C7491k) obj;
            return this.f41380a.equals(c7491k.f41380a) && this.f41381b.equals(c7491k.f41381b) && C7492l.m14881b(this.f41382c, c7491k.f41382c);
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.f41381b.hashCode() + (this.f41380a.hashCode() * 31)) * 31;
        Class<?> cls = this.f41382c;
        return iHashCode + (cls != null ? cls.hashCode() : 0);
    }

    public final String toString() {
        return "MultiClassKey{first=" + this.f41380a + ", second=" + this.f41381b + '}';
    }
}
