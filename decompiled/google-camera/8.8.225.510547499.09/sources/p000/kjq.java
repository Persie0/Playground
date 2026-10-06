package p000;

import android.hardware.camera2.params.OutputConfiguration;
import android.view.Surface;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class kjq extends kjr {

    /* JADX INFO: renamed from: d */
    private final nqf f36302d;

    /* JADX INFO: renamed from: e */
    private kpr f36303e;

    /* JADX INFO: renamed from: f */
    private boolean f36304f;

    /* JADX WARN: Illegal instructions before constructor call */
    public kjq(kkr kkrVar) {
        nqf nqfVarM17621g = nqf.m17621g();
        super(kkrVar, nqfVarM17621g);
        this.f36304f = false;
        this.f36302d = nqfVarM17621g;
        this.f36303e = null;
    }

    @Override // p000.kjs
    /* JADX INFO: renamed from: a */
    public final synchronized kpr mo14393a() {
        return this.f36303e;
    }

    @Override // p000.kjr
    /* JADX INFO: renamed from: b */
    public final void mo14394b(Surface surface) {
        synchronized (this) {
            if (this.f36304f) {
                return;
            }
            this.f36304f = true;
            if (this.f36302d.isDone()) {
                return;
            }
            try {
                OutputConfiguration outputConfigurationM14397a = kju.m14397a(this.f36306b, surface);
                if (outputConfigurationM14397a != null) {
                    synchronized (this) {
                        this.f36303e = new klz(outputConfigurationM14397a);
                    }
                }
                this.f36302d.mo14894e(surface);
            } catch (Throwable th) {
                this.f36302d.mo8566a(th);
            }
        }
    }

    public final String toString() {
        return "DelayedConfig<" + String.valueOf(this.f36306b) + ">";
    }
}
