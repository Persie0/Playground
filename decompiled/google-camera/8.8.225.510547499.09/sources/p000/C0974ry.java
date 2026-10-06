package p000;

/* JADX INFO: renamed from: ry */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class C0974ry {

    /* JADX INFO: renamed from: a */
    public final long f47571a;

    private /* synthetic */ C0974ry(long j) {
        this.f47571a = j;
    }

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ C0974ry m19383a(long j) {
        return new C0974ry(j);
    }

    /* JADX INFO: renamed from: b */
    public static String m19384b(long j) {
        return "RequestNumber(value=" + j + ')';
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C0974ry) && this.f47571a == ((C0974ry) obj).f47571a;
    }

    public final int hashCode() {
        long j = this.f47571a;
        return (int) (j ^ (j >>> 32));
    }

    public final String toString() {
        return m19384b(this.f47571a);
    }
}
