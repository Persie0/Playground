package p000;

import com.google.android.apps.camera.debugui.DebugCanvasView;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class dne extends kfv {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ dnf f12083a;

    public dne(dnf dnfVar) {
        this.f12083a = dnfVar;
    }

    @Override // p000.kfv
    /* JADX INFO: renamed from: bj */
    public final void mo6427bj(kpl kplVar) {
    }

    @Override // p000.kfv
    /* JADX INFO: renamed from: bu */
    public final void mo3408bu(kpp kppVar) {
        DebugCanvasView debugCanvasView = this.f12083a.f12085b;
        if (debugCanvasView == null) {
            ((nbe) ((nbe) dnf.f12084a.m17252c()).mo17276G((char) 998)).mo17290o("UI view not yet initialized");
        } else {
            debugCanvasView.f6610a = false;
        }
    }
}
