package p000;

import android.graphics.Rect;
import android.hardware.HardwareBuffer;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class fqa implements kpw {

    /* JADX INFO: renamed from: a */
    public final key f23177a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ fqb f23178b;

    /* JADX INFO: renamed from: c */
    private final fua f23179c;

    /* JADX INFO: renamed from: d */
    private final kbc f23180d;

    /* JADX INFO: renamed from: e */
    private kpw f23181e = null;

    /* JADX INFO: renamed from: f */
    private final npk f23182f;

    public fqa(fqb fqbVar, key keyVar, fua fuaVar, npk npkVar, byte[] bArr, byte[] bArr2) {
        this.f23178b = fqbVar;
        this.f23177a = keyVar;
        this.f23179c = fuaVar;
        this.f23182f = npkVar;
        kpw kpwVarM9496e = fqbVar.f23184b.m9784a(keyVar).m9496e();
        try {
            kpwVarM9496e.getClass();
            this.f23180d = kbc.m13903h(kpwVarM9496e.mo7247c(), kpwVarM9496e.mo7246b());
            kpwVarM9496e.close();
        } catch (Throwable th) {
            if (kpwVarM9496e != null) {
                try {
                    kpwVarM9496e.close();
                } catch (Throwable th2) {
                    try {
                        Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                    } catch (Exception e) {
                    }
                }
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: k */
    private final synchronized kpw m8693k() {
        nqf nqfVarM17621g = nqf.m17621g();
        if (this.f23181e == null) {
            this.f23178b.f23183a.mo8696c(this.f23177a, this.f23179c, this.f23182f, new fpz(this, nqfVarM17621g));
            this.f23181e = (kpw) kxk.m14974T(nqfVarM17621g);
        }
        return this.f23181e;
    }

    @Override // p000.kpw
    /* JADX INFO: renamed from: a */
    public final int mo7245a() {
        return 35;
    }

    @Override // p000.kpw
    /* JADX INFO: renamed from: b */
    public final int mo7246b() {
        return this.f23180d.f35518b;
    }

    @Override // p000.kpw
    /* JADX INFO: renamed from: c */
    public final int mo7247c() {
        return this.f23180d.f35517a;
    }

    @Override // p000.kba, java.lang.AutoCloseable
    public final synchronized void close() {
        this.f23177a.close();
        kpw kpwVar = this.f23181e;
        if (kpwVar != null) {
            kpwVar.close();
        }
    }

    @Override // p000.kpw
    /* JADX INFO: renamed from: d */
    public final long mo7248d() {
        kfd kfdVarMo7041b = this.f23177a.mo7041b();
        kfdVarMo7041b.getClass();
        return kfdVarMo7041b.f35811b;
    }

    @Override // p000.kpw
    /* JADX INFO: renamed from: e */
    public final Rect mo7249e() {
        kbc kbcVar = this.f23180d;
        return new Rect(0, 0, kbcVar.f35517a, kbcVar.f35518b);
    }

    @Override // p000.kpw
    /* JADX INFO: renamed from: f */
    public final HardwareBuffer mo7250f() {
        kpw kpwVarM8693k = m8693k();
        if (kpwVarM8693k != null) {
            return kpwVarM8693k.mo7250f();
        }
        return null;
    }

    @Override // p000.kpw
    /* JADX INFO: renamed from: g */
    public final List mo7251g() {
        if (m8693k() != null) {
            return m8693k().mo7251g();
        }
        int i = mws.f41739d;
        return mzr.f41857a;
    }

    @Override // p000.kpw
    /* JADX INFO: renamed from: h */
    public final void mo7252h(Rect rect) {
        throw new UnsupportedOperationException("Cannot set crop rect in this implementation!");
    }

    @Override // p000.kpw
    /* JADX INFO: renamed from: i */
    public final /* synthetic */ boolean mo7253i() {
        return false;
    }

    @Override // p000.kpd
    /* JADX INFO: renamed from: j */
    public final khb mo7254j() {
        return khb.m14234x();
    }
}
