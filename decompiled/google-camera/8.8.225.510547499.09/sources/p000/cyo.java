package p000;

import com.google.android.apps.camera.bottombar.BottomBarController;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
class cyo extends czf {

    /* JADX INFO: renamed from: b */
    final /* synthetic */ cyq f10045b;

    public cyo(cyq cyqVar) {
        this.f10045b = cyqVar;
    }

    @Override // p000.czd
    /* JADX INFO: renamed from: bp */
    public final int mo5731bp() {
        return 1;
    }

    @Override // p000.czf, p000.czd
    /* JADX INFO: renamed from: c */
    public void mo5723c() {
        cyq cyqVar = this.f10045b;
        boolean z = false;
        cyqVar.f10050h.mo5818i(false);
        cyqVar.f10049g.mo11023v(false);
        cyqVar.f10049g.mo11013l(false);
        cyqVar.f10053k.m6068c();
        BottomBarController bottomBarController = cyqVar.f10047e;
        if (cyqVar.f10051i.mo6184l(dhh.f11072Y) && cyqVar.f10051i.mo6184l(dhh.f11103p)) {
            z = true;
        }
        bottomBarController.startRecording(z, cyqVar.f10051i.mo6184l(dhh.f11060M));
        cyqVar.f10048f.mo11202J();
    }

    @Override // p000.czf, p000.hjn, p000.hjo
    /* JADX INFO: renamed from: f */
    public final void mo5711f() {
        this.f10045b.f10052j = this;
    }
}
