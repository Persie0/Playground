package p000;

import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.view.View;
import com.google.android.apps.camera.bottombar.BottomBarController;
import com.google.android.apps.camera.bottombar.BottomBarListener;
import com.google.android.apps.camera.bottombar.C0100R;
import com.google.android.apps.camera.p014ui.compositevideoview.CompositeVideoView;
import com.google.android.material.behavior.iWN.zuAgeeF;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class fpm extends chw implements cre, hsr {

    /* JADX INFO: renamed from: b */
    public final cpj f23101b;

    /* JADX INFO: renamed from: d */
    public final cqm f23103d;

    /* JADX INFO: renamed from: e */
    private final chk f23104e;

    /* JADX INFO: renamed from: f */
    private final String f23105f;

    /* JADX INFO: renamed from: g */
    private jvb f23106g;

    /* JADX INFO: renamed from: i */
    private final BottomBarController f23108i;

    /* JADX INFO: renamed from: j */
    private final czt f23109j;

    /* JADX INFO: renamed from: k */
    private final hai f23110k;

    /* JADX INFO: renamed from: l */
    private final dhv f23111l;

    /* JADX INFO: renamed from: m */
    private final fpp f23112m;

    /* JADX INFO: renamed from: n */
    private final hst f23113n;

    /* JADX INFO: renamed from: o */
    private final fna f23114o;

    /* JADX INFO: renamed from: p */
    private final jfs f23115p;

    /* JADX INFO: renamed from: c */
    public final Object f23102c = new Object();

    /* JADX INFO: renamed from: h */
    private final BottomBarListener f23107h = new fpl(this);

    public fpm(chk chkVar, Resources resources, cqm cqmVar, BottomBarController bottomBarController, cpj cpjVar, czt cztVar, jfs jfsVar, hai haiVar, dhv dhvVar, fpp fppVar, hst hstVar, fna fnaVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.f23104e = chkVar;
        this.f23105f = resources.getString(C0100R.string.video_accessibility_peek);
        this.f23101b = cpjVar;
        this.f23108i = bottomBarController;
        this.f23103d = cqmVar;
        this.f23109j = cztVar;
        this.f23115p = jfsVar;
        this.f23110k = haiVar;
        this.f23111l = dhvVar;
        this.f23112m = fppVar;
        this.f23113n = hstVar;
        this.f23114o = fnaVar;
    }

    @Override // p000.cre
    /* JADX INFO: renamed from: bR */
    public final void mo5261bR() {
        this.f23103d.m5369j(true);
    }

    @Override // p000.chw
    /* JADX INFO: renamed from: bS */
    public final void mo3767bS(int i) {
        synchronized (this.f23102c) {
            this.f23101b.m5234f(i);
        }
    }

    @Override // p000.chw
    /* JADX INFO: renamed from: bT */
    public final void mo3768bT(boolean z) {
        synchronized (this.f23102c) {
            this.f23101b.m5238j(z);
        }
    }

    @Override // p000.chw
    /* JADX INFO: renamed from: bU */
    public final void mo3769bU() {
        synchronized (this.f23102c) {
            this.f23103d.m5362c(this.f23104e.mo3693g(), ikw.AMBER);
            this.f23101b.m5232d();
        }
    }

    @Override // p000.chw
    /* JADX INFO: renamed from: bV */
    public final void mo3770bV() {
        synchronized (this.f23102c) {
            this.f23103d.m5364e();
        }
    }

    @Override // p000.chw
    /* JADX INFO: renamed from: c */
    public final String mo3773c() {
        return this.f23105f;
    }

    @Override // p000.kba, java.lang.AutoCloseable
    public final void close() {
        synchronized (this.f23102c) {
            this.f23101b.m5241m();
        }
    }

    @Override // p000.cre
    /* JADX INFO: renamed from: f */
    public final void mo5264f() {
    }

    @Override // p000.cre
    /* JADX INFO: renamed from: g */
    public final void mo5265g() {
    }

    @Override // p000.cre
    /* JADX INFO: renamed from: h */
    public final void mo5266h() {
    }

    @Override // p000.cre
    /* JADX INFO: renamed from: i */
    public final void mo5267i(boolean z) {
        this.f23101b.m5235g(z);
    }

    @Override // p000.chw
    /* JADX INFO: renamed from: k */
    public final void mo3777k() {
        if (this.f5764a) {
            this.f23101b.m5246r(true != this.f23101b.m5242n() ? 5 : 10);
        }
    }

    @Override // p000.chw
    /* JADX INFO: renamed from: l */
    public final void mo3778l() {
        synchronized (this.f23102c) {
            this.f23101b.m5240l(true);
            dhv dhvVar = this.f23111l;
            dhx dhxVar = dhh.f11074a;
            dhvVar.mo6176d();
            if (this.f23115p.m13088X("amber_edu") == 0) {
                czt cztVar = this.f23109j;
                if (cztVar.f10157k == null) {
                    cztVar.f10157k = View.inflate(cztVar.f10150d, C0100R.layout.cinematic_bottom_sheet_content, null);
                }
                cztVar.f10153g = (CompositeVideoView) cztVar.f10157k.findViewById(C0100R.id.cinematic_bottom_sheet_normal_video);
                cztVar.f10155i = (CompositeVideoView) cztVar.f10157k.findViewById(C0100R.id.cinematic_bottom_sheet_cinematic_video);
                if (cztVar.f10154h == null && cztVar.f10156j == null) {
                    CompositeVideoView compositeVideoView = cztVar.f10153g;
                    CompositeVideoView compositeVideoView2 = cztVar.f10155i;
                    ihk ihkVar = cztVar.f10160n;
                    Context context = cztVar.f10150d;
                    Executor executor = cztVar.f10151e;
                    Uri uri = czt.f10147a;
                    ScheduledExecutorService scheduledExecutorService = cztVar.f10152f;
                    cztVar.f10154h = new czv(compositeVideoView, compositeVideoView2, ihkVar, context, executor, uri, scheduledExecutorService, null, null);
                    cztVar.f10156j = new czv(compositeVideoView2, compositeVideoView, ihkVar, context, executor, czt.f10148b, scheduledExecutorService, null, null);
                }
                cztVar.f10154h.m5758f();
                czv czvVar = cztVar.f10154h;
                czvVar.f10167f = new cui(cztVar, 15);
                czvVar.m5754b();
                cztVar.f10156j.m5758f();
                czv czvVar2 = cztVar.f10156j;
                czvVar2.f10167f = new cui(cztVar, 16);
                czvVar2.m5754b();
                cztVar.f10153g.m4323g();
                cztVar.f10155i.m4324h();
                cztVar.f10149c.m10714m(14, C0100R.string.cinematic_bottom_sheet_title, cztVar.f10157k, cztVar);
                this.f23115p.m13090Z(zuAgeeF.wYTuQfnzBhgEYDj);
            }
            this.f23110k.mo10033e(gzy.f27001M, true);
        }
    }

    @Override // p000.chw
    /* JADX INFO: renamed from: n */
    public final void mo3780n() {
        synchronized (this.f23102c) {
            this.f23106g = new jvb();
            this.f23114o.m8602b(this, ikw.AMBER, this.f23106g);
            this.f23108i.addListener(this.f23107h);
            this.f23113n.m10706e(this);
            this.f23103d.m5367h();
            this.f23101b.m5230b(this);
            this.f23112m.m8665i();
        }
    }

    @Override // p000.cre
    /* JADX INFO: renamed from: o */
    public final void mo5273o(fta ftaVar) {
    }

    @Override // p000.chw
    /* JADX INFO: renamed from: p */
    public final void mo3781p() {
        synchronized (this.f23102c) {
            this.f23108i.removeListener(this.f23107h);
            this.f23113n.m10710i(this);
            this.f23103d.m5368i();
            this.f23101b.m5241m();
            this.f23106g.close();
            this.f23101b.m5239k(this);
            this.f23112m.m8666j();
        }
    }

    @Override // p000.chw
    /* JADX INFO: renamed from: s */
    public final void mo3784s(Runnable runnable) {
        runnable.run();
    }

    @Override // p000.chw
    /* JADX INFO: renamed from: t */
    public final boolean mo3785t() {
        boolean zM5243o;
        synchronized (this.f23102c) {
            zM5243o = this.f23101b.m5243o();
        }
        return zM5243o;
    }

    @Override // p000.hsr
    /* JADX INFO: renamed from: x */
    public final void mo8661x(int i) {
        if (i == 14) {
            this.f23112m.m8665i();
        }
    }

    @Override // p000.hsr
    /* JADX INFO: renamed from: y */
    public final void mo8662y(int i) {
        if (i == 14) {
            this.f23112m.m8666j();
        }
    }
}
