package p000;

import android.graphics.Rect;
import android.view.Surface;
import android.view.SurfaceHolder;
import androidx.wear.ambient.AmbientMode;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class ihl implements SurfaceHolder.Callback2 {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ ihm f30968a;

    public ihl(ihm ihmVar) {
        this.f30968a = ihmVar;
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        lku.m15613H(!this.f30968a.f30975f);
        this.f30968a.f30973d.mo13961e("surfaceChanged");
        kbc kbcVar = new kbc(i2, i3);
        Surface surface = surfaceHolder.getSurface();
        Rect surfaceFrame = surfaceHolder.getSurfaceFrame();
        kan kanVarM13871g = kan.m13871g(kbcVar);
        this.f30968a.f30970a.mo13940b("SurfaceEvent: surfaceChanged (newSize: " + kbcVar.toString() + ", newRatio: " + kanVarM13871g.toString() + ", surfaceFrame: " + surfaceFrame.width() + "x" + surfaceFrame.height() + ")");
        if (!this.f30968a.f30976g.isDone()) {
            ihm ihmVar = this.f30968a;
            if (surface.isValid()) {
                kan kanVarM13871g2 = kan.m13871g(kbcVar);
                kan kanVarM13880f = ihmVar.f30974e.f31020b.m13880f();
                if (mpw.m16768g(kanVarM13871g2, kanVarM13880f)) {
                    ihm ihmVar2 = this.f30968a;
                    ihmVar2.f30970a.mo13944f("Surface request is set. size=".concat(String.valueOf(String.valueOf(ihmVar2.f30974e.f31019a))));
                    this.f30968a.f30977h.m10437h(hlj.VIEWFINDER_SURFACE_READY);
                    this.f30968a.f30973d.mo13961e("surfaceRequest.set");
                    this.f30968a.f30976g.mo14894e(new ihw(surface, i, new kbc(i2, i3).m13906c()));
                    this.f30968a.f30973d.mo13962f();
                } else {
                    ihmVar.f30970a.mo13946h("Aspect ratios do not match! surface: " + kanVarM13871g2.m13880f().toString() + " preview: " + kanVarM13880f.m13880f().toString());
                }
            }
        }
        this.f30968a.f30973d.mo13962f();
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
        lku.m15613H(!this.f30968a.f30975f);
        this.f30968a.f30977h.m10437h(hlj.VIEWFINDER_SURFACE_CREATED);
        this.f30968a.f30970a.mo13940b("SurfaceEvent: surfaceCreated");
        if (this.f30968a.f30976g.isDone()) {
            ihm ihmVar = this.f30968a;
            ihmVar.f30970a.mo13947i("surfaceChanged was already called or cancelled? Value: ".concat(String.valueOf(String.valueOf(jvh.m13560h(ihmVar.f30976g)))));
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        lku.m15613H(!this.f30968a.f30975f);
        this.f30968a.f30970a.mo13940b("SurfaceEvent: surfaceDestroyed");
        ihm ihmVar = this.f30968a;
        ihmVar.m11359a("Surface has been destroyed.");
        ihmVar.f30976g = nqf.m17621g();
        this.f30968a.f30977h.close();
        if (this.f30968a.f30972c.mo16813g()) {
            esl eslVar = (esl) ((AmbientMode.AmbientController) this.f30968a.f30972c.mo16809c()).f1697a;
            eslVar.f15404h.m11368g();
            if (!eslVar.f15339U.m3526f() || eslVar.f15339U.m3527g()) {
                return;
            }
            eslVar.f15324F = true;
            eslVar.f15412p.m3782q();
        }
    }

    @Override // android.view.SurfaceHolder.Callback2
    public final void surfaceRedrawNeeded(SurfaceHolder surfaceHolder) {
        lku.m15613H(!this.f30968a.f30975f);
        this.f30968a.f30970a.mo13940b("SurfaceEvent: surfaceRedrawNeeded");
    }
}
