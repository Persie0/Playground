package dm;

/* JADX INFO: renamed from: dm.h */
/* JADX INFO: loaded from: classes2.dex */
public final class C5208h implements InterfaceC5202b {

    /* JADX INFO: renamed from: a */
    public final Class<?> f33276a;

    public C5208h(Class<?> cls, String str) {
        C5207g.m11111f(cls, "jClass");
        this.f33276a = cls;
    }

    @Override // dm.InterfaceC5202b
    /* JADX INFO: renamed from: b */
    public final Class<?> mo10973b() {
        return this.f33276a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C5208h) {
            if (C5207g.m11106a(this.f33276a, ((C5208h) obj).f33276a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f33276a.hashCode();
    }

    public final String toString() {
        return this.f33276a.toString() + " (Kotlin reflection is not available)";
    }
}
