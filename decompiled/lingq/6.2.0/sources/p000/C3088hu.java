package p000;

/* JADX INFO: renamed from: hu */
/* JADX INFO: loaded from: classes2.dex */
public final class C3088hu implements InterfaceC3274ku {

    /* JADX INFO: renamed from: a */
    public final int f42937a;

    public C3088hu(int i) {
        this.f42937a = i;
    }

    /* JADX INFO: renamed from: a */
    public final int m13462a() {
        return this.f42937a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C3088hu) && this.f42937a == ((C3088hu) obj).f42937a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f42937a);
    }

    public final String toString() {
        return ux5.m22989l("Course(id=", this.f42937a, ")");
    }
}
