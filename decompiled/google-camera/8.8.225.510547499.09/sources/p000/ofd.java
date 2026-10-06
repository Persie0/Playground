package p000;

import android.graphics.SurfaceTexture;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ofd implements SurfaceTexture.OnFrameAvailableListener {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ Object f45831a;

    /* JADX INFO: renamed from: b */
    private final /* synthetic */ int f45832b;

    public ofd(eju ejuVar, int i) {
        this.f45832b = i;
        this.f45831a = ejuVar;
    }

    public ofd(ofe ofeVar, int i) {
        this.f45832b = i;
        this.f45831a = ofeVar;
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        off offVar;
        switch (this.f45832b) {
            case 0:
                ((ofe) this.f45831a).f45836d.getAndIncrement();
                synchronized (((ofe) this.f45831a).f45843k) {
                    if (!((ofe) this.f45831a).f45842j && (offVar = ((ofe) this.f45831a).f45834b) != null) {
                        offVar.mo18459b();
                    }
                    break;
                }
                return;
            default:
                if (((eju) this.f45831a).f14397h.getAndSet(true)) {
                    ((nbe) ((nbe) eju.f14390a.m17252c()).mo17276G((char) 1531)).mo17290o("Skipped a camera frame");
                    return;
                }
                return;
        }
    }
}
