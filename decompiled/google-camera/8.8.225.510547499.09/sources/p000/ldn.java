package p000;

import android.view.SurfaceHolder;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ldn implements SurfaceHolder.Callback {

    /* JADX INFO: renamed from: a */
    public final lcw f37990a;

    /* JADX INFO: renamed from: b */
    public final ldi f37991b;

    /* JADX INFO: renamed from: c */
    public volatile boolean f37992c = true;

    /* JADX INFO: renamed from: d */
    private final lby f37993d;

    public ldn(lby lbyVar, lcw lcwVar, ldi ldiVar) {
        this.f37993d = lbyVar;
        this.f37990a = lcwVar;
        this.f37991b = ldiVar;
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        lqi.m15868m(laa.m15116l(this.f37993d, new kha(this, kua.m14875n(surfaceHolder.getSurface()), kzi.m15087d(i2, i3), 7)));
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        if (this.f37992c) {
            lqi.m15868m(laa.m15116l(this.f37993d, new kxw(this, 10)));
        }
    }
}
