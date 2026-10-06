package p000;

import android.hardware.camera2.params.OutputConfiguration;
import android.view.Surface;

/* JADX INFO: renamed from: so */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class C0991so implements InterfaceC0980sd {

    /* JADX INFO: renamed from: a */
    private final OutputConfiguration f47602a;

    /* JADX INFO: renamed from: b */
    private final Surface f47603b;

    public C0991so(OutputConfiguration outputConfiguration) {
        this.f47602a = outputConfiguration;
        this.f47603b = outputConfiguration.getSurface();
    }

    /* JADX INFO: renamed from: a */
    public final void m19405a(Surface surface) {
        surface.getClass();
        C0995ss.m19421c(this.f47602a, surface);
    }

    @Override // p000.InterfaceC0980sd
    /* JADX INFO: renamed from: e */
    public final Object mo13866e(oov oovVar) {
        if (ooc.m18737c(oovVar, ooj.m18762a(OutputConfiguration.class))) {
            return this.f47602a;
        }
        return null;
    }

    public final String toString() {
        return this.f47602a.toString();
    }
}
