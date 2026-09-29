package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class uo0 extends zm9 implements Comparable {

    /* JADX INFO: renamed from: k */
    public long f64125k;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        uo0 uo0Var = (uo0) obj;
        if (m3751d(4) != uo0Var.m3751d(4)) {
            return m3751d(4) ? 1 : -1;
        }
        long j = this.f50502g - uo0Var.f50502g;
        if (j == 0) {
            j = this.f64125k - uo0Var.f64125k;
            if (j == 0) {
                return 0;
            }
        }
        return j > 0 ? 1 : -1;
    }
}
