package p000;

import android.os.Build;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class pjc extends whb {
    private static final pjc zzaw;
    private static volatile ajb zzax;
    private long zzA;
    private int zzB;
    private String zzC;
    private String zzD;
    private boolean zzE;
    private mib zzF;
    private String zzG;
    private int zzH;
    private int zzI;
    private int zzJ;
    private String zzK;
    private long zzL;
    private long zzM;
    private String zzN;
    private String zzO;
    private int zzP;
    private String zzQ;
    private ekc zzR;
    private hib zzS;
    private long zzT;
    private long zzU;
    private String zzV;
    private String zzW;
    private int zzX;
    private boolean zzY;
    private String zzZ;
    private boolean zzaa;
    private oic zzab;
    private String zzac;
    private mib zzad;
    private String zzae;
    private long zzaf;
    private boolean zzag;
    private String zzah;
    private boolean zzai;
    private String zzaj;
    private int zzak;
    private String zzal;
    private cfc zzam;
    private int zzan;
    private iec zzao;
    private String zzap;
    private amc zzaq;
    private long zzar;
    private String zzas;
    private wgc zzat;
    private String zzau;
    private mib zzav;
    private int zzb;
    private int zze;
    private int zzf;
    private mib zzg;
    private mib zzh;
    private long zzi;
    private long zzj;
    private long zzk;
    private long zzl;
    private long zzm;
    private String zzn;
    private String zzo;
    private String zzp;
    private String zzq;
    private int zzr;
    private String zzs;
    private String zzt;
    private String zzu;
    private long zzv;
    private long zzw;
    private String zzx;
    private boolean zzy;
    private String zzz;

    static {
        pjc pjcVar = new pjc();
        zzaw = pjcVar;
        whb.m23957n(pjc.class, pjcVar);
    }

    public pjc() {
        djb djbVar = djb.f35734e;
        this.zzg = djbVar;
        this.zzh = djbVar;
        this.zzn = "";
        this.zzo = "";
        this.zzp = "";
        this.zzq = "";
        this.zzs = "";
        this.zzt = "";
        this.zzu = "";
        this.zzx = "";
        this.zzz = "";
        this.zzC = "";
        this.zzD = "";
        this.zzF = djbVar;
        this.zzG = "";
        this.zzK = "";
        this.zzN = "";
        this.zzO = "";
        this.zzQ = "";
        this.zzS = xhb.f68225e;
        this.zzV = "";
        this.zzW = "";
        this.zzZ = "";
        this.zzac = "";
        this.zzad = djbVar;
        this.zzae = "";
        this.zzah = "";
        this.zzaj = "";
        this.zzal = "";
        this.zzap = "";
        this.zzas = "";
        this.zzau = "";
        this.zzav = djbVar;
    }

    /* JADX INFO: renamed from: X */
    public static ljc m19202X() {
        return (ljc) zzaw.m23965i();
    }

    /* JADX INFO: renamed from: Y */
    public static ljc m19203Y(pjc pjcVar) {
        uhb uhbVarM23965i = zzaw.m23965i();
        uhbVarM23965i.m22742e(pjcVar);
        return (ljc) uhbVarM23965i;
    }

    /* JADX INFO: renamed from: A */
    public final boolean m19204A() {
        return this.zzy;
    }

    /* JADX INFO: renamed from: A0 */
    public final boolean m19205A0() {
        return (this.zze & 32768) != 0;
    }

    /* JADX INFO: renamed from: A1 */
    public final /* synthetic */ void m19206A1() {
        this.zzb |= 32768;
        this.zzw = 161000L;
    }

    /* JADX INFO: renamed from: B */
    public final String m19207B() {
        return this.zzz;
    }

    /* JADX INFO: renamed from: B0 */
    public final long m19208B0() {
        return this.zzaf;
    }

    /* JADX INFO: renamed from: B1 */
    public final /* synthetic */ void m19209B1(String str) {
        str.getClass();
        this.zzb |= 65536;
        this.zzx = str;
    }

    /* JADX INFO: renamed from: C */
    public final boolean m19210C() {
        return (this.zzb & 524288) != 0;
    }

    /* JADX INFO: renamed from: C0 */
    public final boolean m19211C0() {
        return this.zzag;
    }

    /* JADX INFO: renamed from: C1 */
    public final /* synthetic */ void m19212C1() {
        this.zzb &= -65537;
        this.zzx = zzaw.zzx;
    }

    /* JADX INFO: renamed from: D */
    public final long m19213D() {
        return this.zzA;
    }

    /* JADX INFO: renamed from: D0 */
    public final boolean m19214D0() {
        return (this.zze & 131072) != 0;
    }

    /* JADX INFO: renamed from: D1 */
    public final /* synthetic */ void m19215D1(boolean z) {
        this.zzb |= 131072;
        this.zzy = z;
    }

    /* JADX INFO: renamed from: E */
    public final boolean m19216E() {
        return (this.zzb & 1048576) != 0;
    }

    /* JADX INFO: renamed from: E0 */
    public final String m19217E0() {
        return this.zzah;
    }

    /* JADX INFO: renamed from: E1 */
    public final /* synthetic */ void m19218E1() {
        this.zzb &= -131073;
        this.zzy = false;
    }

    /* JADX INFO: renamed from: F */
    public final int m19219F() {
        return this.zzB;
    }

    /* JADX INFO: renamed from: F0 */
    public final boolean m19220F0() {
        return (this.zze & 262144) != 0;
    }

    /* JADX INFO: renamed from: F1 */
    public final /* synthetic */ void m19221F1(String str) {
        this.zzb |= 262144;
        this.zzz = str;
    }

    /* JADX INFO: renamed from: G */
    public final String m19222G() {
        return this.zzC;
    }

    /* JADX INFO: renamed from: G0 */
    public final boolean m19223G0() {
        return this.zzai;
    }

    /* JADX INFO: renamed from: G1 */
    public final /* synthetic */ void m19224G1() {
        this.zzb &= -262145;
        this.zzz = zzaw.zzz;
    }

    /* JADX INFO: renamed from: H */
    public final String m19225H() {
        return this.zzD;
    }

    /* JADX INFO: renamed from: H0 */
    public final boolean m19226H0() {
        return (this.zze & 524288) != 0;
    }

    /* JADX INFO: renamed from: H1 */
    public final /* synthetic */ void m19227H1(long j) {
        this.zzb |= 524288;
        this.zzA = j;
    }

    /* JADX INFO: renamed from: I */
    public final boolean m19228I() {
        return (this.zzb & 8388608) != 0;
    }

    /* JADX INFO: renamed from: I0 */
    public final String m19229I0() {
        return this.zzaj;
    }

    /* JADX INFO: renamed from: I1 */
    public final /* synthetic */ void m19230I1(int i) {
        this.zzb |= 1048576;
        this.zzB = i;
    }

    /* JADX INFO: renamed from: J */
    public final boolean m19231J() {
        return this.zzE;
    }

    /* JADX INFO: renamed from: J0 */
    public final int m19232J0() {
        return this.zzak;
    }

    /* JADX INFO: renamed from: J1 */
    public final /* synthetic */ void m19233J1(String str) {
        this.zzb |= 2097152;
        this.zzC = str;
    }

    /* JADX INFO: renamed from: K */
    public final mib m19234K() {
        return this.zzF;
    }

    /* JADX INFO: renamed from: K0 */
    public final boolean m19235K0() {
        return (this.zze & 4194304) != 0;
    }

    /* JADX INFO: renamed from: K1 */
    public final /* synthetic */ void m19236K1() {
        this.zzb &= -2097153;
        this.zzC = zzaw.zzC;
    }

    /* JADX INFO: renamed from: L */
    public final String m19237L() {
        return this.zzG;
    }

    /* JADX INFO: renamed from: L0 */
    public final cfc m19238L0() {
        cfc cfcVar = this.zzam;
        return cfcVar == null ? cfc.m4609A() : cfcVar;
    }

    /* JADX INFO: renamed from: L1 */
    public final /* synthetic */ void m19239L1(String str) {
        str.getClass();
        this.zzb |= 4194304;
        this.zzD = str;
    }

    /* JADX INFO: renamed from: M */
    public final boolean m19240M() {
        return (this.zzb & 33554432) != 0;
    }

    /* JADX INFO: renamed from: M0 */
    public final boolean m19241M0() {
        return (this.zze & 8388608) != 0;
    }

    /* JADX INFO: renamed from: M1 */
    public final /* synthetic */ void m19242M1() {
        this.zzb |= 8388608;
        this.zzE = false;
    }

    /* JADX INFO: renamed from: N */
    public final int m19243N() {
        return this.zzH;
    }

    /* JADX INFO: renamed from: N0 */
    public final int m19244N0() {
        return this.zzan;
    }

    /* JADX INFO: renamed from: N1 */
    public final void m19245N1(ArrayList arrayList) {
        mib mibVar = this.zzF;
        if (!((chb) mibVar).f10103a) {
            this.zzF = g9a.m12432i(mibVar);
        }
        bhb.m3724c(arrayList, this.zzF);
    }

    /* JADX INFO: renamed from: O */
    public final boolean m19246O() {
        return (this.zzb & 536870912) != 0;
    }

    /* JADX INFO: renamed from: O0 */
    public final boolean m19247O0() {
        return (this.zze & 16777216) != 0;
    }

    /* JADX INFO: renamed from: O1 */
    public final void m19248O1() {
        this.zzF = djb.f35734e;
    }

    /* JADX INFO: renamed from: P */
    public final long m19249P() {
        return this.zzL;
    }

    /* JADX INFO: renamed from: P0 */
    public final iec m19250P0() {
        iec iecVar = this.zzao;
        return iecVar == null ? iec.m13817Y() : iecVar;
    }

    /* JADX INFO: renamed from: P1 */
    public final /* synthetic */ void m19251P1(String str) {
        this.zzb |= 16777216;
        this.zzG = str;
    }

    /* JADX INFO: renamed from: Q */
    public final boolean m19252Q() {
        return (this.zzb & Integer.MIN_VALUE) != 0;
    }

    /* JADX INFO: renamed from: Q0 */
    public final boolean m19253Q0() {
        return (this.zze & 67108864) != 0;
    }

    /* JADX INFO: renamed from: Q1 */
    public final /* synthetic */ void m19254Q1(int i) {
        this.zzb |= 33554432;
        this.zzH = i;
    }

    /* JADX INFO: renamed from: R */
    public final String m19255R() {
        return this.zzN;
    }

    /* JADX INFO: renamed from: R0 */
    public final amc m19256R0() {
        amc amcVar = this.zzaq;
        return amcVar == null ? amc.m581u() : amcVar;
    }

    /* JADX INFO: renamed from: R1 */
    public final /* synthetic */ void m19257R1() {
        this.zzb &= -268435457;
        this.zzK = zzaw.zzK;
    }

    /* JADX INFO: renamed from: S */
    public final boolean m19258S() {
        return (this.zzb & 1) != 0;
    }

    /* JADX INFO: renamed from: S0 */
    public final int m19259S0() {
        return this.zzf;
    }

    /* JADX INFO: renamed from: S1 */
    public final List m19260S1() {
        return this.zzg;
    }

    /* JADX INFO: renamed from: T */
    public final boolean m19261T() {
        return (this.zze & 134217728) != 0;
    }

    /* JADX INFO: renamed from: T0 */
    public final /* synthetic */ void m19262T0(long j) {
        this.zzb |= 536870912;
        this.zzL = j;
    }

    /* JADX INFO: renamed from: T1 */
    public final void m19263T1() {
        mib mibVar = this.zzg;
        if (((chb) mibVar).f10103a) {
            return;
        }
        this.zzg = g9a.m12432i(mibVar);
    }

    /* JADX INFO: renamed from: U */
    public final long m19264U() {
        return this.zzar;
    }

    /* JADX INFO: renamed from: U0 */
    public final /* synthetic */ void m19265U0(String str) {
        str.getClass();
        this.zzb |= Integer.MIN_VALUE;
        this.zzN = str;
    }

    /* JADX INFO: renamed from: U1 */
    public final void m19266U1() {
        mib mibVar = this.zzh;
        if (((chb) mibVar).f10103a) {
            return;
        }
        this.zzh = g9a.m12432i(mibVar);
    }

    /* JADX INFO: renamed from: V */
    public final boolean m19267V() {
        return (this.zze & 536870912) != 0;
    }

    /* JADX INFO: renamed from: V0 */
    public final /* synthetic */ void m19268V0() {
        this.zzb &= Integer.MAX_VALUE;
        this.zzN = zzaw.zzN;
    }

    /* JADX INFO: renamed from: V1 */
    public final void m19269V1(List list) {
        mib mibVar = this.zzav;
        if (!((chb) mibVar).f10103a) {
            this.zzav = g9a.m12432i(mibVar);
        }
        bhb.m3724c(list, this.zzav);
    }

    /* JADX INFO: renamed from: W */
    public final wgc m19270W() {
        wgc wgcVar = this.zzat;
        return wgcVar == null ? wgc.m23944u() : wgcVar;
    }

    /* JADX INFO: renamed from: W0 */
    public final /* synthetic */ void m19271W0(int i) {
        this.zze |= 2;
        this.zzP = i;
    }

    /* JADX INFO: renamed from: W1 */
    public final int m19272W1() {
        return this.zzg.size();
    }

    /* JADX INFO: renamed from: X0 */
    public final void m19273X0(List list) {
        List list2 = this.zzS;
        if (!((chb) list2).f10103a) {
            int size = list2.size();
            this.zzS = ((xhb) list2).mo10419Y(size + size);
        }
        bhb.m3724c(list, this.zzS);
    }

    /* JADX INFO: renamed from: X1 */
    public final ohc m19274X1(int i) {
        return (ohc) this.zzg.get(i);
    }

    /* JADX INFO: renamed from: Y0 */
    public final /* synthetic */ void m19275Y0(long j) {
        this.zze |= 16;
        this.zzT = j;
    }

    /* JADX INFO: renamed from: Y1 */
    public final mib m19276Y1() {
        return this.zzh;
    }

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ void m19277Z() {
        this.zzb |= 1;
        this.zzf = 1;
    }

    /* JADX INFO: renamed from: Z0 */
    public final /* synthetic */ void m19278Z0(long j) {
        this.zze |= 32;
        this.zzU = j;
    }

    /* JADX INFO: renamed from: Z1 */
    public final int m19279Z1() {
        return this.zzh.size();
    }

    /* JADX INFO: renamed from: a0 */
    public final /* synthetic */ void m19280a0(int i, ohc ohcVar) {
        m19263T1();
        this.zzg.set(i, ohcVar);
    }

    /* JADX INFO: renamed from: a1 */
    public final /* synthetic */ void m19281a1(String str) {
        this.zze |= 128;
        this.zzW = str;
    }

    /* JADX INFO: renamed from: a2 */
    public final jmc m19282a2(int i) {
        return (jmc) this.zzh.get(i);
    }

    /* JADX INFO: renamed from: b0 */
    public final /* synthetic */ void m19283b0(ohc ohcVar) {
        m19263T1();
        this.zzg.add(ohcVar);
    }

    /* JADX INFO: renamed from: b1 */
    public final /* synthetic */ void m19284b1(String str) {
        str.getClass();
        this.zze |= 8192;
        this.zzac = str;
    }

    /* JADX INFO: renamed from: b2 */
    public final boolean m19285b2() {
        return (this.zzb & 2) != 0;
    }

    /* JADX INFO: renamed from: c0 */
    public final /* synthetic */ void m19286c0(Iterable iterable) {
        m19263T1();
        bhb.m3724c(iterable, this.zzg);
    }

    /* JADX INFO: renamed from: c1 */
    public final /* synthetic */ void m19287c1() {
        this.zze &= -8193;
        this.zzac = zzaw.zzac;
    }

    /* JADX INFO: renamed from: c2 */
    public final long m19288c2() {
        return this.zzi;
    }

    /* JADX INFO: renamed from: d0 */
    public final void m19289d0() {
        this.zzg = djb.f35734e;
    }

    /* JADX INFO: renamed from: d1 */
    public final void m19290d1(Set set) {
        mib mibVar = this.zzad;
        if (!((chb) mibVar).f10103a) {
            this.zzad = g9a.m12432i(mibVar);
        }
        bhb.m3724c(set, this.zzad);
    }

    /* JADX INFO: renamed from: d2 */
    public final boolean m19291d2() {
        return (this.zzb & 4) != 0;
    }

    /* JADX INFO: renamed from: e0 */
    public final /* synthetic */ void m19292e0(int i) {
        m19263T1();
        this.zzg.remove(i);
    }

    /* JADX INFO: renamed from: e1 */
    public final /* synthetic */ void m19293e1(String str) {
        str.getClass();
        this.zze |= 16384;
        this.zzae = str;
    }

    /* JADX INFO: renamed from: e2 */
    public final long m19294e2() {
        return this.zzj;
    }

    /* JADX INFO: renamed from: f0 */
    public final /* synthetic */ void m19295f0(int i, jmc jmcVar) {
        m19266U1();
        this.zzh.set(i, jmcVar);
    }

    /* JADX INFO: renamed from: f1 */
    public final /* synthetic */ void m19296f1(long j) {
        this.zze |= 32768;
        this.zzaf = j;
    }

    /* JADX INFO: renamed from: f2 */
    public final boolean m19297f2() {
        return (this.zzb & 8) != 0;
    }

    /* JADX INFO: renamed from: g0 */
    public final /* synthetic */ void m19298g0(jmc jmcVar) {
        m19266U1();
        this.zzh.add(jmcVar);
    }

    /* JADX INFO: renamed from: g1 */
    public final /* synthetic */ void m19299g1(boolean z) {
        this.zze |= 65536;
        this.zzag = z;
    }

    /* JADX INFO: renamed from: g2 */
    public final long m19300g2() {
        return this.zzk;
    }

    /* JADX INFO: renamed from: h0 */
    public final /* synthetic */ void m19301h0(int i) {
        m19266U1();
        this.zzh.remove(i);
    }

    /* JADX INFO: renamed from: h1 */
    public final /* synthetic */ void m19302h1(String str) {
        this.zze |= 131072;
        this.zzah = str;
    }

    /* JADX INFO: renamed from: h2 */
    public final boolean m19303h2() {
        return (this.zzb & 16) != 0;
    }

    /* JADX INFO: renamed from: i0 */
    public final /* synthetic */ void m19304i0(long j) {
        this.zzb |= 2;
        this.zzi = j;
    }

    /* JADX INFO: renamed from: i1 */
    public final /* synthetic */ void m19305i1(boolean z) {
        this.zze |= 262144;
        this.zzai = z;
    }

    /* JADX INFO: renamed from: i2 */
    public final long m19306i2() {
        return this.zzl;
    }

    /* JADX INFO: renamed from: j0 */
    public final /* synthetic */ void m19307j0() {
        this.zzb &= -3;
        this.zzi = 0L;
    }

    /* JADX INFO: renamed from: j1 */
    public final /* synthetic */ void m19308j1(String str) {
        str.getClass();
        this.zze |= 524288;
        this.zzaj = str;
    }

    /* JADX INFO: renamed from: j2 */
    public final boolean m19309j2() {
        return (this.zzb & 32) != 0;
    }

    /* JADX INFO: renamed from: k0 */
    public final /* synthetic */ void m19310k0(long j) {
        this.zzb |= 4;
        this.zzj = j;
    }

    /* JADX INFO: renamed from: k1 */
    public final /* synthetic */ void m19311k1(int i) {
        this.zze |= 1048576;
        this.zzak = i;
    }

    /* JADX INFO: renamed from: k2 */
    public final long m19312k2() {
        return this.zzm;
    }

    /* JADX INFO: renamed from: l0 */
    public final /* synthetic */ void m19313l0(long j) {
        this.zzb |= 8;
        this.zzk = j;
    }

    /* JADX INFO: renamed from: l1 */
    public final /* synthetic */ void m19314l1(cfc cfcVar) {
        this.zzam = cfcVar;
        this.zze |= 4194304;
    }

    /* JADX INFO: renamed from: l2 */
    public final String m19315l2() {
        return this.zzn;
    }

    /* JADX INFO: renamed from: m0 */
    public final /* synthetic */ void m19316m0(long j) {
        this.zzb |= 16;
        this.zzl = j;
    }

    /* JADX INFO: renamed from: m1 */
    public final /* synthetic */ void m19317m1(int i) {
        this.zze |= 8388608;
        this.zzan = i;
    }

    /* JADX INFO: renamed from: m2 */
    public final String m19318m2() {
        return this.zzo;
    }

    /* JADX INFO: renamed from: n0 */
    public final /* synthetic */ void m19319n0() {
        this.zzb &= -17;
        this.zzl = 0L;
    }

    /* JADX INFO: renamed from: n1 */
    public final /* synthetic */ void m19320n1(iec iecVar) {
        this.zzao = iecVar;
        this.zze |= 16777216;
    }

    /* JADX INFO: renamed from: n2 */
    public final String m19321n2() {
        return this.zzp;
    }

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ void m19322o0(long j) {
        this.zzb |= 32;
        this.zzm = j;
    }

    /* JADX INFO: renamed from: o1 */
    public final /* synthetic */ void m19323o1(amc amcVar) {
        this.zzaq = amcVar;
        this.zze |= 67108864;
    }

    /* JADX INFO: renamed from: o2 */
    public final String m19324o2() {
        return this.zzq;
    }

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ void m19325p0() {
        this.zzb &= -33;
        this.zzm = 0L;
    }

    /* JADX INFO: renamed from: p1 */
    public final /* synthetic */ void m19326p1(long j) {
        this.zze |= 134217728;
        this.zzar = j;
    }

    /* JADX INFO: renamed from: p2 */
    public final boolean m19327p2() {
        return (this.zzb & 1024) != 0;
    }

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ void m19328q0() {
        this.zzb |= 64;
        this.zzn = "android";
    }

    /* JADX INFO: renamed from: q1 */
    public final /* synthetic */ void m19329q1(wgc wgcVar) {
        this.zzat = wgcVar;
        this.zze |= 536870912;
    }

    /* JADX INFO: renamed from: q2 */
    public final int m19330q2() {
        return this.zzr;
    }

    @Override // p000.whb
    /* JADX INFO: renamed from: r */
    public final Object mo329r(int i) {
        ajb vhbVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new ejb(zzaw, "\u0004E\u0000\u0002\u0001YE\u0000\u0006\u0000\u0001င\u0000\u0002\u001b\u0003\u001b\u0004ဂ\u0001\u0005ဂ\u0002\u0006ဂ\u0003\u0007ဂ\u0005\bဈ\u0006\tဈ\u0007\nဈ\b\u000bဈ\t\fင\n\rဈ\u000b\u000eဈ\f\u0010ဈ\r\u0011ဂ\u000e\u0012ဂ\u000f\u0013ဈ\u0010\u0014ဇ\u0011\u0015ဈ\u0012\u0016ဂ\u0013\u0017င\u0014\u0018ဈ\u0015\u0019ဈ\u0016\u001aဂ\u0004\u001cဇ\u0017\u001d\u001b\u001eဈ\u0018\u001fင\u0019 င\u001a!င\u001b\"ဈ\u001c#ဂ\u001d$ဂ\u001e%ဈ\u001f&ဈ 'င!)ဈ\",ဉ#-\u001d.ဂ$/ဂ%2ဈ&4ဈ'5᠌(7ဇ)9ဈ*:ဇ+;ဉ,?ဈ-@\u001aAဈ.Cဂ/Dဇ0Gဈ1Hဇ2Iဈ3Jင4Kဈ5Lဉ6Mင7Oဉ8Pဈ9Qဉ:Rဂ;Sဈ<Vဉ=Xဈ>Y\u001b", new Object[]{"zzb", "zze", "zzf", "zzg", ohc.class, "zzh", jmc.class, "zzi", "zzj", "zzk", "zzm", "zzn", "zzo", "zzp", "zzq", "zzr", "zzs", "zzt", "zzu", "zzv", "zzw", "zzx", "zzy", "zzz", "zzA", "zzB", "zzC", "zzD", "zzl", "zzE", "zzF", lfc.class, "zzG", "zzH", "zzI", "zzJ", "zzK", "zzL", "zzM", "zzN", "zzO", "zzP", "zzQ", "zzR", "zzS", "zzT", "zzU", "zzV", "zzW", "zzX", u8c.f63604e, "zzY", "zzZ", "zzaa", "zzab", "zzac", "zzad", "zzae", "zzaf", "zzag", "zzah", "zzai", "zzaj", "zzak", "zzal", "zzam", "zzan", "zzao", "zzap", "zzaq", "zzar", "zzas", "zzat", "zzau", "zzav", m4c.class});
        }
        if (i2 == 3) {
            return new pjc();
        }
        if (i2 == 4) {
            return new ljc(zzaw);
        }
        if (i2 == 5) {
            return zzaw;
        }
        if (i2 != 6) {
            throw null;
        }
        ajb ajbVar = zzax;
        if (ajbVar != null) {
            return ajbVar;
        }
        synchronized (pjc.class) {
            try {
                vhbVar = zzax;
                if (vhbVar == null) {
                    vhbVar = new vhb(zzaw);
                    zzax = vhbVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return vhbVar;
    }

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ void m19331r0(String str) {
        str.getClass();
        this.zzb |= 128;
        this.zzo = str;
    }

    /* JADX INFO: renamed from: r1 */
    public final /* synthetic */ void m19332r1(String str) {
        str.getClass();
        this.zze |= 1073741824;
        this.zzau = str;
    }

    /* JADX INFO: renamed from: r2 */
    public final String m19333r2() {
        return this.zzs;
    }

    /* JADX INFO: renamed from: s */
    public final String m19334s() {
        return this.zzt;
    }

    /* JADX INFO: renamed from: s0 */
    public final boolean m19335s0() {
        return (this.zze & 2) != 0;
    }

    /* JADX INFO: renamed from: s1 */
    public final /* synthetic */ void m19336s1() {
        String str = Build.MODEL;
        str.getClass();
        this.zzb |= 256;
        this.zzp = str;
    }

    /* JADX INFO: renamed from: t */
    public final String m19337t() {
        return this.zzu;
    }

    /* JADX INFO: renamed from: t0 */
    public final int m19338t0() {
        return this.zzP;
    }

    /* JADX INFO: renamed from: t1 */
    public final /* synthetic */ void m19339t1() {
        this.zzb &= -257;
        this.zzp = zzaw.zzp;
    }

    /* JADX INFO: renamed from: u */
    public final boolean m19340u() {
        return (this.zzb & 16384) != 0;
    }

    /* JADX INFO: renamed from: u0 */
    public final boolean m19341u0() {
        return (this.zze & 16) != 0;
    }

    /* JADX INFO: renamed from: u1 */
    public final /* synthetic */ void m19342u1(String str) {
        str.getClass();
        this.zzb |= 512;
        this.zzq = str;
    }

    /* JADX INFO: renamed from: v */
    public final long m19343v() {
        return this.zzv;
    }

    /* JADX INFO: renamed from: v0 */
    public final long m19344v0() {
        return this.zzT;
    }

    /* JADX INFO: renamed from: v1 */
    public final /* synthetic */ void m19345v1(int i) {
        this.zzb |= 1024;
        this.zzr = i;
    }

    /* JADX INFO: renamed from: w */
    public final boolean m19346w() {
        return (this.zzb & 32768) != 0;
    }

    /* JADX INFO: renamed from: w0 */
    public final boolean m19347w0() {
        return (this.zze & 128) != 0;
    }

    /* JADX INFO: renamed from: w1 */
    public final /* synthetic */ void m19348w1(String str) {
        str.getClass();
        this.zzb |= 2048;
        this.zzs = str;
    }

    /* JADX INFO: renamed from: x */
    public final long m19349x() {
        return this.zzw;
    }

    /* JADX INFO: renamed from: x0 */
    public final String m19350x0() {
        return this.zzW;
    }

    /* JADX INFO: renamed from: x1 */
    public final /* synthetic */ void m19351x1(String str) {
        str.getClass();
        this.zzb |= 4096;
        this.zzt = str;
    }

    /* JADX INFO: renamed from: y */
    public final String m19352y() {
        return this.zzx;
    }

    /* JADX INFO: renamed from: y0 */
    public final boolean m19353y0() {
        return (this.zze & 8192) != 0;
    }

    /* JADX INFO: renamed from: y1 */
    public final /* synthetic */ void m19354y1(String str) {
        str.getClass();
        this.zzb |= 8192;
        this.zzu = str;
    }

    /* JADX INFO: renamed from: z */
    public final boolean m19355z() {
        return (this.zzb & 131072) != 0;
    }

    /* JADX INFO: renamed from: z0 */
    public final String m19356z0() {
        return this.zzac;
    }

    /* JADX INFO: renamed from: z1 */
    public final /* synthetic */ void m19357z1(long j) {
        this.zzb |= 16384;
        this.zzv = j;
    }
}
