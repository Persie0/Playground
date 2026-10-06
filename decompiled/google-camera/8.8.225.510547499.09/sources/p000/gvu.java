package p000;

import android.os.Handler;
import com.google.android.apps.camera.p014ui.views.CutoutBar;
import com.google.android.apps.camera.p014ui.views.FrontLensIndicatorOverlay;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class gvu implements gvy {

    /* JADX INFO: renamed from: b */
    public CutoutBar f26529b;

    /* JADX INFO: renamed from: c */
    public boolean f26530c;

    /* JADX INFO: renamed from: d */
    public boolean f26531d;

    /* JADX INFO: renamed from: f */
    public final jvd f26533f;

    /* JADX INFO: renamed from: h */
    public final jwn f26535h;

    /* JADX INFO: renamed from: i */
    public final jwn f26536i;

    /* JADX INFO: renamed from: j */
    public FrontLensIndicatorOverlay f26537j;

    /* JADX INFO: renamed from: k */
    public Runnable f26538k;

    /* JADX INFO: renamed from: l */
    public final cdu f26539l;

    /* JADX INFO: renamed from: m */
    private final gwp f26540m;

    /* JADX INFO: renamed from: a */
    public ikw f26528a = ikw.UNINITIALIZED;

    /* JADX INFO: renamed from: g */
    public final Object f26534g = new Object();

    /* JADX INFO: renamed from: e */
    public final Handler f26532e = jvh.m13556d();

    public gvu(cdu cduVar, jww jwwVar, jwn jwnVar, jvd jvdVar, gwp gwpVar) {
        this.f26535h = jwwVar;
        this.f26536i = jwnVar;
        this.f26539l = cduVar;
        this.f26533f = jvdVar;
        this.f26540m = gwpVar;
    }

    @Override // p000.gvy
    /* JADX INFO: renamed from: a */
    public final void mo9802a(ikw ikwVar) {
        synchronized (this.f26534g) {
            if (this.f26537j == null) {
                return;
            }
            if (this.f26530c && this.f26531d && !this.f26540m.mo9852d()) {
                this.f26532e.removeCallbacks(this.f26538k);
                gqn gqnVar = new gqn(this, ikwVar, 6);
                this.f26538k = gqnVar;
                this.f26532e.postDelayed(gqnVar, 500L);
            } else {
                this.f26537j.setVisibility(4);
            }
            this.f26530c = false;
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m9803b(ikw ikwVar) {
        if (this.f26529b == null) {
            return;
        }
        if (!this.f26531d || !ikwVar.equals(ikw.LONG_EXPOSURE)) {
            CutoutBar cutoutBar = this.f26529b;
            cutoutBar.f7223f = 0.0f;
            cutoutBar.setVisibility(4);
            return;
        }
        CutoutBar cutoutBar2 = this.f26529b;
        dhl dhlVar = cutoutBar2.f7219b;
        if (dhlVar == null) {
            ((nbe) ((nbe) CutoutBar.f7218a.m17251b()).mo17276G((char) 4268)).mo17290o("Not showing due to cutout info is null.");
            return;
        }
        cutoutBar2.f7223f = cutoutBar2.f7220c == 9 ? ill.m11431b(dhlVar.f11135d) : dhlVar.f11135d;
        cutoutBar2.setVisibility(0);
        cutoutBar2.invalidate();
    }
}
