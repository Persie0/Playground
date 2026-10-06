package p000;

import com.google.android.apps.camera.bottombar.BottomBarController;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class czc extends czf {

    /* JADX INFO: renamed from: e */
    public final BottomBarController f10078e;

    /* JADX INFO: renamed from: f */
    public final igb f10079f;

    /* JADX INFO: renamed from: g */
    public final hxp f10080g;

    /* JADX INFO: renamed from: h */
    public final icf f10081h;

    /* JADX INFO: renamed from: i */
    public czf f10082i;

    /* JADX INFO: renamed from: j */
    public final dfn f10083j;

    public czc(BottomBarController bottomBarController, igb igbVar, hxp hxpVar, icf icfVar, dfn dfnVar, byte[] bArr, byte[] bArr2) {
        this.f10078e = bottomBarController;
        this.f10079f = igbVar;
        this.f10080g = hxpVar;
        this.f10081h = icfVar;
        this.f10083j = dfnVar;
    }

    @Override // p000.czd
    /* JADX INFO: renamed from: bp */
    public final int mo5731bp() {
        return this.f10082i.mo5731bp();
    }

    /* JADX INFO: renamed from: k */
    public final void m5733k() {
        this.f10083j.m6070e();
        this.f10078e.stopRecording(false, true);
        this.f10081h.mo11023v(true);
        this.f10081h.mo11013l(true);
        this.f10079f.mo11222ad();
        this.f10080g.m10837d(true);
        iqh.m11600d();
    }
}
