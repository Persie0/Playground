package p000;

import com.google.android.apps.camera.bottombar.BottomBarController;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class czk extends czf {

    /* JADX INFO: renamed from: e */
    public final BottomBarController f10097e;

    /* JADX INFO: renamed from: f */
    public final igb f10098f;

    /* JADX INFO: renamed from: g */
    public final hxp f10099g;

    /* JADX INFO: renamed from: h */
    public final icf f10100h;

    /* JADX INFO: renamed from: i */
    public final mrm f10101i;

    /* JADX INFO: renamed from: j */
    public czf f10102j;

    /* JADX INFO: renamed from: k */
    public csn f10103k;

    /* JADX INFO: renamed from: l */
    public final dfn f10104l;

    public czk(BottomBarController bottomBarController, igb igbVar, hxp hxpVar, icf icfVar, dfn dfnVar, mrm mrmVar, byte[] bArr, byte[] bArr2) {
        this.f10097e = bottomBarController;
        this.f10098f = igbVar;
        this.f10099g = hxpVar;
        this.f10100h = icfVar;
        this.f10104l = dfnVar;
        this.f10101i = mrmVar;
    }

    @Override // p000.czd
    /* JADX INFO: renamed from: bp */
    public final int mo5731bp() {
        return this.f10102j.mo5731bp();
    }

    /* JADX INFO: renamed from: k */
    public final void m5737k() {
        this.f10104l.m6070e();
        this.f10097e.stopRecording(true, true);
        this.f10100h.mo11023v(true);
        this.f10100h.mo11013l(true);
        this.f10098f.mo11222ad();
        this.f10099g.m10837d(true);
        mrm mrmVar = this.f10101i;
        if (mrmVar.mo16813g()) {
            ((dax) mrmVar.mo16809c()).mo5862q();
        }
        iqh.m11600d();
    }
}
