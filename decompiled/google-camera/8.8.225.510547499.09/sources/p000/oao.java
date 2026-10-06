package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class oao {

    /* JADX INFO: renamed from: a */
    public static final nxd f45166a;

    /* JADX INFO: renamed from: b */
    public static final nxd f45167b;

    static {
        nxl nxlVarM18137O = nxd.f44898c.m18137O();
        if (!nxlVarM18137O.f44974b.m18142ac()) {
            nxlVarM18137O.mo18106p();
        }
        nxq nxqVar = nxlVarM18137O.f44974b;
        ((nxd) nxqVar).f44900a = -315576000000L;
        if (!nxqVar.m18142ac()) {
            nxlVarM18137O.mo18106p();
        }
        ((nxd) nxlVarM18137O.f44974b).f44901b = -999999999;
        f45166a = (nxd) nxlVarM18137O.mo18103l();
        nxl nxlVarM18137O2 = nxd.f44898c.m18137O();
        if (!nxlVarM18137O2.f44974b.m18142ac()) {
            nxlVarM18137O2.mo18106p();
        }
        nxq nxqVar2 = nxlVarM18137O2.f44974b;
        ((nxd) nxqVar2).f44900a = 315576000000L;
        if (!nxqVar2.m18142ac()) {
            nxlVarM18137O2.mo18106p();
        }
        ((nxd) nxlVarM18137O2.f44974b).f44901b = 999999999;
        f45167b = (nxd) nxlVarM18137O2.mo18103l();
        nxl nxlVarM18137O3 = nxd.f44898c.m18137O();
        if (!nxlVarM18137O3.f44974b.m18142ac()) {
            nxlVarM18137O3.mo18106p();
        }
        nxq nxqVar3 = nxlVarM18137O3.f44974b;
        ((nxd) nxqVar3).f44900a = 0L;
        if (!nxqVar3.m18142ac()) {
            nxlVarM18137O3.mo18106p();
        }
        ((nxd) nxlVarM18137O3.f44974b).f44901b = 0;
    }

    /* JADX INFO: renamed from: a */
    public static nxd m18389a(long j, int i) {
        if (i <= -1000000000 || i >= 1000000000) {
            j = kxk.m14994al(j, i / 1000000000);
            i %= 1000000000;
        }
        if (j > 0 && i < 0) {
            i += 1000000000;
            j--;
        }
        if (j < 0 && i > 0) {
            i -= 1000000000;
            j++;
        }
        nxl nxlVarM18137O = nxd.f44898c.m18137O();
        if (!nxlVarM18137O.f44974b.m18142ac()) {
            nxlVarM18137O.mo18106p();
        }
        nxq nxqVar = nxlVarM18137O.f44974b;
        ((nxd) nxqVar).f44900a = j;
        if (!nxqVar.m18142ac()) {
            nxlVarM18137O.mo18106p();
        }
        ((nxd) nxlVarM18137O.f44974b).f44901b = i;
        nxd nxdVar = (nxd) nxlVarM18137O.mo18103l();
        m18390b(nxdVar);
        return nxdVar;
    }

    /* JADX INFO: renamed from: b */
    public static void m18390b(nxd nxdVar) {
        long j = nxdVar.f44900a;
        int i = nxdVar.f44901b;
        if (j >= -315576000000L && j <= 315576000000L && i >= -999999999 && i < 1000000000) {
            if (j >= 0 && i >= 0) {
                return;
            }
            if (j <= 0 && i <= 0) {
                return;
            }
        }
        throw new IllegalArgumentException(String.format("Duration is not valid. See proto definition for valid values. Seconds (%s) must be in range [-315,576,000,000, +315,576,000,000]. Nanos (%s) must be in range [-999,999,999, +999,999,999]. Nanos must have the same sign as seconds", Long.valueOf(j), Integer.valueOf(i)));
    }
}
