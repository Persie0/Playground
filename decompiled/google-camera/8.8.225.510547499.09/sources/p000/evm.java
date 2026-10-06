package p000;

import android.graphics.Bitmap;
import android.view.SurfaceView;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class evm implements nph {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ evo f20405a;

    public evm(evo evoVar) {
        this.f20405a = evoVar;
    }

    @Override // p000.nph
    /* JADX INFO: renamed from: a */
    public final void mo3810a(Throwable th) {
        ((nbe) ((nbe) ((nbe) evo.f20407b.m17251b()).mo17283h(th)).mo17276G((char) 1982)).mo17290o("Error capturing image");
        synchronized (this.f20405a) {
            this.f20405a.f20430o.mo8566a(th);
        }
    }

    @Override // p000.nph
    /* JADX INFO: renamed from: b */
    public final void mo3811b(Object obj) {
        this.f20405a.f20424i.mo10781a();
        evo evoVar = this.f20405a;
        final evf evfVar = evoVar.f20431p;
        final int iM13893a = evoVar.f20423h.mo9215c().m13893a();
        final boolean zM5901j = this.f20405a.f20426k.m5901j();
        kxk.m14975U(kxk.m14970P(new nol() { // from class: eve
            @Override // p000.nol
            /* JADX INFO: renamed from: a */
            public final nps mo3988a() {
                Bitmap bitmapM11361a;
                evf evfVar2 = evfVar;
                int i = iM13893a;
                boolean z = zM5901j;
                ciq ciqVar = (ciq) evfVar2.f20382b;
                iht ihtVar = ciqVar.f5853s;
                int iM9211c = ggi.m9211c(ciqVar.f5858x);
                iht ihtVar2 = ciqVar.f5853s;
                synchronized (ihtVar2.f31002b) {
                    ihtVar2.f31005e.mo13961e("getScreenshot");
                    ihm ihmVar = ihtVar2.f31008h;
                    ihmVar.getClass();
                    SurfaceView surfaceView = ihmVar.f30971b;
                    boolean z2 = iM9211c == 0;
                    Bitmap bitmapCreateBitmap = Bitmap.createBitmap(((z2 || i % 180 == 0) ? surfaceView.getWidth() : surfaceView.getHeight()) / 4, ((z2 || i % 180 == 0) ? surfaceView.getHeight() : surfaceView.getWidth()) / 4, Bitmap.Config.ARGB_8888);
                    ihtVar2.f31007g.m11500a(surfaceView, bitmapCreateBitmap);
                    ihtVar2.f31005e.mo13963g("getScreenshot#flipAndRotate");
                    bitmapM11361a = iht.m11361a(bitmapCreateBitmap, i, z);
                    ihtVar2.f31005e.mo13962f();
                }
                bitmapM11361a.getClass();
                return kxk.m14965K(bitmapM11361a);
            }
        }, evfVar.f20384d), new djq(evfVar, 2), jvh.m13554b());
        this.f20405a.f20434s.m10148g();
    }
}
