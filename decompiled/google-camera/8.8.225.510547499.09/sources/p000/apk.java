package p000;

import android.hardware.camera2.CameraManager;
import android.os.CancellationSignal;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class apk extends ood implements oni {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ Object f2009a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ Object f2010b;

    /* JADX INFO: renamed from: c */
    private final /* synthetic */ int f2011c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public apk(CameraManager cameraManager, C0999sw c0999sw, int i) {
        super(1);
        this.f2011c = i;
        this.f2009a = cameraManager;
        this.f2010b = c0999sw;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public apk(CancellationSignal cancellationSignal, ory oryVar, int i) {
        super(1);
        this.f2011c = i;
        this.f2009a = cancellationSignal;
        this.f2010b = oryVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public apk(otb otbVar, Runnable runnable, int i) {
        super(1);
        this.f2011c = i;
        this.f2010b = otbVar;
        this.f2009a = runnable;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object, ory] */
    @Override // p000.oni
    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Object mo1803a(Object obj) {
        switch (this.f2011c) {
            case 0:
                ((CancellationSignal) this.f2009a).cancel();
                this.f2010b.mo18977r(null);
                break;
            case 1:
                ((CameraManager) this.f2009a).unregisterAvailabilityCallback((CameraManager.AvailabilityCallback) this.f2010b);
                break;
            default:
                ((otb) this.f2010b).f46511c.removeCallbacks(this.f2009a);
                break;
        }
        return oki.f46196a;
    }
}
