package p000;

import android.hardware.camera2.params.OutputConfiguration;
import android.view.Surface;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class kjp extends kjr {

    /* JADX INFO: renamed from: d */
    private final nqf f36298d;

    /* JADX INFO: renamed from: e */
    private final OutputConfiguration f36299e;

    /* JADX INFO: renamed from: f */
    private final kpr f36300f;

    /* JADX INFO: renamed from: g */
    private boolean f36301g;

    /* JADX WARN: Illegal instructions before constructor call */
    public kjp(kkr kkrVar, OutputConfiguration outputConfiguration) {
        nqf nqfVarM17621g = nqf.m17621g();
        super(kkrVar, nqfVarM17621g);
        this.f36301g = false;
        this.f36298d = nqfVarM17621g;
        this.f36299e = outputConfiguration;
        this.f36300f = new klz(outputConfiguration);
    }

    @Override // p000.kjs
    /* JADX INFO: renamed from: a */
    public final synchronized kpr mo14393a() {
        return this.f36300f;
    }

    @Override // p000.kjr
    /* JADX INFO: renamed from: b */
    public final void mo14394b(Surface surface) {
        synchronized (this) {
            if (this.f36301g) {
                return;
            }
            this.f36301g = true;
            if (this.f36298d.isDone()) {
                return;
            }
            try {
                synchronized (this) {
                    try {
                        OutputConfiguration outputConfiguration = this.f36299e;
                        int[] iArr = ivz.f32455a;
                        outputConfiguration.addSurface(surface);
                    } catch (Throwable th) {
                    }
                }
                this.f36298d.mo14894e(surface);
            } catch (Throwable th2) {
                this.f36298d.mo8566a(th2);
            }
        }
    }

    public final String toString() {
        return "DeferredConfig<" + String.valueOf(this.f36306b) + ">";
    }
}
