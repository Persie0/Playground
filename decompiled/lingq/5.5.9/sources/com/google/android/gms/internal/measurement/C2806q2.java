package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.q2 */
/* JADX INFO: loaded from: classes.dex */
public final class C2806q2 extends AbstractC2771n6 implements InterfaceC2744l7 {
    private static final C2806q2 zza;
    private int zzd;
    private long zze;
    private String zzf = "";
    private int zzg;
    private InterfaceC2836s6 zzh;
    private InterfaceC2836s6 zzi;
    private InterfaceC2836s6 zzj;
    private String zzk;
    private boolean zzl;
    private InterfaceC2836s6 zzm;
    private InterfaceC2836s6 zzn;
    private String zzo;
    private String zzp;
    private String zzq;

    static {
        C2806q2 c2806q2 = new C2806q2();
        zza = c2806q2;
        AbstractC2771n6.m8083p(C2806q2.class, c2806q2);
    }

    public C2806q2() {
        C2850t7 c2850t7 = C2850t7.f14441d;
        this.zzh = c2850t7;
        this.zzi = c2850t7;
        this.zzj = c2850t7;
        this.zzk = "";
        this.zzm = c2850t7;
        this.zzn = c2850t7;
        this.zzo = "";
        this.zzp = "";
        this.zzq = "";
    }

    /* JADX INFO: renamed from: I */
    public static /* synthetic */ void m8159I(C2806q2 c2806q2, int i10, C2780o2 c2780o2) {
        InterfaceC2836s6 interfaceC2836s6 = c2806q2.zzi;
        if (!interfaceC2836s6.mo8078d()) {
            c2806q2.zzi = AbstractC2771n6.m8081m(interfaceC2836s6);
        }
        c2806q2.zzi.set(i10, c2780o2);
    }

    /* JADX INFO: renamed from: J */
    public static void m8160J(C2806q2 c2806q2) {
        c2806q2.zzj = C2850t7.f14441d;
    }

    /* JADX INFO: renamed from: x */
    public static C2793p2 m8161x() {
        return (C2793p2) zza.m8085i();
    }

    /* JADX INFO: renamed from: z */
    public static C2806q2 m8163z() {
        return zza;
    }

    /* JADX INFO: renamed from: A */
    public final String m8164A() {
        return this.zzf;
    }

    /* JADX INFO: renamed from: B */
    public final String m8165B() {
        return this.zzq;
    }

    /* JADX INFO: renamed from: C */
    public final String m8166C() {
        return this.zzp;
    }

    /* JADX INFO: renamed from: D */
    public final String m8167D() {
        return this.zzo;
    }

    /* JADX INFO: renamed from: E */
    public final InterfaceC2836s6 m8168E() {
        return this.zzj;
    }

    /* JADX INFO: renamed from: F */
    public final InterfaceC2836s6 m8169F() {
        return this.zzn;
    }

    /* JADX INFO: renamed from: G */
    public final InterfaceC2836s6 m8170G() {
        return this.zzm;
    }

    /* JADX INFO: renamed from: H */
    public final List m8171H() {
        return this.zzh;
    }

    /* JADX INFO: renamed from: K */
    public final boolean m8172K() {
        return this.zzl;
    }

    /* JADX INFO: renamed from: L */
    public final boolean m8173L() {
        return (this.zzd & 2) != 0;
    }

    /* JADX INFO: renamed from: M */
    public final boolean m8174M() {
        return (this.zzd & 1) != 0;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2771n6
    /* JADX INFO: renamed from: s */
    public final Object mo7659s(int i10) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        int i12 = 0;
        if (i11 == 2) {
            return new C2863u7(zza, "\u0001\r\u0000\u0001\u0001\r\r\u0000\u0005\u0000\u0001ဂ\u0000\u0002ဈ\u0001\u0003င\u0002\u0004\u001b\u0005\u001b\u0006\u001b\u0007ဈ\u0003\bဇ\u0004\t\u001b\n\u001b\u000bဈ\u0005\fဈ\u0006\rဈ\u0007", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", C2845t2.class, "zzi", C2780o2.class, "zzj", C2896x1.class, "zzk", "zzl", "zzm", C2898x3.class, "zzn", C2753m2.class, "zzo", "zzp", "zzq"});
        }
        if (i11 == 3) {
            return new C2806q2();
        }
        if (i11 == 4) {
            return new C2793p2(i12);
        }
        if (i11 != 5) {
            return null;
        }
        return zza;
    }

    /* JADX INFO: renamed from: t */
    public final int m8175t() {
        return this.zzm.size();
    }

    /* JADX INFO: renamed from: u */
    public final int m8176u() {
        return this.zzi.size();
    }

    /* JADX INFO: renamed from: v */
    public final long m8177v() {
        return this.zze;
    }

    /* JADX INFO: renamed from: w */
    public final C2780o2 m8178w(int i10) {
        return (C2780o2) this.zzi.get(i10);
    }
}
