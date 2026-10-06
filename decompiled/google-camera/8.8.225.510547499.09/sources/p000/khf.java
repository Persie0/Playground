package p000;

import android.hardware.camera2.params.MeteringRectangle;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class khf implements kba {

    /* JADX INFO: renamed from: a */
    public kis f36013a;

    /* JADX INFO: renamed from: b */
    public final kie f36014b;

    /* JADX INFO: renamed from: c */
    public final ktz f36015c;

    public khf(ktz ktzVar, kmd kmdVar, kie kieVar, kbo kboVar, byte[] bArr, byte[] bArr2) {
        this.f36014b = kieVar;
        List listMo14563p = kmdVar.mo14563p();
        lku.m15669w(!listMo14563p.isEmpty());
        int iIntValue = ((Integer) listMo14563p.get(0)).intValue();
        if (listMo14563p.contains(4)) {
            iIntValue = 4;
        } else if (listMo14563p.contains(1)) {
            iIntValue = 1;
        }
        List listMo14562o = kmdVar.mo14562o();
        lku.m15669w(!listMo14562o.isEmpty());
        int iIntValue2 = true == listMo14562o.contains(1) ? 1 : ((Integer) listMo14562o.get(0)).intValue();
        List listMo14564q = kmdVar.mo14564q();
        lku.m15669w(!listMo14564q.isEmpty());
        int iIntValue3 = true != listMo14564q.contains(1) ? ((Integer) listMo14562o.get(0)).intValue() : 1;
        Integer numValueOf = Integer.valueOf(iIntValue);
        Integer numValueOf2 = Integer.valueOf(iIntValue2);
        Integer numValueOf3 = Integer.valueOf(iIntValue3);
        MeteringRectangle[] meteringRectangleArr = kit.f36217a;
        MeteringRectangle[] meteringRectangleArr2 = kit.f36217a;
        this.f36013a = new kir(1, numValueOf, numValueOf2, numValueOf3, 0, meteringRectangleArr, meteringRectangleArr2, meteringRectangleArr2, false, false, false).m14365d();
        kboVar.mo6314a("fscrtl3A");
        this.f36015c = ktzVar;
    }

    /* JADX INFO: renamed from: a */
    public final synchronized kir m14259a() {
        return kir.m14364c(this.f36013a);
    }

    /* JADX INFO: renamed from: b */
    public final void m14260b(kge kgeVar) {
        boolean zM14190d = kgeVar.m14190d();
        boolean zM14188b = kgeVar.m14188b();
        boolean zM14189c = kgeVar.m14189c();
        boolean z = false;
        try {
            kic kicVarM14322a = this.f36014b.m14322a();
            try {
                kicVarM14322a.m14309c(kgeVar, true);
                kicVarM14322a.close();
                synchronized (this) {
                    kir kirVarM14363b = kir.m14363b(this.f36013a);
                    boolean z2 = zM14190d || this.f36013a.f36206a.booleanValue();
                    kirVarM14363b.f36200f = Boolean.valueOf(z2);
                    boolean z3 = zM14188b || this.f36013a.f36207b.booleanValue();
                    kirVarM14363b.f36201g = Boolean.valueOf(z3);
                    if (zM14189c || this.f36013a.f36208c.booleanValue()) {
                        z = true;
                    }
                    kirVarM14363b.f36202h = Boolean.valueOf(z);
                    m14261c(kirVarM14363b.m14365d());
                }
            } catch (Throwable th) {
                try {
                    kicVarM14322a.close();
                } catch (Throwable th2) {
                    Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                }
                throw th;
            }
        } catch (Throwable th3) {
            synchronized (this) {
                kir kirVarM14363b2 = kir.m14363b(this.f36013a);
                boolean z4 = zM14190d || this.f36013a.f36206a.booleanValue();
                kirVarM14363b2.f36200f = Boolean.valueOf(z4);
                boolean z5 = zM14188b || this.f36013a.f36207b.booleanValue();
                kirVarM14363b2.f36201g = Boolean.valueOf(z5);
                if (zM14189c || this.f36013a.f36208c.booleanValue()) {
                    z = true;
                }
                kirVarM14363b2.f36202h = Boolean.valueOf(z);
                m14261c(kirVarM14363b2.m14365d());
                throw th3;
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final synchronized void m14261c(kis kisVar) {
        this.f36013a = kisVar;
    }

    @Override // p000.kba, java.lang.AutoCloseable
    public final void close() {
    }

    /* JADX INFO: renamed from: d */
    public final synchronized boolean m14262d(kis kisVar, kex kexVar) {
        if (kisVar.f36207b.booleanValue()) {
            return kisVar.mo14091a().equals(kexVar.mo14091a()) && Arrays.equals(kisVar.f36210e, ((kis) kexVar).f36210e);
        }
        return false;
    }

    /* JADX INFO: renamed from: e */
    public final synchronized boolean m14263e(kis kisVar, kex kexVar) {
        if (kisVar.f36206a.booleanValue()) {
            return kisVar.mo14092b().equals(kexVar.mo14092b()) && Arrays.equals(kisVar.f36209d, ((kis) kexVar).f36209d);
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public final synchronized boolean m14264f(kis kisVar, kex kexVar) {
        if (kisVar.f36208c.booleanValue()) {
            return kisVar.mo14093c().equals(kexVar.mo14093c()) && Arrays.equals(kisVar.f36211f, ((kis) kexVar).f36211f);
        }
        return false;
    }
}
