package p000;

/* JADX INFO: renamed from: vl */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class C1069vl {

    /* JADX INFO: renamed from: a */
    public final long f47850a;

    private /* synthetic */ C1069vl(long j) {
        this.f47850a = j;
    }

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ C1069vl m19504a(long j) {
        return new C1069vl(j);
    }

    /* JADX INFO: renamed from: b */
    public static String m19505b(long j) {
        return "TimestampNs(value=" + j + ')';
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C1069vl) && this.f47850a == ((C1069vl) obj).f47850a;
    }

    public final int hashCode() {
        return C0854nm.m17510e(this.f47850a);
    }

    public final String toString() {
        return m19505b(this.f47850a);
    }
}
