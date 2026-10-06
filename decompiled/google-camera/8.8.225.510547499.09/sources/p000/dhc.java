package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class dhc {

    /* JADX INFO: renamed from: a */
    public final long f11031a;

    /* JADX INFO: renamed from: b */
    private long f11032b = 0;

    /* JADX INFO: renamed from: c */
    private int f11033c = 0;

    /* JADX INFO: renamed from: d */
    private final int f11034d;

    public dhc(int i, long j) {
        this.f11034d = i;
        this.f11031a = j;
    }

    /* JADX INFO: renamed from: a */
    final synchronized njh m6144a(long j) {
        nxl nxlVarM18137O;
        long j2 = j - this.f11031a;
        nxlVarM18137O = njh.f42917f.m18137O();
        int i = this.f11034d;
        if (!nxlVarM18137O.f44974b.m18142ac()) {
            nxlVarM18137O.mo18106p();
        }
        nxq nxqVar = nxlVarM18137O.f44974b;
        njh njhVar = (njh) nxqVar;
        njhVar.f42920b = i - 1;
        njhVar.f42919a |= 1;
        if (!nxqVar.m18142ac()) {
            nxlVarM18137O.mo18106p();
        }
        nxq nxqVar2 = nxlVarM18137O.f44974b;
        njh njhVar2 = (njh) nxqVar2;
        njhVar2.f42919a |= 2;
        njhVar2.f42921c = j2;
        long j3 = this.f11032b;
        if (!nxqVar2.m18142ac()) {
            nxlVarM18137O.mo18106p();
        }
        nxq nxqVar3 = nxlVarM18137O.f44974b;
        njh njhVar3 = (njh) nxqVar3;
        njhVar3.f42919a |= 4;
        njhVar3.f42922d = j3;
        int i2 = this.f11033c;
        if (!nxqVar3.m18142ac()) {
            nxlVarM18137O.mo18106p();
        }
        njh njhVar4 = (njh) nxlVarM18137O.f44974b;
        njhVar4.f42919a |= 8;
        njhVar4.f42923e = i2;
        return (njh) nxlVarM18137O.mo18103l();
    }

    /* JADX INFO: renamed from: b */
    final synchronized void m6145b() {
        this.f11033c++;
    }

    /* JADX INFO: renamed from: c */
    final synchronized void m6146c() {
        this.f11032b++;
    }
}
