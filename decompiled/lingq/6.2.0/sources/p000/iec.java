package p000;

import com.google.android.gms.internal.measurement.zzaew;

/* JADX INFO: loaded from: classes.dex */
public final class iec extends whb {
    private static final iec zzp;
    private static volatile ajb zzq;
    private int zzb;
    private String zze;
    private String zzf;
    private String zzg;
    private long zzh;
    private String zzi;
    private String zzj;
    private String zzk;
    private long zzl;
    private zzaew zzm;
    private zzaew zzn;
    private String zzo;

    static {
        iec iecVar = new iec();
        zzp = iecVar;
        whb.m23957n(iec.class, iecVar);
    }

    public iec() {
        zzaew zzaewVar = zzaew.f11872b;
        this.zzm = zzaewVar;
        this.zzn = zzaewVar;
        this.zze = "";
        this.zzf = "";
        this.zzg = "";
        this.zzi = "";
        this.zzj = "";
        this.zzk = "";
        this.zzo = "";
    }

    /* JADX INFO: renamed from: X */
    public static jdc m13816X() {
        return (jdc) zzp.m23965i();
    }

    /* JADX INFO: renamed from: Y */
    public static iec m13817Y() {
        return zzp;
    }

    /* JADX INFO: renamed from: A */
    public final /* synthetic */ void m13818A(long j) {
        this.zzb |= 128;
        this.zzl = j;
    }

    /* JADX INFO: renamed from: B */
    public final zzaew m13819B() {
        zzaew zzaewVar = this.zzm;
        if (!zzaewVar.f11873a) {
            this.zzm = zzaewVar.m5436a();
        }
        return this.zzm;
    }

    /* JADX INFO: renamed from: C */
    public final zzaew m13820C() {
        zzaew zzaewVar = this.zzn;
        if (!zzaewVar.f11873a) {
            this.zzn = zzaewVar.m5436a();
        }
        return this.zzn;
    }

    /* JADX INFO: renamed from: D */
    public final /* synthetic */ void m13821D(String str) {
        this.zzb |= 256;
        this.zzo = str;
    }

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ void m13822E() {
        this.zzb &= -257;
        this.zzo = zzp.zzo;
    }

    /* JADX INFO: renamed from: F */
    public final boolean m13823F() {
        return (this.zzb & 1) != 0;
    }

    /* JADX INFO: renamed from: G */
    public final String m13824G() {
        return this.zze;
    }

    /* JADX INFO: renamed from: H */
    public final boolean m13825H() {
        return (this.zzb & 2) != 0;
    }

    /* JADX INFO: renamed from: I */
    public final String m13826I() {
        return this.zzf;
    }

    /* JADX INFO: renamed from: J */
    public final boolean m13827J() {
        return (this.zzb & 4) != 0;
    }

    /* JADX INFO: renamed from: K */
    public final String m13828K() {
        return this.zzg;
    }

    /* JADX INFO: renamed from: L */
    public final boolean m13829L() {
        return (this.zzb & 8) != 0;
    }

    /* JADX INFO: renamed from: M */
    public final long m13830M() {
        return this.zzh;
    }

    /* JADX INFO: renamed from: N */
    public final boolean m13831N() {
        return (this.zzb & 16) != 0;
    }

    /* JADX INFO: renamed from: O */
    public final String m13832O() {
        return this.zzi;
    }

    /* JADX INFO: renamed from: P */
    public final boolean m13833P() {
        return (this.zzb & 32) != 0;
    }

    /* JADX INFO: renamed from: Q */
    public final String m13834Q() {
        return this.zzj;
    }

    /* JADX INFO: renamed from: R */
    public final boolean m13835R() {
        return (this.zzb & 64) != 0;
    }

    /* JADX INFO: renamed from: S */
    public final String m13836S() {
        return this.zzk;
    }

    /* JADX INFO: renamed from: T */
    public final boolean m13837T() {
        return (this.zzb & 128) != 0;
    }

    /* JADX INFO: renamed from: U */
    public final long m13838U() {
        return this.zzl;
    }

    /* JADX INFO: renamed from: V */
    public final boolean m13839V() {
        return (this.zzb & 256) != 0;
    }

    /* JADX INFO: renamed from: W */
    public final String m13840W() {
        return this.zzo;
    }

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ void m13841Z(String str) {
        this.zzb |= 1;
        this.zze = str;
    }

    /* JADX INFO: renamed from: a0 */
    public final /* synthetic */ void m13842a0() {
        this.zzb &= -2;
        this.zze = zzp.zze;
    }

    /* JADX INFO: renamed from: b0 */
    public final /* synthetic */ void m13843b0(String str) {
        this.zzb |= 2;
        this.zzf = str;
    }

    /* JADX INFO: renamed from: c0 */
    public final /* synthetic */ void m13844c0() {
        this.zzb &= -3;
        this.zzf = zzp.zzf;
    }

    /* JADX INFO: renamed from: d0 */
    public final /* synthetic */ void m13845d0(String str) {
        this.zzb |= 4;
        this.zzg = str;
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
            return new ejb(zzp, "\u0004\u000b\u0000\u0001\u0001\u000b\u000b\u0002\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဂ\u0003\u0005ဈ\u0004\u0006ဈ\u0005\u0007ဈ\u0006\bဂ\u0007\t2\n2\u000bဈ\b", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", tdc.f62173a, "zzn", zdc.f71426a, "zzo"});
        }
        if (i2 == 3) {
            return new iec();
        }
        if (i2 == 4) {
            return new jdc(zzp);
        }
        if (i2 == 5) {
            return zzp;
        }
        if (i2 != 6) {
            throw null;
        }
        ajb ajbVar = zzq;
        if (ajbVar != null) {
            return ajbVar;
        }
        synchronized (iec.class) {
            try {
                vhbVar = zzq;
                if (vhbVar == null) {
                    vhbVar = new vhb(zzp);
                    zzq = vhbVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return vhbVar;
    }

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ void m13846s() {
        this.zzb &= -5;
        this.zzg = zzp.zzg;
    }

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ void m13847t(long j) {
        this.zzb |= 8;
        this.zzh = j;
    }

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ void m13848u(String str) {
        this.zzb |= 16;
        this.zzi = str;
    }

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ void m13849v() {
        this.zzb &= -17;
        this.zzi = zzp.zzi;
    }

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ void m13850w(String str) {
        this.zzb |= 32;
        this.zzj = str;
    }

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ void m13851x() {
        this.zzb &= -33;
        this.zzj = zzp.zzj;
    }

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ void m13852y(String str) {
        this.zzb |= 64;
        this.zzk = str;
    }

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ void m13853z() {
        this.zzb &= -65;
        this.zzk = zzp.zzk;
    }
}
