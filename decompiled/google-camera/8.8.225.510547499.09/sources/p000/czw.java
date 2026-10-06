package p000;

import android.content.Context;
import android.view.View;
import com.google.android.apps.camera.bottombar.C0100R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class czw implements gfg {

    /* JADX INFO: renamed from: e */
    private static final nbh f10172e = nbh.m17259h("com/google/android/apps/camera/camcorder/ui/hdrvideo/HdrTooltipController");

    /* JADX INFO: renamed from: a */
    public final gfa f10173a;

    /* JADX INFO: renamed from: b */
    public final hai f10174b;

    /* JADX INFO: renamed from: c */
    public final hah f10175c;

    /* JADX INFO: renamed from: d */
    public int f10176d;

    /* JADX INFO: renamed from: f */
    private final elx f10177f;

    /* JADX INFO: renamed from: g */
    private final Context f10178g;

    /* JADX INFO: renamed from: h */
    private kba f10179h;

    public czw(gfa gfaVar, elx elxVar, Context context, hah hahVar, hai haiVar) {
        this.f10173a = gfaVar;
        this.f10177f = elxVar;
        this.f10178g = context;
        this.f10175c = hahVar;
        this.f10174b = haiVar;
    }

    @Override // p000.gfg
    /* JADX INFO: renamed from: a */
    public final void mo5759a() {
        kba kbaVar = this.f10179h;
        if (kbaVar != null) {
            kbaVar.close();
            this.f10179h = null;
        }
    }

    @Override // p000.gfg
    /* JADX INFO: renamed from: b */
    public final /* synthetic */ void mo5760b() {
    }

    @Override // p000.gfg
    /* JADX INFO: renamed from: c */
    public final void mo5761c() {
        if (this.f10176d != 0 || ((Boolean) this.f10175c.mo10031c(gzy.f27003O)).booleanValue()) {
            return;
        }
        mrm mrmVarMo9118d = this.f10173a.mo9118d(gev.AMETHYST, gfc.AMETHYST_ON);
        if (!mrmVarMo9118d.mo16813g()) {
            ((nbe) ((nbe) f10172e.m17252c()).mo17276G((char) 795)).mo17290o("Attempting to show HDR video tooltip but anchor view is not present");
            return;
        }
        igt igtVar = new igt(this.f10178g.getString(C0100R.string.hdr_video_bottom_sheet_tooltip));
        igtVar.m11314r((View) mrmVarMo9118d.mo16809c());
        igtVar.mo11305i();
        igtVar.mo11307k();
        igtVar.f30869d = 300;
        igtVar.mo11308l();
        igtVar.f30870e = 5000;
        igtVar.f30871f = false;
        igtVar.f30873h = false;
        igtVar.mo11312p();
        igtVar.f30874i = this.f10177f;
        igtVar.f30878m = 4;
        igtVar.mo11303g(new cui(this, 18), this.f10178g.getMainExecutor());
        this.f10179h = igtVar.mo11297a();
    }

    @Override // p000.gfg
    /* JADX INFO: renamed from: d */
    public final /* synthetic */ void mo5762d() {
    }
}
