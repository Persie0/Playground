package p000;

import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.view.GestureDetector;
import android.view.SurfaceHolder;
import android.view.View;
import com.google.android.material.snackbar.VMX.rgoX;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ier implements ieq {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ foc f30553a;

    public ier() {
    }

    public ier(foc focVar) {
        this.f30553a = focVar;
    }

    @Override // p000.ieq
    /* JADX INFO: renamed from: a */
    public final GestureDetector.OnGestureListener mo11145a() {
        return null;
    }

    @Override // p000.ieq
    /* JADX INFO: renamed from: b */
    public final View.OnTouchListener mo11146b() {
        return this.f30553a.f22834M;
    }

    @Override // p000.ieq
    /* JADX INFO: renamed from: c */
    public final void mo11147c() {
        this.f30553a.m8618I();
    }

    @Override // p000.ieq
    /* JADX INFO: renamed from: d */
    public final boolean mo11148d() {
        return false;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        ien ienVar;
        foc focVar = this.f30553a;
        if (focVar.f22830I != null) {
            ((nbe) ((nbe) foc.f22821b.m17252c()).mo17276G((char) 2390)).mo17290o("onCameraAvailable queued before onSurfaceTextureAvailable");
            return;
        }
        focVar.f22892w = i;
        focVar.f22893x = i2;
        focVar.m8621y();
        this.f30553a.f22888s.mo3693g().mo3712b();
        ciq ciqVar = (ciq) this.f30553a.f22888s.mo3693g();
        SurfaceTexture surfaceTexture2 = ciqVar.f5854t;
        if (surfaceTexture2 == null || (ienVar = ciqVar.f5852r) == null) {
            ((nbe) ((nbe) ciq.f5815a.m17252c()).mo17276G((char) 190)).mo17290o("Could not set SurfaceTexture default buffer dimensions, not yet setup");
        } else {
            surfaceTexture2.setDefaultBufferSize(ienVar.mo11151b(), ciqVar.f5852r.mo11150a());
        }
        this.f30553a.f22888s.mo3693g().mo3724n();
        foc focVar2 = this.f30553a;
        foc focVar3 = this.f30553a;
        focVar2.f22830I = new eaj(surfaceTexture, focVar3.f22829H, focVar3);
        foc focVar4 = this.f30553a;
        if (focVar4.f22878i != null) {
            focVar4.m8617H();
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        this.f30553a.m8616G();
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        foc focVar = this.f30553a;
        focVar.f22892w = i;
        focVar.f22893x = i2;
        Handler handler = focVar.f22829H;
        if (handler != null) {
            handler.obtainMessage(2, i, i2).sendToTarget();
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        throw new IllegalStateException(rgoX.cttV);
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
        throw new IllegalStateException("Module does NOT support Surface-backed Preview.");
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        throw new IllegalStateException("Module does NOT support Surface-backed Preview.");
    }

    @Override // android.view.SurfaceHolder.Callback2
    public final void surfaceRedrawNeeded(SurfaceHolder surfaceHolder) {
        throw new IllegalStateException("Module does NOT support Surface-backed Preview.");
    }
}
