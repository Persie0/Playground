package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class oaq {

    /* JADX INFO: renamed from: a */
    public static final nzw f45168a;

    /* JADX INFO: renamed from: b */
    public static final nzw f45169b;

    /* JADX INFO: renamed from: c */
    public static final nzw f45170c;

    /* JADX INFO: renamed from: d */
    public static final ThreadLocal f45171d;

    static {
        nxl nxlVarM18137O = nzw.f45101c.m18137O();
        if (!nxlVarM18137O.f44974b.m18142ac()) {
            nxlVarM18137O.mo18106p();
        }
        nxq nxqVar = nxlVarM18137O.f44974b;
        ((nzw) nxqVar).f45103a = -62135596800L;
        if (!nxqVar.m18142ac()) {
            nxlVarM18137O.mo18106p();
        }
        ((nzw) nxlVarM18137O.f44974b).f45104b = 0;
        f45168a = (nzw) nxlVarM18137O.mo18103l();
        nxl nxlVarM18137O2 = nzw.f45101c.m18137O();
        if (!nxlVarM18137O2.f44974b.m18142ac()) {
            nxlVarM18137O2.mo18106p();
        }
        nxq nxqVar2 = nxlVarM18137O2.f44974b;
        ((nzw) nxqVar2).f45103a = 253402300799L;
        if (!nxqVar2.m18142ac()) {
            nxlVarM18137O2.mo18106p();
        }
        ((nzw) nxlVarM18137O2.f44974b).f45104b = 999999999;
        f45169b = (nzw) nxlVarM18137O2.mo18103l();
        nxl nxlVarM18137O3 = nzw.f45101c.m18137O();
        if (!nxlVarM18137O3.f44974b.m18142ac()) {
            nxlVarM18137O3.mo18106p();
        }
        nxq nxqVar3 = nxlVarM18137O3.f44974b;
        ((nzw) nxqVar3).f45103a = 0L;
        if (!nxqVar3.m18142ac()) {
            nxlVarM18137O3.mo18106p();
        }
        ((nzw) nxlVarM18137O3.f44974b).f45104b = 0;
        f45170c = (nzw) nxlVarM18137O3.mo18103l();
        f45171d = new oap();
    }

    /* JADX INFO: renamed from: a */
    public static long m18391a(nzw nzwVar) {
        m18393c(nzwVar);
        return kxk.m14994al(kxk.m14995am(nzwVar.f45103a, 1000L), nzwVar.f45104b / 1000000);
    }

    /* JADX INFO: renamed from: b */
    public static nzw m18392b(long j) {
        int i = (int) ((j % 1000) * 1000000);
        long jM14994al = j / 1000;
        if (i <= -1000000000 || i >= 1000000000) {
            jM14994al = kxk.m14994al(jM14994al, i / 1000000000);
            i %= 1000000000;
        }
        if (i < 0) {
            i += 1000000000;
            jM14994al = kxk.m14996an(jM14994al, 1L);
        }
        nxl nxlVarM18137O = nzw.f45101c.m18137O();
        if (!nxlVarM18137O.f44974b.m18142ac()) {
            nxlVarM18137O.mo18106p();
        }
        nxq nxqVar = nxlVarM18137O.f44974b;
        ((nzw) nxqVar).f45103a = jM14994al;
        if (!nxqVar.m18142ac()) {
            nxlVarM18137O.mo18106p();
        }
        ((nzw) nxlVarM18137O.f44974b).f45104b = i;
        nzw nzwVar = (nzw) nxlVarM18137O.mo18103l();
        m18393c(nzwVar);
        return nzwVar;
    }

    /* JADX INFO: renamed from: c */
    public static void m18393c(nzw nzwVar) {
        long j = nzwVar.f45103a;
        int i = nzwVar.f45104b;
        if (j < -62135596800L || j > 253402300799L || i < 0 || i >= 1000000000) {
            throw new IllegalArgumentException(String.format("Timestamp is not valid. See proto definition for valid values. Seconds (%s) must be in range [-62,135,596,800, +253,402,300,799]. Nanos (%s) must be in range [0, +999,999,999].", Long.valueOf(j), Integer.valueOf(i)));
        }
    }
}
