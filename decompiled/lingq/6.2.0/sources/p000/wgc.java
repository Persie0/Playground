package p000;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class wgc extends whb {
    private static final wgc zze;
    private static volatile ajb zzf;
    private mib zzb = djb.f35734e;

    static {
        wgc wgcVar = new wgc();
        zze = wgcVar;
        whb.m23957n(wgc.class, wgcVar);
    }

    /* JADX INFO: renamed from: t */
    public static rfc m23943t() {
        return (rfc) zze.m23965i();
    }

    /* JADX INFO: renamed from: u */
    public static wgc m23944u() {
        return zze;
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
            return new ejb(zze, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzb", mgc.class});
        }
        if (i2 == 3) {
            return new wgc();
        }
        if (i2 == 4) {
            return new rfc();
        }
        if (i2 == 5) {
            return zze;
        }
        if (i2 != 6) {
            throw null;
        }
        ajb ajbVar = zzf;
        if (ajbVar != null) {
            return ajbVar;
        }
        synchronized (wgc.class) {
            try {
                vhbVar = zzf;
                if (vhbVar == null) {
                    vhbVar = new vhb(zze);
                    zzf = vhbVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return vhbVar;
    }

    /* JADX INFO: renamed from: s */
    public final List m23946s() {
        return this.zzb;
    }

    /* JADX INFO: renamed from: v */
    public final void m23947v(ArrayList arrayList) {
        mib mibVar = this.zzb;
        if (!((chb) mibVar).f10103a) {
            this.zzb = g9a.m12432i(mibVar);
        }
        bhb.m3724c(arrayList, this.zzb);
    }
}
