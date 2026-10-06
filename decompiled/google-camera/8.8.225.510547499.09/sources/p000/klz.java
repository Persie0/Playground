package p000;

import android.hardware.camera2.params.OutputConfiguration;
import android.view.Surface;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class klz implements kpr {

    /* JADX INFO: renamed from: a */
    private final Object f36509a = new Object();

    /* JADX INFO: renamed from: b */
    private final OutputConfiguration f36510b;

    public klz(OutputConfiguration outputConfiguration) {
        this.f36510b = outputConfiguration;
    }

    @Override // p000.kpr
    /* JADX INFO: renamed from: a */
    public final List mo14526a() {
        List<Surface> surfaces;
        synchronized (this.f36509a) {
            surfaces = this.f36510b.getSurfaces();
        }
        return surfaces;
    }

    @Override // p000.kpd
    /* JADX INFO: renamed from: j */
    public final khb mo7254j() {
        khb khbVar;
        synchronized (this.f36509a) {
            khbVar = new khb(this.f36510b);
        }
        return khbVar;
    }

    public final String toString() {
        String string;
        synchronized (this.f36509a) {
            mrl mrlVarM16766e = mpw.m16766e("AndroidOutputConfiguration");
            mrlVarM16766e.m16823b("outputConfiguration", this.f36510b);
            string = mrlVarM16766e.toString();
        }
        return string;
    }
}
