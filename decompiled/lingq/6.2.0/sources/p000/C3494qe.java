package p000;

/* JADX INFO: renamed from: qe */
/* JADX INFO: loaded from: classes.dex */
public final class C3494qe {

    /* JADX INFO: renamed from: a */
    public final int f57630a;

    public /* synthetic */ C3494qe(int i) {
        this.f57630a = i;
    }

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ C3494qe m19886a(int i) {
        return new C3494qe(i);
    }

    /* JADX INFO: renamed from: b */
    public static String m19887b(int i) {
        return wq1.m24114j("Vertical(value=", i, ')');
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C3494qe) {
            return this.f57630a == ((C3494qe) obj).f57630a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f57630a);
    }

    public final String toString() {
        return m19887b(this.f57630a);
    }
}
