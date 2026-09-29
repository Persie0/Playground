package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class g5d extends whb {
    private static final g5d zzg;
    private static volatile ajb zzh;
    private int zzb;
    private n4d zze;
    private s4d zzf;

    static {
        g5d g5dVar = new g5d();
        zzg = g5dVar;
        whb.m23957n(g5d.class, g5dVar);
    }

    /* JADX INFO: renamed from: u */
    public static g5d m12375u(byte[] bArr, phb phbVar) {
        return (g5d) whb.m23955d(zzg, bArr, phbVar);
    }

    /* JADX INFO: renamed from: v */
    public static d5d m12376v() {
        return (d5d) zzg.m23965i();
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
            return new ejb(zzg, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"zzb", "zze", "zzf"});
        }
        if (i2 == 3) {
            return new g5d();
        }
        if (i2 == 4) {
            return new d5d(zzg);
        }
        if (i2 == 5) {
            return zzg;
        }
        if (i2 != 6) {
            throw null;
        }
        ajb ajbVar = zzh;
        if (ajbVar != null) {
            return ajbVar;
        }
        synchronized (g5d.class) {
            try {
                vhbVar = zzh;
                if (vhbVar == null) {
                    vhbVar = new vhb(zzg);
                    zzh = vhbVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return vhbVar;
    }

    /* JADX INFO: renamed from: s */
    public final n4d m12377s() {
        n4d n4dVar = this.zze;
        return n4dVar == null ? n4d.m17212G() : n4dVar;
    }

    /* JADX INFO: renamed from: t */
    public final s4d m12378t() {
        s4d s4dVar = this.zzf;
        return s4dVar == null ? s4d.m21079s() : s4dVar;
    }

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ void m12379w(n4d n4dVar) {
        this.zze = n4dVar;
        this.zzb |= 1;
    }
}
