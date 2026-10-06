package p000;

import com.google.android.apps.camera.bottombar.BottomBarController;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class cyq extends czf {

    /* JADX INFO: renamed from: e */
    public final BottomBarController f10047e;

    /* JADX INFO: renamed from: f */
    public final igb f10048f;

    /* JADX INFO: renamed from: g */
    public final icf f10049g;

    /* JADX INFO: renamed from: h */
    public final daj f10050h;

    /* JADX INFO: renamed from: i */
    public final dhv f10051i;

    /* JADX INFO: renamed from: j */
    public czf f10052j;

    /* JADX INFO: renamed from: k */
    public final dfn f10053k;

    public cyq(BottomBarController bottomBarController, igb igbVar, icf icfVar, dfn dfnVar, daj dajVar, dhv dhvVar, byte[] bArr, byte[] bArr2) {
        this.f10047e = bottomBarController;
        this.f10048f = igbVar;
        this.f10049g = icfVar;
        this.f10053k = dfnVar;
        this.f10050h = dajVar;
        this.f10051i = dhvVar;
    }

    @Override // p000.czd
    /* JADX INFO: renamed from: bp */
    public final int mo5731bp() {
        return this.f10052j.mo5731bp();
    }

    /* JADX INFO: renamed from: k */
    public final void m5732k() {
        this.f10053k.m6070e();
        this.f10047e.stopRecording(false, true);
        this.f10048f.mo11219aa();
        this.f10050h.mo5818i(true);
        this.f10049g.mo11023v(true);
        this.f10049g.mo11013l(true);
    }
}
