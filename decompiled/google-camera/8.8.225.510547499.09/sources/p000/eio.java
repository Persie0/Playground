package p000;

import android.content.Context;
import android.opengl.GLSurfaceView;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class eio extends GLSurfaceView {

    /* JADX INFO: renamed from: a */
    public ein f14165a;

    public eio(Context context) {
        super(context);
        this.f14165a = null;
    }

    @Override // android.view.SurfaceView, android.view.View
    protected final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        surfaceChanged(getHolder(), 3, getWidth(), getHeight());
        ein einVar = this.f14165a;
        if (einVar != null) {
            einVar.mo7362a();
        }
    }
}
