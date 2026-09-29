package com.google.android.gms.internal.play_billing;

import java.io.IOException;
import p000.C0787av;
import p000.fg2;
import p000.fgc;
import p000.imc;
import p000.lgc;
import p000.smc;
import p000.vfc;
import p000.w1c;
import p000.y5c;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.p */
/* JADX INFO: loaded from: classes.dex */
public final class C1005p extends AbstractC0998i {
    private static final C1005p zzb;
    private int zzd;
    private int zze = 0;
    private Object zzf;
    private int zzg;
    private C1007r zzh;
    private int zzi;

    static {
        C1005p c1005p = new C1005p();
        zzb = c1005p;
        AbstractC0998i.m5533f(C1005p.class, c1005p);
    }

    /* JADX INFO: renamed from: p */
    public static /* synthetic */ void m5607p(C1005p c1005p, C1014y c1014y) {
        c1005p.zzf = c1014y;
        c1005p.zze = 7;
    }

    /* JADX INFO: renamed from: q */
    public static /* synthetic */ void m5608q(C1005p c1005p, C0992d0 c0992d0) {
        c1005p.zzf = c0992d0;
        c1005p.zze = 6;
    }

    /* JADX INFO: renamed from: r */
    public static /* synthetic */ void m5609r(C1005p c1005p, int i) {
        c1005p.zzg = i - 1;
        c1005p.zzd |= 1;
    }

    /* JADX INFO: renamed from: s */
    public static imc m5610s() {
        return (imc) zzb.m5540k();
    }

    /* JADX INFO: renamed from: t */
    public static C1005p m5611t(byte[] bArr) throws zzgc {
        AbstractC0998i abstractC0998i = zzb;
        int length = bArr.length;
        y5c y5cVar = y5c.f69331a;
        int i = w1c.f66234a;
        y5c y5cVar2 = y5c.f69331a;
        if (length != 0) {
            AbstractC0998i abstractC0998iM5542n = abstractC0998i.m5542n();
            try {
                lgc lgcVarM23265a = vfc.f65328c.m23265a(abstractC0998iM5542n.getClass());
                lgcVarM23265a.mo5561e(abstractC0998iM5542n, bArr, 0, length, new C0787av(y5cVar2));
                lgcVarM23265a.mo5559c(abstractC0998iM5542n);
                abstractC0998i = abstractC0998iM5542n;
            } catch (zzgc e) {
                throw e;
            } catch (zzia e2) {
                fg2.m11822k(e2.getMessage());
                return null;
            } catch (IOException e3) {
                if (e3.getCause() instanceof zzgc) {
                    throw ((zzgc) e3.getCause());
                }
                throw new zzgc(e3.getMessage(), e3);
            } catch (IndexOutOfBoundsException unused) {
                fg2.m11822k("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                return null;
            }
        }
        if (abstractC0998i == null || AbstractC0998i.m5534i(abstractC0998i, true)) {
            return (C1005p) abstractC0998i;
        }
        fg2.m11822k(new zzia().getMessage());
        return null;
    }

    /* JADX INFO: renamed from: v */
    public static /* synthetic */ void m5612v(C1005p c1005p, zzjk zzjkVar) {
        c1005p.zzi = zzjkVar.zza();
        c1005p.zzd |= 4;
    }

    /* JADX INFO: renamed from: w */
    public static /* synthetic */ void m5613w(C1005p c1005p, C1007r c1007r) {
        c1005p.zzh = c1007r;
        c1005p.zzd |= 2;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC0998i
    /* JADX INFO: renamed from: j */
    public final Object mo5511j(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new fgc(zzb, "\u0004\u0006\u0001\u0001\u0001\u0007\u0006\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001\u0004<\u0000\u0005᠌\u0002\u0006<\u0000\u0007<\u0000", new Object[]{"zzf", "zze", "zzd", "zzg", smc.f61031b, "zzh", C1012w.class, "zzi", smc.f61033d, C0992d0.class, C1014y.class});
        }
        if (i2 == 3) {
            return new C1005p();
        }
        if (i2 == 4) {
            return new imc(zzb);
        }
        if (i2 == 5) {
            return zzb;
        }
        throw null;
    }

    /* JADX INFO: renamed from: u */
    public final C1014y m5614u() {
        return this.zze == 7 ? (C1014y) this.zzf : C1014y.m5651q();
    }
}
