package p000;

import android.graphics.SurfaceTexture;
import android.view.GestureDetector;
import android.view.SurfaceHolder;
import android.view.View;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class iel implements ieq {
    @Override // p000.ieq
    /* JADX INFO: renamed from: a */
    public final GestureDetector.OnGestureListener mo11145a() {
        return new GestureDetector.SimpleOnGestureListener();
    }

    @Override // p000.ieq
    /* JADX INFO: renamed from: b */
    public final View.OnTouchListener mo11146b() {
        return null;
    }

    @Override // p000.ieq
    /* JADX INFO: renamed from: c */
    public final void mo11147c() {
    }

    @Override // p000.ieq
    /* JADX INFO: renamed from: d */
    public final boolean mo11148d() {
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
    }

    @Override // android.view.SurfaceHolder.Callback2
    public final void surfaceRedrawNeeded(SurfaceHolder surfaceHolder) {
    }
}
