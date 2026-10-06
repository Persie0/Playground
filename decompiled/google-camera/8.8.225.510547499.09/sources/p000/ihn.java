package p000;

import android.view.SurfaceHolder;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class ihn implements SurfaceHolder.Callback2 {

    /* JADX INFO: renamed from: a */
    private final dlc f30980a;

    public ihn(dlc dlcVar) {
        this.f30980a = dlcVar;
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        dlc dlcVar = this.f30980a;
        surfaceHolder.getSurface();
        dlcVar.mo6333f();
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
        dlc dlcVar = this.f30980a;
        surfaceHolder.getSurface();
        dlcVar.mo6333f();
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        this.f30980a.mo6330c();
    }

    @Override // android.view.SurfaceHolder.Callback2
    public final void surfaceRedrawNeeded(SurfaceHolder surfaceHolder) {
    }
}
