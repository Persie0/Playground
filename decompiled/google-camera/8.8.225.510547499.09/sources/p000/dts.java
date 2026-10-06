package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class dts implements dtu {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ long f12565a;

    /* JADX INFO: renamed from: b */
    private long f12566b;

    public dts(long j) {
        this.f12565a = j;
        this.f12566b = j;
    }

    @Override // p000.dtu
    /* JADX INFO: renamed from: a */
    public final long mo6745a() {
        return this.f12566b;
    }

    @Override // p000.dtu
    /* JADX INFO: renamed from: b */
    public final boolean mo6746b() {
        long j = this.f12566b;
        long jMin = j >= 1 ? Math.min(j + 1, Long.MAX_VALUE) : 1L;
        if (jMin <= this.f12566b) {
            return false;
        }
        this.f12566b = jMin;
        return true;
    }

    @Override // p000.dtu
    /* JADX INFO: renamed from: c */
    public final boolean mo6747c() {
        long jMax = Math.max(this.f12566b - 1, 1L);
        if (jMax >= this.f12566b) {
            return false;
        }
        this.f12566b = jMax;
        return true;
    }
}
