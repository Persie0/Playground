package p000;

/* JADX INFO: renamed from: iu */
/* JADX INFO: loaded from: classes2.dex */
public final class C3123iu implements InterfaceC3274ku {

    /* JADX INFO: renamed from: a */
    public final int f44564a;

    public C3123iu(int i) {
        this.f44564a = i;
    }

    /* JADX INFO: renamed from: a */
    public final int m14145a() {
        return this.f44564a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C3123iu) && this.f44564a == ((C3123iu) obj).f44564a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f44564a);
    }

    public final String toString() {
        return ux5.m22989l("Lesson(id=", this.f44564a, ")");
    }
}
