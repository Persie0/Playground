package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class rq7 {

    /* JADX INFO: renamed from: a */
    public final boolean f59723a;

    /* JADX INFO: renamed from: b */
    public final boolean f59724b;

    /* JADX INFO: renamed from: c */
    public final long f59725c;

    public rq7(long j, boolean z, boolean z2) {
        this.f59723a = z;
        this.f59724b = z2;
        this.f59725c = j;
    }

    /* JADX INFO: renamed from: a */
    public static rq7 m20746a() {
        return new rq7(0L, true, true);
    }

    /* JADX INFO: renamed from: b */
    public static rq7 m20747b(long j) {
        return new rq7(Math.max(0L, j), false, true);
    }

    /* JADX INFO: renamed from: c */
    public static rq7 m20748c() {
        return new rq7(0L, false, false);
    }

    /* JADX INFO: renamed from: d */
    public final long m20749d() {
        return this.f59725c;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m20750e() {
        return this.f59724b;
    }

    /* JADX INFO: renamed from: f */
    public final boolean m20751f() {
        return this.f59723a;
    }
}
