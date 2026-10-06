package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class dvm implements dtu {

    /* JADX INFO: renamed from: a */
    public long f12666a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ long f12667b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ dvn f12668c;

    public dvm(dvn dvnVar, long j) {
        this.f12668c = dvnVar;
        this.f12667b = j;
        this.f12666a = j;
    }

    @Override // p000.dtu
    /* JADX INFO: renamed from: a */
    public final long mo6745a() {
        return this.f12666a;
    }

    @Override // p000.dtu
    /* JADX INFO: renamed from: b */
    public final boolean mo6746b() {
        synchronized (this.f12668c.f12669a) {
            dvn dvnVar = this.f12668c;
            long j = this.f12666a;
            long j2 = Long.MAX_VALUE;
            if (j != Long.MAX_VALUE) {
                j2 = 1 + j;
            }
            int iM6783d = dvnVar.m6783d(j2);
            if (iM6783d < 0) {
                return false;
            }
            this.f12666a = this.f12668c.m6787h(iM6783d);
            return true;
        }
    }

    @Override // p000.dtu
    /* JADX INFO: renamed from: c */
    public final boolean mo6747c() {
        synchronized (this.f12668c.f12669a) {
            dvn dvnVar = this.f12668c;
            long j = this.f12666a;
            long j2 = Long.MIN_VALUE;
            if (j != Long.MIN_VALUE) {
                j2 = (-1) + j;
            }
            int iM6782c = dvnVar.m6782c(j2);
            if (iM6782c < 0) {
                return false;
            }
            this.f12666a = this.f12668c.m6787h(iM6782c);
            return true;
        }
    }
}
