package p000;

import android.graphics.Bitmap;
import com.google.googlex.gcam.ShotMetadata;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class fku implements ecy, ecz, edi {

    /* JADX INFO: renamed from: b */
    public final kba f22411b;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ drj f22415f;

    /* JADX INFO: renamed from: c */
    public boolean f22412c = false;

    /* JADX INFO: renamed from: g */
    private final nqf f22416g = nqf.m17621g();

    /* JADX INFO: renamed from: d */
    final nqf f22413d = nqf.m17621g();

    /* JADX INFO: renamed from: e */
    final nqf f22414e = nqf.m17621g();

    /* JADX INFO: renamed from: a */
    public final nqf f22410a = nqf.m17621g();

    public fku(drj drjVar, kba kbaVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.f22415f = drjVar;
        this.f22411b = kbaVar;
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [fgy, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v7, types: [java.lang.Object, java.util.concurrent.Executor] */
    @Override // p000.ecy
    /* JADX INFO: renamed from: a */
    public final void mo7052a(eem eemVar, int i, long j, kpp kppVar) {
        synchronized (this.f22415f) {
            this.f22412c = true;
        }
        kpw kpwVarMo8328c = this.f22415f.f12398d.mo8328c(j);
        if (kpwVarMo8328c == null) {
            this.f22410a.mo14894e(mqu.f41450a);
            return;
        }
        Object obj = this.f22415f.f12396b;
        new fkr(((bkn) obj).f3651a, this.f22413d, this.f22414e, this.f22416g);
        this.f22413d.mo14894e(kpwVarMo8328c);
        this.f22410a.mo16665f(nod.m17553i(this.f22416g, fod.f22897b, not.INSTANCE));
    }

    @Override // p000.edi
    /* JADX INFO: renamed from: b */
    public final void mo7057b(eem eemVar, hkc hkcVar, ebp ebpVar) {
    }

    @Override // p000.edi
    /* JADX INFO: renamed from: c */
    public final void mo7058c(eem eemVar, edc edcVar) {
        this.f22410a.mo14894e(mqu.f41450a);
    }

    @Override // p000.ecz
    /* JADX INFO: renamed from: o */
    public final void mo7053o(eem eemVar, Bitmap bitmap, ShotMetadata shotMetadata) {
        this.f22414e.mo14894e(bitmap.copy(Bitmap.Config.ARGB_8888, false));
    }

    @Override // p000.edi
    /* JADX INFO: renamed from: p */
    public final void mo7059p(eem eemVar) {
        this.f22410a.mo14894e(mqu.f41450a);
    }
}
