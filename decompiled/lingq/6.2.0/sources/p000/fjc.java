package p000;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class fjc extends whb {
    private static final fjc zzi;
    private static volatile ajb zzj;
    private int zzb;
    private mib zze = djb.f35734e;
    private String zzf = "";
    private String zzg = "";
    private int zzh;

    static {
        fjc fjcVar = new fjc();
        zzi = fjcVar;
        whb.m23957n(fjc.class, fjcVar);
    }

    /* JADX INFO: renamed from: A */
    public static uic m11901A(fjc fjcVar) {
        uhb uhbVarM23965i = zzi.m23965i();
        uhbVarM23965i.m22742e(fjcVar);
        return (uic) uhbVarM23965i;
    }

    /* JADX INFO: renamed from: z */
    public static uic m11902z() {
        return (uic) zzi.m23965i();
    }

    /* JADX INFO: renamed from: B */
    public final /* synthetic */ void m11903B(int i, pjc pjcVar) {
        m11909H();
        this.zze.set(i, pjcVar);
    }

    /* JADX INFO: renamed from: C */
    public final /* synthetic */ void m11904C(pjc pjcVar) {
        m11909H();
        this.zze.add(pjcVar);
    }

    /* JADX INFO: renamed from: D */
    public final /* synthetic */ void m11905D(ArrayList arrayList) {
        m11909H();
        bhb.m3724c(arrayList, this.zze);
    }

    /* JADX INFO: renamed from: E */
    public final void m11906E() {
        this.zze = djb.f35734e;
    }

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ void m11907F(String str) {
        str.getClass();
        this.zzb |= 1;
        this.zzf = str;
    }

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ void m11908G(String str) {
        str.getClass();
        this.zzb |= 2;
        this.zzg = str;
    }

    /* JADX INFO: renamed from: H */
    public final void m11909H() {
        mib mibVar = this.zze;
        if (((chb) mibVar).f10103a) {
            return;
        }
        this.zze = g9a.m12432i(mibVar);
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
            return new ejb(zzi, "\u0004\u0004\u0000\u0001\u0001\t\u0004\u0000\u0001\u0000\u0001\u001b\u0007ဈ\u0000\bဈ\u0001\t᠌\u0002", new Object[]{"zzb", "zze", pjc.class, "zzf", "zzg", "zzh", u8c.f63605f});
        }
        if (i2 == 3) {
            return new fjc();
        }
        if (i2 == 4) {
            return new uic(zzi);
        }
        if (i2 == 5) {
            return zzi;
        }
        if (i2 != 6) {
            throw null;
        }
        ajb ajbVar = zzj;
        if (ajbVar != null) {
            return ajbVar;
        }
        synchronized (fjc.class) {
            try {
                vhbVar = zzj;
                if (vhbVar == null) {
                    vhbVar = new vhb(zzi);
                    zzj = vhbVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return vhbVar;
    }

    /* JADX INFO: renamed from: s */
    public final List m11910s() {
        return this.zze;
    }

    /* JADX INFO: renamed from: t */
    public final int m11911t() {
        return this.zze.size();
    }

    /* JADX INFO: renamed from: u */
    public final pjc m11912u(int i) {
        return (pjc) this.zze.get(i);
    }

    /* JADX INFO: renamed from: v */
    public final boolean m11913v() {
        return (this.zzb & 1) != 0;
    }

    /* JADX INFO: renamed from: w */
    public final String m11914w() {
        return this.zzf;
    }

    /* JADX INFO: renamed from: x */
    public final boolean m11915x() {
        return (this.zzb & 2) != 0;
    }

    /* JADX INFO: renamed from: y */
    public final String m11916y() {
        return this.zzg;
    }
}
