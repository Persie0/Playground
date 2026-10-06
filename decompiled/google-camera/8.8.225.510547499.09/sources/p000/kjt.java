package p000;

import android.hardware.camera2.params.OutputConfiguration;
import android.view.Surface;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class kjt extends kjs {

    /* JADX INFO: renamed from: a */
    private final kpr f36308a;

    public kjt(kky kkyVar, Surface surface, OutputConfiguration outputConfiguration) {
        super(kkyVar, kxk.m14965K(surface));
        this.f36308a = outputConfiguration == null ? null : new klz(outputConfiguration);
    }

    /* JADX INFO: renamed from: b */
    public static kjt m14396b(kky kkyVar, Surface surface) {
        return new kjt(kkyVar, surface, kju.m14397a(kkyVar, surface));
    }

    @Override // p000.kjs
    /* JADX INFO: renamed from: a */
    public final kpr mo14393a() {
        return this.f36308a;
    }

    public final String toString() {
        return "SurfaceConfig<" + String.valueOf(this.f36306b) + ">";
    }
}
